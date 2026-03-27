# Mirror Bridge Bootstrap fuer Codex

Dieser Prompt richtet den Universal Mirror Bridge Erstaufbau in einem Codex-Workspace ein.
Er ist fuer neue Rechner, neue Sessions oder frische CLI-Installationen gedacht, die das
gemeinsame Mirror-Ledger lesen und schreiben sollen.

## Was Codex hier anders macht

- Codex arbeitet in seinem eigenen Workspace unter `codex-setup/`.
- Das operative Codex-Whiteboard bleibt `codex-setup/agent-memory/shared/MEMORY.md`.
- Die gemeinsame Mirror-Ledger-Datei ist ein expliziter Austauschpfad und kein Ersatz fuer
  das Codex-Whiteboard.
- Alle Mirror-Aenderungen muessen am Ende wieder in den Codex-Workspace und in das gemeinsame
  Ledger zurueckfliessen.

## Bootstrap-Schritte

1. Pruefe den aktuellen Workspace und die Git-Basis.
2. Lies zuerst `codex-setup/agent-memory/shared/MEMORY.md` und dort die `## Oberste Direktive`.
3. Lege die Codex-nativen Mirror-Artefakte an:
   - `codex-setup/skills/self-improve/references/agents/export.md`
   - `codex-setup/skills/self-improve/references/agents/import.md`
   - `codex-setup/bridges/universal-mirror-bridge.md`
   - `codex-setup/bridges/universal-mirror-bridge.json`
4. Registriere die neue Bruecke in `codex-setup/bridges/bridge-registry.json`.
5. Ergaenze das deutsche Trigger-Routing fuer `export`, `import` und `Mirror Bridge`.
6. Wenn die Umgebung sich auf das gemeinsame Ledger stuerzt, verwende nur
   `claude-code-setup/mirror-ledger.md` als Austauschdatei und schreibe nur strukturierte,
   selbsterklaerende Eintraege.

## Wichtige Grundsaetze

- Export bedeutet: Aenderungen vollstaendig und selbsterklaerend dokumentieren.
- Import bedeutet: ausstehende Ledger-Eintraege lesen, anpassen und im eigenen Workspace umsetzen.
- Nichts wird stillschweigend verworfen.
- Kein Mirror-Eintrag soll auf Session-Kontext angewiesen sein.
- Andere CLIs kennen den lokalen Codex-Kontext nicht, deshalb muessen die Eintraege vollstaendig
  und nachvollziehbar sein.
