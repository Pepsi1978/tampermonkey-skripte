package com.entropyjournal.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

fun Modifier.glassCard(
    glowColor: Color = NeonCyan,
    glowIntensity: Float = 0.15f,
    cornerRadius: Dp = 20.dp
): Modifier = this
    .shadow(
        elevation = 8.dp,
        shape = RoundedCornerShape(cornerRadius),
        ambientColor = glowColor.copy(alpha = glowIntensity),
        spotColor = glowColor.copy(alpha = glowIntensity)
    )
    .clip(RoundedCornerShape(cornerRadius))
    .background(
        Brush.verticalGradient(
            listOf(GlassWhite, GlassHighlight)
        )
    )
    .border(
        width = 1.dp,
        brush = Brush.linearGradient(
            listOf(GlassBorder, Color.Transparent)
        ),
        shape = RoundedCornerShape(cornerRadius)
    )

fun Modifier.glassCardElevated(
    glowColor: Color = NeonCyan,
    glowIntensity: Float = 0.25f,
    cornerRadius: Dp = 20.dp
): Modifier = this
    .shadow(
        elevation = 16.dp,
        shape = RoundedCornerShape(cornerRadius),
        ambientColor = glowColor.copy(alpha = glowIntensity),
        spotColor = glowColor.copy(alpha = glowIntensity)
    )
    .clip(RoundedCornerShape(cornerRadius))
    .background(
        Brush.verticalGradient(
            listOf(
                GlassWhite.copy(alpha = 0.15f),
                GlassHighlight
            )
        )
    )
    .border(
        width = 1.dp,
        brush = Brush.linearGradient(
            listOf(
                GlassBorder.copy(alpha = 0.3f),
                Color.Transparent,
                GlassBorder.copy(alpha = 0.1f)
            )
        ),
        shape = RoundedCornerShape(cornerRadius)
    )
