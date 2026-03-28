import { existsSync, mkdirSync, writeFileSync } from 'node:fs';
import path from 'node:path';

const HOME = process.env.HOME || '/Users/frank';
const WORKSPACE = path.join(HOME, '.openclaw', 'workspace');
const CLAWI_SETUP = '/Users/frank/clawi/proggs/clawi-setup';
const LOG_FILE = path.join(WORKSPACE, 'hooks', 'runtime.log');

function log(message: string) {
  mkdirSync(path.dirname(LOG_FILE), { recursive: true });
  const line = `[${new Date().toISOString()}] [clawi-health-check] ${message}\n`;
  writeFileSync(LOG_FILE, line, { flag: 'a' });
  console.log(line.trim());
}

export default async function handler(event: any) {
  if (event?.type !== 'gateway' || event?.action !== 'startup') return;

  const requiredWorkspaceFiles = [
    'SOUL.md',
    'DIREKTIVEN.md',
    'AGENTS.md',
    'ENVIRONMENT-FIXES.md',
    'IDENTITY.md',
    'MEMORY.md',
    'sync-clawi.sh',
    'agents/AGENTS.md',
  ];

  const missing = requiredWorkspaceFiles.filter((rel) => !existsSync(path.join(WORKSPACE, rel)));
  const repoOkay = existsSync(path.join(CLAWI_SETUP, 'sync-clawi.sh')) && existsSync(path.join(CLAWI_SETUP, 'MEMORY.md'));

  if (missing.length === 0 && repoOkay) {
    log('Health OK: critical workspace files, agent catalog, and clawi-setup baseline present.');
  } else {
    log(`Health WARN: missing workspace files=${missing.join(', ') || 'none'}, repoBaseline=${repoOkay ? 'ok' : 'missing'}`);
  }
}
