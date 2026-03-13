---
paths:
  - "**/AndroidManifest.xml"
  - "**/src/main/java/**"
  - "**/src/main/kotlin/**"
  - "**/src/main/res/**"
  - "**/build.gradle.kts"
  - "**/build.gradle"
  - "**/gradle/**"
  - "**/*.apk"
---

# Android Development Rules

## Build System
- Use Gradle with Kotlin DSL (`build.gradle.kts`)
- Use version catalogs (`gradle/libs.versions.toml`) for all dependencies
- Target latest stable SDK (API 35) with minSdk 26+ (Android 8.0+)
- Build command: `./gradlew assembleDebug` (debug APK) or `./gradlew assembleRelease` (signed release)
- Bundle command: `./gradlew bundleRelease` (AAB for Play Store)

## Two Development Paths

### Path 1: Native Kotlin (preferred for Android-only apps)
- Language: Kotlin with Jetpack Compose (modern UI toolkit)
- Build: Gradle + Android Gradle Plugin
- APK: `./gradlew assembleDebug` → `app/build/outputs/apk/debug/app-debug.apk`
- Test: `./gradlew test` (unit) + `./gradlew connectedAndroidTest` (device)
- Lint: `./gradlew lint`

### Path 2: .NET MAUI (for cross-platform C# apps)
- Language: C# with .NET MAUI XAML or Blazor Hybrid
- Build: `dotnet build -f net10.0-android`
- APK: `dotnet publish -f net10.0-android -c Release`
- Test: `dotnet test`
- Output: `bin/Release/net10.0-android/publish/*.apk`

## Environment (Windows)
- JAVA_HOME: C:\Program Files\Eclipse Adoptium\jdk-21.0.10.7-hotspot
- ANDROID_HOME: %LOCALAPPDATA%\Android\Sdk
- Kotlin: C:\Kotlin\kotlinc\bin
- Gradle: C:\Gradle\gradle-8.14\bin
- ADB: %ANDROID_HOME%\platform-tools\adb.exe
- sdkmanager: %ANDROID_HOME%\cmdline-tools\latest\bin\sdkmanager.bat

## APK Signing
- Debug: auto-signed with debug keystore (~/.android/debug.keystore)
- Release: create keystore with `keytool -genkey -v -keystore release.jks -keyalg RSA -keysize 2048 -validity 10000`
- NEVER commit keystores or signing passwords to git
- Store signing config in `local.properties` (gitignored)

## Project Structure (Native Kotlin)
```
app/
  src/
    main/
      java/com/example/app/    # Kotlin source files
      res/
        layout/                 # XML layouts (or skip with Compose)
        values/                 # strings.xml, colors.xml, themes.xml
        drawable/               # Icons, images
        mipmap/                 # App launcher icons
      AndroidManifest.xml       # App manifest
    test/                       # Unit tests
    androidTest/                # Instrumented tests
  build.gradle.kts              # Module build config
build.gradle.kts                # Root build config
settings.gradle.kts             # Project settings
gradle/
  libs.versions.toml            # Version catalog
```

## Common Commands
- Install APK to device: `adb install app-debug.apk`
- View device logs: `adb logcat`
- List connected devices: `adb devices`
- Clear app data: `adb shell pm clear com.example.app`
- Screenshot: `adb shell screencap /sdcard/screenshot.png && adb pull /sdcard/screenshot.png`
- Install SDK package: `sdkmanager "platforms;android-35"`
- Update all SDK: `sdkmanager --update`

## UI Design
- Prefer Jetpack Compose over XML layouts (modern, declarative)
- Follow Material Design 3 guidelines
- Support dark mode (`isSystemInDarkTheme()`)
- Test on multiple screen sizes
- Use ConstraintLayout for complex XML layouts
- App must look polished and professional — store-quality

## Performance
- Use ProGuard/R8 for release builds (shrink + obfuscate)
- Avoid blocking the main thread — use coroutines
- Use lazy loading for images (Coil or Glide)
- Profile with Android Profiler or `adb shell dumpsys`)

## Security
- Never hardcode API keys or secrets
- Use EncryptedSharedPreferences for sensitive data
- Enable network security config for HTTPS-only
- Validate all user input
- Use SafetyNet/Play Integrity for device attestation
