# read-and-extract-porting-list.ps1 (Gemini) — Extrahiert Details aus fremden Briefkaesten
$RepoRoot = $env:GEMINI_WORKSPACE
if (-not $RepoRoot) { $RepoRoot = "C:\Users\barwa\GeminiCLI" }

# Lade Whiteboard-Funktionalität
. "$RepoRoot\Gemini-Setup\scripts\whiteboard-insert.ps1"

$PortingPaths = @(
    @{ name = "Codex"; path = "$RepoRoot\codex-setup\PORTING-LIST.md" },
    @{ name = "Claude Code"; path = "$RepoRoot\claude-code-setup\PORTING-LIST.md" }
)

Write-Host "=== 💡 Gemini Porting-Inbox Extraktor ===" -ForegroundColor Cyan

foreach ($cp in $PortingPaths) {
    if (Test-Path $cp.path) {
        Write-Host "Extrahiere neue Ideen von $($cp.name)..." -ForegroundColor Yellow
        $content = Get-Content $cp.path -Raw
        
        # Suche nach Vorschlag-Bloecken ### [ID]
        $matches = [regex]::Matches($content, "###\s+\[(.*?)\]([\s\S]*?)(?=###|##|$)")
        
        foreach ($match in $matches) {
            $id = $match.Groups[1].Value.Trim()
            $body = $match.Groups[2].Value.Trim()
            
            $Timestamp = Get-Date -Format "yyyy-MM-dd HH:mm"
            $Entry = "### $Timestamp — 📥 Portierungs-Vorschlag von $($cp.name): [$id]`n$body"
            
            # Extrahiere Summary fuer Fuzzy Match (erste Zeile des Bodys)
            $summaryLine = $body.Split("`n")[0].Trim()

            # Nutze den zentralen Dubletten-Check mit Fuzzy Match
            powershell.exe -NoProfile -ExecutionPolicy Bypass -File "$RepoRoot\Gemini-Setup\scripts\check-for-duplicate-suggestions.ps1" -SuggestionId $id -Summary $summaryLine
            $checkStatus = $LASTEXITCODE

            if ($checkStatus -eq 0) {
                Insert-WhiteboardEntry -Section "Offene Fehler & Probleme" -Entry $Entry
                Write-Host "  ✅ [$id] ins Whiteboard uebernommen." -ForegroundColor Green
            } elseif ($checkStatus -eq 1) {
                Write-Host "  ⏭️ [$id] bereits im Whiteboard bekannt (ID match)." -ForegroundColor DarkGray
            } elseif ($checkStatus -eq 2) {
                Write-Host "  ✨ [$id] bereits erfolgreich umgesetzt (im Ledger)." -ForegroundColor Cyan
            } elseif ($checkStatus -eq 3) {
                Write-Host "  🤔 [$id] uebersprungen: Eine sehr aehnliche Idee existiert bereits (Inhalts-Match)." -ForegroundColor Yellow
            }
        }
    }
}
