#!/bin/bash
# agent-resource-lock.sh — Prevents parallel agents from using the same resource
# C4: Agentmaxxing Resource Lock Pattern
# Usage: ./agent-resource-lock.sh <resource> <action>
# Arguments:
#   <resource> — e.g., "android-emulator", "port-5000", "gradle-daemon"
#   <action>   — acquire | release | check
# Lock files live in /tmp/claude-locks/ — auto-expire after 10 minutes

set -euo pipefail

if [ $# -ne 2 ]; then
    echo "Usage: $0 <resource> <acquire|release|check>"
    exit 2
fi

RESOURCE="$1"
ACTION="$2"

# Validate action argument
case "$ACTION" in
    acquire|release|check) ;;
    *)
        echo "Invalid action '$ACTION'. Must be: acquire, release, or check"
        exit 2
        ;;
esac

LOCK_DIR="/tmp/claude-locks"
mkdir -p "$LOCK_DIR"
LOCK_FILE="$LOCK_DIR/${RESOURCE}.lock"

# Returns lock age in whole minutes, or -1 if no lock file exists
get_lock_age_minutes() {
    if [ ! -f "$LOCK_FILE" ]; then
        echo -1
        return
    fi
    local now
    local mtime
    now=$(date +%s)
    mtime=$(stat -c %Y "$LOCK_FILE" 2>/dev/null || stat -f %m "$LOCK_FILE" 2>/dev/null)
    echo $(( (now - mtime) / 60 ))
}

case "$ACTION" in
    acquire)
        age=$(get_lock_age_minutes)
        if [ "$age" -ge 0 ] && [ "$age" -lt 10 ]; then
            owner=$(cat "$LOCK_FILE" 2>/dev/null || echo "unknown")
            echo "LOCKED — Resource '$RESOURCE' is held by $owner (${age}min ago). Wait or use a different resource."
            exit 1
        fi
        # Acquire lock (overwrites stale locks older than 10 minutes)
        echo "$(hostname)-PID$$-$(date +%H:%M:%S)" > "$LOCK_FILE"
        echo "ACQUIRED — Resource '$RESOURCE' locked."
        exit 0
        ;;

    release)
        if [ -f "$LOCK_FILE" ]; then
            rm -f "$LOCK_FILE"
            echo "RELEASED — Resource '$RESOURCE' unlocked."
        else
            echo "NO-LOCK — Resource '$RESOURCE' was not locked."
        fi
        exit 0
        ;;

    check)
        age=$(get_lock_age_minutes)
        if [ "$age" -ge 0 ] && [ "$age" -lt 10 ]; then
            owner=$(cat "$LOCK_FILE" 2>/dev/null || echo "unknown")
            echo "BUSY — Resource '$RESOURCE' is held by $owner (${age}min ago)."
            exit 1
        else
            echo "FREE — Resource '$RESOURCE' is available."
            exit 0
        fi
        ;;
esac
