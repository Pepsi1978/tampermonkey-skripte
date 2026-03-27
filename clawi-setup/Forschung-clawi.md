# Forschung-clawi.md - OpenClaw Specific Intelligence Research (Deep Context)

Dieses Dokument konzentriert sich auf die technologische Optimierung von **Clawi** innerhalb der OpenClaw-Plattform.

---

## ⚡ OpenClaw-spezifische Forschungsschwerpunkte

### 1. Gemini 1M Context Management (Adaptive Compaction)
- **Kontext**: Gemini 3 Flash verfügt über ein massives 1M Token Fenster. Standardmäßige "naive" Kompaktierung (alles nach X Nachrichten zusammenfassen) verschwendet Reasoning-Potenzial.
- **Theorie**: Implementierung einer "Sliding Window" Kompaktierung. Die letzten 50.000 Token bleiben 1:1 erhalten, ältere Teile werden in einen semantischen Index (Wissens-Graph) überführt.
- **Nutzen**: Beibehaltung höchster Detailtreue bei gleichzeitigem Schutz vor "Instruction Fade-out".

### 2. Event-driven Identity Recovery (OpenClaw Hooks)
- **Kontext**: In langen Sitzungen sinkt die "Attention" auf System-Instruktionen.
- **Theorie**: Nutzung von OpenClaw-Hooks, die bei Erkennung von Fehler-Mustern (z.B. Log-Eintrag "edit failed") automatisch eine Kurzzusammenfassung der `DIREKTIVEN.md` in den aktuellen Prompt injizieren.
- **Nutzen**: Sofortige Rückkehr zu stabilen Verhaltensmustern bei technischem Stress.

### 3. Lazy Tool Discovery (Tool-Orchestrierung)
- **Kontext**: Das Laden von 50+ Tools bei jedem Turn bläht den Prompt unnötig auf.
- **Theorie**: Dynamisches Einblenden von Tools basierend auf dem aktuellen Intent des Benutzers. (z.B. `git` Tools nur einblenden, wenn "commit" oder "push" im Gespräch fallen).
- **Nutzen**: Kürzere Latenzzeiten und geringere Token-Kosten.

---

## 🧪 Neue Clawi-Forschungsvorschläge

- **[2026-03-27] Cross-Platform Resilient Path-Resolution**
  - *Problem*: Windows-Pfade (`C:\...`) vs. Unix-Pfade in Repositories.
  - *Lösung*: Ein interner Pre-Processor-Dienst für Clawi, der alle Pfade in System-Befehlen automatisch an das Betriebssystem von **Supi** anpasst (Normalisierung).

---

## 💡 Abgeleitete Clawi-Intelligenz-Vorschläge

- **Clawi-Vorschlag 1: "Identity-Aware" Heartbeat**
  - *Status*: EVALUIERUNG
  - *Umsetzung*: Der Heartbeat prüft den Token-Abstand zum letzten Laden der `DIREKTIVEN.md`. Bei > 100k Token Abstand erfolgt eine stille Re-Injektion der Kernregeln.

---
*Gepflegt von Clawi (Forschungsagent-Modus) - Letztes Update: 2026-03-27.*
