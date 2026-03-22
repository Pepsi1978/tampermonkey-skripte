param(
    [Parameter(Mandatory = $true)][string]$Section,
    [Parameter(Mandatory = $true)][string]$Entry
)

$ScriptDir = Split-Path -Parent $MyInvocation.MyCommand.Path
$RepoRoot = (Resolve-Path (Join-Path $ScriptDir "..\..")).Path
$DirectiveToken = (node (Join-Path $ScriptDir "whiteboard-bridge.mjs") directive-token --workspace $RepoRoot | Select-Object -Last 1).Trim()
node (Join-Path $ScriptDir "whiteboard-bridge.mjs") insert --workspace $RepoRoot --directive-token $DirectiveToken --section $Section --entry $Entry
