---
name: tool-check
description: Systematic code health scanner that audits projects or individual files for bugs, vulnerabilities, performance issues, and creative improvements. Use ONLY when the user explicitly says "/tool-check", "pruefe mein Tool", "check meinen Code", "Code-Gesundheitscheck", "finde Bugs", or "analysiere mein Projekt". NEVER run automatically or proactively — manual trigger only.
---

# Tool-Check: Systematischer Code-Gesundheitscheck

**Before doing ANYTHING, show the user this overview in German:**

```
+==============================================================+
|  Tool-Check v1.0 — Code-Gesundheitscheck                    |
|  Projekte und Dateien systematisch durchleuchten             |
+==============================================================+
|                                                              |
|  Was passiert jetzt:                                         |
|  Ich durchlaufe 3 Analyse-Schleifen. Jede Runde graebt      |
|  tiefer und findet subtilere Probleme.                       |
|                                                              |
|  Loop 1 — Oberflaeche                                        |
|    Offensichtliche Bugs, Crashes, fehlende Fehlerbehandlung  |
|    + kreative Verbesserungsideen                             |
|                                                              |
|  Loop 2 — Tiefenanalyse                                      |
|    Race Conditions, Memory Leaks, Sicherheitsluecken,        |
|    Performance-Probleme + kreative Verbesserungsideen        |
|                                                              |
|  Loop 3 — Architektur & Kreativ                              |
|    Sprachenwahl, Strukturverbesserung, moderne APIs,         |
|    alternative Ansaetze + kreative Verbesserungsideen        |
|                                                              |
|  Danach:                                                     |
|  Alle Ergebnisse als nummerierte Liste praesentieren.        |
|  Du entscheidest, was davon umgesetzt wird.                  |
|                                                              |
|  Zum Schluss:                                                |
|  Meta-Verbesserung — Vorschlaege fuer den Skill selbst      |
|                                                              |
|  Sicherheit: Nichts wird geaendert ohne deine Erlaubnis.    |
|  Du kannst jeden Schritt live mitlesen.                      |
|                                                              |
+==============================================================+
```

**Then proceed with the skill.**

You are performing a systematic code health check. This is not a quick lint — you run 3 analysis loops, each at increasing depth, to find everything from obvious bugs to subtle architectural issues. Each loop also includes a creative layer where you think beyond "what's broken" and ask "what could be better".

The user is not a programmer. Explain everything in German, in simple terms, so they understand what you found and why it matters.

## Visibility Rules (CRITICAL)

- NEVER run anything in the background (no `run_in_background`, no silent subagents)
- The user MUST be able to read along with EVERY action in real-time
- Before each action, write a short German explanation of what you're about to do
- After each action, write the result so the user can follow the progress
- Think of it as a live protocol: the user reads along like watching a log file

## Target Detection

Determine what to scan based on the user's input:

- **Specific file(s)** → scan those files
- **Project/folder** → scan all source files in that folder
- **Unclear** → ask the user what to scan

Detect the programming language(s) automatically and note them. This determines which checks are relevant (e.g., memory management checks only matter for languages without garbage collection).

Read the target files thoroughly before starting analysis. For large projects, focus on the most critical files first (entry points, core logic, API handlers).

## The 3-Loop Process

Each loop collects findings into a shared list that grows across all 3 loops. Findings are categorized by severity:

- **Bug** — Something that is or could be broken (crash, data loss, wrong behavior)
- **Verbesserung** — Something that works but could be better (performance, maintainability, security)
- **Kreativ** — An idea for doing things differently (new approach, better tools, architectural change)

**CRITICAL: NEVER apply fixes during the loops.** Only collect findings. All fixes are applied after the user reviews and approves the final list.

---

### Loop 1 — Oberflaeche (Surface Scan)

Focus on immediately visible issues that don't require deep code understanding.

**Bug-Scan:**
- Syntax errors, typos in variable/function names
- Uninitialized or unused variables and imports
- Empty catch/error blocks that swallow errors silently
- Missing null/undefined/nil checks that could cause crashes
- Obvious logic errors (off-by-one, wrong comparison operators, inverted conditions)
- Hardcoded values that should be configurable (magic numbers, file paths, URLs)
- Deprecated API usage that could break in future versions
- Missing return statements or unreachable code

**Sicherheit (Security):**
- Hardcoded API keys, passwords, tokens, or secrets
- Missing input validation at system boundaries (user input, API responses)
- Obvious injection vectors (SQL injection, XSS, command injection)
- Insecure default configurations

**Kreative Ebene (Creative Layer):**
- Could any function be simplified or made more readable?
- Are there modern language features that would make the code cleaner?
- Is the naming consistent and self-documenting?
- Are comments accurate and helpful (or outdated/misleading)?

