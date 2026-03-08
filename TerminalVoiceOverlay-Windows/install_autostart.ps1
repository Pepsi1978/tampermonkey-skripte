# install_autostart.ps1 — Richtet den Autostart fuer TerminalVoiceOverlay ein
# Ausfuehren: pwsh -File install_autostart.ps1

$ErrorActionPreference = "Stop"

$exePath = Join-Path $PSScriptRoot "publish\TerminalVoiceOverlay.exe"

if (-not (Test-Path $exePath)) {
    Write-Host "Fehler: $exePath nicht gefunden." -ForegroundColor Red
    Write-Host "Bitte zuerst 'pwsh -File publish.ps1' ausfuehren." -ForegroundColor Yellow
    exit 1
}

# .env neben die .exe kopieren falls noch nicht vorhanden
$envSource = Join-Path $PSScriptRoot ".env"
$envTarget = Join-Path $PSScriptRoot "publish\.env"
if ((Test-Path $envSource) -and -not (Test-Path $envTarget)) {
    Copy-Item $envSource $envTarget
    Write-Host ".env nach publish/ kopiert." -ForegroundColor Cyan
}

# Verknuepfung im Autostart-Ordner erstellen
$startupFolder = [System.IO.Path]::Combine(
    [Environment]::GetFolderPath("Startup"),
    "TerminalVoiceOverlay.lnk"
)

$shell = New-Object -ComObject WScript.Shell
$shortcut = $shell.CreateShortcut($startupFolder)
$shortcut.TargetPath = $exePath
$shortcut.WorkingDirectory = Join-Path $PSScriptRoot "publish"
$shortcut.Description = "TerminalVoiceOverlay — Spracheingabe fuer Terminal"
$shortcut.WindowStyle = 7  # Minimiert starten
$shortcut.Save()

Write-Host "`nAutostart eingerichtet!" -ForegroundColor Green
Write-Host "Verknuepfung: $startupFolder"
Write-Host "Programm: $exePath"
Write-Host "`nTerminalVoiceOverlay startet jetzt automatisch bei der Windows-Anmeldung."
