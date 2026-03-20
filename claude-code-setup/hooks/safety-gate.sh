#!/bin/bash
# Safety Gate: Block dangerous commands before execution
# Hook event: PreToolUse (Bash)
# Platform: macOS / Linux (bash)

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
HOOK_NAME="safety-gate"
LOG_DIR="$HOME/.claude/logs/hooks"
LOG_FILE="$LOG_DIR/$(date +%Y-%m-%d).log"

# ---------------------------------------------------------------------------
# Logging helpers (mirrors hook-log.ps1 behaviour)
# ---------------------------------------------------------------------------
_hook_log() {
    local level="$1"
    local msg="$2"
    local ts
    ts="$(date +%H:%M:%S)"
    mkdir -p "$LOG_DIR"
    echo "[$ts] $level $HOOK_NAME: $msg" >> "$LOG_FILE" 2>/dev/null || true
    # Rotate: delete log files older than 14 days
    find "$LOG_DIR" -name "*.log" -mtime +14 -delete 2>/dev/null || true
}
hook_log()       { _hook_log ""      "$1"; }
hook_log_error() { _hook_log "ERROR" "$1"; }

# Source whiteboard helper
# shellcheck source=whiteboard-insert.sh
source "$SCRIPT_DIR/whiteboard-insert.sh"

# ---------------------------------------------------------------------------
# Read JSON from stdin
# ---------------------------------------------------------------------------
hook_input="$(cat)"

tool_name="$(printf '%s' "$hook_input" | python3 -c "import sys,json; d=json.load(sys.stdin); print(d.get('tool_name',''))" 2>/dev/null)"
cmd="$(printf '%s' "$hook_input"       | python3 -c "import sys,json; d=json.load(sys.stdin); print(d.get('tool_input',{}).get('command',''))" 2>/dev/null)"

# Only check Bash tool calls
if [ "$tool_name" != "Bash" ]; then
    exit 0
fi

if [ -z "$cmd" ]; then
    exit 0
fi

# ---------------------------------------------------------------------------
# Dangerous patterns to block (ERE regex, checked with grep -E)
# ---------------------------------------------------------------------------
declare -a PATTERNS=(
    'rm[[:space:]]+-rf[[:space:]]+[/~]'               # rm -rf / or ~
    'git[[:space:]]+push[[:space:]]+--force[[:space:]]+.*main'  # force-push to main
    'git[[:space:]]+reset[[:space:]]+--hard'           # hard reset
    'git[[:space:]]+restore[[:space:]]+\.'             # git restore . (discard all changes)
    'git[[:space:]]+branch[[:space:]]+-D'              # git branch -D (force-delete)
    '(?i)DROP[[:space:]]+TABLE'                        # SQL DROP TABLE (case-insensitive)
    '(?i)DROP[[:space:]]+DATABASE'                     # SQL DROP DATABASE (case-insensitive)
    '(?i)TRUNCATE[[:space:]]+TABLE'                    # SQL TRUNCATE TABLE
)

# Case-insensitive SQL patterns need a separate pass via grep -i
declare -a PATTERNS_CI=(
    'DROP[[:space:]]+TABLE'
    'DROP[[:space:]]+DATABASE'
    'TRUNCATE[[:space:]]+TABLE'
)

# Case-sensitive check
for pattern in "${PATTERNS[@]}"; do
    # Skip the (?i) patterns — handled below
    [[ "$pattern" == '(?i)'* ]] && continue
    if printf '%s' "$cmd" | grep -Eq "$pattern"; then
        short_cmd="${cmd:0:100}"
        hook_log_error "BLOCKED dangerous command: $pattern — cmd: $short_cmd"
        entry="### $(date '+%Y-%m-%d %H:%M') — Hook: safety-gate.sh — Befehl blockiert: $pattern"
        insert_whiteboard_entry "Offene Fehler & Probleme" "$entry"
        printf '{"error":"BLOCKED: Dangerous command detected — %s"}\n' "$pattern"
        exit 2
    fi
done

# Case-insensitive check (SQL keywords)
for pattern in "${PATTERNS_CI[@]}"; do
    if printf '%s' "$cmd" | grep -Eiq "$pattern"; then
        short_cmd="${cmd:0:100}"
        hook_log_error "BLOCKED dangerous command (ci): $pattern — cmd: $short_cmd"
        entry="### $(date '+%Y-%m-%d %H:%M') — Hook: safety-gate.sh — Befehl blockiert (ci): $pattern"
        insert_whiteboard_entry "Offene Fehler & Probleme" "$entry"
        printf '{"error":"BLOCKED: Dangerous command detected — %s"}\n' "$pattern"
        exit 2
    fi
done

hook_log "started — command passed all checks"
exit 0
