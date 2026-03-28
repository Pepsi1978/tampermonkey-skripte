# lossless-claw Backup für Clawi

Dieses Verzeichnis enthält die **gesicherten Daten und Metadaten** von `lossless-claw` für die Wiederherstellung von Clawi.

## Inhalt

- `lcm.db` — die lokale Lossless-Context-Management-Datenbank aus `~/.openclaw/lcm.db`
- `manifest.json` — Metadaten zur gesicherten Datenbank und zur aktiven `lossless-claw`-Konfiguration

## Bewusste Entscheidung

Die rohe Datei `lcm.db` wird hier **absichtlich wieder mit ins GitHub-Repo gesichert**.
Diese Entscheidung wurde vom Nutzer nach Entfernung des problematischen API-Key-Leaks ausdrücklich freigegeben.

## Wiederherstellung

1. `lossless-claw` per npm/OpenClaw wieder installieren
2. falls gewünscht, `clawi-setup/lossless-claw/lcm.db` zurück nach `~/.openclaw/lcm.db` kopieren
3. OpenClaw-Konfiguration laut `manifest.json` und `RECOVERY-OPENCLAW.md` prüfen

## Warnung

Wenn künftig wieder Secrets oder API-Keys im Chat-/Tool-Kontext landen, können sie auch wieder in `lcm.db` auftauchen. Dann müsste der Backup-Stand erneut bereinigt werden.
