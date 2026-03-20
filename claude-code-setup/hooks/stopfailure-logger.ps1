# stopfailure-logger.ps1 — Logs API failures to whiteboard without requiring API access
# Triggered by StopFailure hook event (Claude Code v2.1.78+)
# Uses whiteboard-insert.ps1 for section-based writing (no Add-Content!)

param()

$ErrorActionPreference = 'SilentlyContinue'

$timestamp = Get-Date -Format "yyyy-MM-dd HH:mm"
$whiteboardPath = "$HOME\proggs\.claude\agent-memory\shared\MEMORY.md"

# Read stdin for error details (Claude Code pipes error info)
$errorInput = ""
try {
    if (-not [Console]::IsInputRedirected) {
        $errorInput = "No error details available (stdin empty)"
    } else {
        $errorInput = [Console]::In.ReadToEnd()
        if ([string]::IsNullOrWhiteSpace($errorInput)) {
            $errorInput = "No error details available (stdin empty)"
        }
    }
} catch {
    $errorInput = "Could not read error details: $_"
}

# Truncate long error messages
if ($errorInput.Length -gt 500) {
    $errorInput = $errorInput.Substring(0, 500) + "... (truncated)"
}

# Build whiteboard entry
$entry = @"

### $timestamp — StopFailure: API/Rate-Limit Error — Status: OFFEN
**Quelle:** Hook: StopFailure (command-type, no API dependency)
**Symptom:** Session-Turn endete durch API-Fehler
**Details:** $errorInput
**Fix-Vorschlag:** Pruefen ob Rate-Limit temporaer oder dauerhaft. Bei dauerhaftem Fehler: API-Key pruefen.
**Status:** OFFEN
"@

# Use whiteboard-insert if available, otherwise direct append as fallback
$inserter = "$HOME\.claude\hooks\whiteboard-insert.ps1"
if (Test-Path $inserter) {
    & $inserter -Section "Offene Fehler & Probleme" -Content $entry
} else {
    # Fallback: direct file append (not ideal but better than losing the error)
    Add-Content -Path $whiteboardPath -Value $entry -Encoding UTF8
}

Write-Host "StopFailure logged to whiteboard at $timestamp"
