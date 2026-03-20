# reindex-codebase.ps1 — SessionStart Hook (async)
# Re-indexes the codebase for semantic search if files changed since last index.
# Uses pointer-based DB switching: writes to index-N.db, then updates current.txt.
# The old DB stays untouched and available for searches during the entire reindex.
# Old DBs are cleaned up on a best-effort basis (skips locked files on Windows).

$rootDir = "$env:USERPROFILE\proggs"
$dbDir = Join-Path $rootDir ".code-search"
$stampFile = Join-Path $dbDir ".last-index-time"
$pointerFile = Join-Path $dbDir "current.txt"
$mcpDir = Join-Path $rootDir "mcp-code-search"
$bunExe = "$env:USERPROFILE\.bun\bin\bun.exe"

if (-not (Test-Path (Join-Path $mcpDir "src\index.ts"))) { exit 0 }

# Ensure .mcp.json exists in home directory (Claude Code reads it from working dir)
$homeMcp = Join-Path $env:USERPROFILE ".mcp.json"
$proggsMcp = Join-Path $rootDir ".mcp.json"
if ((Test-Path $proggsMcp) -and -not (Test-Path $homeMcp)) {
    Copy-Item $proggsMcp $homeMcp
}

# Ensure bun dependencies are installed
$nodeModules = Join-Path $mcpDir "node_modules"
if (-not (Test-Path $nodeModules)) {
    Start-Process -FilePath $bunExe -ArgumentList "install" -WorkingDirectory $mcpDir -NoNewWindow -Wait
}

# Auto-start Ollama if not running (headless server — no GUI window)
try {
    $null = Invoke-WebRequest -Uri "http://localhost:11434/api/tags" -TimeoutSec 2 -ErrorAction Stop
} catch {
    $ollamaExe = "$env:LOCALAPPDATA\Programs\Ollama\ollama.exe"
    if (Test-Path $ollamaExe) {
        Start-Process -FilePath $ollamaExe -ArgumentList "serve" -WindowStyle Hidden
        Start-Sleep -Seconds 5
        try {
            $null = Invoke-WebRequest -Uri "http://localhost:11434/api/tags" -TimeoutSec 3 -ErrorAction Stop
        } catch { exit 0 }
    } else { exit 0 }
}

# Ensure nomic-embed-text model is available
try {
    $models = (Invoke-WebRequest -Uri "http://localhost:11434/api/tags" -TimeoutSec 2).Content | ConvertFrom-Json
    $hasNomic = $models.models | Where-Object { $_.name -match "nomic-embed-text" }
    if (-not $hasNomic) {
        Start-Process -FilePath "ollama" -ArgumentList "pull", "nomic-embed-text" -NoNewWindow -Wait
    }
} catch {}

# Check if re-index is needed
$needsReindex = $false
if (-not (Test-Path $stampFile)) {
    $needsReindex = $true
} else {
    $stampTime = (Get-Item $stampFile).LastWriteTime
    $newerFiles = Get-ChildItem -Path $rootDir -Recurse -Include "*.ts","*.kt","*.rs","*.go","*.cs","*.swift","*.py","*.js","*.json","*.md","*.yaml","*.ps1","*.sh" -ErrorAction SilentlyContinue |
        Where-Object { $_.FullName -notmatch '(node_modules|\.git|\.gradle|build|dist|target|\.cache)' } |
        Where-Object { $_.LastWriteTime -gt $stampTime } |
        Select-Object -First 1
    if ($newerFiles) { $needsReindex = $true }
}

if (-not $needsReindex) { exit 0 }

# Determine next DB filename (index-N.db)
$maxN = 0
if (Test-Path $dbDir) {
    Get-ChildItem -Path $dbDir -Filter "index-*.db" -ErrorAction SilentlyContinue | ForEach-Object {
        if ($_.Name -match '^index-(\d+)\.db$') {
            $n = [int]$Matches[1]
            if ($n -gt $maxN) { $maxN = $n }
        }
    }
}
$nextN = $maxN + 1
$newDbName = "index-$nextN.db"

