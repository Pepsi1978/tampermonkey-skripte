# Codex Setup

Dieser Ordner ist die plattformuebergreifende, synchronisierte Regelbasis fuer Codex.

Zweck:
- Regeln fuer Codex zwischen macOS und Windows synchron halten
- `Codex-Regeln/` als bisherigen Einzelordner ersetzen
- Claude-Code-Konfiguration bewusst davon trennen

Grundsatz:
- Dieser Ordner ist nur fuer Codex gedacht.
- `claude-code-setup/` ist nur fuer Claude Code gedacht und fuer Codex keine Regelquelle.
- Wenn Regeltexte an mehreren Stellen im Repository auseinanderlaufen, ist fuer Codex dieser Ordner die massgebliche lokale Referenz.

Struktur:
- `rules/global.md`: dauerhafte globale Regeln fuer Codex auf allen Plattformen

Pfadbeispiele:
- macOS: `/Users/frank/Codex/codex-setup/`
- Windows: `C:\Users\barwa\Codex\codex-setup\`
