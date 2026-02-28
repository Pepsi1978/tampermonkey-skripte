"""
Claude Desktop Voice Input - macOS Overlay (Native AppKit)
Schwebender Mikrofon-Button über der Claude Desktop App.

Nutzung:
    python voice_overlay_macos.py [--model base] [--lang de]

Tastenkürzel (bei fokussiertem Overlay-Fenster):
    Cmd+Shift+M  - Aufnahme starten/stoppen
    Escape        - Beenden

Hinweis:
    macOS erfordert Mikrofon-Berechtigung.
    Beim ersten Start wirst du danach gefragt.
"""

import sys
import os
import threading
import argparse

import objc
from AppKit import (
    NSApplication,
    NSWindow,
    NSView,
    NSColor,
    NSFont,
    NSBezierPath,
    NSAttributedString,
    NSScreen,
    NSEvent,
    NSFontAttributeName,
    NSForegroundColorAttributeName,
    NSParagraphStyleAttributeName,
    NSMutableParagraphStyle,
    NSFloatingWindowLevel,
    NSBackingStoreBuffered,
    NSTrackingArea,
    NSTrackingMouseEnteredAndExited,
    NSTrackingActiveAlways,
    NSTrackingMouseMoved,
    NSTrackingInVisibleRect,
    NSApplicationActivationPolicyAccessory,
)
from Foundation import (
    NSObject,
    NSPoint,
    NSMakeRect,
    NSTimer,
)
from PyObjCTools import AppHelper

# Eigenes Core-Modul
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from voice_core import AudioRecorder, transcribe_audio


# ── Helpers ──────────────────────────────────────────────────

_COLOR_CACHE = {}


def _nscolor(hex_str, alpha=1.0):
    """Convert '#RRGGBB' to NSColor (cached)."""
    key = (hex_str, alpha)
    if key not in _COLOR_CACHE:
        h = hex_str.lstrip("#")
        r = int(h[0:2], 16) / 255.0
        g = int(h[2:4], 16) / 255.0
        b = int(h[4:6], 16) / 255.0
        _COLOR_CACHE[key] = NSColor.colorWithCalibratedRed_green_blue_alpha_(
            r, g, b, alpha
        )
    return _COLOR_CACHE[key]


def paste_to_claude_window(text):
    """Kopiert Text in die Zwischenablage und simuliert Cmd+V im Claude-Fenster."""
    import subprocess
    import time

    if not text.strip():
        return

    process = subprocess.Popen(["pbcopy"], stdin=subprocess.PIPE)
    process.communicate(text.encode("utf-8"))

    try:
        subprocess.run(
            ["osascript", "-e", 'tell application "Claude" to activate'],
            timeout=3,
            capture_output=True,
        )
        time.sleep(0.3)
    except Exception:
        time.sleep(0.3)

    try:
        subprocess.run(
            [
                "osascript",
                "-e",
                'tell application "System Events" to keystroke "v" using command down',
            ],
            timeout=3,
            capture_output=True,
        )
    except Exception:
        try:
            import pyautogui

            pyautogui.hotkey("command", "v")
        except ImportError:
            print("Konnte Cmd+V nicht simulieren.")


def clear_claude_input():
    """Fokussiert das Claude-Fenster und löscht den Text im Eingabefeld."""
    import subprocess
    import time

    try:
        subprocess.run(
            ["osascript", "-e", 'tell application "Claude" to activate'],
            timeout=3,
            capture_output=True,
        )
        time.sleep(0.3)
    except Exception:
        time.sleep(0.3)

    try:
        subprocess.run(
            [
                "osascript",
                "-e",
                'tell application "System Events" to keystroke "a" using command down',
            ],
            timeout=3,
            capture_output=True,
        )
        time.sleep(0.1)
        subprocess.run(
            [
                "osascript",
                "-e",
                'tell application "System Events" to key code 51',
            ],
            timeout=3,
            capture_output=True,
        )
    except Exception:
        try:
            import pyautogui

            pyautogui.hotkey("command", "a")
            time.sleep(0.1)
            pyautogui.press("delete")
        except ImportError:
            print("Konnte Text nicht löschen.")


# ── Borderless Window (accepts keyboard input) ──────────────


class OverlayWindow(NSWindow):
    """Borderless window that can become key (for keyboard shortcuts)."""

    def canBecomeKeyWindow(self):
        return True

    def canBecomeMainWindow(self):
        return False


