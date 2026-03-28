package com.entropyjournal.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.entropyjournal.ui.theme.NeonCyan
import com.entropyjournal.ui.theme.glassCard

@Composable
fun GlassCard(
    modifier: Modifier = Modifier,
    glowColor: Color = NeonCyan,
    glowIntensity: Float = 0.15f,
    cornerRadius: Dp = 20.dp,
    contentPadding: Dp = 16.dp,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .glassCard(
                glowColor = glowColor,
                glowIntensity = glowIntensity,
                cornerRadius = cornerRadius
            )
            .padding(contentPadding)
    ) {
        content()
    }
}
