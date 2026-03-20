#!/usr/bin/env bash
# whiteboard-insert.sh — Shared helper for section-based whiteboard insertion (bash/macOS/Linux)
# Source this in any hook that needs to write to MEMORY.md:
#   source "$(dirname "$0")/whiteboard-insert.sh"
#   insert_whiteboard_entry "Offene Fehler & Probleme" "$my_entry"
#
# This replaces naive append (Add-Content / echo >> ) which is FORBIDDEN by whiteboard rules.
# Entries are inserted inside the correct ## Section, replacing the placeholder if present.

insert_whiteboard_entry() {
    local section="$1"
    local entry="$2"
    local memory_file="$HOME/proggs/.claude/agent-memory/shared/MEMORY.md"
    local placeholder="_Noch keine Eintraege._"

    [ -f "$memory_file" ] || return 0

    # Use Python3 for reliable in-place multi-line editing (available on macOS and Linux)
    python3 - "$memory_file" "$section" "$entry" "$placeholder" <<'PYEOF'
import sys

memory_file = sys.argv[1]
section     = sys.argv[2]
entry       = sys.argv[3]
placeholder = sys.argv[4]

with open(memory_file, 'r', encoding='utf-8') as f:
    lines = f.readlines()

section_header = f"## {section}"
section_idx = -1
for i, line in enumerate(lines):
    if line.rstrip() == section_header or line.rstrip().startswith(section_header):
        section_idx = i
        break

if section_idx < 0:
    sys.exit(0)  # Section not found — do nothing

# Scan inside the section to find placeholder or insertion point
insert_idx = section_idx + 1
placeholder_idx = -1
for j in range(section_idx + 1, len(lines)):
    stripped = lines[j].rstrip()
    if stripped.startswith("## ") or stripped == "---":
        break
    if lines[j].strip() == placeholder:
        placeholder_idx = j
        break
    insert_idx = j + 1

if placeholder_idx >= 0:
    lines[placeholder_idx] = entry + "\n"
else:
    lines.insert(insert_idx, entry + "\n")

with open(memory_file, 'w', encoding='utf-8') as f:
    f.writelines(lines)
PYEOF
}
