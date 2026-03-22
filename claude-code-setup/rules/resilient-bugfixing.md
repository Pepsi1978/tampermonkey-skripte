# Resilient Bugfixing & Proaktive Intelligenz-Steigerung (KRITISCH)

## Regel: Jeder Bug wird zum permanenten System-Upgrade

Wenn ein Fehler gefunden und gefixt wird, ist der Fix NICHT fertig, bis er **zukunftssicher** ist.
Ein Fehler darf in dieser Programmierumgebung **niemals zweimal auftreten** — egal in welcher
Session, auf welcher Plattform, nach welchem Update.

## Proaktive Intelligenz-Vorschlaege (PFLICHT in jeder Session)

Claude muss **waehrend der Arbeit** kontinuierlich nach Verbesserungen suchen und dem Benutzer
Vorschlaege machen. Nicht nur wenn Fehler auftreten, sondern IMMER:

### Wann Vorschlaege machen?
- **Nach jedem Fix**: "Das hat funktioniert — aber hier sehe ich noch eine Schwachstelle..."
- **Bei wiederkehrenden Mustern**: "Mir faellt auf, dass wir X schon 2x manuell gemacht haben. Soll ich das automatisieren?"
- **Bei Zwischenfehler in der Session**: Wenn waehrend der Arbeit etwas nicht beim ersten Mal klappt,
  auch wenn es danach gefixt wurde → trotzdem vorschlagen wie man es in Zukunft vermeiden kann
- **Bei ineffizienten Workflows**: Wenn ein Schritt zu viele Versuche braucht oder zu lange dauert
- **Bei fehlender Absicherung**: Wenn etwas funktioniert, aber keine Tests/Guards/Fallbacks hat
- **Am Ende einer groesseren Aufgabe**: Kurzer Rueckblick: "Was koennte beim naechsten Mal besser laufen?"

### Format fuer Vorschlaege
Vorschlaege MUESSEN kurz, klar und sofort umsetzbar sein:
```
💡 **Intelligenz-Vorschlag**: [Was verbessert werden kann]
   → [Konkreter Vorschlag in 1-2 Saetzen]
   → Soll ich das umsetzen?
```

### Beispiele fuer gute Vorschlaege
- "Dieser Hook hat keinen Retry-Mechanismus. Wenn der mal fehlschlaegt, haengt die Session."
- "Wir haben jetzt 3 Hooks die curl brauchen. Ein gemeinsamer Health-Check-Helper waere robuster."
- "Dieses Plugin wird bei jedem Start geprueft, aber das Ergebnis koennte gecacht werden."
- "Der Build hat 2x fehlgeschlagen wegen fehlender Abhaengigkeit. Ein Pre-Flight-Check wuerde das verhindern."

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
- ❌ Zwischenfehler in der Session ignorieren nur weil sie "danach" gefixt wurden
- ❌ Session beenden ohne Rueckblick auf Verbesserungsmoeglichkeiten
- ❌ Stumm arbeiten ohne proaktive Vorschlaege zur Intelligenz-Steigerung
