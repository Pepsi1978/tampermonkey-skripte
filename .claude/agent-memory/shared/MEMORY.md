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

### 2026-03-20 18:10 — System: Cross-Platform — .sh Hooks nicht lokal deployed
**Quelle:** Deep-Scan Runde 5+6
**Symptom:** .sh-Hooks EXISTIEREN im Setup-Backup (~/proggs/claude-code-setup/hooks/) aber werden NICHT nach ~/.claude/hooks/ deployed
**Ursache:** auto-sync.ps1 kopierte nur .ps1 und .ts — .sh Dateien wurden ignoriert
**Fix:** auto-sync.ps1 um .sh-Kopie erweitert (Runde 6). Ab naechster Session werden .sh Hooks automatisch deployed.
**Betroffene Dateien:** ~/.claude/hooks/auto-sync.ps1 (gefixt), Setup-Backup hat: auto-sync.sh, safety-gate.sh, disk-guard.sh, config-guard.sh, hook-log.sh, intent-anker.sh, notify.sh, reindex-codebase.sh, session-cleanup.sh, auto-format.sh
**Verbleibend:** 4 Hooks haben noch KEIN .sh-Gegenstueck: memory-watchdog, writeback-enforcer, pending-admin-updates, admin-setup
**Status:** TEILWEISE GEFIXT (2026-03-20) — auto-sync repariert, 4 .sh noch fehlend

### 2026-03-20 18:35 — Hook: session-autopsy.ts — Schreibt in separate AUTOPSY.md
**Quelle:** Deep-Scan Runde 6
**Symptom:** Session-Autopsy schreibt in .claude/agent-memory/shared/AUTOPSY.md statt MEMORY.md
**Ursache:** Wurde vor der "nur ein Whiteboard" Regel erstellt
**Betroffene Dateien:** ~/.claude/hooks/session-autopsy.ts (Zeile 48: AUTOPSY_FILE)
**Fix-Vorschlag:** session-autopsy.ts umschreiben: Ergebnisse unter "Debugging-Muster" in MEMORY.md eintragen statt in separate Datei
**Status:** OFFEN

### 2026-03-20 18:35 — Config: context-kit@FlineDev — Marketplace nicht registriert
**Quelle:** Deep-Scan Runde 6
**Symptom:** Plugin context-kit@FlineDev ist in enabledPlugins aktiviert, aber "FlineDev" ist NICHT in extraKnownMarketplaces
**Ursache:** Plugin wurde manuell oder ueber einen inzwischen entfernten Kanal installiert
**Betroffene Dateien:** ~/.claude/settings.json (enabledPlugins + extraKnownMarketplaces)
**Fix-Vorschlag:** FlineDev-Marketplace registrieren: `"FlineDev": {"source": {"source": "github", "repo": "FlineDev/context-kit"}}` oder Plugin entfernen wenn nicht genutzt
**Status:** OFFEN

### 2026-03-20 18:35 — Hook: reindex-codebase.ps1 — Fehler-Eintraege landen am Dateiende
**Quelle:** Deep-Scan Runde 6
**Symptom:** Wenn reindex fehlschlaegt, wird der Fehler per Add-Content ans Ende der MEMORY.md gehaengt — ausserhalb jeder Sektion
**Ursache:** Add-Content haengt immer am Dateiende an, nutzt keine Sektionserkennung
**Betroffene Dateien:** ~/.claude/hooks/reindex-codebase.ps1 (Zeilen 141-142 und 149-150)
**Fix-Vorschlag:** Fehler-Eintraege per PowerShell-Logik in die "Offene Fehler" Sektion einfuegen (gleiche Technik wie writeback-enforcer v2.1)
**Status:** OFFEN

### 2026-03-20 18:35 — Sync: settings-reference.json veraltet
**Quelle:** Deep-Scan Runde 6
**Symptom:** settings-reference.json letzte Aenderung 2026-03-19 — aktuelle settings.json weicht ab (Hooks, Plugins aktualisiert seitdem)
**Betroffene Dateien:** ~/proggs/claude-code-setup/settings-reference.json
**Fix-Vorschlag:** settings-reference.json aus aktueller settings.json regenerieren (ohne maschinenspezifische Permissions)
**Status:** OFFEN

---

## Systemzustand (aktuell — Stand: 2026-03-20 18:30)
<!-- Wird von /self-improve und env-checker aktualisiert -->
<!-- Zeigt den aktuellen Stand des Programmiersystems -->
<!-- DATUM im Titel MUSS bei jeder Aktualisierung angepasst werden! -->

- **Plattform:** Windows 11 Home, Claude Code v2.1.80, Opus 4.6 (1M context)
- **Sprachen:** Swift, C#, TypeScript, Rust, Go, Kotlin
- **Semantic Search:** Aktiv (wird bei jeder Session automatisch aktualisiert via reindex-Hook)
- **Ollama:** v0.18.2, nomic-embed-text Modell, Fenster versteckt (nur Tray)
- **Quality Gate:** quality-gate Agent fuer kombiniertes test+review+optimize
- **Agents:** 15 aktiv (code-reviewer hat memory:project, coder hat isolation:worktree)
- **Hooks:** 15 Event-Typen, 23 individuelle Hooks registriert (auto-sync, disk-guard, safety-gate, reindex, intent-anker, notify, prompt-injection-defender, auto-format, config-guard, memory-watchdog, writeback-enforcer, session-scorer, session-autopsy, session-cleanup, pending-admin-updates + 8 Prompt-Hooks)
- **Plugins:** 90 Eintraege, 87 aktiv (3 deaktiviert: zeroize-audit, xclaude-plugin, apple-platform-build-tools)
- **Preferred Patterns:** MVVM (Swift), Fluent Design (C#), strict mode (TypeScript)
- **Cross-Platform-Luecke:** macOS hat 0 von 14 .sh-Hook-Gegenstuecken (nur Windows-Hooks vorhanden)

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
<!-- Writer: debugger Agent | Leser: alle Agents, /self-improve -->
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
- GEFIXT-Eintraege archivieren: Nach 30 Tagen koennen GEFIXT-Eintraege in einen Archiv-Kommentar verschoben werden um die Sektion kurz zu halten
- Alle Hooks die ins Whiteboard schreiben MUESSEN die Sektionserkennung nutzen — Add-Content ans Dateiende ist VERBOTEN
