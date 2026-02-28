#!/bin/bash
# ============================================================
# Installiert den Claude Voice Overlay Autostart als macOS
# LaunchAgent – das Overlay startet dann automatisch beim Login
# und überwacht ob Claude Desktop geöffnet ist.
# ============================================================

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
PLIST_NAME="com.claude-voice.overlay.plist"
PLIST_PATH="$HOME/Library/LaunchAgents/$PLIST_NAME"
WATCHER="$SCRIPT_DIR/auto_launch.sh"
LOG_DIR="$HOME/Library/Logs/ClaudeVoiceOverlay"

echo "=== Claude Voice Overlay – Autostart Installation ==="
echo

# Bestes verfügbares Python finden (Homebrew bevorzugt)
PYTHON=""
for candidate in /opt/homebrew/bin/python3.13 /opt/homebrew/bin/python3.12 \
                 /opt/homebrew/bin/python3.11 /opt/homebrew/bin/python3 \
                 /usr/local/bin/python3 python3; do
    if command -v "$candidate" &>/dev/null; then
        PYTHON="$candidate"
        break
    fi
done

if [ -z "$PYTHON" ]; then
    echo "FEHLER: Kein Python 3 gefunden!"
    echo "Installiere Homebrew Python: brew install python"
    exit 1
fi

echo "Python: $($PYTHON --version) ($PYTHON)"

# Prüfe ob venv existiert
if [ ! -f "$SCRIPT_DIR/venv/bin/python3" ]; then
    echo "Virtuelle Umgebung wird erstellt..."
    "$PYTHON" -m venv "$SCRIPT_DIR/venv"
    echo "Virtuelle Umgebung erstellt."
    echo
fi

# Pakete immer aktualisieren (damit neue Abhängigkeiten installiert werden)
echo "Pakete werden installiert/aktualisiert..."
"$SCRIPT_DIR/venv/bin/pip" install -q -r "$SCRIPT_DIR/requirements-macos.txt"
echo "Pakete bereit."
echo

# Ausführbar machen
chmod +x "$WATCHER"

# LaunchAgents-Ordner sicherstellen
mkdir -p "$HOME/Library/LaunchAgents"
mkdir -p "$LOG_DIR"

# Alten Agent stoppen falls vorhanden
if launchctl list | grep -q "com.claude-voice.overlay"; then
    echo "Vorherigen LaunchAgent stoppen..."
    launchctl unload "$PLIST_PATH" 2>/dev/null
fi

# LaunchAgent plist erstellen
cat > "$PLIST_PATH" << PLIST
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE plist PUBLIC "-//Apple//DTD PLIST 1.0//EN" "http://www.apple.com/DTDs/PropertyList-1.0.dtd">
<plist version="1.0">
<dict>
    <key>Label</key>
    <string>com.claude-voice.overlay</string>
    <key>ProgramArguments</key>
    <array>
        <string>/bin/bash</string>
        <string>${WATCHER}</string>
    </array>
    <key>RunAtLoad</key>
    <true/>
    <key>KeepAlive</key>
    <false/>
    <key>StandardOutPath</key>
    <string>${LOG_DIR}/overlay.log</string>
    <key>StandardErrorPath</key>
    <string>${LOG_DIR}/overlay-error.log</string>
    <key>EnvironmentVariables</key>
    <dict>
        <key>PATH</key>
        <string>/usr/local/bin:/usr/bin:/bin:/opt/homebrew/bin</string>
    </dict>
</dict>
</plist>
PLIST

# Agent laden
launchctl load "$PLIST_PATH"

echo "Autostart installiert!"
echo
echo "  Plist:  $PLIST_PATH"
echo "  Logs:   $LOG_DIR/overlay.log"
echo
echo "Der Watcher läuft jetzt im Hintergrund."
echo "Öffne die Claude Desktop App – das Overlay erscheint automatisch."
echo
echo "Zum Deinstallieren: bash '$SCRIPT_DIR/uninstall_autostart.sh'"
