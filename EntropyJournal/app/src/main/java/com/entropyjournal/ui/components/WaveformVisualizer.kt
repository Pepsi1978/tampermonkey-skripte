package com.entropyjournal.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.entropyjournal.ui.theme.NeonCyan
import com.entropyjournal.ui.theme.NeonViolet

@Composable
fun WaveformVisualizer(
    amplitude: Float,
    modifier: Modifier = Modifier,
    barCount: Int = 30
) {
    val animatedAmplitude by animateFloatAsState(
        targetValue = amplitude,
        animationSpec = tween(100),
        label = "amplitude"
    )

    Canvas(
        modifier = modifier
            .fillMaxWidth()
            .height(60.dp)
    ) {
        val barWidth = size.width / (barCount * 2f)
        val maxBarHeight = size.height * 0.8f

        for (i in 0 until barCount) {
            val distFromCenter = kotlin.math.abs(i - barCount / 2f) / (barCount / 2f)
            val heightFactor = (1f - distFromCenter * 0.5f) * animatedAmplitude
            val barHeight = (maxBarHeight * heightFactor).coerceAtLeast(4.dp.toPx())

            val x = i * barWidth * 2f + barWidth / 2f
            val y = (size.height - barHeight) / 2f

            drawRoundRect(
                brush = Brush.verticalGradient(
                    listOf(NeonCyan, NeonViolet),
                    startY = y,
                    endY = y + barHeight
                ),
                topLeft = Offset(x, y),
                size = Size(barWidth, barHeight),
                cornerRadius = CornerRadius(barWidth / 2f),
                alpha = 0.6f + heightFactor * 0.4f
            )
        }
    }
}
