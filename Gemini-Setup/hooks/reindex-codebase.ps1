# reindex-codebase.ps1 (Gemini) — Hintergrund-Indexierung mit Status-Zusammenfassung
$RepoRoot = $env:GEMINI_WORKSPACE
if (-not $RepoRoot) { $RepoRoot = "C:\Users\barwa\GeminiCLI" }

$ReindexScript = "$RepoRoot\mcp-code-search\src\reindex.ts"
$SummaryScript = "$RepoRoot\Gemini-Setup\hooks\post-reindex-summary.ps1"

Write-Host "[$(Get-Date)] Starte Hintergrund-Reindex mit automatischer Zusammenfassung..."

# Verkette Reindex und Summary in einer versteckten PowerShell-Sitzung
$Command = "bun run `"$ReindexScript`" `"$RepoRoot`" ; if (`$?) { & `"$SummaryScript`" }"
Start-Process -FilePath "powershell.exe" -ArgumentList "-NoProfile", "-Command", "$Command" -WindowStyle Hidden

Write-Host "✅ Reindex & Summary Job im Hintergrund verkettet."
