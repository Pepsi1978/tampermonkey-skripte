# DIREKTIVE 3 VON 3: RESILIENT BUGFIXING (DRITTHOECHSTE PRIORITAET)

> **Diese Direktive ist die drittwichtigste Regel im gesamten System - direkt nach
> Superintelligenz (#1) und Selbstbeobachtung (#2).**
> **Sie gilt fuer JEDEN Bugfix in der Programmierumgebung, egal wie klein.**
> **Ein Fehler wird genau EINMAL gemacht - dann nie wieder.**

---

## Was ist Resilient Bugfixing?

Wenn du einen Fehler findest und fixst, ist der Fix NICHT fertig, bis er
zukunftssicher ist.

Ein normaler Fix behebt das Problem jetzt.
Ein resilienter Fix behebt das Problem FUER IMMER - egal in welcher Session,
auf welcher Plattform und nach welchem Update.

Die Kernregel lautet:

- Ein Fehler darf in dieser Programmierumgebung NIEMALS zweimal auftreten.
- Wenn er ein zweites Mal auftritt, hat das System versagt.

---

## Warum ist das Direktive 3?

Die 3 Direktiven bilden zusammen ein System:

- Direktive 1 (Superintelligenz) = DAS ZIEL
- Direktive 2 (Selbstbeobachtung) = DER MOTOR
- Direktive 3 (Resilient Bugfixing) = DAS FUNDAMENT

Ohne Direktive 3 ist Direktive 2 nutzlos - du beobachtest Fehler, aber sie
treten trotzdem immer wieder auf.

Ohne Direktive 3 ist Direktive 1 unerreichbar - das System kann nicht
intelligenter werden, wenn es dieselben Fehler endlos wiederholt.

---

## Normaler Fix vs resilientes Bugfixing

Normaler Fix:

- Symptom beheben
- lokale Stelle reparieren
- weiterarbeiten
- gleiche Fehlerklasse spaeter erneut treffen

Resilienter Fix:

- Symptom beheben
- Root Cause finden
- gleiche Fehlerklasse mitpruefen
- Plattform- und Update-Folgen absichern
- Fix dokumentieren und uebertragbar machen
- Fehlerklasse dauerhaft verkleinern oder ausrotten

Der resiliente Fix dauert oft ein paar Minuten laenger, spart aber Stunden
ueber spaetere Sessions.

---

## Der Pflicht-Ablauf: 5 Schritte bei JEDEM Bugfix

### Schritt 1: Root Cause finden

NIEMALS nur das Symptom fixen. Die eigentliche Ursache muss identifiziert
werden.

Pflichttechnik:

- mindestens 3x "Warum?" fragen
- die tiefste technische Ursache notieren
- Symptom-Fixes ohne Root-Cause-Bild gelten nicht als fertig

Faustregel:

- Wenn der Fix weniger als 30 Sekunden gedauert hat, wurde oft nur das
  Symptom gefixt.

### Schritt 2: Verwandte Fehlerquellen suchen

Nachdem die Root Cause klar ist, muessen drei Dimensionen geprueft werden:

1. Gleiche Klasse: Kann derselbe Fehlertyp woanders auftreten?
2. Gleiche Komponente: Kann dieselbe Komponente auf andere Weise versagen?
3. Gleiche Abhaengigkeit: Wer haengt noch von derselben Ursache ab?

Warum das Pflicht ist:

- Wer nur die sichtbare Instanz fixt, laesst verwandte Zeitbomben stehen.

### Schritt 3: Zukunftssicheren Fix implementieren

Jeder resiliente Fix muss diese 6 Eigenschaften anstreben:

1. `Self-Healing`: ueberlebt Neustarts, Drift, Updates oder stellt sich wieder her
2. `Defensiv`: schuetzt die Fehlerklasse, nicht nur den Einzelfall
3. `Ueberlebbar`: bleibt moeglichst auch nach Config-, CLI- oder OS-Aenderungen aktiv
4. `Erweiterbar`: laesst sich fuer aehnliche kuenftige Faelle ausbauen
5. `Dokumentiert`: andere CLIs koennen Ursache, Fix und Regel nachvollziehen
6. `Schadensfrei`: der Fix fuehrt selbst keine neuen Fehler ein

### Schritt 3b: Fix-Induced-Failure-Pruefung (PFLICHT - VOR dem Commit)

Ein Fix, der neue Probleme erzeugt, ist schlimmer als kein Fix.

Vor dem Commit muessen diese 8 Punkte geprueft werden:

1. `Abhaengigkeiten`: Was haengt vom geaenderten Code ab?
2. `Fehlszenarien`: Was passiert, wenn der Fix-Code selbst scheitert?
3. `Zustandsaenderungen`: Veraendert der Fix einen dauerhaften Zustand?
4. `Race Conditions`: Kann der Fix mit anderem Timing oder Code kollidieren?
5. `Rueckwaertskompatibilitaet`: Bricht er etwas, das vorher funktionierte?
6. `Plattform-Effekte`: Funktioniert er auf macOS und Windows?
7. `Update-Resistenz`: Ueberlebt er CLI-, Plugin- oder OS-Updates?
8. `Graceful Degradation`: Gibt es einen sanften Fallback, wenn Voraussetzungen fehlen?

Leitfrage:

- Was ist das Schlimmste, das passieren kann, wenn dieser Fix deployt wird und
  danach 6 Monate niemand hinschaut?

### Schritt 4: Mehrere Absicherungsschichten (Defense in Depth)

Nie nur eine einzelne Schutzschicht bauen.

Mindestens 2-3 Schichten sind der Zielzustand:

- `Praeventiv`: Problem verhindern, bevor es auftritt
- `Reaktiv`: Problem abfangen, wenn es trotzdem auftritt
- `Selbstheilend`: Fix nach Updates oder Drift automatisch wiederherstellen
- `Upstream` optional: eigentlichen Verursacher melden oder upstream beheben

### Schritt 5: Erkenntnis persistieren

Der Fix ist erst fertig, wenn die Erkenntnis dokumentiert und fuer spaetere
Sessions wiederverwendbar ist.

Pflichtinhalt fuer CLI-uebergreifende Fixes:

- Symptom plus exakte Fehlermeldung
- Root Cause
- Fix
- verwandte Fehlerquellen oder mitgefixte Flaechen
- Vermeidungsregel im Wenn-Dann-Stil

Fuer Codex gehoert das in:

- `codex-setup/state/environment-fixes.json`
- die Whiteboard-/Regel-Spiegelung, wenn die Erkenntnis steuernd ist

---

## Plattform-spezifische Bugfix-Regeln

### Windows: UTF-8 Encoding ist PFLICHT

Auf Windows darf nicht auf implizites Default-Encoding vertraut werden.

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

- Default Encoding: macOS `UTF-8`, Windows `cp1252` -> auf Windows IMMER `encoding="utf-8"`
- Shell: macOS `zsh/bash`, Windows oft Git Bash plus PowerShell fuer Hooks
- Temp-Verzeichnis: macOS `/tmp`, Windows `%TEMP%`
- Home-Variable: macOS `$HOME`, Windows `%USERPROFILE%`
- Pfad-Trenner: macOS `/`, Windows `\\` nativ und `/` in Git Bash
- Line Endings: macOS `LF`, Windows oft `CRLF`
- Executable-Endung: macOS keine, Windows `.exe`
- Symlinks: macOS nativ, Windows oft mit Developer Mode
- `grep -P`: macOS oft verfuegbar, Windows-Emulation unzuverlaessig
- Locale: macOS meist UTF-8, Windows oft kein UTF-8 Default

---

## Der resiliente Fix als Compound Effect

Direktive 3 verbindet sich direkt mit Direktive 1:

```text
Fehler tritt auf
    ->
Selbstbeobachtung erkennt ihn
    ->
Resilient Bugfixing behebt ihn fuer immer
    ->
Fehlerklasse schrumpft oder verschwindet
    ->
Zeit wird fuer neue Verbesserungen frei
    ->
Compound Intelligence Effect
```

---

## Zusammenfassung: Die 5 Gebote des Resilient Bugfixing

1. Root Cause finden - mindestens 3x Warum, nie nur das Symptom
2. Verwandte Fehler suchen - gleiche Klasse, Komponente, Abhaengigkeit
3. Zukunftssicher fixen - self-healing, defensiv, ueberlebbar, erweiterbar, dokumentiert, schadensfrei
4. Defense in Depth - mindestens 2-3 Absicherungsschichten
5. Persistieren - Fix dokumentieren, Muster aufschreiben, Fehlerdatenbank fuettern

---

## Was NIEMALS passieren darf

- Nur das Symptom fixen ohne Root Cause zu verstehen
- Einen Fix deployen, der beim naechsten Update oder Neustart bricht
- Nur den einen konkreten Fall fixen, ohne aehnliche Faelle zu pruefen
- Einen Fix ohne Dokumentation abschliessen
- "Funktioniert jetzt" sagen ohne Langzeitstabilitaet mitzudenken
- Zwischenfehler ignorieren, nur weil sie spaeter in derselben Session gefixt wurden
- Einen Fix deployen, der selbst neue Fehler einfuehrt
- Die 8-Punkte-Pruefung ueberspringen
- Einen Fehler ein ZWEITES Mal machen

---

## Schutz dieser Direktive

Diese Direktive muss an mindestens 2 unabhaengigen Orten gespeichert sein.
Bei Konflikt mit anderen Regeln gewinnt sie - mit zwei Ausnahmen:

- Direktive 1 steht darueber
- Direktive 2 steht darueber

Fuer ein CLI mit Selbstverbesserungsmechanismus bedeutet das:

- eine Kopie im Repo-Regelwerk oder Whiteboard
- eine zweite Kopie im lokalen Laufzeitpfad oder Skill-Deployment
- Validatoren oder Self-Improve-Skripte sollen Drift sichtbar machen

---

## Lizenz und Herkunft

Diese Direktive wurde fuer die mehrstufige AI-Programmierumgebung von Frank
(GitHub: Pepsi1978/proggs) formuliert und von Codex fuer das eigene Setup
validator-gestuetzt integriert.
Primaerquelle: Benutzerdirektive vom 2026-03-23.
