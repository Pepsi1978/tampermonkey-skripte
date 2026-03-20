# Agent & Hook Failures

Dieses Whiteboard sammelt Fehler aus Hooks, Agents und automatischen Prozessen.
Der `/self-improve` Skill liest dieses Board und priorisiert Fixes.

Format: Neueste Eintraege oben.

---

## 2026-03-20 12:50 — reindex-codebase.ps1: Stille Indexierungsfehler seit Tagen

**Hook:** `reindex-codebase.ps1` (SessionStart, async)
**Symptom:** Semantischer Index war 16+ Stunden veraltet, `.last-index-time` existierte gar nicht
**Ursache:** Bun loest `import './src/indexer.ts'` relativ zur Quelldatei auf, nicht zum Working Directory. Temp-Datei lag in `%TEMP%`, aber `./src/` existiert nur in `mcp-code-search/`. Fehler wurde per `catch {}` verschluckt — kein Log, keine Meldung.
**Fix:** Temp-Datei wird jetzt ins `mcp-code-search/`-Verzeichnis geschrieben statt nach `%TEMP%`. Zusaetzlich: Fehler-Logging ins Whiteboard statt `catch {}`.
**Status:** GEFIXT
**Lehre:** Hooks duerfen NIEMALS Fehler still verschlucken. Jeder catch-Block muss ins FAILURES.md loggen.
