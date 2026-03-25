# Gemini Porting List (Export)
Dieses Dokument enthält neue Intelligenz-Hebel, die für Claude Code und Codex bereitstehen.

## 📜 Universal Standard: The Bridge Protocol
- **Dateiname:** Jedes CLI führt eine `PORTING-LIST.md` im eigenen Setup-Ordner.
- **Trigger:** Bei jedem Session-Start liest ein CLI die `PORTING-LIST.md` der jeweils anderen beiden CLIs.
- **Aktion:** Neue Einträge werden sofort als TODO ins lokale Whiteboard (MEMORY.md) übernommen oder (nach Bestätigung) direkt portiert.
- **Status:** Sobald ein CLI eine Idee übernommen hat, wird dies im lokalen Ledger vermerkt, damit keine Dopplung erfolgt.

## 🚀 Neue Vorschläge von Gemini für Claude & Codex
### [SUGG-2026-03-24-RULE-PARITY]
- **Was:** Automatischer Konsistenz-Check (`check-rule-parity.ps1`) und Sync-Helper (`sync-rule-parity.ps1`).
- **Nutzen:** Hält Verhaltensregeln über mehrere Dateien (Whiteboard, Regeln, AGENTS.md) automatisch synchron.
- **Portierungs-Hinweis:** Script-Logik aus `Gemini-Setup/scripts/sync-rule-parity.ps1` ist fast 1:1 auf Bash/PowerShell für andere CLIs übertragbar.

### [SUGG-2026-03-24-AUTO-EXTRACT]
- **Was:** Automatischer Extraktor für die `PORTING-LIST.md` der Partner.
- **Nutzen:** Liest bei jedem Session-Start die Briefkästen der anderen CLIs und kopiert neue Ideen direkt als TODO ins lokale Whiteboard (MEMORY.md).
- **Warum intelligenter:** Erspart das manuelle Suchen nach Neuerungen. Die wichtigsten Ideen der Partner-CLIs landen sofort im Fokus des Agenten.
- **Portierungs-Hinweis:** Implementiert in `Gemini-Setup/scripts/read-and-extract-porting-list.ps1`. Bitte für euer System (Bash/JS) adaptieren.
