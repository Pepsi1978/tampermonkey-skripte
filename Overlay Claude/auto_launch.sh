#!/bin/bash
# ============================================================
# Claude Voice Overlay – Autostart-Watcher
# Überwacht ob die Claude Desktop App läuft und startet/stoppt
# das Voice Overlay automatisch.
# ============================================================

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
VENV_PYTHON="$SCRIPT_DIR/venv/bin/python3"
OVERLAY_SCRIPT="$SCRIPT_DIR/voice_overlay_macos.py"
OVERLAY_PID=""
CHECK_INTERVAL=3  # Sekunden zwischen Checks

# Whisper-Modell und Sprache (anpassbar)
MODEL="${VOICE_MODEL:-small}"
LANG="${VOICE_LANG:-de}"

log() {
    echo "[$(date '+%H:%M:%S')] $1"
}

cleanup() {
    log "Beende Watcher..."
    if [ -n "$OVERLAY_PID" ] && kill -0 "$OVERLAY_PID" 2>/dev/null; then
        kill "$OVERLAY_PID" 2>/dev/null
        log "Overlay beendet (PID $OVERLAY_PID)"
    fi
    exit 0
}

trap cleanup SIGINT SIGTERM

# Prüfe ob venv existiert
if [ ! -f "$VENV_PYTHON" ]; then
    log "FEHLER: Virtuelle Umgebung nicht gefunden: $VENV_PYTHON"
    log "Erstelle sie mit: cd '$SCRIPT_DIR' && python3 -m venv venv && source venv/bin/activate && pip install -r requirements-macos.txt"
    exit 1
fi

log "Claude Voice Overlay Watcher gestartet"
log "Überwache Claude Desktop App..."
log "Modell: $MODEL | Sprache: $LANG"

while true; do
    # Prüfe ob Claude läuft (App-Name ist "Claude")
    if pgrep -xq "Claude"; then
        # Claude läuft – Overlay starten falls nötig
        if [ -z "$OVERLAY_PID" ] || ! kill -0 "$OVERLAY_PID" 2>/dev/null; then
            log "Claude erkannt – starte Voice Overlay..."
            "$VENV_PYTHON" "$OVERLAY_SCRIPT" --model "$MODEL" --lang "$LANG" &
            OVERLAY_PID=$!
            log "Overlay gestartet (PID $OVERLAY_PID)"
        fi
    else
        # Claude läuft nicht – Overlay stoppen falls aktiv
        if [ -n "$OVERLAY_PID" ] && kill -0 "$OVERLAY_PID" 2>/dev/null; then
            log "Claude geschlossen – beende Overlay..."
            kill "$OVERLAY_PID" 2>/dev/null
            OVERLAY_PID=""
            log "Overlay beendet"
        fi
    fi

    sleep "$CHECK_INTERVAL"
done
