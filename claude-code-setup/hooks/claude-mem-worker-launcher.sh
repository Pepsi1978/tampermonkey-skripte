#!/usr/bin/env bash
# claude-mem-worker-launcher.sh — Launchd wrapper for claude-mem worker
#
# Dynamically finds the latest plugin version and starts the worker.
# Used by com.claude-mem.worker.plist (launchd agent).
# Self-healing: survives plugin updates because it resolves the path at runtime.

set -e

# Find the latest claude-mem plugin version
PLUGIN_DIR="$HOME/.claude/plugins/cache/thedotmack/claude-mem"
if [ ! -d "$PLUGIN_DIR" ]; then
    echo "$(date -Iseconds) claude-mem plugin not installed at $PLUGIN_DIR" >&2
    exit 1
fi

LATEST_VERSION=$(ls -1d "$PLUGIN_DIR"/*/ 2>/dev/null | sort -V | tail -1)
if [ -z "$LATEST_VERSION" ]; then
    echo "$(date -Iseconds) No plugin versions found in $PLUGIN_DIR" >&2
    exit 1
fi

WORKER_SCRIPT="${LATEST_VERSION}scripts/worker-service.cjs"
if [ ! -f "$WORKER_SCRIPT" ]; then
    echo "$(date -Iseconds) worker-service.cjs not found at $WORKER_SCRIPT" >&2
    exit 1
fi

# Find bun binary
BUN=""
for candidate in /opt/homebrew/bin/bun /opt/homebrew/Cellar/bun/*/bin/bun "$HOME/.bun/bin/bun" /usr/local/bin/bun; do
    # Use glob-safe check
    for resolved in $candidate; do
        [ -x "$resolved" ] && BUN="$resolved" && break 2
    done
done
if [ -z "$BUN" ]; then
    command -v bun >/dev/null 2>&1 && BUN="bun"
fi

if [ -z "$BUN" ]; then
    echo "$(date -Iseconds) bun not found" >&2
    exit 1
fi

echo "$(date -Iseconds) Starting claude-mem worker: $BUN $WORKER_SCRIPT --daemon"
exec "$BUN" "$WORKER_SCRIPT" --daemon