After Loop 1, briefly report: "Loop 1 abgeschlossen — [N] Findings bisher. Starte Loop 2 (Tiefenanalyse)."

---

### Loop 2 — Tiefenanalyse (Deep Analysis)

Focus on issues that require understanding control flow, state management, and timing.

**Bug-Scan:**
- Race conditions (concurrent access to shared state, async timing issues)
- Memory leaks (unclosed streams/connections, unremoved event listeners, growing collections)
- Resource leaks (file handles, database connections, timers without cleanup, observer patterns)
- Error propagation problems (errors caught too early, lost error context, swallowed exceptions)
- Edge cases in business logic (empty inputs, boundary values, Unicode, locale-specific behavior)
- Callback/Promise/async-await misuse (missing await, unhandled rejections, callback hell)
- State management bugs (stale closures, shared mutable state, inconsistent state transitions)

**Performance:**
- Unnecessary re-computation or re-rendering
- N+1 query patterns (database, API calls in loops)
- Blocking operations on the main thread (long loops, synchronous I/O)
- Excessive DOM manipulation (no batching, no virtual DOM, no requestAnimationFrame)
- Large data structures copied unnecessarily (spread operator on large arrays/objects)
- Missing debounce/throttle on high-frequency events

**Sicherheit (Security):**
- CSRF/SSRF potential
- Insecure deserialization or eval usage
- Path traversal vulnerabilities
- Missing rate limiting or authentication checks
- Improper token/session handling

**Kreative Ebene (Creative Layer):**
- Would design patterns improve the architecture? (Observer, Strategy, Factory, etc.)
- Would caching significantly improve performance?
- Are there well-tested libraries that solve a problem better than the current custom code?
- Could error handling be made more robust with a consistent strategy?

After Loop 2, briefly report: "Loop 2 abgeschlossen — [N] Findings bisher. Starte Loop 3 (Architektur & Kreativ)."

---

### Loop 3 — Architektur & Kreativ (Architecture & Creative)

Focus on the big picture — is the approach fundamentally right?

**Architektur:**
- Is the code structure logical? Are responsibilities clearly separated?
- Is the dependency graph clean or are there circular dependencies?
- Is the error handling strategy consistent across the codebase?
- Is the code testable? Could tests be added easily?
- Is the API surface clean and well-documented?
- Is configuration properly separated from logic?
- Are there god objects/functions that do too much?

**Sprachen-Bewertung (Language Assessment):**
- Is the chosen language the best fit for this task?
- Would a different language provide significant benefits?
  - Better type safety (e.g., JS → TypeScript)
  - Better performance (e.g., Python → Rust for CLI tools)
  - Smaller binary / no runtime dependency (e.g., Python → Go)
  - Better ecosystem/libraries for this use case
  - Better cross-platform support
- **Only suggest a language change if the benefit is substantial.** "Could be 5% faster" is not worth a rewrite. "Would eliminate an entire class of bugs" might be.

**Kreative Ebene (Creative Layer):**
- Could the entire approach be rethought for better results?
- Are there emerging technologies or APIs that could replace complex custom code?
- Could the UX/DX be significantly improved with a different architecture?
- Would splitting or merging components improve maintainability?
- Is there a way to make the tool self-healing or more resilient?
- Could the tool benefit from a plugin/extension system?

After Loop 3, report: "Alle 3 Loops abgeschlossen — [N] Findings insgesamt. Erstelle die Zusammenfassung."

---

## After All 3 Loops: Presentation

Present ALL findings as a single numbered list, grouped by category. This is the most important part — the user makes decisions based on this list.

```
## Tool-Check Ergebnisse fuer [Projektname/Dateiname]

### Erkannte Sprache(n): [z.B. JavaScript, TypeScript]
### Analysierte Dateien: [Anzahl]
### Gefundene Probleme: [Anzahl total]

---

### Bugs (muessen gefixt werden)
1. [Datei:Zeile] — Beschreibung des Problems
   Fix: Konkrete Loesung
   Risiko: Was passiert wenn man es nicht fixt

2. [Datei:Zeile] — ...
   Fix: ...
   Risiko: ...

### Verbesserungen (sollte man machen)
N. [Datei:Zeile] — Beschreibung
   Fix: Konkrete Loesung
   Vorteil: Was wird dadurch besser

### Kreative Ideen (koennte man machen)
M. [Datei] — Beschreibung der Idee
   Umsetzung: Wie es gemacht werden koennte
   Aufwand: Einschaetzung (klein/mittel/gross)

### Architektur-Vorschlaege (optional, aber spannend)
K. Beschreibung — Begruendung
   Aufwand: Einschaetzung
   Nutzen: Was sich dadurch verbessert

---

Welche Punkte soll ich umsetzen?
(z.B. "1, 2, 5, 8" oder "alle Bugs" oder "alles ausser 12")
```

