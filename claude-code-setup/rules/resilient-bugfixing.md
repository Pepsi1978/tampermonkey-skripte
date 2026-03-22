# Resilient Bugfixing — Fehler nur EINMAL (KRITISCH)

## Regel: Jeder Bug wird zum permanenten System-Upgrade

Wenn ein Fehler gefunden und gefixt wird, ist der Fix NICHT fertig, bis er **zukunftssicher** ist.
Ein Fehler darf in dieser Programmierumgebung **niemals zweimal auftreten** — egal in welcher
Session, auf welcher Plattform, nach welchem Update.

## Pflicht-Ablauf bei JEDEM Bugfix

### 1. Root Cause finden (nicht nur Symptom fixen)
- Den eigentlichen Ausloeser identifizieren, nicht nur das sichtbare Problem
- Frage: "Was ist die TIEFSTE Ursache?" — mindestens 3x "Warum?" fragen
- Beispiel: Hook-Fehler → Symptom ist der Fehler, Root Cause ist die Race Condition

### 2. Verwandte Fehlerquellen suchen (PFLICHT)
- **Gleiche Klasse**: Kann der gleiche Fehlertyp an anderer Stelle auftreten?
  (z.B. Race Condition bei claude-mem → gibt es andere Plugins mit dem gleichen Muster?)
- **Gleiche Komponente**: Kann die betroffene Komponente auf andere Weise versagen?
  (z.B. Port-Konflikt → was passiert bei Timeout, bei Crash, bei Update?)
- **Gleiche Abhaengigkeit**: Welche anderen Teile haengen von der gleichen Sache ab?
  (z.B. Worker-Service → wer braucht den noch? Was wenn er spaeter crasht?)

### 3. Zukunftssicheren Fix implementieren
Der Fix muss diese Eigenschaften haben:

| Eigenschaft | Bedeutung |
|-------------|-----------|
| **Self-Healing** | Repariert sich selbst nach Updates, Neustarts, Plattformwechsel |
| **Defensiv** | Faengt nicht nur den bekannten Fehler ab, sondern die ganze Fehlerklasse |
| **Ueberlebbar** | Uebersteht Plugin-Updates, Config-Aenderungen, System-Upgrades |
| **Erweiterbar** | Kann fuer zukuenftige aehnliche Faelle erweitert werden (z.B. Service Registry) |
| **Dokumentiert** | Memory-Eintrag erklaert Ursache, Fix und wie man neue Faelle hinzufuegt |

### 4. Mehrere Absicherungsschichten (Defense in Depth)
Nie nur EINE Absicherung. Immer mindestens 2-3 Schichten:
- Schicht 1: Praeventiv (Problem verhindern bevor es auftritt)
- Schicht 2: Reaktiv (Problem abfangen wenn es doch auftritt)
- Schicht 3: Selbstheilend (Fix automatisch wiederherstellen nach Updates)
- Schicht 4: Upstream (Bug beim Verursacher melden fuer permanenten Fix)

### 5. Memory speichern
- Feedback-Memory mit: Was war der Fehler, was war die Root Cause, was ist der Fix
- Muster-Erkennung: "Wenn ich in Zukunft [Muster X] sehe, muss ich [Check Y] machen"

## Beispiel: claude-mem Hook-Fehler (2026-03-22)

| Schritt | Was gemacht wurde |
|---------|-------------------|
| Root Cause | Race Condition: MCP-Server und Hook starten Worker gleichzeitig |
| Verwandte Fehler | Alle Plugins mit Daemon/Worker/Server-Start geprueft |
| Self-Healing | Auto-Patcher repariert hooks.json nach jedem Plugin-Update |
| Defensiv | Service Registry fuer ALLE zukuenftigen Service-Plugins |
| Mehrere Schichten | Guard-Hook + Auto-Patcher + Plugin-Patch + Upstream-Issue |
| Memory | Feedback-Memory mit Muster-Erkennung gespeichert |

## Was NIEMALS passieren darf
- ❌ Nur das Symptom fixen ohne Root Cause zu verstehen
- ❌ Fix der bei naechstem Plugin-Update oder Neustart kaputt geht
- ❌ Fix nur fuer den einen konkreten Fall, ohne aehnliche Faelle zu pruefen
- ❌ Fix ohne Memory-Eintrag (Wissen geht verloren zwischen Sessions)
- ❌ "Funktioniert jetzt" sagen ohne zu pruefen ob es in 2 Wochen noch funktioniert
