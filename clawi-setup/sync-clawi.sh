#!/usr/bin/env bash
# sync-clawi.sh - Sync Clawi's complete identity/memory baseline between Repo and Local Workspace
set -euo pipefail

MODE=${1:-}
SCRIPT_DIR=$(cd "$(dirname "$0")" && pwd)
DEFAULT_REPO_DIR="/Users/frank/clawi/proggs/clawi-setup"
if [[ -n "${CLAWI_SETUP_REPO_DIR:-}" ]]; then
  REPO_DIR="$CLAWI_SETUP_REPO_DIR"
elif [[ "$SCRIPT_DIR" == "$HOME/.openclaw/workspace" ]]; then
  REPO_DIR="$DEFAULT_REPO_DIR"
else
  REPO_DIR="$SCRIPT_DIR"
fi
WORKSPACE_DIR="$HOME/.openclaw/workspace"
FILES_TO_SYNC=(
  "SOUL.md"
  "IDENTITY.md"
  "DIREKTIVEN.md"
  "AGENTS.md"
  "ENVIRONMENT-FIXES.md"
  "Forschung-clawi.md"
  "README.md"
  "HEARTBEAT.md"
  "MEMORY.md"
  "RECOVERY-OPENCLAW.md"
  "health-report-template.md"
  "sync-clawi.sh"
  "sync-clawi.ps1"
)
DIRS_TO_SYNC=(
  "memory"
  "hooks"
  "agents"
)

if [[ ! -d "$WORKSPACE_DIR" ]]; then
  echo "Local OpenClaw workspace not found at $WORKSPACE_DIR"
  exit 1
fi
if [[ ! -d "$REPO_DIR" ]]; then
  echo "Clawi setup repo not found at $REPO_DIR"
  exit 1
fi

copy_file_if_exists() {
  local src="$1"
  local dst="$2"
  if [[ -f "$src" ]]; then
    mkdir -p "$(dirname "$dst")"
    if [[ "$src" != "$dst" ]]; then
      cp "$src" "$dst"
    fi
    echo "  Synced $(basename "$src")"
  fi
}

copy_dir_if_exists() {
  local src="$1"
  local dst="$2"
  if [[ -d "$src" ]]; then
    mkdir -p "$dst"
    if [[ "$src" != "$dst" ]]; then
      cp -R "$src/." "$dst/"
    fi
    echo "  Synced $(basename "$src")/"
  fi
}

case "$MODE" in
  pull)
    echo "Pulling Clawi's full baseline from Repo ($REPO_DIR) to $WORKSPACE_DIR..."
    for file in "${FILES_TO_SYNC[@]}"; do
      copy_file_if_exists "$REPO_DIR/$file" "$WORKSPACE_DIR/$file"
    done
    for dir in "${DIRS_TO_SYNC[@]}"; do
      copy_dir_if_exists "$REPO_DIR/$dir" "$WORKSPACE_DIR/$dir"
    done
    echo "Clawi's full baseline is now up to date in local workspace!"
    ;;
  push)
    echo "Pushing Clawi's full baseline from $WORKSPACE_DIR to Repo ($REPO_DIR)..."
    for file in "${FILES_TO_SYNC[@]}"; do
      copy_file_if_exists "$WORKSPACE_DIR/$file" "$REPO_DIR/$file"
    done
    for dir in "${DIRS_TO_SYNC[@]}"; do
      copy_dir_if_exists "$WORKSPACE_DIR/$dir" "$REPO_DIR/$dir"
    done
    echo "Clawi's full baseline is now backed up in the repository!"
    ;;
  *)
    echo "Usage: $0 {pull|push}"
    exit 1
    ;;
esac