# ── Custom View ──────────────────────────────────────────────


class OverlayView(NSView):
    """Draws mic button, clear button, and status text."""

    BTN_SIZE = 56

    def initWithFrame_(self, frame):
        self = objc.super(OverlayView, self).initWithFrame_(frame)
        if self is None:
            return None
        self.ctrl = None  # VoiceOverlay controller, set externally
        self._hover_mic = False
        self._hover_clear = False
        self._drag_start_screen = None
        self._win_origin_start = None
        return self

    def isFlipped(self):
        return True  # y=0 at top, like tkinter

    def acceptsFirstResponder(self):
        return True

    def acceptsFirstMouse_(self, event):
        return True  # allow clicks when window is not key

    # --- Tracking areas (hover detection) ---

    def updateTrackingAreas(self):
        for ta in self.trackingAreas():
            self.removeTrackingArea_(ta)
        opts = (
            NSTrackingMouseEnteredAndExited
            | NSTrackingActiveAlways
            | NSTrackingMouseMoved
            | NSTrackingInVisibleRect
        )
        ta = NSTrackingArea.alloc().initWithRect_options_owner_userInfo_(
            self.bounds(), opts, self, None
        )
        self.addTrackingArea_(ta)
        objc.super(OverlayView, self).updateTrackingAreas()

    # --- Geometry ---

    @objc.python_method
    def _geom(self):
        """Return (cx, mic_cy, clr_cy, r)."""
        w = self.bounds().size.width
        s = self.BTN_SIZE
        cx = w / 2
        r = s / 2
        mic_cy = s / 2 + 5
        clr_cy = mic_cy + s + 10
        return cx, mic_cy, clr_cy, r

    @objc.python_method
    def _in_circle(self, px, py, cx, cy, r):
        return (px - cx) ** 2 + (py - cy) ** 2 <= r * r

    # --- Drawing ---

    def drawRect_(self, dirty):
        c = self.ctrl
        if c is None:
            return
        cx, mic_cy, clr_cy, r = self._geom()

        # Canvas background
        _nscolor("#1E1E1E").set()
        NSBezierPath.fillRect_(self.bounds())

        # ── Mic button ──
        self._draw_btn(
            cx,
            mic_cy,
            r,
            self._mic_fill(),
            c.pulse_bright,
            "\U0001F3A4",
            20,
            False,
        )

        # ── Clear (X) button ──
        fill = _nscolor("#3D3D3D") if self._hover_clear else _nscolor("#2D2D2D")
        self._draw_btn(cx, clr_cy, r, fill, False, "\u2715", 18, True)

        # ── Status text ──
        self._draw_text(c.status_text, cx, clr_cy + r + 8, 9, False, c.status_color)

    @objc.python_method
    def _mic_fill(self):
        c = self.ctrl
        if c.is_recording:
            return _nscolor("#E53935")
        if c.is_processing:
            return _nscolor("#FF9800")
        if self._hover_mic:
            return _nscolor("#3D3D3D")
        return _nscolor("#2D2D2D")

    @objc.python_method
    def _draw_btn(self, cx, cy, r, fill, bright_outline, icon, size, bold):
        # Shadow
        _nscolor("#111111").set()
        NSBezierPath.bezierPathWithOvalInRect_(
            NSMakeRect(cx - r - 3, cy - r - 3, (r + 3) * 2, (r + 3) * 2)
        ).fill()
        # Fill
        fill.set()
        rect = NSMakeRect(cx - r, cy - r, r * 2, r * 2)
        NSBezierPath.bezierPathWithOvalInRect_(rect).fill()
        # Outline
        color = _nscolor("#FF6666") if bright_outline else _nscolor("#555555")
        color.set()
        path = NSBezierPath.bezierPathWithOvalInRect_(rect)
        path.setLineWidth_(2)
        path.stroke()
        # Icon text
        self._draw_text(icon, cx, cy, size, bold, NSColor.whiteColor())

    @objc.python_method
    def _draw_text(self, text, cx, cy, size, bold, color):
        font = (
            NSFont.boldSystemFontOfSize_(size)
            if bold
            else NSFont.systemFontOfSize_(size)
        )
        style = NSMutableParagraphStyle.alloc().init()
        style.setAlignment_(2)  # NSCenterTextAlignment
        attrs = {
            NSFontAttributeName: font,
            NSForegroundColorAttributeName: color,
            NSParagraphStyleAttributeName: style,
        }
        astr = NSAttributedString.alloc().initWithString_attributes_(text, attrs)
        sz = astr.size()
        astr.drawAtPoint_(NSPoint(cx - sz.width / 2, cy - sz.height / 2))

    # --- Mouse events ---

    def mouseDown_(self, event):
        loc = self.convertPoint_fromView_(event.locationInWindow(), None)
        cx, mic_cy, clr_cy, r = self._geom()

        if self._in_circle(loc.x, loc.y, cx, mic_cy, r):
            if self.ctrl:
                self.ctrl.on_mic_click()
            return
        if self._in_circle(loc.x, loc.y, cx, clr_cy, r):
            if self.ctrl:
                self.ctrl.on_clear_click()
            return

        # Begin window drag
        self._drag_start_screen = NSEvent.mouseLocation()
        self._win_origin_start = self.window().frame().origin

    def mouseDragged_(self, event):
        if self._drag_start_screen is None:
            return
        current = NSEvent.mouseLocation()
        dx = current.x - self._drag_start_screen.x
        dy = current.y - self._drag_start_screen.y
        self.window().setFrameOrigin_(
            NSPoint(
                self._win_origin_start.x + dx,
                self._win_origin_start.y + dy,
            )
        )

    def mouseUp_(self, event):
        self._drag_start_screen = None

    def mouseMoved_(self, event):
        loc = self.convertPoint_fromView_(event.locationInWindow(), None)
        cx, mic_cy, clr_cy, r = self._geom()
        hm = self._in_circle(loc.x, loc.y, cx, mic_cy, r)
        hc = self._in_circle(loc.x, loc.y, cx, clr_cy, r)
        if hm != self._hover_mic or hc != self._hover_clear:
            self._hover_mic = hm
            self._hover_clear = hc
            self.setNeedsDisplay_(True)

    def mouseExited_(self, event):
        if self._hover_mic or self._hover_clear:
            self._hover_mic = False
            self._hover_clear = False
            self.setNeedsDisplay_(True)

    # --- Keyboard ---

    def keyDown_(self, event):
        mods = event.modifierFlags()
        ch = event.charactersIgnoringModifiers()

        # Cmd+Shift+M
        CMD = 1 << 20
        SHIFT = 1 << 17
        if ch and ch.lower() == "m" and (mods & CMD) and (mods & SHIFT):
            if self.ctrl:
                self.ctrl.on_mic_click()
            return

        # Escape
        if event.keyCode() == 53:
            if self.ctrl:
                self.ctrl.quit()
            return

        objc.super(OverlayView, self).keyDown_(event)


