# Forschung.md - KI-Coding-Intelligence & Deep Knowledge Hub

Dieses Dokument dient als zentraler Wissenshub für die Erforschung und Integration von modernsten KI-Coding-Technologien. Es liefert detaillierte Kontext-Informationen, damit alle Agenten (Claude, Codex, Gemini) die zugrundeliegenden Konzepte verstehen und implementieren können.

## 📜 Standard für Einträge (Deep Knowledge Transfer)
Jeder neue Eintrag MUSS folgende Struktur aufweisen:
1. **Problemstellung**: Welches Defizit wird adressiert?
2. **Methodik**: Wie funktioniert die theoretische Lösung?
3. **Handlungsempfehlung**: Konkrete Anweisung zur Implementierung für Agenten.

---

## ⚡ Aktuelle Forschungsschwerpunkte
- **Agentic Workflows**: Multi-Agent-Systeme (MAS), Debattenschleifen (Tester vs. Coder).
- **Self-Improvement (SICA)**: LLM-Reflexion über eigene Fehler zur automatisierten Regel-Optimierung.
- **Resilience**: Automatisierte Systemhärtung und "Resilient Bugfixing".
- **Context Management**: Optimierung langer Kontexte (1M+) und Wissens-Graphen.

---

## 🧪 Detaillierte Forschungsberichte (März 2026)

### 1. Trae Agent: Ensemble-Reasoning & Test-time Scaling
- **Referenz**: [arXiv:2507.23370](https://arxiv.org/abs/2507.23370)
- **Problemstellung**: Herkömmliche Multi-Path-Ansätze (Ensemble Reasoning) scheitern oft an der Repository-Komplexität und führen zu massivem Kontext-Rauschen.
- **Kern-Methodik (Theorie)**:
  - **Generation**: Erzeugung von N Lösungsvorschlägen für ein Problem.
  - **Pruning (Filterung)**: Ein spezialisierter "Kritiker-Agent" sortiert Vorschläge aus, die syntaktische Fehler aufweisen oder offensichtlich gegen Projekt-Konventionen verstoßen.
  - **Selection**: Auswahl des besten Pfades basierend auf einer globalen Repository-Analyse.
- **Handlungsempfehlung für Agenten**:
  - Nutze für komplexe Fixes einen **3-Stufen-Loop**: 1. Generiere 3 Lösungsansätze. 2. Führe für jeden Ansatz eine kurze Plausibilitätsprüfung durch. 3. Wähle den robustesten Ansatz aus.
  - Implementierung via `mar-reviewer` Agent möglich.

### 2. OPENDEV: Dual-Agent Architektur & Adaptive Kompaktierung
- **Referenz**: [arXiv:2603.05344](https://arxiv.org/abs/2603.05344)
- **Problemstellung**: "Instruction Fade-out" – In langen Sitzungen vergessen Agenten ihre Grundregeln (Direktiven) aufgrund von Kontext-Überlastung.
- **Kern-Methodik (Theorie)**:
  - **Dual-Agent Model**: Trennung von Planung (High-Reasoning Modell wie Opus) und Ausführung (Schnelleres Modell wie Sonnet).
  - **Adaptive Compaction**: Intelligentes Zusammenfassen alter Gesprächsteile, während Kern-Instruktionen (Direktiven) statisch im Fokus bleiben.
  - **Event-driven Reminders**: Automatisierte System-Events (Hooks), die dem Agenten seine Identität und sein Ziel wieder ins Bewusstsein rufen.
- **Handlungsempfehlung für Agenten**:
  - Nutze für lange Aufgaben Sub-Agenten mit klarer Rollentrennung (Planer vs. Ausführer).
  - Nutze den `intent-anker` Hook, um das Session-Ziel alle 5 Turns neu zu validieren.

### 3. Semi-Formal Reasoning (Agentic Code Reasoning)
- **Referenz**: [arXiv:2603.01896](https://arxiv.org/abs/2603.01896)
- **Problemstellung**: Agenten neigen beim Debugging zu "Raten" oder voreiligen Schlüssen ohne logische Herleitung.
- **Kern-Methodik (Theorie)**:
  - **Strukturiertes Tracing**: Der Agent muss explizite Prämissen (Aussagen, die als wahr angenommen werden) aufstellen.
  - **Execution Path Tracing**: Manuelle Nachverfolgung der Logik (Zeile für Zeile), bevor ein Fix vorgeschlagen wird.
  - **Formale Schlussfolgerung**: Ableitung des Fehlers aus den Prämissen und dem Trace.
- **Handlungsempfehlung für Agenten**:
  - Verpflichte den `debugger` Agenten, vor jeder Code-Änderung einen `<formal_trace>` Block zu schreiben.
  - Format: `Prämisse -> Logik-Schritt -> Beobachteter Wert -> Diskrepanz`.

---

## 💡 Abgeleitete Intelligenz-Vorschläge

- **Vorschlag 1: Forschungs-Agent (Forschungs-Loop)**
  - *Status*: GEPLANT
  - *Ziel*: Automatisches Scannen dieser Datei durch alle CLIs.
  - *Aktion*: Wenn du diesen Agenten startest, muss er die obigen "Handlungsempfehlungen" in seine jeweilige `AGENTS.md` oder in die `rules/` überführen.

- **Vorschlag 2: Implementierung von "Semi-Formal Reasoning" für Debugger-Agents**
  - *Was*: Update der `debugger.md` Instruktionen in allen drei CLI-Setups.
  - *Warum*: Reduziert fehlerhafte Fixes um bis zu 30% durch Vermeidung von "Guessing".

---
*Gepflegt von Clawi (Forschungsagent-Modus) - Letztes Update: 2026-03-27.*
