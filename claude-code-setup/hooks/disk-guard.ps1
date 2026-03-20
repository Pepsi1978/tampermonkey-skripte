# Disk Guard: Warns when storage is critically low
# Hook event: SessionStart
# Platform: Windows (PowerShell 7+)

. "$PSScriptRoot/hook-log.ps1"

try {
    $drive = Get-PSDrive C -ErrorAction Stop
    $freeGB = [math]::Round($drive.Free / 1GB, 1)
    $usedGB = [math]::Round($drive.Used / 1GB, 1)
    $totalGB = [math]::Round(($drive.Free + $drive.Used) / 1GB, 1)
    $usagePct = [math]::Round(($usedGB / $totalGB) * 100, 0)
} catch {
    Hook-LogError "failed to read disk space: $_"
    exit 0
}

if ($usagePct -ge 95) {
    Hook-LogError "CRITICAL disk space: ${usagePct}% used, ${freeGB}GB free"
    Write-Output "WARNUNG: Speicherplatz KRITISCH bei ${usagePct}% — nur ${freeGB}GB frei!"
    Write-Output "Empfehlung: Temporaere Dateien loeschen oder Speicher freigeben."
    # Log to whiteboard so /self-improve can see it
    $whiteboardFile = Join-Path $env:USERPROFILE "proggs\.claude\agent-memory\shared\MEMORY.md"
    if (Test-Path $whiteboardFile) {
        $entry = "`n### $(Get-Date -Format 'yyyy-MM-dd HH:mm') — Hook: disk-guard.ps1 — Speicherplatz KRITISCH`n**Quelle:** Hook: disk-guard.ps1 (SessionStart)`n**Symptom:** Speicherplatz bei ${usagePct}%, nur ${freeGB}GB frei`n**Ursache:** Zu wenig freier Speicherplatz auf C:\`n**Fix-Vorschlag:** Temporaere Dateien, Build-Caches und alte Logs loeschen`n**Status:** OFFEN"
        Add-Content -Path $whiteboardFile -Value $entry -Encoding UTF8
    }
} elseif ($usagePct -ge 90) {
    Hook-LogWarn "disk space low: ${usagePct}% used, ${freeGB}GB free"
    Write-Output "Disk-Guard: Speicherplatz bei ${usagePct}% — ${freeGB}GB frei (Achtung)."
} else {
    Hook-Log "disk OK: ${usagePct}% used, ${freeGB}GB free"
}

exit 0
