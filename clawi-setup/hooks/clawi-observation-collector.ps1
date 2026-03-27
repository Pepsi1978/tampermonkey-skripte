# clawi-observation-collector.ps1 - Automatischer Gedächtnis-Staubsauger (v2 mit Kontext)
# Scannt die OpenClaw Transkripte nach "🔍 Selbstbeobachtung" und sichert sie inkl. Kontext.

$ErrorActionPreference = "SilentlyContinue"

# Pfade
$SessionsDir = Join-Path $env:USERPROFILE ".openclaw\agents\main\sessions"
$WorkspaceDir = Join-Path $env:USERPROFILE ".openclaw\workspace"
$MemoryDir = Join-Path $WorkspaceDir "memory"
$Today = Get-Date -Format "yyyy-MM-dd"
$LogFile = Join-Path $MemoryDir "$Today.md"

Write-Host "🦖 Clawi Gedächtnis-Staubsauger (v2) startet..." -ForegroundColor Cyan

# 1. Neueste Transkript finden
$LatestFile = Get-ChildItem $SessionsDir -Filter "*.jsonl" | Sort-Object LastWriteTime -Descending | Select-Object -First 1
if (-not $LatestFile) {
    Write-Host "Kein Transkript gefunden."
    exit 0
}

# 2. Daily Log initialisieren
if (-not (Test-Path $MemoryDir)) { New-Item -ItemType Directory $MemoryDir -Force }
if (-not (Test-Path $LogFile)) { 
    "# 🧠 Selbstbeobachtung - $Today`n" | Out-File $LogFile -Encoding utf8 
}

# 3. Transkript laden
$Entries = Get-Content $LatestFile.FullName | ForEach-Object { 
    try { $_ | ConvertFrom-Json } catch { $null } 
}

$CollectorCount = 0
for ($i = 0; $i -lt $Entries.Count; $i++) {
    $entry = $Entries[$i]
    if ($null -eq $entry -or $entry.role -ne "assistant") { continue }
    
    # Suche nach Selbstbeobachtung
    if ($entry.content -match "(🔍 Selbstbeobachtung[\s\S]*?)(?=\n\n|\n💡|\n---|\z)") {
        $observation = $Matches[1].Trim()
        
        # Kontext-Suche: Nimm die letzte Benutzer-Nachricht vor dieser Beobachtung
        $context = "Kein Kontext gefunden."
        for ($j = $i - 1; $j -ge 0; $j--) {
            if ($Entries[$j].role -eq "user") {
                $context = $Entries[$j].content.Trim()
                if ($context.Length -gt 200) { $context = $context.Substring(0, 197) + "..." }
                break
            }
        }
        
        # Prüfen ob bereits im Log
        $CurrentLog = Get-Content $LogFile -Raw
        if ($CurrentLog -match [regex]::Escape($observation)) {
            continue
        }
        
        # Anhängen mit Kontext
        $logBlock = "`n### 🗓️ Gesammelt am $(Get-Date -Format 'HH:mm:ss')`n"
        $logBlock += "**Kontext (User):** $context`n`n"
        $logBlock += "$observation`n"
        $logBlock += "---`n"
        
        $logBlock | Out-File $LogFile -Append -Encoding utf8
        $CollectorCount++
    }
}

if ($CollectorCount -gt 0) {
    Write-Host "✅ $CollectorCount neue Beobachtung(en) mit Kontext gesichert." -ForegroundColor Green
} else {
    Write-Host "Keine neuen Beobachtungen gefunden."
}
