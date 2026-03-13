---
paths:
  - "**/*.kt"
  - "**/*.kts"
  - "**/build.gradle.kts"
  - "**/settings.gradle.kts"
---

# Kotlin Development Rules

- Use Kotlin 2.3+, prefer KSP over KAPT for annotation processing
- Follow Kotlin coding conventions (kotlinlang.org/docs/coding-conventions.html)
- Use data classes for DTOs, sealed classes/interfaces for state modeling
- Prefer `val` over `var`, immutable collections over mutable
- Use coroutines + Flow for async operations, never RxJava in new code
- Use scope functions idiomatically: `let`, `apply`, `also`, `run`, `with`
- Null safety: avoid `!!` operator, use `?.let {}`, `?:`, or `requireNotNull()`
- Format code: `ktfmt --kotlinlang-style` (installed via Homebrew)
- Lint code: `detekt` (installed via Homebrew, configurable via detekt.yml)
- Build with Gradle Wrapper: `./gradlew build` (never use global `gradle` for project builds)
- Run tests: `./gradlew test` (unit) or `./gradlew connectedAndroidTest` (instrumented)
- Use Gradle Kotlin DSL (build.gradle.kts) over Groovy DSL
