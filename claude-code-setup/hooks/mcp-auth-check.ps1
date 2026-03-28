# MCP Auth Check: Detects expired cloud connector sessions at startup
# Hook event: SessionStart (async)
# Platform: Windows (PowerShell 7+)
#
# Checks all MCP servers for "Needs authentication" or "Failed to connect"
# and outputs actionable messages instead of cryptic status codes.
#
# Output: stdout → AI context (system-reminder)

$ErrorActionPreference = 'SilentlyContinue'

try {
    $output = & claude mcp list 2>&1 | Out-String

    $authNeeded = @()
    $failed = @()

    foreach ($line in $output -split "`n") {
        $line = $line.Trim()
        if ($line -match '^(.+?)\s*[-:].+Needs authentication') {
            $serverName = $Matches[1].Trim()
            $authNeeded += $serverName
        }
        elseif ($line -match '^(.+?)\s*[-:].+Failed to connect') {
            $serverName = $Matches[1].Trim()
            $failed += $serverName
        }
    }

    $messages = @()

    if ($authNeeded.Count -gt 0) {
        $names = $authNeeded -join ', '
        $messages += "MCP-Auth-Check: $($authNeeded.Count) Cloud-Connector(s) haben eine abgelaufene Session: $names. Loesung: claude.ai/settings oeffnen und die Verbindung erneuern (Re-Login)."
    }

    if ($failed.Count -gt 0) {
        $names = $failed -join ', '
        $messages += "MCP-Auth-Check: $($failed.Count) MCP-Server nicht erreichbar: $names. Moeglicherweise fehlt ein API-Token oder der Server ist offline."
    }

    if ($messages.Count -gt 0) {
        foreach ($msg in $messages) {
            Write-Output $msg
            [Console]::Error.WriteLine("⚠ $msg")
        }
    } else {
        Write-Output "MCP-Auth-Check: Alle MCP-Server verbunden."
    }
} catch {
    # Never block session start
    Write-Output "MCP-Auth-Check: Pruefung fehlgeschlagen (nicht kritisch)."
}

exit 0
