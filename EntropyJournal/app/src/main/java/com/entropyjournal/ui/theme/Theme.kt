package com.entropyjournal.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val CosmosColorScheme = darkColorScheme(
    primary = NeonCyan,
    onPrimary = CosmosBlack,
    primaryContainer = NeonCyan.copy(alpha = 0.12f),
    onPrimaryContainer = NeonCyan,
    secondary = NeonViolet,
    onSecondary = CosmosBlack,
    secondaryContainer = NeonViolet.copy(alpha = 0.12f),
    onSecondaryContainer = NeonViolet,
    tertiary = NeonMagenta,
    onTertiary = CosmosBlack,
    tertiaryContainer = NeonMagenta.copy(alpha = 0.12f),
    onTertiaryContainer = NeonMagenta,
    error = NeonRed,
    onError = CosmosBlack,
    errorContainer = NeonRed.copy(alpha = 0.12f),
    onErrorContainer = NeonRed,
    background = CosmosBlack,
    onBackground = TextPrimary,
    surface = CosmosDeep,
    onSurface = TextPrimary,
    surfaceVariant = CosmosLayer,
    onSurfaceVariant = TextSecondary,
    outline = GlassBorder,
    outlineVariant = GlassHighlight,
    inverseSurface = TextPrimary,
    inverseOnSurface = CosmosBlack,
    surfaceTint = NeonCyan
)

@Composable
fun EntropyJournalTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = CosmosColorScheme,
        typography = AppTypography,
        shapes = AppShapes,
        content = content
    )
}
