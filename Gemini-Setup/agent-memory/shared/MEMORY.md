# Shared Knowledge Hub — Zentrales Whiteboard (Gemini CLI)

Das zentrale Gedaechtnis fuer das Gemini CLI System. Jede Komponente (Agents, Skills, Hooks) MUSS hier lesen und schreiben, um plattformuebergreifendes Lernen (Claude/Codex/Gemini) zu ermoeglichen.

## Oberste Direktive
- Gemini CLI verfolgt als oberstes Ziel, seine Programmierintelligenz und die Intelligenz seiner gesamten Programmierumgebung von Session zu Session zu steigern.
- Die Zielrichtung ist kumulative und exponentielle Hebelwirkung.
- Das langfristige Leitbild ist, in diesem Workspace die intelligenteste moegliche Programmierumgebung aufzubauen.
- Jede Session soll mindestens einen klaren Intelligenzhebel benennen oder einen `Intelligenzvorschlag` liefern.

## Offene Fehler & Probleme
_Noch keine Eintraege._

## Systemzustand
- **Initiales Setup:** Gemini CLI auf macOS (darwin) erfolgreich initialisiert (2026-03-23).
- **Workspace:** `/Users/frank/GeminiCLI` (Schreibrechte in Gemini-Setup/).
- **Konfiguration:** Node v23.7.0, npm v10.9.2, Git v2.48.1.
- **Brücken:** Bidirektionale Brücken zu Codex und Claude Code aktiv.
- **Validierung:** Alle 25 Kernkomponenten verifiziert.

- **[2026-03-23 21:40] env-checker**: Whiteboard-Anbindung erfolgreich verifiziert.
- **[2026-03-23 22:30] evolution-analyst**: Erster Self-Improve Run (ausführlich) abgeschlossen. 100% Validierung, MCP-Fix angewendet, Windows-Parität hergestellt.
## Erkenntnisse aus Code Reviews
_Noch keine Eintraege._

## Erkenntnisse aus Tests
_Noch keine Eintraege._

## Architektur-Entscheidungen
- **Trennung:** Klare Workspace-Trennung zwischen GeminiCLI, Codex und proggs (Claude).
- **Redundanz:** Drei Core-Direktiven (Superintelligenz, Selbstbeobachtung, Resilient Bugfixing) redundant gespeichert.
- **Enforcer-Modell:** Alle Agenten schreiben Sentinel-Files, die am Ende gebündelt gemerged werden.

## Debugging-Muster
- **Pfade:** macOS nutzt standardmäßig `/Users/frank/`, Windows `%USERPROFILE%`. Hooks müssen beide Pfade über Umgebungsvariablen auflösen.
- **Cross-Plattform:** Shell-Skripte (.sh) für macOS brauchen immer PowerShell (.ps1) Gegenstücke für Windows-Parität.

## Performance & Optimierung
_Noch keine Eintraege._

## UI/UX-Patterns
- **💡 Symbole:** Intelligenz-Vorschläge werden zur besseren Sichtbarkeit immer mit einer Glühbirne (💡) gekennzeichnet.

## Forschung & Intelligence
- **Lern-Erfolg (Delta-Bruecke):** 8 Fixes von Claude Code analysiert und adaptiert (2026-03-23).
- **Muster-Erkennung:** Eigennamen (wie Claude Code) müssen immer vor Verwendung gegen das Filesystem geprüft werden (Vermeidung von Halluzinationen).

## Regeln & Konventionen
- **Kommunikation:** Strikte Anweisung auf DEUTSCH für alle Erklärungen und Antworten.
- **Fix-Härtung:** Vor jedem Commit muss die 8-Punkte Fix-Induced-Failure Prüfung erfolgen.
- **Git:** Autonome Commits/Pushs sind nur innerhalb von `Gemini-Setup/` erlaubt.
