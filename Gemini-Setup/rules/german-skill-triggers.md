# Deutsche Trigger-Map fuer Gemini CLI

Diese Datei steuert die Uebersetzung von deutschen Benutzeranfragen in technische Skills und Aktionen.

## 1. Committen & Git
| Phrase | Aktion |
|--------|--------|
| "committe", "mach ein Commit" | `git commit` |
| "pushe das", "ab damit" | `git push` |
| "mach das rückgängig", "undo" | `git revert` |

## 2. Brücken & Lernen
| Phrase | Aktion |
|--------|--------|
| "Starte bitte die Bruecke zu Codex" | `node Gemini-Setup/scripts/audit-codex-delta.mjs` |
| "Starte bitte die Bruecke zu Claude Code" | `node Gemini-Setup/scripts/audit-claude-delta.mjs` |
| "was ist neuer bei ..." | Entsprechenden Delta-Audit starten. |
| "uebernimm das von ..." | Entsprechenden Delta-Audit starten. |

## 3. Debugging & Analyse
| Phrase | Aktion |
|--------|--------|
| "finde den Bug", "warum geht das nicht?" | 3x Warum? Analyse + Resilient Bugfixing Ablauf. |
| "Root Cause", "Ursache finden" | Systematische Ursachenforschung. |

## 4. Setup & System
| Phrase | Aktion |
|--------|--------|
| "check dein Setup", "validiere Gemini" | `bash Gemini-Setup/scripts/validate-gemini-setup.sh` |
| "zeige den Bootstrap-Report" | `node Gemini-Setup/scripts/bootstrap-report.mjs` |
| "code-search", "semantische Suche" | `node Gemini-Setup/scripts/check-code-search-health.mjs` |

## 5. Intelligenzvorschläge & Memory
| Phrase | Aktion |
|--------|--------|
| "logge diesen Umgebungsfix" | `node Gemini-Setup/scripts/register-environment-fix.mjs add` |
| "logge diesen Intelligenzvorschlag" | `node Gemini-Setup/scripts/register-intelligence-suggestion.mjs add` |
| "was hast du gelernt?" | Whiteboard (`MEMORY.md`) lesen. |
