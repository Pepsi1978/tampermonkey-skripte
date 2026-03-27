# clawi-log-clean-agent.ps1 - Scannt OpenClaw Logs nach Fehlermustern
# Teil des Selbstbeobachtungs-Systems (Direktive 2)

$ErrorActionPreference = "SilentlyContinue"

$LogDir = "\tmp\openclaw"
$RepoDir = "C:\Users\barwa\Clawi"
$ReportFile = Join-Path $RepoDir "clawi-setup\memory\system-health-report.md"
$FixesFile = Join-Path $RepoDir "clawi-setup\ENVIRONMENT-FIXES.md"

Write-Host "🦖 Log-Clean-Agent startet Analyse..." -ForegroundColor Cyan

if (-not (Test-Path $LogDir)) {
    Write-Host "Log-Verzeichnis nicht gefunden." -ForegroundColor Red
    exit 1
}

# 1. Neueste Log-Datei finden
$LatestLog = Get-ChildItem $LogDir -Filter "openclaw-*.log" | Sort-Object LastWriteTime -Descending | Select-Object -First 1

if (-not $LatestLog) {
    Write-Host "Keine Logs zum Scannen gefunden."
    exit 0
}

Write-Host "Analysiere: $($LatestLog.Name)"

# 2. Bekannte Fehlermuster suchen
$LogContent = Get-Content $LatestLog.FullName
$EditFailedCount = ($LogContent | Select-String -Pattern "edit failed" | Measure-Object).Count
$ConnectionClosedCount = ($LogContent | Select-String -Pattern "connection closed" | Measure-Object).Count
$TimeoutCount = ($LogContent | Select-String -Pattern "Request Time-out" | Measure-Object).Count

# 3. Report generieren (Einfache Version)
$Date = Get-Date -Format "yyyy-MM-dd"
$ReportHeader = "# System-Health-Report - $Date`n"
$ReportContent = "## Log-Statistik für $($LatestLog.Name)`n"
$ReportContent += "- **Edit Fails:** $EditFailedCount (Ziel: Reduzierung durch FIX-2026-03-27-001)`n"
$ReportContent += "- **WhatsApp Disconnects:** $ConnectionClosedCount`n"
$ReportContent += "- **Timeouts:** $TimeoutCount`n"

if ($EditFailedCount -gt 5) {
    $ReportContent += "`n💡 **Intelligenz-Vorschlag:** Die Edit-Strategie greift noch nicht optimal. Eventuell müssen die Sektions-Begrenzungen im Agent-System schärfer definiert werden.`n"
}

$ReportHeader + $ReportContent | Out-File $ReportFile -Encoding utf8

Write-Host "✅ Analyse abgeschlossen. Report unter clawi-setup\memory\system-health-report.md gesichert." -ForegroundColor Green
