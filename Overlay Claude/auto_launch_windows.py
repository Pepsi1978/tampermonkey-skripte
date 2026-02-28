"""
Claude Voice Overlay – Autostart-Watcher (Windows)
Überwacht ob die Claude Desktop App läuft und startet/stoppt
das Voice Overlay automatisch.

Wird von install_autostart_windows.bat als Hintergrundprozess
(pythonw.exe) eingerichtet.
"""

import subprocess
import sys
import os
import time
import signal

SCRIPT_DIR = os.path.dirname(os.path.abspath(__file__))
OVERLAY_SCRIPT = os.path.join(SCRIPT_DIR, "voice_overlay_windows.py")
VENV_PYTHON = os.path.join(SCRIPT_DIR, "venv", "Scripts", "python.exe")
CHECK_INTERVAL = 3  # Sekunden zwischen Checks

# Whisper-Modell und Sprache (anpassbar über Umgebungsvariablen)
MODEL = os.environ.get("VOICE_MODEL", "small")
LANG = os.environ.get("VOICE_LANG", "de")

# Log-Datei im Benutzerverzeichnis
LOG_DIR = os.path.join(os.environ.get("LOCALAPPDATA", os.path.expanduser("~")),
                       "ClaudeVoiceOverlay")
LOG_FILE = os.path.join(LOG_DIR, "overlay.log")

overlay_process = None


def log(msg):
    t = time.strftime("%H:%M:%S")
    line = f"[{t}] {msg}"
    print(line, flush=True)
    try:
        os.makedirs(LOG_DIR, exist_ok=True)
        with open(LOG_FILE, "a", encoding="utf-8") as f:
            f.write(line + "\n")
    except Exception:
        pass


def is_claude_running():
    """Prüft ob Claude Desktop (Claude.exe) läuft."""
    try:
        result = subprocess.run(
            ["tasklist", "/FI", "IMAGENAME eq Claude.exe", "/NH"],
            capture_output=True, text=True, timeout=5,
            creationflags=subprocess.CREATE_NO_WINDOW,
        )
        return "Claude.exe" in result.stdout
    except Exception:
        return False


def stop_overlay():
    """Beendet den Overlay-Prozess sauber."""
    global overlay_process
    if overlay_process is not None and overlay_process.poll() is None:
        log("Claude geschlossen – beende Overlay...")
        overlay_process.terminate()
        try:
            overlay_process.wait(timeout=5)
        except subprocess.TimeoutExpired:
            overlay_process.kill()
        overlay_process = None
        log("Overlay beendet")


def main():
    global overlay_process

    # Python aus der venv bevorzugen
    python = VENV_PYTHON if os.path.exists(VENV_PYTHON) else sys.executable

    if not os.path.exists(OVERLAY_SCRIPT):
        log(f"FEHLER: Overlay-Skript nicht gefunden: {OVERLAY_SCRIPT}")
        sys.exit(1)

    log("Claude Voice Overlay Watcher gestartet")
    log(f"Überwache Claude Desktop App...")
    log(f"Modell: {MODEL} | Sprache: {LANG}")
    log(f"Python: {python}")

    # Sauberes Beenden bei Signal
    def on_signal(signum, frame):
        stop_overlay()
        log("Watcher beendet")
        sys.exit(0)

    signal.signal(signal.SIGTERM, on_signal)
    signal.signal(signal.SIGINT, on_signal)

    try:
        while True:
            if is_claude_running():
                # Claude läuft – Overlay starten falls nötig
                if overlay_process is None or overlay_process.poll() is not None:
                    log("Claude erkannt – starte Voice Overlay...")
                    overlay_process = subprocess.Popen(
                        [python, OVERLAY_SCRIPT, "--model", MODEL, "--lang", LANG]
                    )
                    log(f"Overlay gestartet (PID {overlay_process.pid})")
            else:
                # Claude läuft nicht – Overlay stoppen falls aktiv
                stop_overlay()

            time.sleep(CHECK_INTERVAL)

    except KeyboardInterrupt:
        pass
    finally:
        stop_overlay()
        log("Watcher beendet")


if __name__ == "__main__":
    main()
