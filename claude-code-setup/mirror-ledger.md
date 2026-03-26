# Mirror Ledger — Universal Cross-Platform & Cross-CLI Sync
<!-- VERSION: 1 -->
<!-- FORMAT: universal-mirror-bridge-v1 -->

This file is the central exchange ledger for the Universal Mirror Bridge.
It is shared across ALL platforms (macOS, Windows) and ALL CLIs (Claude Code, Codex CLI, Gemini CLI)
via the git repository Pepsi1978/proggs.

**Rules:**
- Entries are APPEND-ONLY — never delete or overwrite existing entries
- Each entry has a unique ID: MIRROR-YYYY-MM-DD-{PLATFORM}-{NNN}
- Platform codes: MAC (macOS), WIN (Windows), CDX (Codex CLI), GEM (Gemini CLI)
- APPLIED status tracks which platforms have imported each entry
- Entries older than 90 days AND applied on all platforms may be archived

**Entry Types:** hook, rule, agent, skill, settings, mcp, software, env-fix, directive, plugin, whiteboard

---
