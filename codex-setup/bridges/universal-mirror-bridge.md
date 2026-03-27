# Universal Mirror Bridge

Die Universal Mirror Bridge ist die Codex-Basis fuer Export und Import ueber das gemeinsame
Mirror-Ledger. Sie verbindet die Codex-Setup-Umgebung mit einem extern gefuehrten, aber
strukturisch gemeinsamen Austauschprotokoll.

## Zweck

- Session-Aenderungen vollstaendig in ein gemeinsames Ledger schreiben
- ausstehenden Ledger-Stand auf der Zielplattform/CLI importieren
- die gleiche Bridge-Idee in anderen CLI-Setups wiederverwendbar machen
- den Kontextverlust zwischen macOS, Windows, Codex, Claude Code und Gemini CLI reduzieren

## Codex-Implementierung

- Export-Workflow: `codex-setup/skills/self-improve/references/agents/export.md`
- Import-Workflow: `codex-setup/skills/self-improve/references/agents/import.md`
- Bootstrap fuer neue Installationen: `codex-setup/bridges/mirror-bridge-bootstrap.md`
- Shared Ledger: `claude-code-setup/mirror-ledger.md`

## Regeln

- Nur Anhaengen, nie stille Ueberschreibung alter Ledger-Eintraege.
- Jeden Ledger-Eintrag so schreiben, als kenne die Gegenplattform den Session-Kontext nicht.
- APPLIED-Status immer nur nach realer Umsetzung aktualisieren.
- Maximal 20 Export-Eintraege pro Lauf.
- Maximal 15 Import-Eintraege pro Lauf.
- Export priorisiert erst die robusten Umwelt-Fixes, dann Agenten, Regeln, Settings und den Rest.

## Trigger

- starte den export Agenten
- starte den import Agenten
- exportiere
- importiere
- Aenderungen spiegeln
- Mirror Bridge
- mirror-ledger
