---
name: clawi-session-end
description: "Sichert Clawis Basis an Session-Grenzen zurück nach clawi-setup und pusht autorisierte Änderungen"
metadata:
  openclaw:
    emoji: "💾"
    events: ["command:new", "command:reset", "command:stop"]
    os: ["darwin", "linux"]
    requires:
      bins: ["bash", "git"]
---

# clawi-session-end

- läuft bei `/new`, `/reset` und `/stop`
- synchronisiert Workspace → `clawi-setup`
- committed und pusht **nur** Änderungen unter `clawi-setup/`
- lässt fremde Repo-Änderungen unangetastet
