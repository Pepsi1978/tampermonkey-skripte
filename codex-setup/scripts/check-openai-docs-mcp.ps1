$Server = ((codex mcp get openaiDeveloperDocs) -join "`n")

if ($Server -notmatch "enabled: true") {
    throw "openaiDeveloperDocs MCP is not enabled."
}

if ($Server -notmatch "https://developers.openai.com/mcp") {
    throw "openaiDeveloperDocs MCP points to an unexpected URL."
}

$null = Invoke-WebRequest -UseBasicParsing -Uri "https://developers.openai.com/api/docs/guides/tools-connectors-mcp"

Write-Host "openaiDeveloperDocs MCP configured and official docs reachable"
