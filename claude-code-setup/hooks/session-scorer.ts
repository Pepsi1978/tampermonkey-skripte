#!/usr/bin/env bun
/**
 * Session Scorer — Meta-Evolution Artifact #1
 *
 * Runs at SessionEnd to analyze the current session transcript
 * and extract quality metrics into a JSONL log file.
 *
 * Metrics tracked:
 * - total_turns: Number of user messages
 * - tool_calls: Number of tool invocations
 * - errors: Number of failed tool calls
 * - corrections: User corrections detected
 * - quality_score: Composite 1-10 score
 */

import { readFileSync, appendFileSync, readdirSync, statSync, existsSync } from "fs";
import { join } from "path";

const HOME = process.env.HOME || "/Users/frank";
const SCORES_FILE = join(HOME, ".claude", "session-scores.jsonl");
const PROJECTS_DIR = join(HOME, ".claude", "projects", "-Users-frank");

interface SessionMetrics {
  date: string;
  session_id: string;
  total_turns: number;
  tool_calls: number;
  errors: number;
  corrections: number;
  quality_score: number;
}

function findLatestTranscript(): string | null {
  try {
    const entries = readdirSync(PROJECTS_DIR);
    let latest = "";
    let latestTime = 0;

    for (const entry of entries) {
      if (!entry.endsWith(".jsonl")) continue;
      // Skip agent transcripts — only score main sessions (UUID format)
      if (entry.startsWith("agent-")) continue;
      const fullPath = join(PROJECTS_DIR, entry);
      try {
        const stat = statSync(fullPath);
        if (stat.mtimeMs > latestTime) {
          latestTime = stat.mtimeMs;
          latest = fullPath;
        }
      } catch {
        // Skip inaccessible files
      }
    }

    return latest || null;
  } catch {
    return null;
  }
}

function analyzeTranscript(path: string): SessionMetrics {
  const content = readFileSync(path, "utf-8");
  const lines = content.trim().split("\n");

  let totalTurns = 0;
  let toolCalls = 0;
  let errors = 0;
  let corrections = 0;

  const correctionPatterns = [
    /\bnein\b/i, /\bfalsch\b/i, /\bnicht das\b/i, /\bstop\b/i,
    /\brückgängig\b/i, /\bundo\b/i, /\bwrong\b/i, /\bthat's not\b/i,
    /\bdon't do\b/i, /\bmach das nicht\b/i, /\bso nicht\b/i,
  ];

  for (const line of lines) {
    try {
      const entry = JSON.parse(line);

      // Claude Code transcript format: { type: "user"|"assistant"|"tool_result", message: {...} }
      const entryType = entry.type;
      const msg = entry.message;

      if (entryType === "user" && msg) {
        totalTurns++;
        const text = typeof msg.content === "string"
          ? msg.content
          : JSON.stringify(msg.content);
        for (const pattern of correctionPatterns) {
          if (pattern.test(text)) {
            corrections++;
            break;
          }
        }
      }

      if (entryType === "assistant" && msg) {
        // Tool calls are content blocks with type "tool_use"
        const content = Array.isArray(msg.content) ? msg.content : [];
        const toolUseBlocks = content.filter((b: any) => b.type === "tool_use");
        toolCalls += toolUseBlocks.length;
      }

      if (entryType === "tool_result" && msg) {
        const output = typeof msg.content === "string"
          ? msg.content
          : JSON.stringify(msg.content);
        if (/error|failed|exception|ENOENT|EPERM/i.test(output)) {
          errors++;
        }
      }
    } catch {
      // Skip malformed lines
    }
  }

  // Calculate composite quality score (1-10)
  let score = 7.0;

  // Error penalty: -0.5 per error, max -2
  score -= Math.min(errors * 0.5, 2.0);

  // Correction penalty: -0.8 per correction, max -2
  score -= Math.min(corrections * 0.8, 2.0);

  // Tool efficiency: fewer errors per tool call is better
  if (toolCalls > 0) {
    const errorRate = errors / toolCalls;
    if (errorRate < 0.05) score += 0.5;
    else if (errorRate > 0.3) score -= 0.5;
  }

  // Engagement bonus: productive sessions have more tool calls
  if (toolCalls > 20) score += 0.3;
  if (totalTurns > 0 && toolCalls / totalTurns > 5) score += 0.2;

  score = Math.max(1.0, Math.min(10.0, Math.round(score * 10) / 10));

  const sessionId = path.split("/").pop()?.replace(".jsonl", "") || "unknown";

  return {
    date: new Date().toISOString(),
    session_id: sessionId,
    total_turns: totalTurns,
    tool_calls: toolCalls,
    errors,
    corrections,
    quality_score: score,
  };
}