# ── Controller ───────────────────────────────────────────────


class VoiceOverlay(NSObject):
    """Main overlay controller (NSObject subclass for NSTimer callbacks)."""

    def initWithModel_language_(self, model_size, language):
        self = objc.super(VoiceOverlay, self).init()
        if self is None:
            return None
        self.model_size = model_size
        self.language = language
        self.recorder = AudioRecorder()
        self.is_recording = False
        self.is_processing = False
        self.status_text = "Bereit"
        self.status_color = _nscolor("#AAAAAA")
        self.pulse_bright = False
        self._pulse_timer = None
        self._setup_window()
        return self

    @objc.python_method
    def _setup_window(self):
        s = 56  # button size
        w = s + 40  # 96
        h = s * 2 + 50  # 162

        screen = NSScreen.mainScreen().frame()
        x = screen.size.width - w - 80
        y = 120  # distance from bottom

        self.window = OverlayWindow.alloc().initWithContentRect_styleMask_backing_defer_(
            NSMakeRect(x, y, w, h),
            0,  # borderless
            NSBackingStoreBuffered,
            False,
        )
        self.window.setLevel_(NSFloatingWindowLevel)
        self.window.setOpaque_(False)
        self.window.setBackgroundColor_(NSColor.clearColor())
        self.window.setAlphaValue_(0.92)
        self.window.setHasShadow_(False)
        self.window.setAcceptsMouseMovedEvents_(True)
        # Show on all Spaces
        self.window.setCollectionBehavior_(1 << 1)

        self.view = OverlayView.alloc().initWithFrame_(NSMakeRect(0, 0, w, h))
        self.view.ctrl = self
        self.window.setContentView_(self.view)
        self.window.makeKeyAndOrderFront_(None)

    # --- Mic button actions ---

    @objc.python_method
    def on_mic_click(self):
        if self.is_processing:
            return
        if self.is_recording:
            self._stop_recording()
        else:
            self._start_recording()

    @objc.python_method
    def _start_recording(self):
        self.is_recording = True
        self.status_text = "Aufnahme..."
        self.status_color = _nscolor("#E53935")
        self.view.setNeedsDisplay_(True)
        self.recorder.start()
        self._start_pulse()

    @objc.python_method
    def _stop_recording(self):
        self.is_recording = False
        self.is_processing = True
        self.status_text = "Verarbeite..."
        self.status_color = _nscolor("#FF9800")
        self.pulse_bright = False
        self._stop_pulse()
        self.view.setNeedsDisplay_(True)

        audio_data = self.recorder.stop()

        def do_transcribe():
            try:
                text = transcribe_audio(
                    audio_data,
                    language=self.language,
                    model_size=self.model_size,
                )
                text = text.strip() if text else ""
            except Exception as e:
                print(f"Transkription Fehler: {e}")
                text = ""
            AppHelper.callAfter(self._on_transcription_done, text)

        threading.Thread(target=do_transcribe, daemon=True).start()

    @objc.python_method
    def _on_transcription_done(self, text):
        self.is_processing = False
        if text:
            self.status_text = "Eingefügt!"
            self.status_color = _nscolor("#4CAF50")
            paste_to_claude_window(text)
        else:
            self.status_text = "Kein Text erkannt"
            self.status_color = _nscolor("#FF5722")
        self.view.setNeedsDisplay_(True)

        NSTimer.scheduledTimerWithTimeInterval_target_selector_userInfo_repeats_(
            3.0, self, "resetStatus:", None, False
        )

    def resetStatus_(self, timer):
        if not self.is_recording and not self.is_processing:
            self.status_text = "Bereit"
            self.status_color = _nscolor("#AAAAAA")
            self.view.setNeedsDisplay_(True)

    # --- Clear button ---

    @objc.python_method
    def on_clear_click(self):
        self.status_text = "Gelöscht!"
        self.status_color = _nscolor("#FF5722")
        self.view.setNeedsDisplay_(True)
        threading.Thread(target=clear_claude_input, daemon=True).start()

        NSTimer.scheduledTimerWithTimeInterval_target_selector_userInfo_repeats_(
            2.0, self, "resetStatus:", None, False
        )

    # --- Pulse animation ---

    @objc.python_method
    def _start_pulse(self):
        self._pulse_timer = (
            NSTimer.scheduledTimerWithTimeInterval_target_selector_userInfo_repeats_(
                0.5, self, "pulseToggle:", None, True
            )
        )

    @objc.python_method
    def _stop_pulse(self):
        if self._pulse_timer:
            self._pulse_timer.invalidate()
            self._pulse_timer = None

    def pulseToggle_(self, timer):
        if self.is_recording:
            self.pulse_bright = not self.pulse_bright
            self.view.setNeedsDisplay_(True)
        else:
            timer.invalidate()

    # --- Quit ---

    @objc.python_method
    def quit(self):
        if self.is_recording:
            self.recorder.stop()
        self._stop_pulse()
        AppHelper.stopEventLoop()


# ── Main ─────────────────────────────────────────────────────


def main():
    parser = argparse.ArgumentParser(
        description="Claude Desktop Voice Input Overlay (macOS)"
    )
    parser.add_argument(
        "--model",
        default="small",
        choices=["tiny", "base", "small", "medium", "large"],
        help="Whisper Modell-Größe (Standard: small)",
    )
    parser.add_argument(
        "--lang",
        default="de",
        help="Sprache für die Erkennung (Standard: de)",
    )
    args = parser.parse_args()

    app = NSApplication.sharedApplication()
    app.setActivationPolicy_(NSApplicationActivationPolicyAccessory)

    overlay = VoiceOverlay.alloc().initWithModel_language_(args.model, args.lang)

    print("Claude Voice Input - macOS (Native)")
    print("Klicke auf den Mikrofon-Button")
    print("Ziehen zum Verschieben")
    print("Escape zum Beenden")
    print()
    print("Hinweis: Erlaube Mikrofon-Zugriff")
    print("unter Systemeinstellungen > Datenschutz & Sicherheit")

    AppHelper.runEventLoop()


if __name__ == "__main__":
    main()
