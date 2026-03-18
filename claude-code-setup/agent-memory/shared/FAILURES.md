# Failure Pattern Library

> Every mistake is a lesson. Never make the same mistake twice.
> Updated by: debugger, code-reviewer, tester, self-improve
> Read by: ALL agents before starting work

## How to Use This File

**Agents**: Before debugging or fixing a bug, search this file for similar symptoms.
**Self-Improve**: Analyze patterns here to create preventive hooks and rules.
**Format**: One entry per failure, with symptom, cause, fix, and prevention.

## Format Template

```
### [DATE] Category: Short Title
- **Symptom**: What the user saw or what failed
- **Root Cause**: The actual underlying problem
- **Fix**: What was done to resolve it
- **Prevention**: How to avoid this in the future (hook, rule, test)
- **Files**: Which files were involved
```

---

## Build & Compilation Failures

_No entries yet. The debugger and tester will add recurring build failures here._

## Logic & Runtime Errors

_No entries yet. Agents will add logic errors that recurred or were hard to find._

## Configuration & Environment Issues

### [2026-03-18] Config: Session-Scorer produced dummy data for 25 sessions
- **Symptom**: session-scores.jsonl had total_turns=0 and tool_calls=0 for 25/26 entries
- **Root Cause**: Transcript format mismatch — scorer expected `entry.message` but format varied across Claude Code versions
- **Fix**: Updated scorer to handle current transcript format (v5.3)
- **Prevention**: Added plausibility check in self-improve Stufe 0 — if total_turns=0 in 3+ of last 5 entries, flag as defect
- **Files**: ~/.claude/hooks/session-scorer.ts, session-scores.jsonl

### [2026-03-18] Config: effortLevel silently reset from high to medium
- **Symptom**: Claude Code was running at medium effort without user noticing
- **Root Cause**: `/model` command reset effortLevel as side effect
- **Fix**: config-guard.sh hook now blocks any effortLevel change away from "high"
- **Prevention**: ConfigChange + Stop hooks both monitor effortLevel
- **Files**: ~/.claude/hooks/config-guard.sh, settings.json

### [2026-03-18] Security: Command injection in notify.sh hook
- **Symptom**: Notification hook passed unsanitized input to osascript
- **Root Cause**: Tool name and result were interpolated directly into AppleScript string
- **Fix**: Sanitized all inputs by removing single quotes before passing to osascript
- **Prevention**: safety-gate.sh now checks for common injection patterns in hook scripts
- **Files**: ~/.claude/hooks/notify.sh

## Cross-Platform Issues

_No entries yet. Issues specific to macOS↔Windows differences will be logged here._

## Data & Content Quality

### [2026-03-18] Content: Sopranos Emmy count in quiz question was incorrect
- **Symptom**: Quiz question stated The Sopranos won a wrong number of Emmys
- **Root Cause**: AI-generated trivia not fact-checked before commit
- **Fix**: Corrected the answer in FilmQuestionsMedium3.kt
- **Prevention**: For trivia/factual content, always verify with web search before committing
- **Files**: QuizVerse/app/src/main/java/.../FilmQuestionsMedium3.kt

## Agent & Workflow Failures

### [2026-03-18] Agent: Shared Knowledge Hub empty after 12 days
- **Symptom**: No agent ever wrote to shared/MEMORY.md despite instructions
- **Root Cause**: Agent definitions say "update MEMORY.md" but don't enforce it — agents prioritize their main task and skip the write-back
- **Fix**: Added mandatory write-back sections with explicit triggers to all senior agent definitions
- **Prevention**: SubagentStop hook could verify if MEMORY.md was updated (future improvement)
- **Files**: ~/.claude/agents/code-reviewer.md, tester.md, architect.md, debugger.md
