# Shared Knowledge Hub

This file is the central knowledge exchange between agents and the self-improve skill.
**Writers**: code-reviewer, tester, architect, debugger, self-improve
**Readers**: All agents (quality-gate, optimizer, coder, ui-polisher, batch-reviewer read only)

## From Code Reviews (updated by code-reviewer)
<!-- Recurring patterns, code conventions, common issues found during reviews -->
_No entries yet — will be populated after first code review with memory: project._

## From Tests (updated by tester)
<!-- Recurring test failures, flaky patterns, missing test infrastructure -->
_No entries yet._

## From Architect (updated by architect)
<!-- Major architecture decisions, patterns chosen for specific projects -->
_No entries yet._

## From Debugger (updated by debugger)
<!-- Root causes that could recur, common bug patterns -->
_No entries yet._

## From Self-Improve (updated by self-improve skill)
- Environment: macOS, Claude Code v2.1.76, Opus 4.6 with 1M context (2026-03-14)
- Languages: Swift, C#, TypeScript, Rust, Go, Kotlin
- Quality gate: Use `quality-gate` agent for combined test+review+optimize
- Agents: code-reviewer has `memory: project`, coder has `isolation: worktree`
- New plugins: xclaude-plugin (iOS/Xcode MCP), apple-platform-build-tools (Xcode builds)
- Hooks: PostCompact (context summary), SubagentStop (agent result summary)
- Preferred patterns: MVVM (Swift), Fluent Design (C#), strict mode (TypeScript)

## Recurring Issues (shared — any writer can add)
<!-- Patterns that keep showing up across reviews, tests, and debugging -->

### 2026-03-20 — Silent hook failures masked broken semantic search for days
**Source:** reindex-codebase.ps1 (SessionStart hook)
**Problem:** Bun resolves `import './src/...'` relative to source file, not working directory. Temp file in `%TEMP%` could not find `./src/` — indexing failed silently for 16+ hours. Root cause: `catch {}` swallowed the error.
**Fix applied:** Temp file now written to `mcp-code-search/` dir. All catch blocks now log errors to this whiteboard section instead of swallowing them.
**Rule derived:** Hooks MUST NEVER silently swallow errors. Every catch block in a hook must append to this "Recurring Issues" section so `/self-improve` can detect and fix them.

## Rules & Conventions (shared)
- No Python for user-facing code
- Commit format: #NNN - Description (English)
- Communication: German, code comments: English
- Cross-platform: Always consider macOS + Windows parity
- quality-gate MUST run after every completed feature or new project