try {
    $script = @"
import { findCodeFiles, chunkFile } from './src/indexer.ts';
import { generateEmbeddings } from './src/ollama.ts';
import { VectorStore } from './src/store.ts';
import { resolve, join } from 'path';
import { mkdirSync, existsSync, writeFileSync, readdirSync, unlinkSync } from 'fs';

const rootDir = resolve('$($rootDir -replace '\\','/')');
const dbDir = join(rootDir, '.code-search');
if (!existsSync(dbDir)) mkdirSync(dbDir, { recursive: true });

// Write to NEW db file — old one stays untouched for active searches
const newDbName = '$newDbName';
const newDbPath = join(dbDir, newDbName);
const store = new VectorStore(newDbPath);

const files = await findCodeFiles(rootDir);
const allChunks = [];
for (const file of files) {
  const chunks = await chunkFile(file, rootDir);
  allChunks.push(...chunks);
}

const BATCH = 32;
for (let i = 0; i < allChunks.length; i += BATCH) {
  const batch = allChunks.slice(i, i + BATCH);
  const embeddings = await generateEmbeddings(batch.map(c => c.content));
  store.insertBatch(batch, embeddings);
}
store.close();

// Update pointer — this is the "switch" moment (tiny text write, practically instant)
writeFileSync(join(dbDir, 'current.txt'), newDbName);

// Clean up old DB files (best-effort — skip if locked by MCP server)
for (const f of readdirSync(dbDir)) {
  if (f.match(/^index-\d+\.db/) && !f.startsWith(newDbName.replace('.db', ''))) {
    try { unlinkSync(join(dbDir, f)); } catch {}
  }
}
"@

    $tempFile = Join-Path $mcpDir "reindex-$([guid]::NewGuid().ToString('N').Substring(0,8)).ts"
    Set-Content -Path $tempFile -Value $script -Encoding UTF8
    try {
        $process = Start-Process -FilePath $bunExe -ArgumentList "run", $tempFile -WorkingDirectory $mcpDir -NoNewWindow -Wait -PassThru
    } finally {
        Remove-Item $tempFile -ErrorAction SilentlyContinue
        # Also clean up any orphaned temp files from previous crashed runs
        Get-ChildItem -Path $mcpDir -Filter "reindex-*.ts" -ErrorAction SilentlyContinue | Remove-Item -ErrorAction SilentlyContinue
    }

    if ($process.ExitCode -eq 0) {
        if (-not (Test-Path $dbDir)) { New-Item -ItemType Directory -Path $dbDir -Force | Out-Null }
        Set-Content -Path $stampFile -Value (Get-Date -Format "o")
        Write-Output "Reindex-Hook: Codebase neu indexiert ($newDbName, pointer-swap)."
    } else {
        $whiteboardFile = Join-Path $rootDir ".claude\agent-memory\shared\MEMORY.md"
        if (Test-Path $whiteboardFile) {
            $exitInfo = if ($process.ExitCode -eq 143) { "SIGTERM — Prozess vom 180s-Timeout gekillt" } else { "Unbekannter Fehler" }
            $entry = "`n### $(Get-Date -Format 'yyyy-MM-dd HH:mm') — Hook: reindex-codebase.ps1 — Indexierung ExitCode $($process.ExitCode)`n**Quelle:** Hook: reindex-codebase.ps1 (SessionStart, async)`n**Symptom:** Semantische Indexierung fehlgeschlagen mit ExitCode $($process.ExitCode) ($exitInfo)`n**Ursache:** $exitInfo. Hook-Timeout in settings.json ist 180s, bei 599+ Dateien und kaltem Ollama kann das knapp werden.`n**Betroffene Dateien:** ~/.claude/settings.json (Hook-Timeout), ~/.claude/hooks/reindex-codebase.ps1`n**Fix-Vorschlag:** Hook-Timeout von 180s auf 300s erhoehen. Alternativ Lock-File um parallele Laeufe zu verhindern.`n**Status:** OFFEN"
            Add-Content -Path $whiteboardFile -Value $entry
        }
        Write-Output "Reindex-Hook: FEHLER — Bun ExitCode $($process.ExitCode). Siehe Shared Whiteboard."
    }
} catch {
    $whiteboardFile = Join-Path $rootDir ".claude\agent-memory\shared\MEMORY.md"
    if (Test-Path $whiteboardFile) {
        $entry = "`n### $(Get-Date -Format 'yyyy-MM-dd HH:mm') — Hook: reindex-codebase.ps1 — Exception`n**Quelle:** Hook: reindex-codebase.ps1 (SessionStart, async)`n**Symptom:** PowerShell-Exception: $($_.Exception.Message)`n**Ursache:** $($_.Exception.GetType().Name) in Zeile $($_.InvocationInfo.ScriptLineNumber): $($_.InvocationInfo.Line.Trim())`n**Betroffene Dateien:** ~/.claude/hooks/reindex-codebase.ps1`n**Fix-Vorschlag:** Exception-Ursache in der genannten Zeile beheben.`n**Status:** OFFEN"
        Add-Content -Path $whiteboardFile -Value $entry
    }
    Write-Output "Reindex-Hook: EXCEPTION — $($_.Exception.Message). Siehe Shared Whiteboard."
}
