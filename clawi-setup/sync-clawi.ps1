# sync-clawi.ps1 - Sync Clawi's complete identity/memory baseline between Repo and Local Workspace
param(
    [Parameter(Mandatory=$true)]
    [ValidateSet("pull", "push")]
    $Mode
)

$ErrorActionPreference = "Stop"

$ScriptDir = $PSScriptRoot
$DefaultRepoDir = "/Users/frank/clawi/proggs/clawi-setup"
if ($env:CLAWI_SETUP_REPO_DIR) {
    $RepoDir = $env:CLAWI_SETUP_REPO_DIR
}
elseif ($ScriptDir -eq (Join-Path $env:USERPROFILE ".openclaw\workspace")) {
    $RepoDir = $DefaultRepoDir
}
else {
    $RepoDir = $ScriptDir
}
$WorkspaceDir = Join-Path $env:USERPROFILE ".openclaw\workspace"
$FilesToSync = @(
    "SOUL.md",
    "IDENTITY.md",
    "DIREKTIVEN.md",
    "AGENTS.md",
    "ENVIRONMENT-FIXES.md",
    "Forschung-clawi.md",
    "README.md",
    "HEARTBEAT.md",
    "MEMORY.md",
    "RECOVERY-OPENCLAW.md",
    "health-report-template.md",
    "sync-clawi.sh",
    "sync-clawi.ps1"
)
$DirsToSync = @("memory", "hooks", "agents")

if (-not (Test-Path $WorkspaceDir)) {
    Write-Host "Local OpenClaw workspace not found at $WorkspaceDir" -ForegroundColor Red
    exit 1
}
if (-not (Test-Path $RepoDir)) {
    Write-Host "Clawi setup repo not found at $RepoDir" -ForegroundColor Red
    exit 1
}

function Copy-IfExists {
    param(
        [string]$Source,
        [string]$Destination
    )

    if (Test-Path $Source) {
        $parent = Split-Path -Parent $Destination
        if ($parent -and -not (Test-Path $parent)) {
            New-Item -ItemType Directory -Path $parent -Force | Out-Null
        }
        if ($Source -ne $Destination) { Copy-Item $Source $Destination -Force }
        Write-Host "  Synced $(Split-Path $Source -Leaf)"
    }
}

function Copy-DirIfExists {
    param(
        [string]$Source,
        [string]$Destination
    )

    if (Test-Path $Source) {
        if (-not (Test-Path $Destination)) { New-Item -ItemType Directory -Path $Destination -Force | Out-Null }
        if ($Source -ne $Destination) { Copy-Item (Join-Path $Source "*") $Destination -Force -Recurse }
        Write-Host "  Synced $(Split-Path $Source -Leaf)/"
    }
}

if ($Mode -eq "pull") {
    Write-Host "Pulling Clawi's full baseline from Repo ($RepoDir) to $WorkspaceDir..." -ForegroundColor Cyan
    foreach ($file in $FilesToSync) {
        Copy-IfExists (Join-Path $RepoDir $file) (Join-Path $WorkspaceDir $file)
    }
    foreach ($dir in $DirsToSync) {
        Copy-DirIfExists (Join-Path $RepoDir $dir) (Join-Path $WorkspaceDir $dir)
    }
    Write-Host "Clawi's full baseline is now up to date in local workspace!" -ForegroundColor Green
}
elseif ($Mode -eq "push") {
    Write-Host "Pushing Clawi's full baseline from $WorkspaceDir to Repo ($RepoDir)..." -ForegroundColor Cyan
    foreach ($file in $FilesToSync) {
        Copy-IfExists (Join-Path $WorkspaceDir $file) (Join-Path $RepoDir $file)
    }
    foreach ($dir in $DirsToSync) {
        Copy-DirIfExists (Join-Path $WorkspaceDir $dir) (Join-Path $RepoDir $dir)
    }
    Write-Host "Clawi's full baseline is now backed up in the repository!" -ForegroundColor Green
}
