# reindex-codebase.ps1 — SessionStart Hook (async)
# Re-indexes the codebase for semantic search if files changed since last index.
# Uses atomic swap: writes to index.db.new, then renames to index.db.
# This ensures the old index stays available during the entire reindex process.

$rootDir = "$env:USERPROFILE\proggs"
$dbDir = Join-Path $rootDir ".code-search"
$dbFile = Join-Path $dbDir "index.db"
$dbFileNew = Join-Path $dbDir "index.db.new"
$stampFile = Join-Path $dbDir ".last-index-time"
$mcpDir = Join-Path $rootDir "mcp-code-search"
$bunExe = "$env:USERPROFILE\.bun\bin\bun.exe"

# Check if MCP server project exists
if (-not (Test-Path (Join-Path $mcpDir "src\index.ts"))) {
    exit 0
}

# Check if Ollama is running
try {
    $null = Invoke-WebRequest -Uri "http://localhost:11434/api/tags" -TimeoutSec 2 -ErrorAction Stop
} catch {
    exit 0
}

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

    if ($newerFiles) {
        $needsReindex = $true
    }
}

if (-not $needsReindex) {
    exit 0
}

# Clean up leftover .new file from a previous failed run
if (Test-Path $dbFileNew) {
    Remove-Item $dbFileNew -Force -ErrorAction SilentlyContinue
}

# Reindex into a TEMPORARY database (index.db.new), then swap atomically
try {
    $script = @"
import { findCodeFiles, chunkFile } from './src/indexer.ts';
import { generateEmbeddings } from './src/ollama.ts';
import { VectorStore } from './src/store.ts';
import { resolve, join } from 'path';
import { mkdirSync, existsSync, renameSync, unlinkSync } from 'fs';

const rootDir = resolve('$($rootDir -replace '\\','/')');
const dbDir = join(rootDir, '.code-search');
if (!existsSync(dbDir)) mkdirSync(dbDir, { recursive: true });

// Write to index.db.new (old index.db stays untouched and searchable)
const newDbPath = join(dbDir, 'index.db.new');
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

// Atomic swap: delete old, rename new to old
const oldDbPath = join(dbDir, 'index.db');
try { unlinkSync(oldDbPath); } catch {}
try { unlinkSync(oldDbPath + '-wal'); } catch {}
try { unlinkSync(oldDbPath + '-shm'); } catch {}
renameSync(newDbPath, oldDbPath);
try { unlinkSync(newDbPath + '-wal'); } catch {}
try { unlinkSync(newDbPath + '-shm'); } catch {}
"@

    $tempFile = Join-Path $env:TEMP "reindex-$([guid]::NewGuid().ToString('N').Substring(0,8)).ts"
    Set-Content -Path $tempFile -Value $script -Encoding UTF8

    $process = Start-Process -FilePath $bunExe -ArgumentList "run", $tempFile -WorkingDirectory $mcpDir -NoNewWindow -Wait -PassThru

    Remove-Item $tempFile -ErrorAction SilentlyContinue

    if ($process.ExitCode -eq 0) {
        if (-not (Test-Path $dbDir)) { New-Item -ItemType Directory -Path $dbDir -Force | Out-Null }
        Set-Content -Path $stampFile -Value (Get-Date -Format "o")
        Write-Output "Reindex-Hook: Codebase neu indexiert (atomic swap)."
    }
} catch {
    # Clean up failed .new file
    if (Test-Path $dbFileNew) {
        Remove-Item $dbFileNew -Force -ErrorAction SilentlyContinue
    }
}
