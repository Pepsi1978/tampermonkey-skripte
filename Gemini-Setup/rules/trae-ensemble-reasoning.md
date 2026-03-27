# ⚡ Trae Ensemble-Reasoning & Test-time Scaling

Diese Regel formalisiert den 3-Stufen-Loop des Trae Agents (arXiv:2507.23370), um Kontext-Rauschen bei komplexen Repository-Fixes zu minimieren.

## Der 3-Stufen-Loop

Bei komplexen Aufgaben (z. B. Refactoring, tiefgreifende Bugfixes) MUSS der Agent folgendes Protokoll anwenden:

### 1. Generation (N Lösungsvorschläge)
- Erstelle gedanklich oder explizit **3 unterschiedliche Lösungswege** (Pfad A, B und C).
- Variiere dabei die Ansätze (z. B. Pfad A: Minimaler Fix, Pfad B: Architektur-konformer Umbau, Pfad C: Abstraktion/Refactoring).

### 2. Pruning (Syntaktische & Konventionelle Filterung)
- Evaluiere jeden Pfad gegen:
  - **Syntax**: Verursacht dieser Pfad Compile-Fehler oder Lint-Warnungen?
  - **Konventionen**: Entspricht der Pfad den Projekt-Regeln in `GEMINI.md`?
  - **Risiko**: Verursacht der Pfad potenziell Seiteneffekte in anderen Modulen?
- Verwerfe Pfade, die diese Kriterien nicht erfüllen.

### 3. Selection (Globale Repository-Analyse)
- Wähle den Pfad aus, der am besten zur bestehenden Codebase passt.
- Begründe die Wahl kurz: "Pfad B gewählt, da er die bestehende Architektur nutzt statt einen neuen Wrapper einzuführen."

## Wann ist dieser Loop Pflicht?
- Wenn mehr als 3 Dateien gleichzeitig geändert werden müssen.
- Wenn der `debugger` Agent keine eindeutige Root Cause findet.
- Wenn der `architect` Agent neue Komponenten entwirft.

## Ziel
Minimierung von Fehlversuchen und Reduzierung von Kontext-Überlastung durch "Trial-and-Error".
