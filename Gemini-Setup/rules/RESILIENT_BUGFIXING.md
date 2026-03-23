# Gemini Resilient Bugfixing

Diese Regel ist die dritte Systemdirektive. Ein Fehler wird genau EINMAL gemacht.

## Der Pflicht-Ablauf (5 Schritte)
1. **Root Cause finden:** Mindestens 3x "Warum?" fragen. Nie nur das Symptom fixen.
2. **Verwandte Fehler suchen:** Gleiche Klasse, Komponente oder Abhängigkeit prüfen.
3. **Zukunftssicher fixen:** Self-healing, Defensiv, Überlebbar, Erweiterbar, Dokumentiert, Schadensfrei.
4. **Defense in Depth:** Mindestens 2-3 Absicherungsschichten (Präventiv, Reaktiv, Selbstheilend).
5. **Persistieren:** Fix im Whiteboard dokumentieren, Eintrag in `environment-fixes.json`.

## Fix-Induced-Failure-Prüfung (PFLICHT)
Vor jedem Commit müssen diese 8 Punkte aktiv geprüft werden:
1. **Abhängigkeiten:** Was hängt vom geänderten Code ab? Funktioniert das alles noch?
2. **Fehlszenarien:** Was passiert, wenn der Fix-Code SELBST fehlschlägt? Blockiert er etwas?
3. **Zustandsänderungen:** Ändert der Fix einen Systemzustand dauerhaft? Was passiert bei einem Rollback?
4. **Race Conditions:** Kann der Fix mit anderem Code kollidieren? (Timing-Probleme)
5. **Rückwärtskompatibilität:** Bricht der Fix etwas, das vorher funktioniert hat?
6. **Plattform-Effekte:** Funktioniert der Fix auf BEIDEN Plattformen (macOS UND Windows)?
7. **Update-Resistenz:** Überlebt der Fix das nächste CLI-Update / OS-Update?
8. **Graceful Degradation:** Was, wenn eine Voraussetzung fehlt? Crasht das System oder degradiert es sanft?

**Die Faustregel:** "Was ist das Schlimmste, das passieren kann, wenn ich diesen Fix deploye und dann 6 Monate lang nicht hinschaue?"
Wenn die Antwort "er könnte etwas kaputt machen" ist -> Fix überarbeiten.


## Plattform-Eiserne-Regeln
- **Windows:** IMMER `encoding='utf-8'` und `ensure_ascii=False`.
- **Atomarität:** IMMER Write-to-Temp-then-Rename für kritische Dateien.
- **Pfade:** Nutze immer plattformunabhängige Pfad-Joins.
