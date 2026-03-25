# Regel-Archiv: Entfernung von Termux
- **Datum:** 2024-03-24
- **Grund:** Benutzer nutzt Termux nicht mehr; Fokus auf Windows/macOS-Paritaet.
- **Status:** Gelöscht (Archiviert)
- **Stale-Patterns:** "termux", "com.termux", "termux-notification", "termux-toast"

## Ursprüngliche Regel (Auszug aus AGENTS.md/claude-code-setup/rules/termux.md)
- Platform: Android/Termux on aarch64
- NEVER use `#!/usr/bin/env` — it doesn't exist on Termux
- ALWAYS use `#!/data/data/com.termux/files/usr/bin/bash`

## Betroffene Artefakte
- `claude-code-setup/rules/termux.md` (gelöscht)
- `AGENTS.md` (Referenzen entfernt)
- `Gemini-Setup/skills/self-improve/SKILL.md` (Referenzen entfernt)

---
*Zweck des Archivs: Verhindert, dass künftige Agenten versehentlich versuchen, Termux-Support wieder einzuführen.*
