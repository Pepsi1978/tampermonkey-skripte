# TerminalVoiceOverlay — Windows

Ein schwebendes WPF-Overlay, das sich automatisch am Rand des aktiven Terminals einblendet. Per Knopfdruck wird Sprache aufgenommen, via **Groq Whisper** in Text umgewandelt und direkt ins Terminal eingefuegt. Optional korrigiert **Google Gemini** den transkribierten Text vor dem Einfuegen.

---

## Features

- **Voice-to-Text**: Mikrofon-Button druecken, sprechen, nochmal druecken — der transkribierte Text wird direkt ins Terminal eingefuegt
- **Gemini-Korrektur** (optional): Verbessert Grammatik, Rechtschreibung und Zeichensetzung des transkribierten Texts vor dem Einfuegen
- **Automatische Sichtbarkeit**: Das Overlay erscheint nur, wenn ein Terminal-Fenster aktiv ist, und versteckt sich automatisch
- **Multi-Monitor**: Das Overlay positioniert sich immer auf dem Monitor des aktiven Terminals
- **Zeile loeschen**: X-Button loescht die aktuelle Zeile im Terminal
- **System-Tray**: Laeuft unauffaellig im Hintergrund mit Tray-Icon
- **Watcher**: Optionaler Watcher startet das Overlay automatisch neu, falls es sich beendet
- **Autostart**: Kann sich beim Windows-Login automatisch starten

---

## Voraussetzungen

### 1. .NET 8 SDK

Das Projekt ist eine WPF-App, die mit .NET 8 gebaut wird. Du brauchst das SDK zum Kompilieren.

Download: **https://dotnet.microsoft.com/download/dotnet/8.0**

> Lade den **SDK-Installer** herunter (nicht nur die Runtime). Waehle **Windows x64**.

Nach der Installation pruefen — oeffne ein neues Terminal und fuehre aus:

```powershell
dotnet --version
```

> Es muss eine Versionsnummer wie `8.0.x` angezeigt werden.

### 2. Groq API-Key (erforderlich)

Groq stellt die Whisper-API fuer die Spracherkennung bereit. Du brauchst einen kostenlosen API-Key.

1. Gehe zu: **https://console.groq.com/**
2. Erstelle ein Konto oder melde dich an
3. Gehe zu **API Keys** und erstelle einen neuen Key
4. Kopiere den Key — du brauchst ihn gleich fuer die `.env`-Datei

### 3. Gemini API-Key (optional)

Gemini korrigiert den transkribierten Text (Grammatik, Satzzeichen). Ohne Gemini-Key wird der Rohtext von Whisper direkt eingefuegt.

1. Gehe zu: **https://aistudio.google.com/apikey**
2. Melde dich mit deinem Google-Konto an
3. Erstelle einen API-Key und kopiere ihn

---

## Installation

### 1. Repository klonen

Falls du das Repository noch nicht auf deinem Rechner hast:

```powershell
cd $HOME\Documents
```

```powershell
git clone https://github.com/Pepsi1978/proggs.git
```

```powershell
cd proggs\TerminalVoiceOverlay-Windows
```

Falls du das Repository bereits hast, hole den aktuellen Stand:

```powershell
cd $HOME\Documents\proggs
```

```powershell
git pull origin main
```

```powershell
cd TerminalVoiceOverlay-Windows
```

### 2. Projekt kompilieren

Das Skript `publish.ps1` baut eine einzelne, ausfuehrbare `.exe`-Datei (self-contained, kein .NET auf dem Zielrechner noetig):

```powershell
pwsh -File publish.ps1
```

> Die fertige `TerminalVoiceOverlay.exe` liegt danach im Ordner `publish/`. Die Datei ist ca. 60-80 MB gross, da die komplette .NET-Runtime enthalten ist.

**Hinweis:** Falls `pwsh` nicht gefunden wird, nutze stattdessen:

```powershell
powershell -File publish.ps1
```

### 3. Konfiguration (.env-Datei)

Erstelle die `.env`-Datei aus der Vorlage:

```powershell
copy .env.example publish\.env
```

Oeffne die Datei zum Bearbeiten:

```powershell
notepad publish\.env
```

Trage mindestens deinen **Groq API-Key** ein. Die wichtigsten Einstellungen:

| Variable | Pflicht | Beschreibung |
|---|---|---|
| `GROQ_API_KEY` | Ja | Dein Groq API-Key fuer Whisper Speech-to-Text |
| `WHISPER_MODEL` | Nein | Whisper-Modell (Standard: `whisper-large-v3`) |
| `WHISPER_LANG` | Nein | Sprache der Aufnahme (Standard: `de` fuer Deutsch) |
| `GEMINI_API_KEY` | Nein | Google Gemini API-Key fuer Textkorrektur |
| `GEMINI_MODEL` | Nein | Gemini-Modell (Standard: `gemini-3.1-flash-lite-preview`) |
| `GEMINI_THINKING_LEVEL` | Nein | Thinking-Level fuer Gemini 3.x: `LOW`, `MEDIUM` oder `HIGH` |
| `TERMINAL_PROCESS_NAMES` | Nein | Kommagetrennte Terminal-Prozessnamen (Standard: `WindowsTerminal,pwsh,powershell`) |

> **Wichtig:** Die `.env`-Datei enthaelt deine geheimen API-Keys. Sie darf **niemals** auf GitHub hochgeladen werden.

Die `.env`-Datei wird in folgender Reihenfolge gesucht:

