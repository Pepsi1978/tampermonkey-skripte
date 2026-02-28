@echo off
chcp 65001 >nul
REM ============================================================
REM Entfernt den Claude Voice Overlay Autostart (Windows)
REM ============================================================

echo === Claude Voice Overlay - Autostart Deinstallation (Windows) ===
echo.

set "SCRIPT_DIR=%~dp0"
set "STARTUP_FOLDER=%APPDATA%\Microsoft\Windows\Start Menu\Programs\Startup"
set "SHORTCUT=%STARTUP_FOLDER%\ClaudeVoiceOverlay.lnk"
set "VBS_PATH=%SCRIPT_DIR%claude_voice_launcher.vbs"

REM ---- Autostart-Shortcut entfernen ----
if exist "%SHORTCUT%" (
    del "%SHORTCUT%"
    echo Autostart-Shortcut entfernt.
) else (
    echo Kein Autostart-Shortcut gefunden.
)

REM ---- VBS Launcher entfernen ----
if exist "%VBS_PATH%" (
    del "%VBS_PATH%"
    echo VBS Launcher entfernt.
)

REM ---- Laufende Prozesse beenden ----
echo.
echo Beende laufende Overlay-Prozesse...

REM Overlay- und Watcher-Prozesse über Kommandozeile finden und beenden
powershell -NoProfile -Command ^
    "Get-Process pythonw -ErrorAction SilentlyContinue | Where-Object { $_.CommandLine -like '*auto_launch_windows*' -or $_.CommandLine -like '*voice_overlay_windows*' } | Stop-Process -Force -ErrorAction SilentlyContinue; Get-Process python -ErrorAction SilentlyContinue | Where-Object { $_.CommandLine -like '*auto_launch_windows*' -or $_.CommandLine -like '*voice_overlay_windows*' } | Stop-Process -Force -ErrorAction SilentlyContinue"

echo Prozesse beendet.
echo.
echo Autostart deinstalliert.
echo Das Overlay wird beim naechsten Login nicht mehr automatisch gestartet.
echo.
pause
