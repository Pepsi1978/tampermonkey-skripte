---
name: self-improve
description: Systematic self-improvement of the Claude Code development environment. Use when the user says "/self-improve", "verbessere dich", "optimiere deine Umgebung", "check dein Setup", "update alles", or wants Claude to audit and improve its own tools, plugins, settings, and capabilities. Also use proactively when you notice something outdated or suboptimal during normal work.
context: fork
---

# Self-Improve: Systematic Environment Optimization

You are performing a systematic self-improvement of your development environment. This is not a one-shot check — you run **3 improvement loops**, each time digging deeper. Think of it like polishing: each pass reveals new things to fix.

The user is not a programmer. Explain everything in German, in simple terms, so they understand what you did and why.

## User Goals (never forget these)

- **Zero friction**: No permission prompts, no manual steps, full automation
- **Maximum quality**: Store-quality native apps for macOS (Swift/AppKit) and Windows (C#/WPF)
- **Preferred languages**: Swift, C#, TypeScript, Rust, Go (in this order). No Python for visible things.
- **Best model always**: Opus with high effort and extended thinking
- **Parallel execution**: Use Agent Teams and subagents wherever possible
- **Self-explanatory**: Always explain what you did and why, in German

## The 3-Loop Process

For each loop (1, 2, 3), execute ALL 5 phases. Each loop should find progressively subtler improvements.

### Phase 1: CHECK (Audit)

Run a comprehensive audit. Use parallel tool calls for speed.

**Check these in parallel:**
- `claude --version` — is Claude Code itself up to date?
- `brew outdated` — any Homebrew packages need updating?
- `rustup check` — Rust toolchain updates?
- `dotnet workload update --check` — .NET workload updates?
- Read `~/.claude/settings.json` — verify all settings are optimal
- Read `~/CLAUDE.md` — verify rules are current and complete
- List `~/.claude/rules/` — check all rule files for accuracy
- List `~/.claude/agents/` — verify all agents use `model: opus`
- List `~/.claude/commands/` — check custom commands
- Read `~/.claude/projects/-Users-frank/memory/MEMORY.md` — is memory accurate?
- Count enabled plugins in settings.json — compare against known available plugins
- Check `~/.zshrc` — verify PATH and aliases are correct
- Run `git config --global --list` — verify git settings
- Check disk space with `df -h /`

**Collect all findings into a status report before proceeding.**

### Phase 2: RESEARCH (Discover New Things)

Use WebSearch and WebFetch to find improvements. Run these searches in parallel via subagents:

1. **Claude Code updates**: Search for "Claude Code new features" or "Claude Code changelog" — any new settings, flags, or capabilities?
2. **Plugin marketplace**: Fetch the superpowers-marketplace catalog and the official plugins — any new plugins since last check?
3. **Skills and best practices**: Search for "Claude Code skills best practices" or "Claude Code optimization" — any new techniques?
4. **Language tooling**: Check if there are newer versions of key tools (Xcode, .NET SDK, Rust, Go, Node, Bun)
5. **Security**: Any known vulnerabilities in installed tools?

**Important**: Only suggest installing things that align with the user's goals. Don't suggest Python tools or frameworks unless they're invisible backend components.

### Phase 3: UPDATE (Apply Updates)

Based on findings from CHECK and RESEARCH:

- Run `brew upgrade` if packages are outdated (but skip Python-related packages)
- Run `rustup update` if Rust has updates
- Update plugins if new versions exist
- Fix any settings that have drifted from optimal
- Update rule files if language versions changed
- Update memory file if information is outdated
- Install any new plugins or tools discovered in RESEARCH phase

**Always explain what you're updating and why before doing it.**

### Phase 4: IMPROVE (Optimize Beyond Updates)

This is the creative phase. Think about:

- Can any rule files be improved with new best practices?
- Are there new agent types that would be useful?
- Can the CLAUDE.md be refined for better automation?
- Are there new hooks that would reduce friction?
- Can build/test/deploy workflows be streamlined?
- Are there new cross-compilation targets worth adding?
- Can the quality loop (build → test → review → improve) be made more automatic?

**Implement at least one concrete improvement per loop, even if small.**

### Phase 5: REPORT (Explain in German)

After each loop, give a clear summary:

```
## Verbesserungsschleife [N]/3

### Was ich geprüft habe
[kurze Liste]

### Was ich aktualisiert habe
[Liste mit Erklärungen]

### Was ich verbessert habe
[konkrete Verbesserungen mit Begründung]

### Status
[Gesamtstatus der Umgebung]
```

## After All 3 Loops: SYNC to GitHub

After all 3 loops are complete, **always sync changes to the cross-platform repo**:

1. **Copy changed files** from `~/.claude/` to `~/claude-config/`:
   - `cp ~/.claude/rules/*.md ~/claude-config/rules/`
   - `cp ~/.claude/agents/*.md ~/claude-config/agents/`
   - `cp ~/.claude/commands/*.md ~/claude-config/commands/`
   - `cp ~/.claude/hooks/auto-format.sh ~/claude-config/hooks/`
   - `cp ~/CLAUDE.md ~/claude-config/CLAUDE.md`
   - `cp ~/.gitignore_global ~/claude-config/.gitignore_global`
   - Update `~/claude-config/settings.json` (without platform-specific hooks)

2. **Check if Windows variants need updating**: If a rule, agent, or hook changed, consider whether the Windows equivalent (`hooks/auto-format.ps1`, `hooks-windows.json`) also needs to be updated to match.

3. **Commit and push** to `Pepsi1978/claude-code-setup`:
   ```
   cd ~/claude-config && git add -A && git commit -m "Update: [brief summary of changes]" && git push
   ```

4. **Report sync status** in the final summary.

This ensures the Windows machine always has access to the latest optimizations. The repo is the single source of truth for both platforms.

## Final Summary

Give a final comprehensive summary:
- Total number of improvements made
- Current environment status (everything green?)
- GitHub sync status (what was pushed)
- Any recommendations that need the user's input
- Next recommended run: suggest when to run /self-improve again

## Important Rules

- NEVER downgrade the model from Opus or reduce effort level
- NEVER install Python tools for visible/GUI purposes
- NEVER remove existing working configurations without replacement
- ALWAYS run updates that don't require user passwords automatically
- If something needs `sudo`, tell the user what to run manually
- If you find a critical security issue, report it IMMEDIATELY, don't wait for the loop to finish
- Use Agent Teams to parallelize research and updates wherever possible
- Keep the memory file under 200 lines (it gets truncated otherwise)