1. Neben der `.exe` (empfohlen)
2. Im aktuellen Arbeitsverzeichnis
3. In `%USERPROFILE%\.env`
4. In `%APPDATA%\TerminalVoiceOverlay\.env`

### 4. Starten

```powershell
.\publish\TerminalVoiceOverlay.exe
```

Das Overlay erscheint automatisch am rechten Rand, sobald ein Terminal-Fenster (Windows Terminal, PowerShell) aktiv ist.

---

## Autostart einrichten

Damit das Overlay bei jedem Windows-Login automatisch startet:

```powershell
pwsh -File install_autostart.ps1
```

> Das Skript erstellt eine Verknuepfung im Windows-Autostart-Ordner, die den **Watcher** startet. Der Watcher ueberwacht alle 3 Sekunden, ob das Overlay laeuft, und startet es automatisch neu, falls es sich beendet hat.

Um den Autostart wieder zu entfernen:

```powershell
pwsh -File uninstall_autostart.ps1
```

---

## Bedienung

Das Overlay zeigt drei runde Buttons:

| Button | Funktion |
|---|---|
| **X** | Loescht die aktuelle Zeile im Terminal (simuliert End + Backspace) |
| **Mikrofon** | Aufnahme starten/stoppen — spricht den Text ins Terminal |
| **G** | Gemini-Korrektur an/aus (gruen = an, rot = aus) |

### Mikrofon-Farben

| Farbe | Bedeutung |
|---|---|
| Dunkelgrau | Bereit (Idle) |
| Rot (pulsierend) | Aufnahme laeuft |
| Orange | Verarbeitung (Transkription / Korrektur) |
| Gruen | Erfolgreich eingefuegt |

### Workflow

1. Terminal-Fenster oeffnen (Windows Terminal, PowerShell)
2. Das Overlay erscheint automatisch am rechten Bildschirmrand
3. Mikrofon-Button klicken — Aufnahme startet (Button pulsiert rot)
4. Sprechen
5. Mikrofon-Button nochmal klicken — Aufnahme stoppt
6. Text wird transkribiert, optional von Gemini korrigiert, und ins Terminal eingefuegt

---

## Projektstruktur

```
TerminalVoiceOverlay-Windows/
  .env.example          — Vorlage fuer die Konfiguration
  App.xaml / App.xaml.cs — WPF-Anwendung mit System-Tray-Icon
  TerminalVoiceOverlay.csproj — Projektdatei (.NET 8, WPF)
  app.manifest           — Windows-Manifest
  Models/
    RecordingState.cs    — Enum fuer Aufnahmezustaende
  NativeMethods/
    Win32.cs             — Win32-API-Aufrufe (SetForegroundWindow, SendInput, etc.)
  Services/
    AudioRecorder.cs     — Mikrofon-Aufnahme via NAudio
    Config.cs            — .env-Datei laden und parsen
    GeminiClient.cs      — Google Gemini API-Client fuer Textkorrektur
    GroqWhisperClient.cs — Groq Whisper API-Client fuer Transkription
    TerminalController.cs — Text ins Terminal einfuegen, Zeile loeschen
    TerminalWatcher.cs   — Erkennt aktive Terminal-Fenster
  Views/
    OverlayWindow.xaml   — Overlay-UI (drei runde Buttons)
    OverlayWindow.xaml.cs — Overlay-Logik
  publish.ps1            — Build-Skript (erzeugt einzelne .exe)
  install_autostart.ps1  — Richtet Autostart mit Watcher ein
  uninstall_autostart.ps1 — Entfernt den Autostart
  watcher.vbs            — Ueberwacht das Overlay und startet es bei Bedarf neu
```

---

## Haeufige Probleme

| Problem | Loesung |
|---|---|
| `dotnet wird nicht erkannt` | .NET 8 SDK installieren von https://dotnet.microsoft.com/download/dotnet/8.0 und Terminal neu starten |
| `pwsh wird nicht erkannt` | PowerShell 7 installieren oder stattdessen `powershell -File publish.ps1` verwenden |
| Overlay erscheint nicht | Pruefen ob ein Terminal-Fenster (Windows Terminal / PowerShell) im Vordergrund ist. Andere Terminals muessen ggf. in `TERMINAL_PROCESS_NAMES` ergaenzt werden |
| Transkription schlaegt fehl | `GROQ_API_KEY` in der `.env` pruefen. Ist der Key gueltig? Ist die `.env` neben der `.exe`? |
| Gemini-Korrektur funktioniert nicht | `GEMINI_API_KEY` pruefen. Ohne Key wird Gemini automatisch deaktiviert (kein Fehler) |
| Text wird nicht eingefuegt | Das Terminal-Fenster muss im Vordergrund sein. Das Overlay aktiviert das Terminal vor dem Einfuegen automatisch |
| Watcher startet nicht | Pruefen ob `watcher.vbs` und `publish\TerminalVoiceOverlay.exe` im selben Verzeichnis liegen |
| Mehrere Overlay-Instanzen | Der Watcher hat eine Doppelstart-Sperre. Falls trotzdem mehrere laufen: Task-Manager oeffnen und `TerminalVoiceOverlay.exe` beenden |

---

## Technologie

- **C# / WPF** (.NET 8) — Desktop-UI mit transparentem, nicht-aktivierendem Overlay
- **NAudio** — Mikrofon-Aufnahme (WAV)
- **Groq Whisper API** — Speech-to-Text
- **Google Gemini API** — Textkorrektur (optional)
- **Win32 API** — Fenster-Erkennung, Vordergrund-Steuerung, Tastatureingabe-Simulation
