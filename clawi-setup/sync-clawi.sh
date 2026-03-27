#!/usr/bin/env bash
# sync-clawi.sh - Sync Clawi's Identity/Memory between Repo and Local Workspace
set -e

# Configuration
MODE=$1
REPO_DIR=$(cd "$(dirname "$0")" && pwd)
WORKSPACE_DIR="$HOME/.openclaw/workspace"
FILES_TO_SYNC=("SOUL.md" "IDENTITY.md" "DIREKTIVEN.md")

if [[ ! -d "$WORKSPACE_DIR" ]]; then
    echo "Local OpenClaw workspace not found at $WORKSPACE_DIR"
    exit 1
fi

case "$MODE" in
    "pull")
        echo "Pulling Clawi's Identity from Repo to $WORKSPACE_DIR..."
        for file in "${FILES_TO_SYNC[@]}"; do
            if [[ -f "$REPO_DIR/$file" ]]; then
                cp "$REPO_DIR/$file" "$WORKSPACE_DIR/"
                echo "  Updated $file"
            fi
        done
        # Memory Sync (pull)
        if [[ -d "$REPO_DIR/memory" ]]; then
            mkdir -p "$WORKSPACE_DIR/memory"
            cp -r "$REPO_DIR/memory/"* "$WORKSPACE_DIR/memory/"
            echo "  Updated Memory logs"
        fi
        echo "Clawi's Identity is now up to date in local workspace!"
        ;;
    "push")
        echo "Pushing Clawi's Identity from $WORKSPACE_DIR to Repo..."
        for file in "${FILES_TO_SYNC[@]}"; do
            if [[ -f "$WORKSPACE_DIR/$file" ]]; then
                cp "$WORKSPACE_DIR/$file" "$REPO_DIR/"
                echo "  Saved $file"
            fi
        done
        # Memory Sync (push)
        if [[ -d "$WORKSPACE_DIR/memory" ]]; then
            mkdir -p "$REPO_DIR/memory"
            cp -r "$WORKSPACE_DIR/memory/"* "$REPO_DIR/memory/"
            echo "  Saved Memory logs"
        fi
        echo "Clawi's Identity is now backed up in the repository!"
        ;;
    *)
        echo "Usage: $0 {pull|push}"
        exit 1
        ;;
esac
