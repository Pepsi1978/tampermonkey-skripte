$ScriptDir = Split-Path -Parent $MyInvocation.MyCommand.Path
& node (Join-Path $ScriptDir "check-openai-docs-mcp.mjs") @args
exit $LASTEXITCODE
