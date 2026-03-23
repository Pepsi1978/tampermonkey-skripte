# Gemini CLI Delta Bridge

Dies ist die Codex-Bruecke fuer Verbesserungen aus Gemini CLI.

Ziel:

- neue Regeln, Setup-Ideen, Arbeitsprozesse und Umgebungsverbesserungen aus `Gemini CLI`
- umgebungsbezogene Fehlerfixes, Memory-Muster und Haertungen aus `Gemini CLI`
- sauber, deutsch und approval-faehig auflisten
- nur die Programmierumgebung betrachten, nicht normalen Projektcode

## Quellseite

Read-only Quellen:

- `Gemini-Setup/**`
- `Gemini-Setup/agent-memory/shared/MEMORY.md`
- `C:\Users\barwa\GeminiCLI\agent-memory\shared\MEMORY.md`

## Zielseite

Codex schreibt nur in seine eigene Setup-Basis:

- `codex-setup/`
- `AGENTS.md`
- Codex-Validierung

## Pflichtklassifikation

Jeder Delta-Kandidat wird als genau eine dieser Klassen berichtet:

- `ADD`
- `ADAPT`
- `REPLACE`

## Approval-Regel

- `ADD`: sichere additive Empfehlung
- `ADAPT`: fuer Codex uebersetzen
- `REPLACE`: vor Umsetzung warnen und Freigabe holen

- Alle drei Klassen sind zunaechst nur Vorschlaege.
- Auch `ADD` und `ADAPT` duerfen niemals autonom umgesetzt werden.
- Erst nach ausdruecklicher Benutzerfreigabe auf Basis der A1/B1/C1/D1-Liste darf Codex die Vorschlaege uebernehmen.

## Ausgabeformat

Die menschenlesbare Liste soll deutsch sein und nach diesen Gruppen sortiert werden:

- `A1`, `A2`, ... Regeln und Prompts
- `B1`, `B2`, ... Agenten, Skills und Arbeitsprozesse
- `C1`, `C2`, ... Skripte, Memory-Muster und Validierung
- `D1`, `D2`, ... Runtime und Konfiguration

## Triggerwoerter

- "Starte bitte die Bruecke zu Gemini CLI"
- "starte die Bruecke zu Gemini CLI"
- "was wurde bei Gemini CLI erneuert"
- "welche Verbesserungen gibt es bei Gemini CLI"
- "welche Regeln sind bei Gemini CLI neuer"
- "welche Fehler wurden bei Gemini CLI gefixt"
- "was davon ist fuer Codex sinnvoll"

## Referenzimplementierung

- `codex-setup/scripts/audit-gemini-delta.mjs`
- `codex-setup/scripts/audit-gemini-delta.sh`
- `codex-setup/scripts/audit-gemini-delta.ps1`

Der Satz `Starte bitte die Bruecke zu Gemini CLI` soll bei Codex immer direkt diese Referenzimplementierung ausloesen.
