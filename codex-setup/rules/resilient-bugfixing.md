# Codex Resilient Bugfixing

Diese Regel ist die dritte Systemdirektive unter der `## Oberste Direktive`.
Sie ist die dritthoechste Regel im gesamten Codex-System - direkt unter
Direktive 1 und Direktive 2.
Sie gilt fuer jeden Bugfix in der Codex-Programmierumgebung selbst:

- Hooks
- Regeln
- Settings
- MCP-Server
- Validierung
- Skripte
- Agents
- Skills

Sie gilt nicht fuer normale Projekt- oder App-Bugs des Benutzers.

> Ein Fehler wird genau EINMAL gemacht - dann nie wieder.

## Was ist Resilient Bugfixing?

Wenn du einen Fehler findest und fixst, ist der Fix nicht fertig, bis er
zukunftssicher ist.

- Ein normaler Fix behebt das Problem jetzt.
- Ein resilienter Fix behebt das Problem fuer spaetere Sessions, die andere Plattform und das naechste Update mit.
- Bugfixing ist erst fertig, wenn Root Cause, verwandte Fehlerquellen, Zukunftssicherheit, Schadensfreiheit und Dokumentation abgesichert sind.

## Warum ist das Direktive 3?

- Direktive 1 setzt das Ziel: mehr Intelligenz pro Session.
- Direktive 2 erkennt waehrend der Arbeit, wo Fehler und Reibung liegen.
- Direktive 3 sorgt dafuer, dass erkannte Umgebungsfehler so gefixt werden, dass sie nicht wiederkommen.

Ohne resilientes Bugfixing wuerde Codex dieselben Umweltfehler immer wieder
reparieren statt echte Intelligenz aufzubauen.

## Der Pflicht-Ablauf: 5 Schritte bei JEDEM Bugfix

### Schritt 1: Root Cause finden

- NIEMALS nur das Symptom fixen.
- Vor jedem Umgebungsfix mindestens 3x `Warum?` fragen, bevor der Fix gebaut wird.
- Root Cause bedeutet: die tiefste technische Ursache finden, nicht nur das sichtbare Fehlersymptom.
- Wenn plattformabhaengiges Default-Verhalten die eigentliche Ursache ist, muss dieses Verhalten explizit erzwungen oder neutralisiert werden.

Faustregel:

- Wenn der Fix weniger als 30 Sekunden gedauert hat, wurde oft nur das Symptom gefixt.

### Schritt 2: Verwandte Fehlerquellen suchen

Vor dem Fix muessen drei Fragen beantwortet werden:

1. Gleiche Fehlerklasse: Kann derselbe Fehlertyp an anderer Stelle auftreten?
2. Gleiche Komponente: Kann dieselbe Komponente auf andere Weise ebenfalls versagen?
3. Gleiche Abhaengigkeit: Welche anderen Teile haengen von derselben Ursache ab?

Ein Fix ist unvollstaendig, wenn nur die sichtbare Instanz gefixt wird, aber
die verwandten Oberflaechen ungeprueft bleiben.

### Schritt 3: Zukunftssicheren Fix implementieren

Ein Umgebungsfix ist nur dann vollstaendig, wenn er diese Eigenschaften hat:

1. `Self-Healing`: Er stellt sich nach Updates, Neustarts oder Plattformwechseln wieder her oder bleibt automatisch korrekt.
2. `Defensiv`: Er faengt die Fehlerklasse ab, nicht nur den Einzelfall.
3. `Ueberlebbar`: Er uebersteht Plugin-, CLI-, Config- und OS-Aenderungen moeglichst ohne manuelle Nacharbeit.
4. `Erweiterbar`: Er ist fuer aehnliche kuenftige Faelle ausbaubar.
5. `Dokumentiert`: Ursache, Fixmuster und Vermeidungsregel stehen in der Fix-Datenbank.
6. `Schadensfrei`: Der Fix selbst fuehrt keine neuen Fehler ein.

### Schritt 3b: Fix-Induced-Failure-Pruefung (PFLICHT - VOR dem Commit)

Vor jedem Commit eines Umgebungsfixes muessen diese 8 Fragen beantwortet werden:

1. `Abhaengigkeiten`: Was haengt vom geaenderten Code oder Verhalten ab?
2. `Fehlszenarien`: Was passiert, wenn der Fix-Code selbst scheitert?
3. `Zustandsaenderungen`: Veraendert der Fix einen dauerhaften Systemzustand?
4. `Race Conditions`: Kann der Fix mit anderem Code kollidieren?
5. `Rueckwaertskompatibilitaet`: Bricht der Fix etwas, das vorher funktionierte?
6. `Plattform-Effekte`: Funktioniert der Fix auf macOS und Windows?
7. `Update-Resistenz`: Ueberlebt der Fix spaetere Updates?
8. `Graceful Degradation`: Gibt es einen sicheren Fallback, wenn Voraussetzungen fehlen?

