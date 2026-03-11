# Claude Code Setup

Cross-platform configuration for Claude Code — optimized for building store-quality native desktop apps on macOS (Swift/AppKit) and Windows (C#/WPF).

## Quick Start

**macOS:**
```bash
git clone https://github.com/Pepsi1978/claude-code-setup.git
cd claude-code-setup
chmod +x setup-macos.sh
./setup-macos.sh
```

**Windows (PowerShell):**
```powershell
git clone https://github.com/Pepsi1978/claude-code-setup.git
cd claude-code-setup
.\setup-windows.ps1
```

## What's Included

| Directory | Contents |
|-----------|----------|
| `rules/` | Language-specific rules (Swift, C#, TypeScript, Rust, Go, C/C++, Tampermonkey) |
| `agents/` | Custom Opus agents (architect, code-reviewer, ui-polisher, debugger, optimizer, tester) |
| `commands/` | Slash commands (`/self-improve` for automated environment optimization) |
| `hooks/` | Auto-format hooks for Swift, Go, Rust (macOS: bash, Windows: PowerShell) |
| `settings.json` | Base settings (plugins, permissions, model config) |
| `hooks-macos.json` | macOS-specific hooks (terminal-notifier, auto-format.sh) |
| `hooks-windows.json` | Windows-specific hooks (Toast notifications, auto-format.ps1) |
| `CLAUDE.md` | Project rules (automation, quality loop, cross-platform) |
| `.gitignore_global` | Global gitignore for all platforms |

## Configuration

- **Model:** Claude Opus 4.6 (always the best)
- **Effort:** High + Extended Thinking always on
- **50 Plugins** (all official + marketplace)
- **132 Tool Permissions** (zero friction)
- **Agent Teams** enabled for parallel execution
- **Auto-updates** on latest channel

## Self-Improvement

Run `/self-improve` in Claude Code to automatically:
1. Audit all tools, plugins, and settings
2. Research new features and updates online
3. Install updates and fix issues
4. Implement optimizations
5. Report everything in German

Runs 3 improvement loops, each finding progressively subtler optimizations.
