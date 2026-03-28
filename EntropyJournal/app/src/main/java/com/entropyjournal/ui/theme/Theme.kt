package com.entropyjournal.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val LocalIsDarkTheme = staticCompositionLocalOf { true }

private val WarmDarkScheme = darkColorScheme(
    primary = WarmCopper,
    onPrimary = Color.White,
    primaryContainer = CosmosSurface,
    onPrimaryContainer = WarmSand,
    secondary = WarmSand,
    onSecondary = CosmosBlack,
    secondaryContainer = CosmosSurface.copy(alpha = 0.7f),
    onSecondaryContainer = WarmSand,
    tertiary = WarmGold,
    onTertiary = CosmosBlack,
    tertiaryContainer = CosmosSurface.copy(alpha = 0.5f),
    onTertiaryContainer = WarmGold,
    error = NeonRed,
    onError = Color.White,
    errorContainer = NeonRed.copy(alpha = 0.15f),
    onErrorContainer = NeonRed,
    background = CosmosBlack,
    onBackground = TextPrimary,
    surface = CosmosDeep,
    onSurface = TextPrimary,
    surfaceVariant = CosmosLayer,
    onSurfaceVariant = TextSecondary,
    outline = TextMuted,
    outlineVariant = GlassHighlight,
    inverseSurface = TextPrimary,
    inverseOnSurface = CosmosBlack,
    surfaceTint = WarmCopper
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF3D6B8E),              // Deep steel blue — buttons, links
    onPrimary = Color.White,
    primaryContainer = LightSurfaceVariant,   // Soft sky blue
    onPrimaryContainer = Color(0xFF1C3A52),
    secondary = Color(0xFF8B6914),            // Warm amber — secondary actions
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFFAF9EE),
    onSecondaryContainer = Color(0xFF4A3600),
    tertiary = Color(0xFF6B7B8D),             // Cool gray-blue
    onTertiary = Color.White,
    tertiaryContainer = LightSurfaceContainer,
    onTertiaryContainer = Color(0xFF2C3E50),
    error = Color(0xFFD32F2F),
    onError = Color.White,
    errorContainer = Color(0xFFFFCDD2),
    onErrorContainer = Color(0xFFB71C1C),
    background = LightBackground,             // #F9F8F6
    onBackground = LightTextPrimary,          // #1C2833
    surface = LightSurface,                   // #FAF9EE
    onSurface = LightTextPrimary,
    surfaceVariant = LightSurfaceVariant,     // #D9EAFD
    onSurfaceVariant = LightTextSecondary,    // #4A5568
    outline = LightTextMuted,                 // #9AA6B2
    outlineVariant = LightSurfaceContainer,   // #BCCCDC
    inverseSurface = LightTextPrimary,
    inverseOnSurface = LightBackground,
    surfaceTint = Color(0xFF3D6B8E)
)

@Composable
fun EntropyJournalTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) WarmDarkScheme else LightColorScheme

    CompositionLocalProvider(LocalIsDarkTheme provides darkTheme) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = AppTypography,
            shapes = AppShapes,
            content = content
        )
    }
}
