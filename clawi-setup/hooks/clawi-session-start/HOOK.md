---
name: clawi-session-start
description: "Synchronisiert Clawis Basis beim Gateway-Start aus clawi-setup in den Workspace"
metadata:
  openclaw:
    emoji: "🦖"
    events: ["gateway:startup"]
    os: ["darwin", "linux"]
    requires:
      bins: ["bash", "git"]
---

# clawi-session-start

- prüft die lokale `clawi-setup`-Referenzbasis
- zieht bei sauberem Repo-Stand Änderungen von `origin/main`
- synchronisiert anschließend per `sync-clawi.sh pull` in den OpenClaw-Workspace
- aktualisiert `hooks/sync-state.json`
