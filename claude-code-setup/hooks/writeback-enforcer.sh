#!/usr/bin/env bash
# writeback-enforcer.sh — SubagentStop Hook for Write-Back Enforcement (C1, macOS/Linux)
# Checks for sentinel files written by senior agents, merges findings into MEMORY.md.
# Equivalent of writeback-enforcer.ps1 for non-Windows platforms.

SENTINEL_DIR="${TMPDIR:-/tmp}"
MEMORY_FILE="$HOME/proggs/.claude/agent-memory/shared/MEMORY.md"

[ ! -f "$MEMORY_FILE" ] && exit 0

# Find sentinel files
shopt -s nullglob
sentinels=("$SENTINEL_DIR"/agent-writeback-*.json)
shopt -u nullglob

[ ${#sentinels[@]} -eq 0 ] && exit 0

for f in "${sentinels[@]}"; do
    agent=$(python3 -c "import json; print(json.load(open('$f')).get('agent','unknown'))" 2>/dev/null || echo "unknown")
    findings=$(python3 -c "import json; print(json.load(open('$f')).get('findings','(no findings)'))" 2>/dev/null || echo "(no findings)")
    ts=$(date +"%Y-%m-%d %H:%M")
    entry="- **[$ts] $agent**: $findings"

    # Simple insertion: replace placeholder or append after section header
    if grep -q "_Noch keine Eintraege._" "$MEMORY_FILE"; then
        sed -i.bak "0,/_Noch keine Eintraege._/s/_Noch keine Eintraege._/$entry/" "$MEMORY_FILE"
        rm -f "$MEMORY_FILE.bak"
    fi

    rm -f "$f"
    echo "WriteBack-Enforcer: Merged $agent findings"
done

exit 0