Die Leitfrage dahinter lautet:

- Was ist das Schlimmste, das passieren kann, wenn dieser Fix deployt wird und danach 6 Monate niemand hinschaut?

### Schritt 4: Mehrere Absicherungsschichten (Defense in Depth)

Nie nur eine einzige Schutzschicht bauen. Gute Umgebungsfixes kombinieren
mindestens zwei oder drei der folgenden Ebenen:

- `Praeventiv`: Problem verhindern, bevor es auftritt
- `Reaktiv`: Problem im Fehlerfall abfangen und degradiert weiterlaufen
- `Selbstheilend`: Nach Updates oder Drift automatisch wiederherstellen
- `Upstream` optional: Den eigentlichen Verursacher melden oder upstream beheben

### Schritt 5: Erkenntnis persistieren

Jeder Umgebungsfix gehoert in `codex-setup/state/environment-fixes.json`.

Jeder neue oder aktualisierte Eintrag muss fuer andere CLIs ohne Session-Kontext
verstaendlich sein und mindestens enthalten:

- Kontext
- exakten oder wiedererkennbaren Symptomtext
- Root Cause
- 3x-Warum- bzw. Why-Chain-Zusammenfassung
- gepruefte verwandte Fehlerquellen
- falsches Muster und richtiges Muster
- klare Vermeidungsregel im Wenn-Dann-Stil
- Resilienz-Zusammenfassung
- Fix-Induced-Failure-Review
- Verifikation

## Plattform-spezifische Bugfix-Regeln

### Windows: UTF-8 Encoding ist PFLICHT

Auf Windows darf nie auf implizites Default-Encoding vertraut werden.

Falsch:

```python
with open(path, "w") as f:
    json.dump(data, f)
```

Richtig:

```python
with open(path, "w", encoding="utf-8") as f:
    json.dump(data, f, ensure_ascii=False)
```

### Atomares Schreiben (Write-to-Temp-then-Rename)

Kritische Dateien sollen nicht destruktiv direkt ueberschrieben werden.

```python
import json
import os
import tempfile

def safe_json_write(path, data):
    dir_name = os.path.dirname(path)
    with tempfile.NamedTemporaryFile(
        "w",
        dir=dir_name,
        suffix=".tmp",
        delete=False,
        encoding="utf-8",
    ) as tmp:
        json.dump(data, tmp, indent=2, ensure_ascii=False)
        tmp.write("\n")
        tmp_path = tmp.name
    os.replace(tmp_path, path)
```

### Plattform-Unterschiede Referenztabelle

- Default Encoding: macOS `UTF-8`, Windows oft kein UTF-8 Default
- Shell: macOS `zsh/bash`, Windows Git Bash plus PowerShell fuer Hooks
- Temp-Verzeichnis: macOS `/tmp`, Windows `%TEMP%`
- Home-Variable: macOS `$HOME`, Windows `%USERPROFILE%`
- Pfad-Trenner: macOS `/`, Windows `\\` nativ und `/` in Git Bash
- Line Endings: macOS `LF`, Windows oft `CRLF`
- Executable-Endung: macOS keine, Windows `.exe`
- Symlinks: macOS nativ, Windows oft mit Developer Mode
- `grep -P`: Unix oft verfuegbar, Windows-Emulation unzuverlaessig
- Locale: macOS meist UTF-8, Windows oft cp1252 statt UTF-8

## Was niemals passieren darf

- Nur das Symptom fixen, ohne die Root Cause zu verstehen
- Einen Fix deployen, der beim naechsten Update oder Neustart sofort wieder bricht
- Nur die sichtbare Instanz fixen, ohne verwandte Fehlerquellen zu pruefen
- Einen Umgebungsfix ohne Eintrag in der Fix-Datenbank committen
- Einen Fix deployen, der selbst neue Fehler einfuehrt
- Die 8-Punkte-Pruefung ueberspringen
- Einen Fehler ein zweites Mal machen, obwohl er schon einmal erkannt und gefixt wurde

## Schutz dieser Direktive

- Diese Direktive muss an mindestens 2 unabhaengigen Orten gespeichert sein.
- Fuer Codex in diesem Workspace bedeutet das mindestens das Repo-Whiteboard und die lokal deployte Self-Improve-Skill-Kopie.
- Bei Konflikten gewinnt diese Direktive gegen andere Regeln - mit zwei Ausnahmen: Direktive 1 und Direktive 2 stehen darueber.
- Wenn ein Validator, Skill oder Selbstverbesserungsmechanismus eine Abschwaechung erkennt, soll das sichtbar gemacht und behoben werden.
