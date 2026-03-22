# Deutsche Trigger-Map fuer Skills und Plugins (KRITISCH)

## Warum diese Regel existiert

Der Benutzer spricht Deutsch (oft via Whisper Speech-to-Text). Die meisten Skill-
und Plugin-Beschreibungen sind auf Englisch. Diese Regel ist die Uebersetzungsschicht
zwischen deutschen Anfragen und englischen Skills.

**PFLICHT**: Bei JEDER Benutzer-Anfrage diese Map mental durchgehen und pruefen ob
ein Skill oder Plugin passt. Auch bei 1% Wahrscheinlichkeit den Skill aufrufen.

## Haupt-Kategorien

### Committen & Pushen
| Deutsche Phrase | Skill / Plugin |
|----------------|---------------|
| "committe", "commit", "mach ein commit" | `commit-commands:commit` |
| "committe und pushe", "push das", "ab damit" | `commit-commands:commit-push-pr` |
| "mach einen PR", "Pull Request erstellen" | `commit-commands:commit-push-pr` |
| "pushe das", "hochladen", "push" | direkt `git push` |

### Code Review & Qualitaet
| Deutsche Phrase | Skill / Plugin |
|----------------|---------------|
| "überprüfe den Code", "review", "schau dir das an" | `code-review:code-review` oder `pr-review-toolkit:review-pr` |
| "prüfe das Projekt", "check das", "ist das gut so?" | `tool-check` |
| "vereinfache", "aufräumen", "simplifizieren" | `simplify` |
| "Code Review", "reviewe den PR" | `coderabbit:review` oder `code-review:code-review` |
| "zweite Meinung", "andere Meinung", "was sagt Codex?" | `second-opinion:second-opinion` |

### Debugging & Fehler
| Deutsche Phrase | Skill / Plugin |
|----------------|---------------|
| "finde den Bug", "debugge das", "warum geht das nicht?" | `superpowers:systematic-debugging` |
| "Fehler fixen", "repariere", "geht nicht", "funktioniert nicht" | `superpowers:systematic-debugging` |
| "mach das rückgängig", "undo", "zurücknehmen" | `undo-changes` |
| "was ist kaputt?", "Fehleranalyse" | `superpowers:systematic-debugging` |
| "Root Cause", "Ursache finden" | `kaizen:why` (5-Whys) oder `kaizen:cause-and-effect` (Fishbone) |

### Planung & Architektur
| Deutsche Phrase | Skill / Plugin |
|----------------|---------------|
| "plan erstellen", "plane das", "wie sollen wir das machen?" | `superpowers:writing-plans` |
| "brainstormen", "Ideen sammeln", "was meinst du?" | `superpowers:brainstorming` |
| "Architektur", "wie soll das aufgebaut sein?" | `architect` Agent oder `everything-claude-code:plan` |
| "Feature bauen", "neues Feature", "ich will..." | `superpowers:brainstorming` → `superpowers:writing-plans` |
| "Spezifikation", "Anforderungen" | `sdd:brainstorm` |

### Testen
| Deutsche Phrase | Skill / Plugin |
|----------------|---------------|
| "teste das", "schreib Tests", "TDD" | `superpowers:test-driven-development` oder `tdd:write-tests` |
| "Tests fixen", "Tests reparieren" | `tdd:fix-tests` |
| "Testabdeckung", "Coverage" | `tdd:write-tests` |
| "Go testen" | `everything-claude-code:go-test` |
| "Kotlin testen" | `everything-claude-code:kotlin-test` |
| "Python testen" | `everything-claude-code:python-review` |
| "E2E testen", "Browser testen" | `everything-claude-code:e2e` |

### Selbstverbesserung & System
| Deutsche Phrase | Skill / Plugin |
|----------------|---------------|
| "verbessere dich", "self-improve", "werde besser" | `self-improve` |
| "was hast du gelernt?", "Learnings" | `claudeception` |
| "reflektiere", "was lief gut/schlecht?" | `claude-reflect:reflect` |
| "prüfe die Umgebung", "Environment Check" | `env-checker` Agent |
| "konfiguriere", "Settings ändern", "Einstellung" | `update-config` |
| "Tastenkürzel", "Keybinding", "Shortcut" | `keybindings-help` |

### Sicherheit
| Deutsche Phrase | Skill / Plugin |
|----------------|---------------|
| "Sicherheitscheck", "Security Review" | `everything-claude-code:security-review` |
| "Sicherheitsscan", "scan nach Schwachstellen" | `everything-claude-code:security-scan` oder `aikido:scan` |
| "ist das sicher?", "Schwachstelle", "Vulnerability" | `everything-claude-code:security-review` |
| "Semgrep", "statische Analyse" | `static-analysis:semgrep` |
| "Prompt Injection prüfen" | Parry-Scanner |

