#!/usr/bin/env bash
# hook-log.sh — Error logging for Claude Code hooks (bash/macOS/Linux)
# Source this at the top of every hook script:
#   source "$(dirname "$0")/hook-log.sh"
#
# Provides:
#   hook_log "message"       — log info message
#   hook_log_error "message" — log error with details
#   hook_log_warn "message"  — log warning
#
# Logs to: ~/.claude/logs/hooks/YYYY-MM-DD.log
# Log rotation: files older than 14 days are auto-deleted

_HOOK_LOG_DIR="$HOME/.claude/logs/hooks"
_HOOK_LOG_NAME="$(basename "${BASH_SOURCE[1]:-unknown-hook}" .sh)"
_HOOK_LOG_FILE="$_HOOK_LOG_DIR/$(date '+%Y-%m-%d').log"

# Ensure log directory exists
mkdir -p "$_HOOK_LOG_DIR"

# Clean up log files older than 14 days (macOS uses -mtime +14, Linux too)
find "$_HOOK_LOG_DIR" -name "*.log" -mtime +14 -delete 2>/dev/null || true

hook_log() {
    local ts
    ts=$(date '+%H:%M:%S')
    echo "[$ts] $_HOOK_LOG_NAME: $1" >> "$_HOOK_LOG_FILE" 2>/dev/null || true
}

hook_log_error() {
    local ts
    ts=$(date '+%H:%M:%S')
    echo "[$ts] ERROR $_HOOK_LOG_NAME: $1" >> "$_HOOK_LOG_FILE" 2>/dev/null || true
}

hook_log_warn() {
    local ts
    ts=$(date '+%H:%M:%S')
    echo "[$ts] WARN  $_HOOK_LOG_NAME: $1" >> "$_HOOK_LOG_FILE" 2>/dev/null || true
}

hook_log "started"
