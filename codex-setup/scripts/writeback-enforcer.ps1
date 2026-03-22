param(
    [string]$SentinelDir
)

$ScriptDir = Split-Path -Parent $MyInvocation.MyCommand.Path
$RepoRoot = (Resolve-Path (Join-Path $ScriptDir "..\..")).Path
$DirectiveToken = (node (Join-Path $ScriptDir "whiteboard-bridge.mjs") directive-token --workspace $RepoRoot | Select-Object -Last 1).Trim()

if ($SentinelDir) {
    node (Join-Path $ScriptDir "whiteboard-bridge.mjs") merge-sentinels --workspace $RepoRoot --directive-token $DirectiveToken --sentinel-dir $SentinelDir
} else {
    node (Join-Path $ScriptDir "whiteboard-bridge.mjs") merge-sentinels --workspace $RepoRoot --directive-token $DirectiveToken
}
