#!/usr/bin/env bash
# Memory Watchdog — SubagentStop Hook (v1.0, macOS/Linux version)
# Checks if a senior agent wrote back to MEMORY.md after finishing.
# Equivalent of memory-watchdog.ps1 for non-Windows platforms.

MEMORY_FILE="$HOME/proggs/.claude/agent-memory/shared/MEMORY.md"
COUNTER_FILE="/tmp/claude-writeback-counter.txt"

miss_count=0
if [ -f "$COUNTER_FILE" ]; then
    miss_count=$(cat "$COUNTER_FILE" 2>/dev/null || echo 0)
fi

# Check if MEMORY.md was modified in the last 3 minutes
recent_write=false
if [ -f "$MEMORY_FILE" ]; then
    if [ "$(uname)" = "Darwin" ]; then
        last_mod=$(stat -f %m "$MEMORY_FILE")
    else
        last_mod=$(stat -c %Y "$MEMORY_FILE")
    fi
    now=$(date +%s)
    diff=$((now - last_mod))
    if [ "$diff" -lt 180 ]; then
        recent_write=true
    fi
fi

if [ "$recent_write" = true ]; then
    echo "0" > "$COUNTER_FILE"
    echo "MEMORY_WATCHDOG: Write-back detected — counter reset"
    exit 0
fi

miss_count=$((miss_count + 1))
echo "$miss_count" > "$COUNTER_FILE"

if [ "$miss_count" -ge 5 ]; then
    ts=$(date +"%Y-%m-%d %H:%M")
    entry="### [$ts] Agent: Write-Back nicht erfolgt ($miss_count aufeinanderfolgende Agents) — Status: AUTO-LOGGED"
    # Section-based insertion using whiteboard-insert.sh if available
    if [ -f "$HOME/.claude/hooks/whiteboard-insert.sh" ]; then
        source "$HOME/.claude/hooks/whiteboard-insert.sh"
        insert_whiteboard_entry "Offene Fehler & Probleme" "$entry"
    else
        # Fallback: replace first placeholder or append after section header
        if grep -q "_Noch keine Eintraege._" "$MEMORY_FILE"; then
            sed -i.bak "0,/_Noch keine Eintraege._/s/_Noch keine Eintraege._/$entry/" "$MEMORY_FILE"
            rm -f "$MEMORY_FILE.bak"
        fi
    fi
    echo "0" > "$COUNTER_FILE"
    echo "MEMORY_WATCHDOG: $miss_count consecutive misses — logged to MEMORY.md"
fi

exit 0
