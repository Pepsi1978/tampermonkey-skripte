# Launch Electron apps with Chrome DevTools Protocol enabled
# This enables the Voice Overlay to inject text directly (100% reliable)
# instead of using unreliable clipboard + keyboard simulation (~50%)
#
# Usage: pwsh -File launch-with-cdp.ps1 [claude|codex|cursor|all]

param(
    [string]$App = "all"
)

$port = 9222

function Launch-WithCdp($name, $exePath, $cdpPort) {
    if (-not (Test-Path $exePath)) {
        Write-Host "  $name nicht gefunden: $exePath" -ForegroundColor Yellow
        return
    }

    # Check if already running
    $existing = Get-Process -Name ($name -replace '\.exe$','') -ErrorAction SilentlyContinue
    if ($existing) {
        Write-Host "  $name laeuft bereits (PID $($existing[0].Id))" -ForegroundColor Cyan
        # Check if CDP is active
        try {
            $response = Invoke-RestMethod "http://localhost:$cdpPort/json/version" -TimeoutSec 2
            Write-Host "  CDP aktiv auf Port $cdpPort" -ForegroundColor Green
        } catch {
            Write-Host "  ACHTUNG: CDP nicht aktiv! Bitte $name neu starten mit diesem Skript." -ForegroundColor Red
        }
        return
    }

    Write-Host "  Starte $name mit CDP auf Port $cdpPort..." -ForegroundColor Green
    Start-Process -FilePath $exePath -ArgumentList "--remote-debugging-port=$cdpPort"
    Start-Sleep -Seconds 3

    try {
        $response = Invoke-RestMethod "http://localhost:$cdpPort/json/version" -TimeoutSec 2
        Write-Host "  CDP aktiv! Browser: $($response.Browser)" -ForegroundColor Green
    } catch {
        Write-Host "  CDP nicht erreichbar — App unterstuetzt evtl. kein --remote-debugging-port" -ForegroundColor Yellow
    }
}

Write-Host "`nVoice Overlay — CDP Launcher" -ForegroundColor White
Write-Host "============================" -ForegroundColor White

# Find app paths
$claudePaths = @(
    "$env:LOCALAPPDATA\Programs\claude\Claude.exe",
    "$env:LOCALAPPDATA\AnthropicClaude\Claude.exe",
    "${env:ProgramFiles}\Anthropic\Claude\Claude.exe"
)
$cursorPaths = @(
    "$env:LOCALAPPDATA\Programs\cursor\Cursor.exe",
    "$env:LOCALAPPDATA\Programs\Cursor\Cursor.exe"
)
$codexPaths = @(
    "$env:LOCALAPPDATA\Programs\codex\Codex.exe",
    "$env:LOCALAPPDATA\Programs\Codex\Codex.exe"
)

$claudeExe = $claudePaths | Where-Object { Test-Path $_ } | Select-Object -First 1
$cursorExe = $cursorPaths | Where-Object { Test-Path $_ } | Select-Object -First 1
$codexExe  = $codexPaths  | Where-Object { Test-Path $_ } | Select-Object -First 1

switch ($App.ToLower()) {
    "claude" {
        if ($claudeExe) { Launch-WithCdp "Claude" $claudeExe $port }
        else { Write-Host "Claude Desktop nicht gefunden" -ForegroundColor Red }
    }
    "cursor" {
        if ($cursorExe) { Launch-WithCdp "Cursor" $cursorExe ($port + 1) }
        else { Write-Host "Cursor nicht gefunden" -ForegroundColor Red }
    }
    "codex" {
        if ($codexExe) { Launch-WithCdp "Codex" $codexExe ($port + 2) }
        else { Write-Host "Codex nicht gefunden" -ForegroundColor Red }
    }
    "all" {
        $currentPort = $port
        if ($claudeExe) { Launch-WithCdp "Claude" $claudeExe $currentPort; $currentPort++ }
        if ($cursorExe) { Launch-WithCdp "Cursor" $cursorExe $currentPort; $currentPort++ }
        if ($codexExe)  { Launch-WithCdp "Codex"  $codexExe  $currentPort }
        if (-not $claudeExe -and -not $cursorExe -and -not $codexExe) {
            Write-Host "Keine Electron-Apps gefunden." -ForegroundColor Red
            Write-Host "Installationspfade durchsucht:" -ForegroundColor Yellow
            ($claudePaths + $cursorPaths + $codexPaths) | ForEach-Object { Write-Host "  $_" }
        }
    }
    default {
        Write-Host "Nutzung: launch-with-cdp.ps1 [claude|codex|cursor|all]" -ForegroundColor Yellow
    }
}

Write-Host "`nTipp: Starte danach das Voice Overlay — es verbindet sich automatisch via CDP." -ForegroundColor Cyan
