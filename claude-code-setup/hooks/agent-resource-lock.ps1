# agent-resource-lock.ps1 — Prevents parallel agents from using the same resource
# C4: Agentmaxxing Resource Lock Pattern
# Usage: Called by agents before accessing shared resources (emulator, ports, gradle daemon)
# Lock files live in /tmp/claude-locks/ — auto-expire after 10 minutes

param(
    [Parameter(Mandatory=$true)]
    [string]$Resource,  # e.g., "android-emulator", "port-5000", "gradle-daemon"

    [Parameter(Mandatory=$true)]
    [ValidateSet("acquire", "release", "check")]
    [string]$Action
)

$ErrorActionPreference = 'SilentlyContinue'
$lockDir = "$env:TEMP\claude-locks"
if (-not (Test-Path $lockDir)) { New-Item -ItemType Directory -Path $lockDir -Force | Out-Null }
$lockFile = Join-Path $lockDir "$Resource.lock"

function Get-LockAge {
    if (Test-Path $lockFile) {
        $age = (Get-Date) - (Get-Item $lockFile).LastWriteTime
        return $age.TotalMinutes
    }
    return -1
}

switch ($Action) {
    "acquire" {
        $age = Get-LockAge
        if ($age -ge 0 -and $age -lt 10) {
            $owner = Get-Content $lockFile -ErrorAction SilentlyContinue
            Write-Host "LOCKED — Resource '$Resource' is held by $owner (${age}min ago). Wait or use a different resource."
            exit 1
        }
        # Acquire lock (overwrite stale locks > 10 min)
        "$env:COMPUTERNAME-PID$$-$(Get-Date -Format 'HH:mm:ss')" | Set-Content $lockFile
        Write-Host "ACQUIRED — Resource '$Resource' locked."
        exit 0
    }
    "release" {
        if (Test-Path $lockFile) {
            Remove-Item $lockFile -Force
            Write-Host "RELEASED — Resource '$Resource' unlocked."
        } else {
            Write-Host "NO-LOCK — Resource '$Resource' was not locked."
        }
        exit 0
    }
    "check" {
        $age = Get-LockAge
        if ($age -ge 0 -and $age -lt 10) {
            $owner = Get-Content $lockFile -ErrorAction SilentlyContinue
            Write-Host "BUSY — Resource '$Resource' is held by $owner (${age}min ago)."
            exit 1
        } else {
            Write-Host "FREE — Resource '$Resource' is available."
            exit 0
        }
    }
}
