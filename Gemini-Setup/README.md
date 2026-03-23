# Gemini-Setup — Die Superintelligenz-Zentrale

Dieses Verzeichnis ist das operative Gehirn und die Konfigurationsbasis für das **Gemini CLI** in diesem Workspace. Es ist darauf ausgelegt, die Programmierumgebung durch Selbstbeobachtung und Cross-Tool-Lernen (Codex/Claude) kontinuierlich zu verbessern.

## 🚀 Die 3 Haupt-Direktiven

Gemini CLI operiert unter einem strengen Grundgesetz, das in `rules/` definiert ist:

1. **Superintelligenz (`SUPERINTELLIGENZ.md`):** Jede Session muss das System messbar intelligenter machen. Fokus auf den **Compound Intelligence Effect**.
2. **Selbstbeobachtung (`SELBSTBEOBACHTUNG.md`):** Kontinuierliche Analyse der eigenen Arbeit. Fehler, Umwege und Ineffizienzen werden am Ende jeder Aufgabe als 💡 **Intelligenz-Vorschlag** gemeldet.
3. **Resilient Bugfixing (`RESILIENT_BUGFIXING.md`):** Ein Fehler wird genau EINMAL gemacht. Jeder Fix muss zukunftssicher, dokumentiert und plattformübergreifend (macOS/Windows) sein.

---

## 🛠 Infrastruktur & Automatisierung

### 1. Bootstrap & Validierung
- **`bootstrap-gemini-setup.sh/.ps1`:** Initialisiert die Umgebung, prüft Updates und startet Hintergrunddienste.
- **`validate-gemini-setup.sh/.ps1`:** Verifiziert die Existenz und Integrität aller 25+ Kernkomponenten.
- **`bootstrap-report.mjs`:** Erzeugt einen Statusbericht über Registrierungen, Brücken und Ledger.

### 2. Cross-CLI Brücken (Intelligence Exchange)
Gemini lernt aktiv von seinen Partner-CLIs über die Brücken in `bridges/`:
- **`audit-codex-delta.mjs`:** Scant `codex-setup/` auf neue Regeln und Tools.
- **`audit-claude-delta.mjs`:** Scant `claude-code-setup/` und `CLAUDE.md`.
- **`bridge-registry.json`:** Die zentrale Map für alle Brücken und Synchronisations-Ziele.

### 3. Semantische Suche (MCP)
- **`code-search-mcp-client.mjs`:** Direkter Zugriff auf den lokalen Code-Search Server.
- **`check-code-search-health.mjs`:** Diagnosetool für den Index-Status.
- **`reindex-codebase.sh`:** Automatischer Hintergrund-Job zur Aktualisierung des Suchindex.
- **`validate-mcp-paths.mjs`:** Guard, der Pfadfehler in der `.mcp.json` verhindert.

### 4. Whiteboard & Gedächtnis
- **`MEMORY.md`:** Das zentrale "Shared Whiteboard". Hier fließen alle Erkenntnisse strukturiert ein.
- **`whiteboard-bridge.mjs`:** Technische Schnittstelle zum sicheren Schreiben in das Whiteboard.
- **`writeback-enforcer.sh`:** Stellt sicher, dass Agenten-Erkenntnisse (Sentinels) am Ende jeder Aufgabe gemerged werden.

---

## 🤖 Spezialisierte Agenten

In `agents/` befinden sich Definitionen für spezialisierte Rollen:
- **`challenger`:** Findet Schwachstellen in neuen Architekturentwürfen.
- **`durability-auditor`:** Prüft die langfristige Haltbarkeit von Fixes.
- **`env-checker`:** Überwacht die Stabilität der lokalen Laufzeitumgebung.
- **`intelligence-researcher`:** Sucht nach technologischen Durchbrüchen für das System.

---

## 🔄 Git- & Sync-Regeln

Um Konflikte in der Multi-CLI-Umgebung zu vermeiden, gelten strikte Regeln:
- **Rebase-Pflicht:** Vor jedem Push MUSS ein `git fetch` und `git rebase origin/main` durchgeführt werden.
- **Autonome Pushes:** Nur innerhalb von `Gemini-Setup/` erlaubt. Alles andere benötigt eine Benutzerfreigabe.
- **Auto-Sync:** Das Skript `auto-sync.sh` führt beim Start automatisch einen Pull durch und zeigt Veränderungen als Diff an.

## 💡 Wie man das System verbessert
Verwende den **`self-improve`** Skill (in `skills/self-improve/`), um einen geführten 6-stufigen Optimierungsdurchlauf zu starten. Triggere ihn einfach mit: *"Gemini, verbessere dich"* oder *"/self-improve"*.

---
*Status: Vollständig gehärtet und synchronisiert (24. März 2026)*
