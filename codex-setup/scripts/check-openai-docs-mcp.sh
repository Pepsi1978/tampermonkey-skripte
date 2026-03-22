#!/usr/bin/env bash
set -euo pipefail

codex mcp get openaiDeveloperDocs | rg -F "enabled: true" >/dev/null
codex mcp get openaiDeveloperDocs | rg -F "https://developers.openai.com/mcp" >/dev/null
curl -fsS -o /dev/null "https://developers.openai.com/api/docs/guides/tools-connectors-mcp"

echo "openaiDeveloperDocs MCP configured and official docs reachable"
