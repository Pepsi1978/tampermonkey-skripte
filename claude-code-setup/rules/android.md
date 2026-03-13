---
paths:
  - "**/AndroidManifest.xml"
  - "**/build.gradle.kts"
  - "**/src/main/java/**"
  - "**/src/main/kotlin/**"
  - "**/src/main/res/**"
---

# Android Development Rules

## Architecture
- Use MVVM + Clean Architecture (Google recommended)
- Jetpack Compose for UI (no XML layouts in new projects)
- Material 3 (Material You) as design system
- Hilt for dependency injection (with KSP, not KAPT)
- Room for local database, DataStore for key-value storage
- Retrofit + OkHttp for networking, Ktor for KMP projects
- Navigation 3 for Compose navigation

## Build Configuration
- targetSdk: 35+ (Google Play requirement)
- minSdk: 26 (Android 8.0, covers 95%+ devices)
- compileSdk: 35
- Kotlin: 2.3.10, AGP: latest stable
- Always use version catalogs (libs.versions.toml) for dependency management

## Testing
- Unit tests: JUnit 5 + MockK + kotlinx-coroutines-test
- UI tests: Compose Testing (ComposeTestRule) for Compose UIs
- Instrumented tests: AndroidJUnit4 runner
- Run all tests: `./gradlew test connectedAndroidTest`

## Quality
- Format: `ktfmt --kotlinlang-style`
- Lint: `detekt` for static analysis, Android Lint via `./gradlew lint`
- No hardcoded strings in UI — always use string resources (res/values/strings.xml)
- Support dark theme (Material 3 handles this automatically with dynamic colors)
- Support landscape + portrait, different screen sizes (use WindowSizeClass)
- ProGuard/R8 rules for release builds

## Emulator
- AVD: Pixel7_API35 (ARM64, Google Play) — already configured
- Start: `emulator @Pixel7_API35 -gpu host`
- Install: `adb install app.apk`
- Logs: `adb logcat -s "AppTag"`

## Signing
- Debug: automatic debug keystore
- Release: keystore in project-local `keystore.properties` (NEVER commit keystores!)
