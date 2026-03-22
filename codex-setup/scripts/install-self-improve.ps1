$ScriptDir = Split-Path -Parent $MyInvocation.MyCommand.Path
$RepoRoot = Resolve-Path (Join-Path $ScriptDir "..\..")
$SourceDir = Join-Path $RepoRoot "codex-setup\skills\self-improve"
$TargetDir = Join-Path $env:USERPROFILE ".codex\skills\self-improve"
$CacheDir = Join-Path $env:USERPROFILE ".codex\self-improve-cache"

New-Item -ItemType Directory -Force -Path $TargetDir | Out-Null
New-Item -ItemType Directory -Force -Path $CacheDir | Out-Null

Get-ChildItem -Path $TargetDir -Force -ErrorAction SilentlyContinue | Remove-Item -Recurse -Force
Copy-Item -Path (Join-Path $SourceDir "*") -Destination $TargetDir -Recurse -Force

Write-Host "Installed Codex self-improve skill to $TargetDir"