**Each finding must include:**
- Exact file and line number (where applicable)
- Clear description of the problem in German
- Concrete fix suggestion (not just "fix this" — show what the code should look like)
- Why it matters (what could go wrong, or what improves)

**Wait for the user to choose which items to implement.**

## Applying Fixes

After the user selects items:

1. Apply ONLY the selected fixes, one by one, visibly
2. After each fix, briefly confirm what was changed
3. Bump version numbers if applicable (e.g., Tampermonkey scripts follow `tampermonkey-version` skill rules)
4. Run any available tests or linters to verify fixes don't break functionality
5. Commit and push (per CLAUDE.md automation rules)
6. Report which fixes were applied and which were skipped

---

## Phase 2: Meta-Improve (Skill Self-Improvement)

After the code analysis is complete (whether or not fixes were applied), this skill analyzes and improves itself. This happens at the end of every run.

### Step 1: Self-Analysis

Reflect on the analysis that just ran:

- Which checks found nothing useful? Could they be replaced with more targeted checks?
- Were there issues that the loops missed but should have caught?
- Did any phase take too long or produce low-value results?
- Were there new patterns or techniques discovered that should become standard checks?
- Was the loop depth distribution right? (Too much surface, not enough depth?)
- Did the creative layer produce genuinely useful ideas?

### Step 2: Line Count Check

Count lines of this skill file:
```
wc -l ~/.claude/commands/tool-check.md
```

- **Under 500 lines**: Suggestions can be made freely
- **500-600 lines**: Warn that the limit is approaching
- **600+ lines**: STOP. Ask the user how to proceed (compress? split into sub-files? remove low-value sections?)

### Step 3: Present Suggestions (NEVER auto-apply!)

```
## Meta-Verbesserung: Vorschlaege fuer Tool-Check

### Vorschlag 1: [Titel]
**Was**: [Was soll geaendert werden]
**Warum**: [Begruendung aus der Analyse]
**Wo im Skill**: [Phase/Zeile die betroffen ist]

### Vorschlag 2: [Titel]
...

### Skill-Status
- Aktuelle Zeilenzahl: [N]/600
- Letzte Meta-Verbesserung: [Datum oder "erste"]

Soll ich diese Aenderungen umsetzen? (Ja/Nein/Teilweise)
```

**CRITICAL**: NEVER modify this skill file without explicit user approval. Only suggest, never auto-apply.

### Step 4: Apply (only after user says yes)

If the user approves:
1. **BACKUP FIRST**: Commit the current skill version to GitHub BEFORE making changes
2. Apply the approved changes to `~/.claude/commands/tool-check.md`
3. Update the version number and date at the bottom of this file
4. Document exactly what changed (old → new)
5. Sync to `~/proggs/claude-code-setup/commands/`

---

## Sync to GitHub

After the skill is modified, sync to the cross-platform repo:

1. Copy: `cp ~/.claude/commands/tool-check.md ~/proggs/claude-code-setup/commands/`
2. Commit and push to `Pepsi1978/proggs` (NEVER create a separate repo):
   ```
   cd ~/proggs && git add claude-code-setup/commands/ && git commit -m "#NNN - Update tool-check skill" && git push
   ```
3. Report sync status

---

## Important Rules

- NEVER apply fixes without user approval — always present findings first, then wait for selection
- NEVER modify this skill file without explicit user approval (Meta-Improve is suggest-only)
- NEVER run this skill automatically — manual trigger only, when the user explicitly requests it
- NEVER delete code without showing what will be removed and getting approval
- **Transparency**: Every finding must include file, line, description, fix, and reasoning. No vague findings.
- **Communication**: German with the user, English for code comments and commits
- **Before modifying this skill**: Always commit the current version as a backup first
- **600-line limit**: If approaching, warn the user. If exceeded, stop and ask.
- **Security**: If a critical vulnerability is found (exposed secrets, remote code execution), report it IMMEDIATELY — don't wait for all loops to finish
- **Visibility**: Everything happens in the main conversation, nothing hidden, no background work
- **Scope respect**: Only analyze and fix what the user asked for. Don't expand scope without asking.
- NEVER create new GitHub repositories. ALL changes go to `Pepsi1978/proggs`.

---
<!-- Skill Version: v1.0 | Date: 2026-03-11 | Last Meta-Improve: none | Lines: ???/600 -->