function detectTrends(currentMetrics: SessionMetrics): void {
  if (!existsSync(SCORES_FILE)) return;

  const allScores = readFileSync(SCORES_FILE, "utf-8")
    .trim()
    .split("\n")
    .map((l) => {
      try { return JSON.parse(l) as SessionMetrics; } catch { return null; }
    })
    .filter((s): s is SessionMetrics => s !== null && s.total_turns > 0);

  if (allScores.length < 5) return;

  const sharedMemory = join(HOME, ".claude", "agent-memory", "shared", "MEMORY.md");

  // Phase 1: Simple trend check (< 20 real sessions)
  if (allScores.length < 20) {
    const recent = allScores.slice(-5);
    const avg = recent.reduce((s, m) => s + m.quality_score, 0) / recent.length;

    if (allScores.length >= 10) {
      const prevAvg = allScores.slice(-10, -5).reduce((s, m) => s + m.quality_score, 0) / 5;
      if (avg < prevAvg - 0.5) {
        const warning = `\n- **${currentMetrics.date.split("T")[0]}**: Quality declining: ${prevAvg.toFixed(1)} → ${avg.toFixed(1)} (simple trend, ${allScores.length}/20 sessions for SPC)\n`;
        if (existsSync(sharedMemory)) {
          appendFileSync(sharedMemory, warning, "utf-8");
        }
      }
    }
    return;
  }

  // Phase 2: Statistical Process Control (>= 20 real sessions)
  const scores = allScores.map(s => s.quality_score);
  const mean = scores.reduce((a, b) => a + b, 0) / scores.length;
  const stdDev = Math.sqrt(scores.reduce((sum, s) => sum + (s - mean) ** 2, 0) / scores.length);
  const ucl = mean + 3 * stdDev;
  const lcl = mean - 3 * stdDev;

  const current = currentMetrics.quality_score;
  const warnings: string[] = [];

  // Rule 1: Point outside control limits
  if (current > ucl || current < lcl) {
    warnings.push(`SPC SIGNAL: Score ${current} outside limits [${lcl.toFixed(1)}, ${ucl.toFixed(1)}]`);
  }

  // Rule 2: 7-point run below mean (process shift)
  const last7 = allScores.slice(-7).map(s => s.quality_score);
  if (last7.length === 7 && last7.every(s => s < mean)) {
    warnings.push(`SPC SIGNAL: 7 consecutive sessions below mean (${mean.toFixed(1)}) — process shift detected`);
  }

  // Rule 3: 5-session moving average comparison
  const recent5 = allScores.slice(-5);
  const prev5 = allScores.slice(-10, -5);
  if (prev5.length === 5) {
    const recentAvg = recent5.reduce((s, m) => s + m.quality_score, 0) / 5;
    const prevAvg = prev5.reduce((s, m) => s + m.quality_score, 0) / 5;
    if (recentAvg < prevAvg - 0.5) {
      warnings.push(`Trend: ${prevAvg.toFixed(1)} → ${recentAvg.toFixed(1)} (declining)`);
    }
  }

  if (warnings.length > 0 && existsSync(sharedMemory)) {
    const entry = `\n- **${currentMetrics.date.split("T")[0]}**: ${warnings.join("; ")} [SPC: μ=${mean.toFixed(1)}, σ=${stdDev.toFixed(2)}, UCL=${ucl.toFixed(1)}, LCL=${lcl.toFixed(1)}, N=${scores.length}]\n`;
    appendFileSync(sharedMemory, entry, "utf-8");
  }
}

function validateMetrics(metrics: SessionMetrics, transcriptPath: string): boolean {
  // Self-validation: detect when scorer produces dummy data
  try {
    const content = readFileSync(transcriptPath, "utf-8");
    const lineCount = content.trim().split("\n").length;

    if (metrics.total_turns === 0 && lineCount > 50) {
      // Transcript has 50+ lines but we found 0 turns — something is wrong
      const warning = `\n### [${new Date().toISOString().split("T")[0]}] SCORER WARNING: 0 turns parsed from ${lineCount}-line transcript\n` +
        `- **Session**: ${metrics.session_id}\n` +
        `- **Action**: Skipped writing dummy score. Check transcript format.\n`;

      const failuresPath = join(HOME, ".claude", "agent-memory", "shared", "FAILURES.md");
      if (existsSync(failuresPath)) {
        appendFileSync(failuresPath, warning, "utf-8");
      }
      return false; // Don't write this score
    }
  } catch {
    // Can't validate — proceed with caution
  }
  return true;
}

function main() {
  const transcript = findLatestTranscript();
  if (!transcript) {
    process.exit(0);
  }

  try {
    const metrics = analyzeTranscript(transcript);

    // Self-validation: don't write dummy data
    if (!validateMetrics(metrics, transcript!)) {
      process.exit(0);
    }

    appendFileSync(SCORES_FILE, JSON.stringify(metrics) + "\n", "utf-8");
    detectTrends(metrics);
  } catch {
    // Fail silently — never block session exit
    process.exit(0);
  }
}

main();
