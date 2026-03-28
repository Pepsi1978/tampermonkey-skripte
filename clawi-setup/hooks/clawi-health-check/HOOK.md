---
name: clawi-health-check
description: "Prüft beim Gateway-Start, ob Clawis kritische Dateien, Sync-Skripte und LCM-Kontext-Grundlagen vorhanden sind"
metadata:
  openclaw:
    emoji: "🩺"
    events: ["gateway:startup"]
    os: ["darwin", "linux"]
---

# clawi-health-check

- prüft kritische Dateien im Workspace
- prüft `clawi-setup`-Basis und Sync-Skripte
- schreibt einen kompakten Status nach `hooks/runtime.log`
- greift nicht destruktiv ein
