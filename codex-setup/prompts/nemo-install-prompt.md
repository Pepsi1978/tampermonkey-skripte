# Nemo MCP-Server fuer Codex CLI installieren

## Aufgabe

Installiere den **Nemo MCP-Server** in der Codex CLI Umgebung. Nemo ist ein kostenloser Wissens-Worker der Nemotron 3 Super 120B ueber NVIDIAs NIM API nutzt. Er spart Token-Kosten indem einfache Wissensaufgaben (Quizfragen, Recherche, Uebersetzungen, Seed-Daten) an ein kostenloses LLM ausgelagert werden.

Der MCP-Server existiert bereits als funktionierender TypeScript-Code im Repo unter `~/proggs/tools/nemo-mcp/`. Er muss nur fuer Codex konfiguriert werden.

---

## Schritt 1: MCP-Server in Codex registrieren

Fuege folgenden Block in `~/.codex/config.toml` ein (bei den anderen `[mcp_servers.*]` Eintraegen):

```toml
[mcp_servers.nemo-mcp]
command = "/opt/homebrew/bin/bun"
args = ["run", "/Users/frank/proggs/tools/nemo-mcp/src/index.ts"]

[mcp_servers.nemo-mcp.env]
NIM_API_KEY = "<DEIN_NIM_API_KEY>"
```

**Wichtig**: Den NIM API-Key bekommst du kostenlos auf https://build.nvidia.com — kein Kreditkarte noetig, grosszuegige Rate Limits. Der Key beginnt mit `nvapi-`. Der aktuelle Key liegt in der Umgebungsvariable `$NIM_API_KEY` auf dem Mac.

**Auf Windows** waeren die Pfade anders:
```toml
[mcp_servers.nemo-mcp]
command = "C:/Users/barwa/.bun/bin/bun.exe"
args = ["run", "C:/Users/barwa/proggs/tools/nemo-mcp/src/index.ts"]

[mcp_servers.nemo-mcp.env]
NIM_API_KEY = "<DEIN_NIM_API_KEY>"
```

---

## Schritt 2: Dependencies sicherstellen

```bash
cd ~/proggs/tools/nemo-mcp && bun install
```

Falls `node_modules` schon existiert (aus einem frueheren Install), ist dieser Schritt optional.

---

## Schritt 3: Funktionstest

Nach dem Neustart von Codex CLI sollten die folgenden MCP-Tools verfuegbar sein:

| Tool | Beschreibung | Deutsche Trigger-Woerter |
|------|-------------|--------------------------|
| `nemo_ask` | Wissensfragen beantworten | "frag Nemo", "lass Nemo antworten", "kostenlose Frage" |
| `nemo_quiz` | Parallele Quizfragen generieren (QuizVerse-Format) | "Quizfragen erstellen", "Quiz generieren" |
| `nemo_research` | Strukturierte Recherche | "recherchiere mit Nemo", "Nemo-Recherche" |
| `nemo_generate` | Seed-Daten / strukturierte Inhalte | "generiere Daten", "Seed-Daten erstellen" |
| `nemo_summarize` | Text zusammenfassen | "fasse zusammen", "Zusammenfassung" |
| `nemo_translate` | Text uebersetzen | "uebersetze das", "auf Englisch bitte" |

**Schnelltest:**
```
Nutze das nemo_ask Tool und frage: "Was ist die Hauptstadt von Australien?"
```

Erwartete Antwort: "Die Hauptstadt von Australien ist Canberra."

---

## Schritt 4: Anwendungsbeispiele mit deutschen Triggern

### Massengenerierung (Token sparen)
> "Erstelle 200 Quizfragen zum Thema Weltgeographie mit Nemo"

Codex soll `nemo_quiz` mit `topic: "Weltgeographie"`, `category_id: 1`, `workers: 4`, `questions_per_worker: 50` aufrufen. Das erzeugt 200 Fragen kostenlos ueber Nemotron statt teure GPT-Tokens zu verbrauchen.

### Recherche fuer App-Features
> "Recherchiere mit Nemo 30 Outdoor-Aktivitaeten fuer eine Fitness-App als JSON"

Codex soll `nemo_research` mit `topic: "Outdoor-Aktivitaeten fuer Fitness-App"`, `format: "json"`, `count: 30` aufrufen.

### Seed-Daten generieren
> "Lass Nemo 50 Beispiel-Rezepte als JSON generieren"

Codex soll `nemo_generate` mit passendem Prompt, `format: "json"`, `count: 50` aufrufen.

### Uebersetzung
> "Uebersetze diese README auf Englisch mit Nemo"

Codex soll `nemo_translate` mit dem Text und `target_language: "English"` aufrufen.

### Zusammenfassung
> "Fasse diesen langen Text mit Nemo zusammen"

Codex soll `nemo_summarize` mit `style: "bullets"` aufrufen.

---

## Wann Nemo nutzen, wann NICHT

| Aufgabe | Nemo? | Grund |
|---------|-------|-------|
| Quizfragen generieren | **JA** | Massengenerierung, kostenlos |
| Seed-Daten fuer Datenbank | **JA** | Strukturierte Daten, kostenlos |
| Text uebersetzen | **JA** | Einfache Aufgabe, kostenlos |
| Allgemeinwissen-Fragen | **JA** | Kein Reasoning noetig |
| Zusammenfassungen | **JA** | Einfache Textverarbeitung |
| Code schreiben oder reviewen | **NEIN** | Braucht Reasoning-Qualitaet |
| Architektur-Entscheidungen | **NEIN** | Braucht tiefes Verstaendnis |
| Debugging | **NEIN** | Braucht Code-Analyse |
| Sicherheitsanalyse | **NEIN** | Zu kritisch fuer schwaches Modell |
| Web-Recherche (aktuelle Daten) | **NEIN** | Nemotron hat kein Internet |

---

## Technische Details

- **Modell**: Nemotron 3 Super 120B (`nvidia/nemotron-3-super-120b-a12b`)
- **API**: NVIDIA NIM (`https://integrate.api.nvidia.com/v1/chat/completions`)
- **Kosten**: Komplett kostenlos (NIM Free Tier)
- **Runtime**: Bun (TypeScript, kein Build noetig)
- **Abhaengigkeit**: Nur `@modelcontextprotocol/sdk`
- **Besonderheit**: Nemotron ist ein Reasoning-Modell — der Server verdoppelt `max_tokens` intern fuer die Denkphase
- **Quizfragen**: `nemo_quiz` startet bis zu 20 parallele Worker fuer maximalen Durchsatz
