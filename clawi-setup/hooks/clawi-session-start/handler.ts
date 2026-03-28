import { execFileSync } from 'node:child_process';
import { existsSync, mkdirSync, readFileSync, writeFileSync } from 'node:fs';
import path from 'node:path';

const HOME = process.env.HOME || '/Users/frank';
const REPO_ROOT = '/Users/frank/clawi/proggs';
const CLAWI_SETUP = path.join(REPO_ROOT, 'clawi-setup');
const WORKSPACE = path.join(HOME, '.openclaw', 'workspace');
const STATE_FILE = path.join(WORKSPACE, 'hooks', 'sync-state.json');
const LOG_FILE = path.join(WORKSPACE, 'hooks', 'runtime.log');
const SYNC_SCRIPT = path.join(CLAWI_SETUP, 'sync-clawi.sh');

function log(message: string) {
  mkdirSync(path.dirname(LOG_FILE), { recursive: true });
  const line = `[${new Date().toISOString()}] [clawi-session-start] ${message}\n`;
  writeFileSync(LOG_FILE, line, { flag: 'a' });
  console.log(line.trim());
}

function sh(cmd: string, args: string[], cwd?: string) {
  return execFileSync(cmd, args, {
    cwd,
    encoding: 'utf8',
    stdio: ['ignore', 'pipe', 'pipe'],
  }).trim();
}

function readState() {
  try {
    return JSON.parse(readFileSync(STATE_FILE, 'utf8'));
  } catch {
    return {
      last_pull_timestamp: 0,
      last_push_timestamp: 0,
      last_health_check_timestamp: 0,
      scheduled_pull_hour: 8,
      scheduled_backup_hour: 0,
      last_result: null,
    };
  }
}

function writeState(patch: Record<string, unknown>) {
  const next = { ...readState(), ...patch };
  mkdirSync(path.dirname(STATE_FILE), { recursive: true });
  writeFileSync(STATE_FILE, JSON.stringify(next, null, 2) + '\n');
}

export default async function handler(event: any) {
  if (event?.type !== 'gateway' || event?.action !== 'startup') return;

  if (!existsSync(CLAWI_SETUP) || !existsSync(SYNC_SCRIPT)) {
    log(`Skipped: missing repo baseline at ${CLAWI_SETUP}`);
    writeState({ last_result: 'missing-clawi-setup' });
    return;
  }

  try {
    const dirty = sh('git', ['-C', REPO_ROOT, 'status', '--porcelain']);
    if (!dirty) {
      try {
        sh('git', ['-C', REPO_ROOT, 'pull', '--rebase', 'origin', 'main']);
        log('Git pull --rebase origin main completed.');
      } catch (error: any) {
        log(`Git pull skipped/failed: ${error?.message || String(error)}`);
      }
    } else {
      log('Repo not clean; skipped auto-pull to avoid touching unrelated work.');
    }

    sh('bash', [SYNC_SCRIPT, 'pull'], WORKSPACE);
    const now = Math.floor(Date.now() / 1000);
    writeState({
      last_pull_timestamp: now,
      last_health_check_timestamp: now,
      last_result: 'startup-sync-ok',
    });
    log('Workspace baseline pull completed.');
  } catch (error: any) {
    writeState({ last_result: `startup-sync-failed: ${error?.message || String(error)}` });
    log(`FAILED: ${error?.message || String(error)}`);
    throw error;
  }
}
