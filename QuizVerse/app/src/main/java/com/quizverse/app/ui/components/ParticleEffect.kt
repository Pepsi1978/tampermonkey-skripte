package com.quizverse.app.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin
import kotlin.random.Random

/**
 * Particle data for a single confetti piece.
 *
 * @property x         Fractional X position [0..1] relative to the canvas width.
 * @property startY    Fractional starting Y position [-0.2..0] (above the top edge).
 * @property size      Radius in px.
 * @property color     Fill colour.
 * @property speed     Fall speed multiplier.
 * @property angle     Initial rotation angle in degrees.
 * @property rotSpeed  Rotation speed multiplier.
 * @property isCircle  True = circle, false = rectangle.
 */
private data class Particle(
    val x: Float,
    val startY: Float,
    val size: Float,
    val color: Color,
    val speed: Float,
    val angle: Float,
    val rotSpeed: Float,
    val isCircle: Boolean,
)

/** Bright confetti palette. */
private val CONFETTI_COLORS = listOf(
    Color(0xFFFF6B6B), Color(0xFFFFE66D), Color(0xFF4ECDC4),
    Color(0xFF6C63FF), Color(0xFFFF9F43), Color(0xFF48DBFB),
    Color(0xFFFF9FF3), Color(0xFF54A0FF), Color(0xFF5F27CD),
    Color(0xFF00D2D3), Color(0xFFFF6348), Color(0xFFFECA57),
)

/**
 * Full-screen confetti particle system drawn on a [Canvas].
 *
 * Particles fall from the top with random colours, sizes and rotations.
 * Designed to overlay a quiz screen on correct answers and level-ups.
 *
 * @param isActive    Start / stop the animation.
 * @param count       Number of confetti pieces.
 * @param modifier    Modifier (typically [fillMaxSize]).
 */
@Composable
fun ParticleEffect(
    isActive: Boolean,
    count: Int = 80,
    modifier: Modifier = Modifier.fillMaxSize(),
) {
    if (!isActive) return

    // Generate particles once per activation
    val particles = remember(isActive) {
        List(count) {
            Particle(
                x       = Random.nextFloat(),
                startY  = Random.nextFloat() * -0.3f,
                size    = Random.nextFloat() * 12f + 5f,
                color   = CONFETTI_COLORS.random(),
                speed   = Random.nextFloat() * 0.6f + 0.4f,
                angle   = Random.nextFloat() * 360f,
                rotSpeed = (Random.nextFloat() - 0.5f) * 4f,
                isCircle = Random.nextBoolean(),
            )
        }
    }

    // Master clock: 0 → 1 over the animation duration, then loops
    val infiniteTransition = rememberInfiniteTransition(label = "confetti")
    val clock by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue  = 1f,
        animationSpec = infiniteRepeatable(
            animation   = tween(durationMillis = 2500, easing = LinearEasing),
            repeatMode  = RepeatMode.Restart,
        ),
        label = "confettiClock",
    )

    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height

        particles.forEach { p ->
            // Each particle falls at its own speed; wrap around bottom back to top
            val t = ((clock * p.speed + p.startY + 1f) % 1f)
            val x = p.x * w
            val y = t * (h + p.size * 4)

            // Gentle horizontal sway using a simple sine
            val sway = sin((t * PI * 4 + p.x * PI).toFloat()) * 18f
            val rotation = p.angle + clock * p.rotSpeed * 360f

            // Fade in/out near the edges
            val alpha = when {
                t < 0.05f -> t / 0.05f
                t > 0.9f  -> (1f - t) / 0.1f
                else      -> 1f
            }

            rotate(degrees = rotation, pivot = Offset(x + sway, y)) {
                if (p.isCircle) {
                    drawCircle(
                        color  = p.color.copy(alpha = alpha),
                        radius = p.size,
                        center = Offset(x + sway, y),
                    )
                } else {
                    drawRect(
                        color   = p.color.copy(alpha = alpha),
                        topLeft = Offset(x + sway - p.size / 2f, y - p.size),
                        size    = androidx.compose.ui.geometry.Size(p.size, p.size * 2),
                    )
                }
            }
        }
    }
}
