@echo off
chcp 65001 >nul
REM ============================================================
REM Richtet das Claude Voice Overlay ein und erstellt eine
REM Desktop-Verknüpfung "Claude + Voice" zum gemeinsamen Starten.
REM Kein Autostart beim Windows-Login!
REM ============================================================

echo === Claude Voice Overlay - Launcher Installation ===
echo.

set "SCRIPT_DIR=%~dp0"
set "VENV_DIR=%SCRIPT_DIR%venv"
set "VBS_LAUNCHER=%SCRIPT_DIR%start_claude.vbs"

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

REM ---- Desktop-Verknüpfung erstellen ----
set "DESKTOP=%USERPROFILE%\Desktop"
set "SHORTCUT=%DESKTOP%\Claude + Voice.lnk"

REM Alten Shortcut entfernen falls vorhanden
if exist "%SHORTCUT%" del "%SHORTCUT%"

powershell -NoProfile -Command ^
    "$ws = New-Object -ComObject WScript.Shell; $s = $ws.CreateShortcut('%SHORTCUT%'); $s.TargetPath = 'wscript.exe'; $s.Arguments = '\"%VBS_LAUNCHER%\"'; $s.WorkingDirectory = '%SCRIPT_DIR%'; $s.Description = 'Claude Desktop mit Voice Overlay starten'; $s.IconLocation = 'shell32.dll,168'; $s.Save()"

if exist "%SHORTCUT%" (
    echo Desktop-Verknuepfung erstellt!
) else (
    echo HINWEIS: Desktop-Verknuepfung konnte nicht erstellt werden.
    echo Du kannst start_claude.vbs auch direkt per Doppelklick starten.
)

echo.
echo   Verknuepfung:  %SHORTCUT%
echo   Launcher:      %VBS_LAUNCHER%
echo.
echo -------------------------------------------------------
echo   Starte Claude Desktop ab jetzt ueber:
echo   - Die Desktop-Verknuepfung "Claude + Voice"
echo   - Oder Doppelklick auf start_claude.vbs
echo.
echo   Das Overlay startet automatisch mit Claude Desktop.
echo   Kein Hintergrundprozess beim Windows-Start!
echo -------------------------------------------------------
echo.
pause
