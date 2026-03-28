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
  const line = `[${new Date().toISOString()}] [clawi-session-end] ${message}\n`;
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
  if (event?.type !== 'command') return;
  if (!['new', 'reset', 'stop'].includes(event?.action)) return;

  if (!existsSync(CLAWI_SETUP) || !existsSync(SYNC_SCRIPT)) {
    log(`Skipped: missing repo baseline at ${CLAWI_SETUP}`);
    writeState({ last_result: 'missing-clawi-setup' });
    return;
  }

  try {
    sh('bash', [SYNC_SCRIPT, 'push'], WORKSPACE);

    const clawiStatus = sh('git', ['-C', REPO_ROOT, 'status', '--porcelain', '--', 'clawi-setup']);
    if (!clawiStatus) {
      const now = Math.floor(Date.now() / 1000);
      writeState({ last_push_timestamp: now, last_result: 'no-changes-to-push' });
      log(`No clawi-setup changes detected on command:${event.action}.`);
      return;
    }

    const nonClawiStatus = sh('git', ['-C', REPO_ROOT, 'status', '--porcelain']);
    const lines = nonClawiStatus.split(/\r?\n/).filter(Boolean);
    const foreignChanges = lines.filter((line) => !line.includes('clawi-setup/'));
    if (foreignChanges.length > 0) {
      writeState({ last_result: 'skipped-git-push-foreign-dirty' });
      log('Repo has unrelated changes; skipped auto commit/push to avoid collateral effects.');
      return;
    }

    sh('git', ['-C', REPO_ROOT, 'add', 'clawi-setup']);
    const dateStr = new Date().toISOString().replace('T', ' ').slice(0, 16);
    try {
      sh('git', ['-C', REPO_ROOT, 'commit', '-m', `#AUTO - Clawi Sync (${event.action}, ${dateStr})`]);
    } catch (error: any) {
      const msg = error?.message || String(error);
      if (!msg.includes('nothing to commit')) throw error;
    }

    try {
      sh('git', ['-C', REPO_ROOT, 'pull', '--rebase', 'origin', 'main']);
    } catch (error: any) {
      log(`Git pull before push skipped/failed: ${error?.message || String(error)}`);
    }
    sh('git', ['-C', REPO_ROOT, 'push', 'origin', 'HEAD']);

    const now = Math.floor(Date.now() / 1000);
    writeState({ last_push_timestamp: now, last_result: `push-ok:${event.action}` });
    log(`clawi-setup push completed on command:${event.action}.`);
  } catch (error: any) {
    writeState({ last_result: `push-failed: ${error?.message || String(error)}` });
    log(`FAILED: ${error?.message || String(error)}`);
    throw error;
  }
}
