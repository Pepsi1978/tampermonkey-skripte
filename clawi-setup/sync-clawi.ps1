# sync-clawi.ps1 - Sync Clawi's Identity/Memory between Repo and Local Workspace
param(
    [Parameter(Mandatory=$true)]
    [ValidateSet("pull", "push")]
    $Mode
)

$ErrorActionPreference = "Stop"

# Paths
$RepoDir = $PSScriptRoot
$WorkspaceDir = Join-Path $env:USERPROFILE ".openclaw\workspace"
$FilesToSync = @("SOUL.md", "IDENTITY.md", "DIREKTIVEN.md")

if (-not (Test-Path $WorkspaceDir)) {
    Write-Host "Local OpenClaw workspace not found at $WorkspaceDir" -ForegroundColor Red
    exit 1
}

if ($Mode -eq "pull") {
    # From Repo to Workspace
    Write-Host "Pulling Clawi's Identity from Repo to $WorkspaceDir..." -ForegroundColor Cyan
    foreach ($file in $FilesToSync) {
        $repoFile = Join-Path $RepoDir $file
        if (Test-Path $repoFile) {
            Copy-Item $repoFile $WorkspaceDir -Force
            Write-Host "  Updated $file"
        }
    }
    # Memory Sync (pull)
    $repoMemory = Join-Path $RepoDir "memory"
    $workspaceMemory = Join-Path $WorkspaceDir "memory"
    if (Test-Path $repoMemory) {
        if (-not (Test-Path $workspaceMemory)) { New-Item -ItemType Directory $workspaceMemory -Force }
        Copy-Item (Join-Path $repoMemory "*") $workspaceMemory -Force -Recurse
        Write-Host "  Updated Memory logs"
    }
    Write-Host "Clawi's Identity is now up to date in local workspace!" -ForegroundColor Green
}
elseif ($Mode -eq "push") {
    # From Workspace to Repo
    Write-Host "Pushing Clawi's Identity from $WorkspaceDir to Repo..." -ForegroundColor Cyan
    foreach ($file in $FilesToSync) {
        $wsFile = Join-Path $WorkspaceDir $file
        if (Test-Path $wsFile) {
            Copy-Item $wsFile $RepoDir -Force
            Write-Host "  Saved $file"
        }
    }
    # Memory Sync (push)
    $wsMemory = Join-Path $WorkspaceDir "memory"
    $repoMemory = Join-Path $RepoDir "memory"
    if (Test-Path $wsMemory) {
        if (-not (Test-Path $repoMemory)) { New-Item -ItemType Directory $repoMemory -Force }
        Copy-Item (Join-Path $wsMemory "*") $repoMemory -Force -Recurse
        Write-Host "  Saved Memory logs"
    }
    Write-Host "Clawi's Identity is now backed up in the repository!" -ForegroundColor Green
}
