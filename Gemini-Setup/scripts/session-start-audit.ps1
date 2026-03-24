# session-start-audit.ps1 (Gemini) — Automatisches Cross-CLI Audit bei Session-Start
$RepoRoot = $env:GEMINI_WORKSPACE
if (-not $RepoRoot) { $RepoRoot = "C:\Users\barwa\GeminiCLI" }
cd $RepoRoot

# Lade Whiteboard-Funktionalität
. "$RepoRoot\Gemini-Setup\scripts\whiteboard-insert.ps1"

Write-Host "=== 💡 Gemini Cross-CLI Intelligence Audit (Start/PS7) ===" -ForegroundColor Cyan

function Process-DeltaAudit($CliName, $ScriptPath) {
    Write-Host "Pruefe $CliName..."
    $AuditOutput = node "$RepoRoot\$ScriptPath"
    $NewCommits = $AuditOutput | Select-String "\[([a-f0-9]{7})\]"
    
    if ($NewCommits.Count -gt 0) {
        $Count = $NewCommits.Count
        Write-Host "💡 $CliName: $Count neue Commits gefunden." -ForegroundColor Yellow
        
        $Timestamp = Get-Date -Format "yyyy-MM-dd HH:mm"
        $Entry = "### $Timestamp — Brücken-Audit ($CliName): $Count neue Commits seit dem letzten Checkpoint gefunden. Empfehlung: Brücke zu $CliName starten (`audit-$($CliName.ToLower().Replace(' ', '-'))-delta.mjs`)."
        
        # In Whiteboard unter "Offene Fehler & Probleme" oder eine neue Sektion schreiben
        Insert-WhiteboardEntry -Section "Offene Fehler & Probleme" -Entry $Entry
    } else {
        Write-Host "✅ $CliName ist synchron." -ForegroundColor Green
    }
}

# Codex Audit
Process-DeltaAudit "Codex" "Gemini-Setup/scripts/audit-codex-delta.mjs"

# Claude Audit
Process-DeltaAudit "Claude Code" "Gemini-Setup/scripts/audit-claude-delta.mjs"

Write-Host "=== Audit abgeschlossen ==="
