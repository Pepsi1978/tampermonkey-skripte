---
name: clawi-session-end
description: "Sichert Clawis Basis an Session-Grenzen zurück nach clawi-setup, scannt auf Secrets und pusht autorisierte Änderungen"
metadata:
  openclaw:
    emoji: "💾"
    events: ["command:new", "command:reset", "command:stop"]
    os: ["darwin", "linux"]
    requires:
      bins: ["bash", "git", "rg", "strings"]
---

# clawi-session-end

- läuft bei `/new`, `/reset` und `/stop`
- synchronisiert Workspace → `clawi-setup`
- scannt `clawi-setup/` inklusive `lossless-claw/lcm.db` vor jedem Auto-Push auf typische Secrets
- blockiert den Auto-Push bei verdächtigen Treffern
- committed und pusht **nur** Änderungen unter `clawi-setup/`
- lässt fremde Repo-Änderungen unangetastet
