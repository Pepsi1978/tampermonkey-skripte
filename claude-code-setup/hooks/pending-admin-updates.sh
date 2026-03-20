#!/usr/bin/env bash
# Pending Admin Updates — SessionEnd Hook (macOS/Linux version)
# Checks for available system updates and logs them.
# Equivalent of pending-admin-updates.ps1 for non-Windows platforms.

if [ "$(uname)" = "Darwin" ]; then
    # macOS: check brew
    if command -v brew &>/dev/null; then
        outdated=$(brew outdated 2>/dev/null | head -20)
        if [ -n "$outdated" ]; then
            count=$(echo "$outdated" | wc -l | tr -d ' ')
            echo "Pending-Admin-Updates: $count brew Updates verfuegbar."
        else
            echo "Pending-Admin-Updates: Keine ausstehenden Updates."
        fi
    fi
else
    # Linux: check apt
    if command -v apt &>/dev/null; then
        updates=$(apt list --upgradable 2>/dev/null | grep -c upgradable || echo 0)
        echo "Pending-Admin-Updates: $updates apt Updates verfuegbar."
    fi
fi

exit 0
