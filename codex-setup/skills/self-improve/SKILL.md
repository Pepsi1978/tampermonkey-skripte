---
name: self-improve
description: Codex-only self-improvement workflow for the Codex workspace and Codex runtime. Use only when the user explicitly asks for self-improvement or a full Codex setup check, for example with "/self-improve", "verbessere dich", "optimiere deine Umgebung", "check dein Setup", "update alles", "mach dich besser", "aktualisiere alles", "pruef mein System", or "Umgebung pruefen". This skill is hard-wired to the Codex workspace and must never operate on proggs or Claude's whiteboard.
---

# Self-Improve for Codex V1.0.0

This is the Codex-native self-improve workflow for this repository.

Primary objective:
- drive this Codex environment toward superintelligence in programming
- make Codex the strongest possible programming environment inside its own workspace
- treat all other improvements as supporting work toward that top-level goal
- maximize the compounding intelligence gain from session to session
- prefer improvements that increase long-term leverage, not just local convenience

Mission:
- make Codex fully independent from `proggs` and Claude Code
- make Codex smarter inside its own workspace and runtime
- improve memory, verification, MCP usage, automation, and coding quality
- move this environment toward the strongest possible programming setup
- long-term ambition: the number one programming environment for Codex in this workspace

System hierarchy:
- the Codex whiteboard is the central nervous system
- `self-improve` is the highest-priority skill
- agents, researchers, MCP usage, automation, validation, and memory all serve the same direction:
  making this Codex environment smarter at programming every session
- the whiteboard section `## Oberste Direktive` is the first directive to read before any substantial action

Hard rules:
- Work only in the current `Codex` workspace.
- Never use `proggs` as workdir, whiteboard source, or sync target.
- Never use Claude's whiteboard as operational memory.
- The only authoritative whiteboard is `<workspace>/codex-setup/agent-memory/shared/MEMORY.md`.
- The Git source-of-truth for this skill is `<workspace>/codex-setup/skills/self-improve/`.
- The local deployment target is `~/.codex/skills/self-improve/`.

Read these files as needed:
- [references/workspace-scan.md](references/workspace-scan.md)
- [references/whiteboard-bridge.md](references/whiteboard-bridge.md)
- [references/researchers.md](references/researchers.md)
- [references/report-and-creative.md](references/report-and-creative.md)
- Agent prompts under [references/agents/](references/agents)

## Mandatory Opening

Before doing any work, show this overview in German:

```text
╔══════════════════════════════════════════════════════════════╗
║  Self-Improve Skill — Codex Workspace                       ║
║  nur fuer Codex, nie fuer proggs                            ║
╠══════════════════════════════════════════════════════════════╣
║  Stufe 1: SCAN — Codex-Workspace und Runtime tief pruefen   ║
║  Stufe 2: DEEP-DIVE — Research, Risiken, Chancen            ║
║  Stufe 3: IMPROVE — Fixes, Sync, Report                     ║
║  Stufe 4: CREATIVE — neue Ideen, Artefakte, Benchmark       ║
║  Stufe 5: SUPER INTELLIGENZ — schlauer arbeiten             ║
║  Stufe 6: DAUERHAFTIGKEIT — Rueckfaelle verhindern          ║
╚══════════════════════════════════════════════════════════════╝
```

Also state:
- Standard: 10-15 Min
- Thorough: 20-30 Min
- Focus: 25-35 Min

## Scope Resolution

Resolve the workspace root with:

```bash
git rev-parse --show-toplevel
```

Then require:
- `<root>/codex-setup/`
- `<root>/codex-setup/agent-memory/shared/MEMORY.md`

If either is missing, stop and report that this skill is only valid for a Codex workspace with `codex-setup/`.

## Mandatory Memory Source

The only whiteboard for this skill is:

```text
<workspace>/codex-setup/agent-memory/shared/MEMORY.md
```

Do not read or write:
- `~/proggs/.../MEMORY.md`
- `~/.claude/.../MEMORY.md`
- `<workspace>/.claude/agent-memory/shared/MEMORY.md`

Treat those paths as foreign or legacy.

The Codex whiteboard is the central nervous system of this setup.
Its section `## Oberste Direktive` is the highest directive for all attached Codex components.
This skill must treat it as the primary coordination layer for:
- system state
- open problems
- intelligence findings
- recurring patterns
- long-term self-improvement direction

## Stage 0: Independence Gate

This gate is mandatory and comes before everything else.

