from __future__ import annotations

import ctypes
import time
from typing import Optional

import psutil
import pyperclip
import win32con
import win32gui

from config import Settings

# Virtual key codes
VK_CONTROL = 0x11
VK_V = 0x56
VK_A = 0x41
VK_BACK = 0x08

KEYEVENTF_KEYUP = 0x0002


def _keybd_event(vk: int, up: bool = False) -> None:
    flags = KEYEVENTF_KEYUP if up else 0
    ctypes.windll.user32.keybd_event(vk, 0, flags, 0)


def _send_ctrl_v() -> None:
    _keybd_event(VK_CONTROL)
    _keybd_event(VK_V)
    time.sleep(0.05)
    _keybd_event(VK_V, up=True)
    _keybd_event(VK_CONTROL, up=True)


def _send_ctrl_a() -> None:
    _keybd_event(VK_CONTROL)
    _keybd_event(VK_A)
    time.sleep(0.05)
    _keybd_event(VK_A, up=True)
    _keybd_event(VK_CONTROL, up=True)


def _send_backspace() -> None:
    _keybd_event(VK_BACK)
    time.sleep(0.05)
    _keybd_event(VK_BACK, up=True)


def is_claude_running(settings: Settings) -> bool:
    """Prueft, ob ein Claude-Prozess laeuft."""
    names = set(settings.claude_process_names)
    for proc in psutil.process_iter(["name"]):
        name = (proc.info.get("name") or "").lower()
        for candidate in names:
            if candidate and candidate in name:
                return True
    return False


def _find_claude_hwnd() -> Optional[int]:
    """Sucht das Claude-Desktop-Fenster und gibt dessen HWND zurueck."""
    result = []

    def _enum_callback(hwnd: int, _: object) -> bool:
        if not win32gui.IsWindowVisible(hwnd):
            return True
        title = win32gui.GetWindowText(hwnd).lower()
        if "claude" in title:
            result.append(hwnd)
        return True

    win32gui.EnumWindows(_enum_callback, None)
    return result[0] if result else None


def _bring_to_front(hwnd: int) -> None:
    """Bringt ein Fenster zuverlaessig in den Vordergrund."""
    # Falls minimiert, wiederherstellen
    if win32gui.IsIconic(hwnd):
        win32gui.ShowWindow(hwnd, win32con.SW_RESTORE)

    win32gui.ShowWindow(hwnd, win32con.SW_SHOW)

    # AllowSetForegroundWindow fuer den eigenen Prozess
    ctypes.windll.user32.AllowSetForegroundWindow(ctypes.windll.kernel32.GetCurrentProcessId())

    # Attachment-Trick: Verbinde unseren Thread mit dem Ziel-Thread
    fore_thread = ctypes.windll.user32.GetWindowThreadProcessId(
        ctypes.windll.user32.GetForegroundWindow(), None
    )
    target_thread = ctypes.windll.user32.GetWindowThreadProcessId(hwnd, None)

    if fore_thread != target_thread:
        ctypes.windll.user32.AttachThreadInput(fore_thread, target_thread, True)
        win32gui.SetForegroundWindow(hwnd)
        ctypes.windll.user32.AttachThreadInput(fore_thread, target_thread, False)
    else:
        win32gui.SetForegroundWindow(hwnd)


def insert_text_into_claude(text: str, overlay_hwnd: int | None = None) -> None:
    """Fuegt Text in das Claude-Eingabefeld ein (ueber Zwischenablage + Ctrl+V)."""
    if not text.strip():
        return

    hwnd = _find_claude_hwnd()
    if hwnd is None:
        raise RuntimeError("Claude-Fenster wurde nicht gefunden.")

    # Overlay kurz verstecken, damit es den Fokus nicht stiehlt
    if overlay_hwnd:
        win32gui.ShowWindow(overlay_hwnd, win32con.SW_HIDE)
        time.sleep(0.1)

    try:
        pyperclip.copy(text)
        _bring_to_front(hwnd)
        time.sleep(0.5)
        _send_ctrl_v()
        time.sleep(0.1)
    finally:
        # Overlay wieder anzeigen
        if overlay_hwnd:
            time.sleep(0.2)
            win32gui.ShowWindow(overlay_hwnd, win32con.SW_SHOW)
            # Overlay wieder topmost setzen
            win32gui.SetWindowPos(
                overlay_hwnd,
                win32con.HWND_TOPMOST,
                0, 0, 0, 0,
                win32con.SWP_NOMOVE | win32con.SWP_NOSIZE | win32con.SWP_NOACTIVATE,
            )


def clear_claude_input(overlay_hwnd: int | None = None) -> None:
    """Leert das Eingabefeld in Claude (Ctrl+A, dann Backspace)."""
    hwnd = _find_claude_hwnd()
    if hwnd is None:
        raise RuntimeError("Claude-Fenster wurde nicht gefunden.")

    if overlay_hwnd:
        win32gui.ShowWindow(overlay_hwnd, win32con.SW_HIDE)
        time.sleep(0.1)

    try:
        _bring_to_front(hwnd)
        time.sleep(0.5)
        _send_ctrl_a()
        time.sleep(0.1)
        _send_backspace()
    finally:
        if overlay_hwnd:
            time.sleep(0.2)
            win32gui.ShowWindow(overlay_hwnd, win32con.SW_SHOW)
            win32gui.SetWindowPos(
                overlay_hwnd,
                win32con.HWND_TOPMOST,
                0, 0, 0, 0,
                win32con.SWP_NOMOVE | win32con.SWP_NOSIZE | win32con.SWP_NOACTIVATE,
            )
