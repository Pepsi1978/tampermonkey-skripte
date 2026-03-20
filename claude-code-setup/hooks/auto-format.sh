#!/usr/bin/env bash
# auto-format.sh — PostToolUse Hook
# Runs the appropriate code formatter after file edits.
# Platform: macOS/Linux (bash)

source "$(dirname "$0")/hook-log.sh"

# Read JSON input from stdin
HOOK_INPUT=$(cat)
if [ -z "$HOOK_INPUT" ]; then
    exit 0
fi

# Extract file_path from JSON input
FILE_PATH=$(echo "$HOOK_INPUT" | python3 -c "
import sys, json
try:
    data = json.load(sys.stdin)
    print(data.get('tool_input', {}).get('file_path', ''))
except Exception:
    print('')
" 2>/dev/null)

if [ -z "$FILE_PATH" ] || [ ! -f "$FILE_PATH" ]; then
    exit 0
fi

hook_log "formatting $FILE_PATH"

# Determine file extension (without leading dot)
EXT="${FILE_PATH##*.}"

case "$EXT" in
    go)
        gofmt -w "$FILE_PATH" 2>/dev/null || true
        ;;
    rs)
        rustfmt "$FILE_PATH" 2>/dev/null || true
        ;;
    cs)
        DIR=$(dirname "$FILE_PATH")
        # Search up to 3 directory levels for a .csproj file
        PROJ=$(find "$DIR" -maxdepth 3 -name "*.csproj" 2>/dev/null | head -1)
        if [ -n "$PROJ" ]; then
            PROJ_DIR=$(dirname "$PROJ")
            dotnet format whitespace "$PROJ_DIR" --include "$FILE_PATH" 2>/dev/null || true
        fi
        ;;
    ts|tsx|mts|js|jsx|mjs|json|css)
        if command -v biome > /dev/null 2>&1; then
            biome format --write "$FILE_PATH" 2>/dev/null || true
        elif command -v prettier > /dev/null 2>&1; then
            prettier --write "$FILE_PATH" 2>/dev/null || true
        fi
        ;;
    c|cpp|h|hpp)
        if command -v clang-format > /dev/null 2>&1; then
            clang-format -i "$FILE_PATH" 2>/dev/null || true
        fi
        ;;
    kt|kts)
        if command -v ktfmt > /dev/null 2>&1; then
            ktfmt --kotlinlang-style "$FILE_PATH" 2>/dev/null || true
        elif command -v ktlint > /dev/null 2>&1; then
            ktlint --format "$FILE_PATH" 2>/dev/null || true
        fi
        ;;
    java)
        if command -v google-java-format > /dev/null 2>&1; then
            google-java-format --replace "$FILE_PATH" 2>/dev/null || true
        fi
        ;;
esac

exit 0
