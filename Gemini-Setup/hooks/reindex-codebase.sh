#!/usr/bin/env bash
# reindex-codebase.sh (Gemini) — Hintergrund-Indexierung
set -euo pipefail

REPO_ROOT="/Users/frank/GeminiCLI"
SCRIPT_PATH="$REPO_ROOT/Gemini-Setup/scripts/code-search-mcp-client.mjs"

echo "[$(date)] Starte Hintergrund-Reindex..."
nohup node "$SCRIPT_PATH" call index_codebase --args-json "{\"directory\": \"$REPO_ROOT\"}" > /dev/null 2>&1 &

echo "✅ Reindex-Job im Hintergrund gestartet."
