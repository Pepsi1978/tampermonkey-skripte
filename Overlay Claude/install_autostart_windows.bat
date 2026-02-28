@echo off
chcp 65001 >nul
REM ============================================================
REM Installiert den Claude Voice Overlay Autostart unter Windows.
REM Das Overlay startet automatisch beim Login und überwacht ob
REM Claude Desktop geöffnet ist.
REM ============================================================

echo === Claude Voice Overlay - Autostart Installation (Windows) ===
echo.

set "SCRIPT_DIR=%~dp0"
set "VENV_DIR=%SCRIPT_DIR%venv"
set "WATCHER=%SCRIPT_DIR%auto_launch_windows.py"
set "STARTUP_FOLDER=%APPDATA%\Microsoft\Windows\Start Menu\Programs\Startup"
set "LOG_DIR=%LOCALAPPDATA%\ClaudeVoiceOverlay"

REM ---- Python finden ----
where python >nul 2>&1
if %errorlevel% neq 0 (
    echo FEHLER: Python nicht gefunden!
    echo Installiere Python von https://python.org
    echo Stelle sicher, dass "Add Python to PATH" aktiviert ist.
    echo.
    pause
    exit /b 1
)

for /f "tokens=*" %%i in ('python --version 2^>^&1') do echo Python: %%i

REM ---- Virtuelle Umgebung erstellen ----
if not exist "%VENV_DIR%\Scripts\python.exe" (
    echo.
    echo Virtuelle Umgebung wird erstellt...
    python -m venv "%VENV_DIR%"
    echo Virtuelle Umgebung erstellt.
)

REM ---- Pakete installieren ----
echo.
echo Pakete werden installiert/aktualisiert...
"%VENV_DIR%\Scripts\pip.exe" install -q -r "%SCRIPT_DIR%requirements-windows.txt"
echo Pakete bereit.
echo.

REM ---- Log-Ordner erstellen ----
if not exist "%LOG_DIR%" mkdir "%LOG_DIR%"

REM ---- VBS Launcher erstellen (startet pythonw.exe ohne sichtbares Fenster) ----
set "VBS_PATH=%SCRIPT_DIR%claude_voice_launcher.vbs"
(
echo Set WshShell = CreateObject^("WScript.Shell"^)
echo WshShell.CurrentDirectory = "%SCRIPT_DIR%"
echo WshShell.Run """" ^& "%VENV_DIR%\Scripts\pythonw.exe" ^& """ """ ^& "%WATCHER%" ^& """", 0, False
) > "%VBS_PATH%"

REM ---- Alten Autostart-Eintrag entfernen ----
set "SHORTCUT=%STARTUP_FOLDER%\ClaudeVoiceOverlay.lnk"
if exist "%SHORTCUT%" del "%SHORTCUT%"

REM ---- Shortcut im Autostart-Ordner erstellen ----
powershell -NoProfile -Command ^
    "$ws = New-Object -ComObject WScript.Shell; $s = $ws.CreateShortcut('%SHORTCUT%'); $s.TargetPath = 'wscript.exe'; $s.Arguments = '\"%VBS_PATH%\"'; $s.WorkingDirectory = '%SCRIPT_DIR%'; $s.Description = 'Claude Voice Overlay Autostart'; $s.Save()"

if exist "%SHORTCUT%" (
    echo Autostart installiert!
) else (
    echo FEHLER: Shortcut konnte nicht erstellt werden.
    echo Versuche manuell: Kopiere claude_voice_launcher.vbs in den
    echo Autostart-Ordner: %STARTUP_FOLDER%
    echo.
    pause
    exit /b 1
)

echo.
echo   Startup:  %SHORTCUT%
echo   Logs:     %LOG_DIR%\overlay.log
echo.
echo Der Watcher startet automatisch beim naechsten Login.
echo Oeffne die Claude Desktop App - das Overlay erscheint automatisch.
echo.
echo Zum sofortigen Starten: Doppelklick auf claude_voice_launcher.vbs
echo Zum Deinstallieren:     uninstall_autostart_windows.bat
echo.
pause
