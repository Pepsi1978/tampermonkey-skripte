# Shared Knowledge Hub — Zentrales Whiteboard

Das zentrale Nervensystem des Claude Code Systems. JEDE Komponente die hier arbeitet
(Agents, Skills, Hooks, MCP-Server, Plugins) MUSS hier lesen und schreiben.

**Zugriff**: Lesen + Schreiben fuer ALLE Komponenten — keine Ausnahmen.
**Gepflegt von**: /self-improve (raeumte auf, loest offene Fehler, haelt aktuell)
**Pfad**: `.claude/agent-memory/shared/MEMORY.md`

**Angeschlossene Systeme** (MUESSEN von /self-improve ebenfalls gelesen werden):
_Hinweis: Pfade mit `~/proggs/` liegen im Repo (autoritativ). Pfade mit `~/.claude/` sind lokal
und maschinenspezifisch (session-scores, cache, etc. — werden NICHT ueber Git synchronisiert)._
- **CLAUDE.md** (WICHTIGSTE DATEI): `~/proggs/CLAUDE.md` + `~/CLAUDE.md` (Sync-Kopie)
  Enthaelt ALLE Projektregeln, Konventionen und Workflow-Definitionen. Wenn /self-improve
  neue Regeln aus Fehlern oder Feedback ableitet → gehoeren sie in die CLAUDE.md.
  Wenn die CLAUDE.md geaendert wird → BEIDE Kopien synchron halten und pushen.
  Ist plattformuebergreifend — wird auf Windows UND macOS gelesen.
- **Benutzer-Feedback**: `~/.claude/projects/*/memory/feedback_*.md`
  (Pfad ist plattformabhaengig: Windows=C--Users-barwa, macOS=Users-frank)
  Enthaelt Korrekturen und Praeferenzen des Benutzers. /self-improve MUSS diese lesen
  und daraus neue Regeln oder Hooks ableiten, wenn ein Feedback-Muster systemweit gilt.
- **Projekt-Notizen**: `~/.claude/projects/*/memory/project_*.md`
  Enthaelt laufende Projekte und deren Status.
- **Memory-Index**: `~/.claude/projects/*/memory/MEMORY.md`
  Zeigt alle vorhandenen Memory-Dateien als Verzeichnis.
- **Session-Scores**: `~/.claude/session-scores.jsonl`
  Qualitaets-Trends ueber Sessions hinweg. /self-improve liest diese fuer Trend-Analyse
  und IQ-Score. Wenn Qualitaet sinkt → Ursache im Whiteboard suchen.
- **Self-Improve Cache**: `~/.claude/self-improve-cache/R*_*.md`
  Gecachte Researcher-Ergebnisse (R1-R8) mit TTL. Veraltet? → /self-improve aktualisiert sie.
- **Claude-Mem Observations**: `~/.claude/homunculus/projects/*/observations.jsonl`
  Cross-Session-Wissen vom claude-mem Plugin. Enthaelt Beobachtungen aus frueheren Sessions
  die fuer aktuelle Arbeit relevant sein koennen.

---

## Offene Fehler & Probleme (PRIORITAET fuer /self-improve)
<!-- /self-improve liest diese Sektion ZUERST und MUSS jeden OFFEN-Eintrag fixen. -->
<!-- PFLICHT-FORMAT (damit /self-improve den Fehler versteht und fixen kann): -->
<!--   ### DATUM — Quelle: [Komponententyp: Name] — Kurzbeschreibung -->
<!--   **Quelle:** Welche Komponente (Hook/Agent/MCP-Server/Plugin/Skill + Name) -->
<!--   **Symptom:** Was ist sichtbar schiefgegangen -->
<!--   **Ursache:** WARUM ist es passiert (Root Cause, nicht nur das Symptom!) -->
<!--   **Betroffene Dateien:** Welche Dateien muessen geaendert werden -->
<!--   **Reproduktion:** Wie kann man den Fehler nachstellen -->
<!--   **Fix-Vorschlag:** Was muesste konkret geaendert werden -->
<!--   **Status:** OFFEN | GEFIXT (Datum) -->
<!-- WICHTIG: Fehler MUESSEN ausfuehrlich genug beschrieben werden, dass ein -->
<!-- frischer /self-improve Lauf sie ohne zusaetzlichen Kontext fixen kann! -->

<!-- ARCHIV (2026-03-20): 3 GEFIXT-Eintraege zu reindex-codebase.ps1 ExitCode 143 — Timeout von 180s auf 300s erhoeht, Bun-Imports gefixt. Regel: Hooks duerfen NIEMALS Fehler still verschlucken. -->
<!-- ARCHIV (2026-03-20): .sh Hooks nicht deployed — auto-sync.ps1 gefixt (Runde 6), alle 4 fehlenden .sh erstellt (Runde 8). -->
<!-- ARCHIV (2026-03-20): session-autopsy AUTOPSY.md → MEMORY.md umgeleitet (Runde 8). -->
<!-- ARCHIV (2026-03-20): context-kit@FlineDev Marketplace registriert (Runde 8). -->
<!-- ARCHIV (2026-03-20): reindex-codebase.ps1 Add-Content → whiteboard-insert (Runde 8). -->
<!-- ARCHIV (2026-03-20): settings-reference.json regeneriert (Runde 8). -->

