# Workspace Scan for Codex

This scan is Codex-specific. It must not use `proggs` or Claude's whiteboard as an operational source.

## Required Scan Targets

Always inspect:
- `AGENTS.md`
- `codex-setup/README.md`
- `codex-setup/rules/global.md`
- `codex-setup/agent-memory/shared/MEMORY.md`
- `codex-setup/scripts/`
- `codex-setup/skills/self-improve/`
- `.github/workflows/`
- `~/.codex/config.toml`
- `~/.codex/skills/self-improve/` if present

Conditional:
- `mcp-code-search/` when semantic search exists
- `~/.codex/log/` when runtime failures or startup warnings are relevant
- repo launchers or wrapper scripts when they affect Codex startup

## Required Findings

The scan must answer:
1. Does Codex have its own whiteboard in `codex-setup/`?
2. Is Codex already 100 percent operationally independent from `proggs` and Claude memory?
3. Is the self-improve skill repo-first and deployable to `~/.codex/skills/`?
4. Do the whiteboard bridge scripts exist and validate?
5. Are GitHub workflows validating `codex-setup/**`?
6. Are local MCP registrations aligned with this workspace?
7. Is the whiteboard's `## Oberste Direktive` propagated across the attached Codex control files, prompts, validation paths, and `AGENTS.md`?

## Forbidden Operational Sources

Do not use these as the active Codex memory or control plane:
- `~/proggs/...`
- `claude-code-setup/`
- `.claude/agent-memory/shared/MEMORY.md`
- `~/.claude/...`

They may exist in the repository, but for this skill they are not authoritative.