Before any improvement work:
- verify that the active whiteboard is the Codex whiteboard in `codex-setup/`
- verify that no operational script in `codex-setup/scripts/` depends on `proggs`
- verify that the local deployment target is `~/.codex/skills/self-improve/`
- verify that the skill can function without Claude-specific memory or hooks

If any dependency on Claude/proggs is still operational:
- fix that first
- do not continue to later stages until independence is restored

After independence is confirmed:
- read the Codex whiteboard before any other substantial action
- read and restate `## Oberste Direktive` before scanning or changing anything else
- summarize current system state, open problems, intelligence direction, and the best next leverage point
- decide what change would most increase long-term programming intelligence in this session

## Stage 1: Scan

Deep-scan the Codex workspace and local Codex runtime.

Minimum scan targets:
- `codex-setup/**`
- `.github/workflows/**`
- `mcp-code-search/**` if present
- `~/.codex/config.toml`
- `~/.codex/skills/`
- `~/.codex/log/` if relevant for current failures
- repo-local wrappers or launch scripts that affect Codex

Use [references/workspace-scan.md](references/workspace-scan.md).

Always verify:
- no accidental operational dependency on `proggs`
- own Codex whiteboard exists
- the whiteboard contains `## Oberste Direktive`
- whiteboard bridge scripts exist and work
- local skill deployment target exists or can be created
- MCP registrations relevant to this workspace
- the highest directive is reflected across the attached Codex control files and prompts
- the session has at least one clear path to increase programming intelligence, not just maintenance quality

If semantic search exists, validate it the Codex-native way:
1. `mcp__code_search__search_status`
2. one real `mcp__code_search__search_code` query
3. optional `tsx reindex.ts` smoke test

## Stage 2: Deep-Dive

Use [references/researchers.md](references/researchers.md).

Codex-native researcher roles:
- env-checker
- evolution-analyst
- researcher
- intelligence-researcher
- challenger
- whiteboard-scanner
- durability-auditor

If the current run explicitly allows delegation, you may reconstruct these roles from
[references/agents/](references/agents). Otherwise do the work locally and keep the same structure.

## Stage 3: Improve

Goal:
- fix Codex-specific issues
- strengthen the Codex whiteboard bridge
- keep the skill repo-first and deployable to `~/.codex/skills/self-improve/`
- invest this session in the highest-leverage intelligence gain available

When writing to the whiteboard:
- use `codex-setup/scripts/whiteboard-insert.*`
- or merge sentinel files with `codex-setup/scripts/writeback-enforcer.*`

After repo changes to this skill:
- deploy the repo copy to `~/.codex/skills/self-improve/`
- use `codex-setup/scripts/install-self-improve.sh` or `.ps1`

## Stage 4: Creative

Use [references/report-and-creative.md](references/report-and-creative.md).

Minimum deliverables:
- 1 artifact or concrete implementation
- 3 action proposals in plain German
- 3 simple intelligence opportunities that the user can approve immediately
- 1 short creativity reflection

## Stage 5: Super Intelligence

Mandatory in every mode.

This is not a side track. It is the main direction of the skill.

Focus:
- better reasoning
- better verification
- better Codex workflows
- better use of MCP, skills, logs, and structured memory
- better error prevention
- stronger self-improvement loops
- stronger environment-level intelligence, not just isolated fixes

At least one of the following must happen:
- one improvement implemented now
- one strong non-recommendation documented with clear reasoning
- one concrete step that makes Codex measurably more intelligent, more reliable, or more autonomous

When tradeoffs exist, prefer the option that most increases long-term programming intelligence.
When in doubt, choose compounding gains over short-term convenience.

Success criterion:
- every run should leave Codex smarter than before
- the ideal trajectory is compounding and, where possible, exponential rather than linear

## Stage 6: Durability

Mandatory in every mode.

Check:
- does the skill still avoid `proggs` completely
- does the whiteboard bridge still work
- are the latest fixes reflected in the Codex whiteboard
- what should be prevented next
- is Codex still fully independent from Claude-specific memory and control paths

Prefer durable prevention:
- validation script
- workflow check
- stronger rule
- clearer agent prompt
- bridge improvement

## Final Summary

Always end with:
- number of changes
- overall status
- independence status from Claude/proggs
- intelligence gain achieved in this session
- next simple intelligence opportunities for the user
- open issues
- next recommended run or next recommended action
- deploy status to `~/.codex/skills/self-improve/`
- commit/push status as the last sentence if git changes were involved
