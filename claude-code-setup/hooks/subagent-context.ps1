# SubagentStart Hook: Inject global project rules into every subagent
# This ensures all subagents know the core rules even without conversation history
#
# DESIGN: Output MUST be valid JSON on stdout. Any error → empty output + exit 0.
# PowerShell equivalent of subagent-context.sh

. "$PSScriptRoot/hook-log.ps1"

try {
    $context = @{
        additionalContext = @"
## Globale Projekt-Regeln (automatisch injiziert)

### Repository
- EINZIGES Repo: Pepsi1978/proggs — NIEMALS neue Repos erstellen
- Lokaler Pfad: ~/proggs/ — GitHub: https://github.com/Pepsi1978/proggs
- Jeder Push geht ausschliesslich nach Pepsi1978/proggs

### Sprachen & Plattformen
- Bevorzugt: Swift, C#, Kotlin, TypeScript, Rust, Go (in dieser Reihenfolge)
- KEIN Python fuer GUIs oder Desktop-Apps
- Cross-Platform: macOS (Swift/AppKit) + Windows (C#/WPF) + Android (Kotlin/Compose)

### Commits & Kommunikation
- Commit-Format: #NNN - Beschreibung (fortlaufend nummeriert, Englisch)
- Kommunikation mit Benutzer auf Deutsch, Code auf Englisch
- Committen und Pushen immer direkt — nicht vorher fragen
- Letzter Satz IMMER: 'Committed und gepusht.' / 'Committed.' / 'Ich habe weder committed noch gepusht.'

### Qualitaet
- UI muss aussehen wie gekaufte Software — poliert, professionell
- Nach jedem Feature: quality-gate Agent starten (tester + code-reviewer + optimizer)
- Bei Fehlern selbststaendig debuggen und fixen
"@
    }

    # Output must be valid JSON on stdout — use ConvertTo-Json (no pretty-print for single line)
    $json = $context | ConvertTo-Json -Compress
    Write-Output $json
} catch {
    Hook-LogError "subagent-context failed: $($_.Exception.Message)"
    # On error: output nothing, exit cleanly (Claude will proceed without injected context)
}

exit 0
