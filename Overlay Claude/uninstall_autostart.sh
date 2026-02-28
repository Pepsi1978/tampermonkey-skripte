#!/bin/bash
# ============================================================
# Entfernt den Claude Voice Overlay Autostart (LaunchAgent)
# ============================================================

PLIST_NAME="com.claude-voice.overlay.plist"
PLIST_PATH="$HOME/Library/LaunchAgents/$PLIST_NAME"

echo "=== Claude Voice Overlay – Autostart Deinstallation ==="
echo

if [ -f "$PLIST_PATH" ]; then
    launchctl unload "$PLIST_PATH" 2>/dev/null
    rm "$PLIST_PATH"
    echo "LaunchAgent entfernt: $PLIST_PATH"
else
    echo "Kein LaunchAgent gefunden – nichts zu tun."
fi

# Overlay-Prozess beenden falls noch aktiv
pkill -f "auto_launch.sh" 2>/dev/null
pkill -f "voice_overlay_macos.py" 2>/dev/null

echo "Autostart deinstalliert."
echo "Das Overlay wird beim nächsten Login nicht mehr automatisch gestartet."