### Recherche & Dokumentation
| Deutsche Phrase | Skill / Plugin |
|----------------|---------------|
| "recherchiere", "such mal nach", "finde raus" | `researcher` Agent oder `everything-claude-code:deep-research` |
| "Doku schreiben", "Dokumentation", "README" | `docs:update-docs` |
| "was sagt die Doku?", "offizielle Dokumentation" | context7 MCP (`resolve-library-id` → `query-docs`) |
| "zeig mir Beispiele", "Code-Beispiele" | context7 MCP |
| "frühere Session", "was haben wir gemacht?" | `episodic-memory:search-conversations` |

### UI & Design
| Deutsche Phrase | Skill / Plugin |
|----------------|---------------|
| "baue eine Webseite", "Frontend", "UI bauen" | `frontend-design:frontend-design` |
| "mach das hübscher", "Design verbessern" | `ui-polisher` Agent |
| "Playground", "interaktiver Explorer" | `playground:playground` |
| "Präsentation", "Slides" | `everything-claude-code:frontend-slides` |
| "finde ein Icon", "Icon suchen" | `better-icons` MCP |
| "finde einen Sound", "Sound suchen" | `sound-search` |

### Projekt-Management
| Deutsche Phrase | Skill / Plugin |
|----------------|---------------|
| "parallel machen", "gleichzeitig" | `superpowers:dispatching-parallel-agents` |
| "Worktree", "isoliert arbeiten" | `superpowers:using-git-worktrees` oder `git:worktrees` |
| "Branch aufräumen", "gone Branches" | `commit-commands:clean_gone` |
| "Issue analysieren", "GitHub Issue" | `git:analyze-issue` |
| "PR erstellen" | `git:create-pr` |

### Sprach-spezifisch
| Deutsche Phrase | Skill / Plugin |
|----------------|---------------|
| "Swift", "iOS", "macOS App" | `apple-platform-build-tools:building-apple-platform-products` |
| "Android", "Kotlin App", "Compose" | `android-dev` Skill, `everything-claude-code:android-clean-architecture` |
| "Go Code", "Golang" | `everything-claude-code:golang-patterns` |
| "Rust Code" | Rust-spezifische Rules |
| "C# Code", "WPF", "Windows App" | C#-spezifische Rules |
| "Python Code" | `everything-claude-code:python-patterns` |
| "TypeScript", "React", "Next.js" | `everything-claude-code:frontend-patterns` |
| "Rails", "Ruby" | `compound-engineering:dhh-rails-style` |
| "Spring Boot", "Java" | `everything-claude-code:springboot-patterns` |
| "Django" | `everything-claude-code:django-patterns` |

### Skill-Erstellung & Plugins
| Deutsche Phrase | Skill / Plugin |
|----------------|---------------|
| "erstelle einen Skill", "neuer Skill" | `skill-creator:skill-creator` |
| "erstelle ein Plugin", "neues Plugin" | `plugin-dev:create-plugin` |
| "erstelle einen Agenten", "neuer Agent" | `plugin-dev:agent-development` |
| "erstelle einen Hook", "neuer Hook" | `plugin-dev:hook-development` oder `hookify:hookify` |
| "erstelle einen Command", "neuer Befehl" | `plugin-dev:command-development` |
| "Skill verbessern", "Skill fixen" | `skill-improver:skill-improver` |

### MCP & Claude API
| Deutsche Phrase | Skill / Plugin |
|----------------|---------------|
| "Claude API", "Anthropic SDK" | `claude-api` oder `everything-claude-code:claude-api` |
| "MCP Server bauen" | `mcp:build-mcp` |
| "Agent SDK", "SDK App bauen" | `agent-sdk-dev:new-sdk-app` |

## Whisper Speech-to-Text Korrekturen

Der Benutzer spricht via Whisper. Haeufige Fehlerkennungen:

| Whisper hoert | Gemeint ist |
|---------------|------------|
| "Cloud" | **Claude** (C-L-A-U-D-E) |
| "Rapper" | **Wrapper** |
| "Plug-in" | **Plugin** |
| "Skill" (englisch ausgesprochen) | Skill |
| "Self improve" | `/self-improve` |
| "Tool check" | `/tool-check` |
| "Commit" | Commit (git) |
| "Push" | Push (git) |
| "Brainstorm" | Brainstorm-Skill |
| "Claw" | NanoClaw REPL |

## Implizite Trigger (der Benutzer sagt nicht direkt den Skill-Namen)

Diese Situationen MUESSEN automatisch einen Skill triggern:

| Situation | Skill |
|-----------|-------|
| Benutzer beschreibt ein neues Feature | `superpowers:brainstorming` |
| Code wurde geschrieben, Aufgabe scheint fertig | `superpowers:verification-before-completion` |
| Benutzer sagt "ich bin fertig" / "das wars" | `superpowers:finishing-a-development-branch` |
| Bug wird beschrieben oder Fehler tritt auf | `superpowers:systematic-debugging` |
| Benutzer fragt "wie sollen wir..." | `superpowers:brainstorming` |
| Benutzer will etwas BAUEN (nicht nur aendern) | `superpowers:brainstorming` → `superpowers:writing-plans` |
| PR-Feedback kommt rein | `superpowers:receiving-code-review` |
| Benutzer sagt "mach rückgängig" | `undo-changes` |
