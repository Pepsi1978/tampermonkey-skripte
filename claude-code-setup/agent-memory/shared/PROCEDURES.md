# Procedural Memory — Bewährte Workflows

> Wiederverwendbare Schritt-für-Schritt-Abläufe für häufige Aufgaben.
> Jedes Verfahren wurde mindestens 2x erfolgreich angewendet.
> Updated by: all agents after repeated successful workflows
> Read by: ALL agents before starting work

## Wie dieses Dokument funktioniert

Agents sollen dieses Dokument VOR der Arbeit lesen und prüfen, ob ein passender Workflow existiert.
Wenn ein Agent eine Aufgabe 3x ähnlich löst, soll er den Ablauf hier als neuen Workflow eintragen.

---

## QuizVerse: Neue Quiz-Fragen hinzufügen

**Wann**: Wenn neue Fragen für eine Kategorie/Schwierigkeit erstellt werden sollen
**Schritte**:
1. Bestehende Dateien prüfen: `QuizVerse/app/src/main/java/com/quizverse/app/data/prepopulate/questions/`
2. Nächste fortlaufende Nummer für die Datei ermitteln (z.B. FilmQuestionsEasy6.kt)
3. 50 Fragen pro Datei erstellen, Format: `Question(text=, options=listOf(), correctAnswer=, ...)`
4. **WICHTIG**: Jede faktische Aussage mit Web-Recherche verifizieren (Lesson aus FAILURES.md)
5. In `QuestionSeeder.kt` importieren UND in der `seedQuestions()`-Funktion registrieren
6. `questionCount` für die Kategorie aktualisieren
7. Build prüfen (Kotlin-Compiler fängt Syntaxfehler)
8. Committen mit `#NNN - Add [N] [difficulty] [category] questions`

**Bekannte Fallstricke**:
- Vergessen, den Import UND die Registrierung in QuestionSeeder.kt hinzuzufügen
- questionCount nicht aktualisiert → App zeigt falsche Fortschrittsanzeige
- Fakten nicht geprüft → falsche Antworten in der App

---

## Neues Projekt anlegen (Cross-Platform)

**Wann**: Wenn ein neues Projekt in ~/proggs/ erstellt werden soll
**Schritte**:
1. Ordner unter `~/proggs/` erstellen (z.B. `~/proggs/MeinProjekt/`)
2. **NIEMALS** ein neues GitHub-Repo erstellen — alles geht in `Pepsi1978/proggs`
3. Architektur planen: macOS (Swift/AppKit) + Windows (C#/WPF) parallel
4. README.md erstellen mit Programmbeschreibung + Installation (DE, für Anfänger)
5. Build-System einrichten (Xcode Projekt, .sln, package.json, Cargo.toml)
6. quality-gate Agent starten nach erstem Feature
7. Committen und Pushen

**Bekannte Fallstricke**:
- Neues Repo erstellt statt Unterordner → CLAUDE.md-Verstoß
- Python für GUI verwendet → User will das nicht

---

## Self-Improve Durchlauf

**Wann**: Bei `/self-improve` oder expliziter Anfrage
**Schritte**:
1. Platform erkennen (Darwin/MINGW/Linux)
2. Stufe 0: session-scores.jsonl Plausibility Check + evolution-analyst
3. Stufe 1: env-checker Agent (full/quick)
4. Stufe 2: Researchers parallel (R1+R5+R6 immer, R2-R4 wenn Cache >7 Tage)
5. Stufe 3: Verbesserungen implementieren, Report, Meta-Improve
6. Cross-Platform-Sync: Alle Änderungen nach ~/proggs/claude-code-setup/ kopieren
7. Committen und Pushen

**Bekannte Fallstricke**:
- settings-reference.json vergessen zu aktualisieren bei Hook-Änderungen
- Git push ohne vorheriges pull --rebase → Merge-Konflikte

---

## Tampermonkey-Skript aktualisieren

**Wann**: Bei Änderungen an Userscripts in ~/proggs/Tampermonkey/
**Schritte**:
1. Datei bearbeiten
2. **PFLICHT**: @version im UserScript-Header erhöhen (x.y → x.y+1)
3. Committen mit `#NNN - Update [Skriptname] to v[Version]`
4. Pushen

**Bekannte Fallstricke**:
- Version nicht erhöht → Tampermonkey erkennt kein Update
