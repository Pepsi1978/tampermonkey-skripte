# Claude Desktop Voice Input

Schwebender Mikrofon-Button als Overlay über der Claude Desktop App.
Klick auf den Button startet die Sprachaufnahme, ein zweiter Klick stoppt sie.
Der gesprochene Text wird per Whisper (lokal!) transkribiert und automatisch
ins Eingabefeld der Claude Desktop App eingefügt.

## Features

- **Lokale Transkription** – kein Cloud-Service, alles läuft auf deinem Rechner (Whisper)
- **Always-on-Top Overlay** – schwebt über der Claude Desktop App
- **Frei verschiebbar** – per Rechtsklick (Windows) / Ctrl+Click (macOS) ziehen
- **Globaler Hotkey** – Strg+Shift+M (Windows) / Cmd+Shift+M (macOS)
- **Automatische Texteingabe** – transkribierter Text wird direkt ins Claude-Eingabefeld eingefügt
- **Visuelle Status-Anzeige** – Idle (grau), Aufnahme (rot pulsierend), Verarbeitung (orange)

## Voraussetzungen

- Python 3.9+
- Mikrofon
- Claude Desktop App (geöffnet)

## Installation

### Windows

```bash
# Repository klonen
git clone https://github.com/Pepsi1978/tampermonkey-skripte.git
cd tampermonkey-skripte/claude-voice-input

# Virtuelle Umgebung erstellen (empfohlen)
python -m venv venv
venv\Scripts\activate

# Abhängigkeiten installieren
pip install -r requirements-windows.txt
```

### macOS

```bash
# Repository klonen
git clone https://github.com/Pepsi1978/tampermonkey-skripte.git
cd tampermonkey-skripte/claude-voice-input

# Virtuelle Umgebung erstellen (empfohlen)
python3 -m venv venv
source venv/bin/activate

# Abhängigkeiten installieren
pip install -r requirements-macos.txt

# Tkinter für macOS (falls nicht vorhanden)
brew install python-tk
```

**macOS Berechtigungen:** Beim ersten Start wirst du nach Mikrofon-Zugriff und
Bedienungshilfen-Berechtigung gefragt (Systemeinstellungen > Datenschutz & Sicherheit).

## Nutzung

### Windows

```bash
python voice_overlay_windows.py
```

### macOS

```bash
python voice_overlay_macos.py
```

### Optionen

```
--model {tiny,base,small,medium,large}   Whisper Modell-Größe (Standard: base)
--lang LANG                               Sprachcode (Standard: de)
```

**Beispiele:**

```bash
# Größeres Modell für bessere Erkennung
python voice_overlay_windows.py --model small

# Englische Spracheingabe
python voice_overlay_macos.py --lang en

# Schnellstes Modell (weniger genau)
python voice_overlay_windows.py --model tiny
```

## Autostart (macOS)

Das Voice Overlay kann automatisch mitgestartet werden, wenn du die Claude Desktop App öffnest.

### Installation

```bash
cd "Overlay Claude"
bash install_autostart.sh
```

Das war's! Ab jetzt wird das Overlay automatisch gestartet, sobald du Claude Desktop öffnest, und beendet, sobald du Claude schließt.

### Deinstallation

```bash
bash uninstall_autostart.sh
```

### Konfiguration

Du kannst Whisper-Modell und Sprache über Umgebungsvariablen anpassen.
Bearbeite dazu die plist-Datei unter `~/Library/LaunchAgents/com.claude-voice.overlay.plist`
und füge hinzu:

```xml
<key>VOICE_MODEL</key>
<string>small</string>
<key>VOICE_LANG</key>
<string>en</string>
```

### Logs

Logs findest du unter:
```
~/Library/Logs/ClaudeVoiceOverlay/overlay.log
~/Library/Logs/ClaudeVoiceOverlay/overlay-error.log
```

## Bedienung

| Aktion | Windows | macOS |
|---|---|---|
| Aufnahme starten/stoppen | Klick auf Button | Klick auf Button |
| Globaler Hotkey | Strg+Shift+M | Cmd+Shift+M |
| Button verschieben | Rechtsklick + Ziehen | Ctrl+Click + Ziehen |
| Beenden | Escape | Escape |

## Whisper Modell-Größen

| Modell | RAM | Geschwindigkeit | Qualität |
|---|---|---|---|
| tiny | ~1 GB | Sehr schnell | Grundlegend |
| **base** | ~1 GB | **Schnell** | **Gut (Standard)** |
| small | ~2 GB | Mittel | Sehr gut |
| medium | ~5 GB | Langsam | Exzellent |
| large | ~10 GB | Sehr langsam | Beste |

Für Deutsch empfehle ich mindestens `base`, für beste Ergebnisse `small` oder `medium`.

## Troubleshooting

### "Kein Mikrofon gefunden"
- Prüfe ob dein Mikrofon vom System erkannt wird
- Windows: Einstellungen > System > Sound > Eingabe
- macOS: Systemeinstellungen > Ton > Eingabe

### "Kein Text erkannt"
- Sprich deutlicher oder näher am Mikrofon
- Versuche ein größeres Modell: `--model small`
- Prüfe die Sprache: `--lang de` für Deutsch

### macOS: "Bedienungshilfen-Zugriff verweigert"
- Systemeinstellungen > Datenschutz & Sicherheit > Bedienungshilfen
- Python/Terminal zu den erlaubten Apps hinzufügen

### Windows: Hotkey funktioniert nicht
- Das `keyboard`-Paket benötigt auf manchen Systemen Admin-Rechte
- Alternative: Nutze einfach den Button-Klick

## Architektur

```
Overlay Claude/
├── voice_core.py              # Shared: Whisper-Integration, AudioRecorder
├── voice_overlay_windows.py   # Windows-spezifisches Overlay (tkinter)
├── voice_overlay_macos.py     # macOS-spezifisches Overlay (tkinter + AppleScript)
├── auto_launch.sh             # Watcher: startet Overlay wenn Claude läuft
├── install_autostart.sh       # Installiert macOS LaunchAgent (Autostart)
├── uninstall_autostart.sh     # Entfernt den Autostart
├── requirements-windows.txt   # Windows Abhängigkeiten
├── requirements-macos.txt     # macOS Abhängigkeiten
└── README.md
```
