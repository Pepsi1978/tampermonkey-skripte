# ClaudeCodexVoiceOverlay-macOS

Voice-to-text overlay for Electron applications (Claude Desktop, Codex) on macOS.
Press a hotkey → speak → text is typed into the active Electron app.

## Build

**Always use `build.sh`** — never compile with `swiftc` directly.
`build.sh` handles certificate signing with "Frank Local Dev", which preserves TCC (accessibility) permissions across rebuilds.

```bash
bash build.sh
open build/ClaudeCodexVoiceOverlay.app
```

Direct `swiftc` results in ad-hoc signing → macOS revokes accessibility permissions on every rebuild.

## Architecture

| File | Purpose |
|------|---------|
| `Config.swift` | API keys from .env, configuration |
| `AudioRecorder.swift` | AVAudioEngine microphone recording |
| `GroqWhisperClient.swift` | Groq Whisper API for speech-to-text |
| `GeminiClient.swift` | Gemini API for text correction/formatting |
| `InputController.swift` | CGEvent keyboard simulation for Electron apps (Cmd+A+Backspace to clear) |
| `AppWatcher.swift` | NSWorkspace observer for target app detection |
| `OverlayPanel.swift` | Floating NSPanel overlay UI |
| `ErrorDescriptions.swift` | Extracted error description methods |
| `AppDelegate.swift` | App lifecycle, hotkey registration, orchestration |
| `main.swift` | Entry point |

## Key Patterns

- **Text insertion**: CGEvent keyboard simulation with clipboard save/restore
- **Field clearing**: Cmd+A + Backspace (Electron-specific, not Ctrl+U)
- **Target apps**: Claude Desktop, Codex (Electron bundle IDs in AppWatcher.swift)
- **Thread safety**: DispatchQueue.main.async for all UI updates
- **Retries**: DispatchQueue.asyncAfter (never Thread.sleep on main thread)
- **Code signing**: "Frank Local Dev" certificate (not ad-hoc)

## Sister Project (CRITICAL)

**TerminalVoiceOverlay-macOS** shares ~80% of the code.
When changing ANY shared file, ALWAYS apply the same change to:
`~/proggs/TerminalVoiceOverlay-macOS/`

### Shared files (nearly identical):
Config.swift, AudioRecorder.swift, GroqWhisperClient.swift, GeminiClient.swift,
AppDelegate.swift, AppWatcher.swift, OverlayPanel.swift, ErrorDescriptions.swift, build.sh

### Different files:
- `InputController.swift` (this project) vs `TerminalController.swift` (Terminal)
- Target apps: Electron apps vs terminals
- Key combo: Cmd+A+Backspace (select all + delete) vs Ctrl+U (clear line)

## Windows Counterpart

**ClaudeVoiceOverlay-Windows** — same functionality in C#/WPF.

| macOS (Swift) | Windows (C#) |
|---------------|-------------|
| InputController.swift | Services/AppController.cs |
| AppWatcher.swift | Services/AppWatcher.cs |
| AudioRecorder.swift | Services/AudioRecorder.cs |
| GroqWhisperClient.swift | Services/GroqWhisperClient.cs |
| GeminiClient.swift | Services/GeminiClient.cs |
| Config.swift | Services/Config.cs |
| OverlayPanel.swift | Views/OverlayWindow.xaml + .cs |
| AppDelegate.swift | App.xaml.cs |
| CGEvent | keybd_event / SendInput (Win32.cs) |
| AVAudioEngine | NAudio |
| NSWorkspace | SetWinEventHook |

## Requirements

- macOS 13.0+, Apple Silicon (arm64)
- Xcode Command Line Tools (`xcode-select --install`)
- .env file with GROQ_API_KEY (required) and GEMINI_API_KEY (optional)
- Accessibility permission in System Settings → Privacy & Security