_Aktuell keine offenen Fehler. Letzter Deep-Scan: 2026-03-20 Runde 8 (100+ Fehler in 4 Runden gefixt)._

---

## Systemzustand (aktuell — Stand: 2026-03-20 19:45)
<!-- Wird von /self-improve und env-checker aktualisiert -->
<!-- Zeigt den aktuellen Stand des Programmiersystems -->
<!-- DATUM im Titel MUSS bei jeder Aktualisierung angepasst werden! -->

- **Plattform:** Windows 11 Home, Claude Code v2.1.80, Opus 4.6 (1M context)
- **Sprachen:** Swift, C#, TypeScript, Rust, Go, Kotlin
- **Semantic Search:** Aktiv (wird bei jeder Session automatisch aktualisiert via reindex-Hook)
- **Ollama:** v0.18.2, nomic-embed-text Modell, Fenster versteckt (nur Tray)
- **Quality Gate:** quality-gate Agent fuer kombiniertes test+review+optimize
- **Agents:** 15 aktiv, alle mit C1 Sentinel-Enforcement (code-reviewer hat memory:project, coder hat isolation:worktree)
- **Hooks:** 15 Event-Typen, 23 individuelle Hooks — alle mit .ps1 UND .sh Gegenstuecken (Cross-Platform komplett)
- **Plugins:** 90 Eintraege, 87 aktiv (3 deaktiviert: zeroize-audit, xclaude-plugin, apple-platform-build-tools)
- **Whiteboard-Anbindung:** Alle Hooks nutzen whiteboard-insert.ps1 (sektionsbasiert) — Add-Content ans Dateiende eliminiert
- **Session-Scorer:** v3 — schreibt NUR in session-scores.jsonl, NICHT mehr direkt in MEMORY.md
- **Session-Autopsy:** v2 — schreibt in MEMORY.md "Debugging-Muster" statt separate AUTOPSY.md
- **Preferred Patterns:** MVVM (Swift), Fluent Design (C#), strict mode (TypeScript)
- **Self-Improve Skill:** v5.16 — alle Phantom-Referenzen gefixt, R1-R8 TTL komplett

---

## Erkenntnisse aus Code Reviews
<!-- code-reviewer, mar-reviewer, batch-reviewer schreiben hierher -->
_Noch keine Eintraege._

## Erkenntnisse aus Tests
<!-- Writer: tester Agent | Leser: alle Agents, /self-improve -->
_Noch keine Eintraege._

## Architektur-Entscheidungen
<!-- Writer: architect, challenger Agents | Leser: alle Agents, /self-improve -->
_Noch keine Eintraege._

## Debugging-Muster
<!-- Writer: debugger Agent, session-autopsy.ts | Leser: alle Agents, /self-improve -->
_Noch keine Eintraege._

## Performance & Optimierung
<!-- Writer: optimizer Agent | Leser: alle Agents, /self-improve -->
_Noch keine Eintraege._

## UI/UX-Patterns
<!-- Writer: ui-polisher Agent | Leser: alle Agents, /self-improve -->
_Noch keine Eintraege._

## Forschung & Intelligence
<!-- researcher, intelligence-researcher schreiben hierher -->
_Noch keine Eintraege._

---

## Regeln & Konventionen
<!-- Gilt fuer alle Komponenten — von allen lesbar, von /self-improve gepflegt -->

- Kein Python fuer User-Interfaces
- Commit-Format: #NNN - Beschreibung (Englisch)
- Kommunikation: Deutsch, Code-Kommentare: Englisch
- quality-gate MUSS nach jedem Feature/Projekt laufen
- Fehler NIEMALS still verschlucken — immer ins Whiteboard loggen
- Neue Dateien/Strukturen: Pruefen ob Whiteboard-Eintrag noetig
- Einziges Repository: Pepsi1978/proggs
- Cross-Platform: Jede Aenderung MUSS auf beiden Plattformen funktionieren
- Status-Meldung: "Committed, gepusht und plattformuebergreifend" nur wenn ehrlich
- Writeback-Enforcer: Sentinel-Daten gehoeren in die thematisch passende Sektion, NICHT ans Dateiende
- GEFIXT-Eintraege archivieren: Nach 30 Tagen koennen GEFIXT-Eintraege in einen Archiv-Kommentar verschoben werden
- Alle Hooks die ins Whiteboard schreiben MUESSEN whiteboard-insert.ps1 (oder .sh Aequivalent) nutzen — Add-Content/appendFileSync ans Dateiende ist VERBOTEN
- Session-Scorer ist ein DATEN-SAMMLER — schreibt NUR in session-scores.jsonl, Analyse macht evolution-analyst
