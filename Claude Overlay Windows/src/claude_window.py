from __future__ import annotations

import time
from typing import Optional

import psutil
import pyperclip
import win32com.client

from config import Settings


def is_claude_running(settings: Settings) -> bool:
    """Prueft, ob ein Claude-Prozess laeuft."""
    names = set(settings.claude_process_names)
    for proc in psutil.process_iter(["name"]):
        name = (proc.info.get("name") or "").lower()
        for candidate in names:
            if candidate and candidate in name:
                return True
    return False


def _activate_claude() -> bool:
    """Aktiviert das Claude-Fenster ueber WScript.Shell.AppActivate."""
    shell = win32com.client.Dispatch("WScript.Shell")
    return shell.AppActivate("Claude")


def insert_text_into_claude(text: str, **_kwargs) -> None:
    """Fuegt Text an der aktuellen Cursorposition in Claude ein."""
    if not text.strip():
        return

    pyperclip.copy(text)

    if not _activate_claude():
        raise RuntimeError("Claude-Fenster wurde nicht gefunden.")

    time.sleep(0.3)
    shell = win32com.client.Dispatch("WScript.Shell")
    shell.SendKeys("^v")


def clear_claude_input(**_kwargs) -> None:
    """Leert das Eingabefeld in Claude (Ctrl+A, dann Backspace)."""
    if not _activate_claude():
        raise RuntimeError("Claude-Fenster wurde nicht gefunden.")

    time.sleep(0.3)
    shell = win32com.client.Dispatch("WScript.Shell")
    shell.SendKeys("^a")
    time.sleep(0.05)
    shell.SendKeys("{BACKSPACE}")
