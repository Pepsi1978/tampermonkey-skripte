# Researcher Templates for Codex Self-Improve

Top-level objective for all researchers:
- support the superintelligence trajectory of this Codex environment
- prioritize findings that make Codex materially smarter at programming, verification,
  memory use, problem decomposition, and system-level self-improvement
- favor findings with session-over-session compounding effects over one-off tweaks
- read the whiteboard section `## Oberste Direktive` first and align all findings to it
- always surface simple next-step intelligence opportunities that the user could approve immediately

Cache location:
- `~/.codex/self-improve-cache/`

Cache stamp:
- `~/.codex/self-improve-cache/.last-cache-time`

Use fresh research whenever:
- `codex-setup/` changed
- `~/.codex/config.toml` changed
- local skill files changed
- MCP registrations changed

## R1 — Codex and OpenAI Updates

Use official OpenAI sources only.

Prompt skeleton:
```text
Research Codex CLI and OpenAI platform changes relevant to this local Codex workflow.
Current local config: [summary].
Check release notes, config changes, MCP-related changes, and breaking changes.
Return only actionable findings.
```

## R2 — Skills, MCP, Integrations

Prompt skeleton:
```text
Research Codex-relevant integrations for terminal workflows:
- MCP servers
- skill patterns
- wrapper scripts
- workspace automation helpers

Reject anything already installed locally.
Return only integrations that are real, current, and actionable.
```

## R3 — Parallelization and Automation

Prompt skeleton:
```text
Research best practices for Codex delegation, worktree isolation, and automation.
Focus on approaches that fit a local workspace with repo-based skills and MCP.
Return concrete patterns, not theory.
```

## R4 — Tool Versions

Prompt skeleton:
```text
Find latest stable versions for the locally used tools from the Stage 1 scan.
Compare only against exact local versions.
Return: tool | current | latest | action.
```

## R5 — Security

Prompt skeleton:
```text
Check confirmed vulnerabilities and supply-chain risks for:
- Codex-adjacent tooling
- Node/npm packages used by local MCP or bridge scripts
- relevant local runtimes from the scan

Return only confirmed issues with concrete impact.
```

## R6 — Creative Explorer

Prompt skeleton:
```text
Find novel ideas to make this Codex workspace smarter, faster, or easier to maintain.
Look for unusual but practical workflow ideas, MCP combinations, whiteboard patterns,
validation tricks, and terminal-AI productivity gains.
Return at least 3 ideas with adaptation proposals.
```

## R7 — Focus Deep-Dive

Only in explicit focus mode.

Prompt skeleton:
```text
Deep-dive into [FOCUS TOPIC] for this Codex workspace.
Go beyond generic advice. Find production-grade patterns, pitfalls, and concrete changes.
```

## R8 — Intelligence Researcher

Prompt skeleton:
```text
Find approaches that make this Codex setup fundamentally smarter:
- reasoning patterns
- verification patterns
- better memory usage
- stronger MCP usage
- competitive workflow ideas that can be adapted now

Return at least 5 findings, prioritized by immediacy.
Treat this as the top-level mission of the whole skill, not as a side activity.
```
