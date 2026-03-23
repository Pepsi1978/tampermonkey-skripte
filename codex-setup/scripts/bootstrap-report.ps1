$ScriptDir = Split-Path -Parent $MyInvocation.MyCommand.Path
& node (Join-Path $ScriptDir "bootstrap-report.mjs") @args
exit $LASTEXITCODE
