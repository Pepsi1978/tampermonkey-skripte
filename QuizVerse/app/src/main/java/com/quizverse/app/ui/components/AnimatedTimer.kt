package com.quizverse.app.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Circular countdown timer drawn on a [Canvas].
 *
 * Colours transition:
 *   green  (> 50 %)  →  yellow  (20–50 %)  →  red  (≤ 20 %)
 *
 * A pulsing scale animation activates in the last 5 seconds to draw attention.
 *
 * @param remainingSeconds  How many seconds are left.
 * @param totalSeconds      The full duration of the timer.
 * @param size              Diameter of the circular widget.
 * @param modifier          Optional layout modifier.
 */
@Composable
fun AnimatedTimer(
    remainingSeconds: Int,
    totalSeconds: Int,
    size: Dp = 80.dp,
    modifier: Modifier = Modifier,
) {
    // Fraction of time remaining [0..1]
    val fraction = (remainingSeconds.toFloat() / totalSeconds.coerceAtLeast(1)).coerceIn(0f, 1f)

    // Smooth arc progress animation
    val animatedFraction by animateFloatAsState(
        targetValue = fraction,
        animationSpec = tween(durationMillis = 900, easing = LinearEasing),
        label = "timerArc",
    )

    // Colour: green → yellow → red
    val arcColor by animateColorAsState(
        targetValue = when {
            fraction > 0.5f -> Color(0xFF4ADE80)   // green
            fraction > 0.2f -> Color(0xFFFBBF24)   // yellow
            else            -> Color(0xFFF87171)    // red
        },
        animationSpec = tween(durationMillis = 400),
        label = "timerColor",
    )

    // Pulsing scale in last 5 seconds
    val isUrgent = remainingSeconds in 1..5
    val pulseAnim = rememberInfiniteTransition(label = "timerPulse")
    val pulseScale by pulseAnim.animateFloat(
        initialValue = 1f,
        targetValue = if (isUrgent) 1.12f else 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 500, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "pulseScale",
    )

    val trackColor = Color.White.copy(alpha = 0.15f)

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.size(size),
    ) {
        Canvas(modifier = Modifier.size(size)) {
            val stroke = size.toPx() * 0.1f
            val padding = stroke / 2f

            // Background track
            drawArc(
                color = trackColor,
                startAngle = -90f,
                sweepAngle = 360f,
                useCenter = false,
                style = Stroke(width = stroke, cap = StrokeCap.Round),
                topLeft = androidx.compose.ui.geometry.Offset(padding, padding),
                size = this.size.copy(
                    width = this.size.width - stroke,
                    height = this.size.height - stroke,
                ),
            )

            // Foreground progress arc
            drawArc(
                color = arcColor,
                startAngle = -90f,
                sweepAngle = animatedFraction * 360f,
                useCenter = false,
                style = Stroke(width = stroke, cap = StrokeCap.Round),
                topLeft = androidx.compose.ui.geometry.Offset(padding, padding),
                size = this.size.copy(
                    width = this.size.width - stroke,
                    height = this.size.height - stroke,
                ),
            )
        }

        // Centre time label
        Text(
            text = remainingSeconds.toString(),
            fontSize = (size.value * 0.28f).sp,
            fontWeight = FontWeight.ExtraBold,
            color = arcColor,
            style = MaterialTheme.typography.headlineSmall,
        )
    }
}
