package com.quizverse.app.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/** Tier constants for [AchievementBadge]. */
object AchievementTier {
    const val BRONZE = 1
    const val SILVER = 2
    const val GOLD   = 3
}

/**
 * Circular achievement badge with:
 * - Bronze / Silver / Gold colour ring matching [tier]
 * - [Canvas]-drawn progress arc around the outside
 * - Lock icon overlay when [isUnlocked] == false
 * - Shimmer glow animation when [newlyUnlocked] == true
 *
 * @param iconEmoji      Emoji or symbol shown in the centre.
 * @param tier           Achievement tier: 1 = Bronze, 2 = Silver, 3 = Gold.
 * @param progress       Fraction of completion [0..1].
 * @param isUnlocked     Whether the achievement has been earned.
 * @param newlyUnlocked  Triggers the shimmer glow animation.
 * @param size           Diameter of the badge.
 * @param modifier       Optional layout modifier.
 */
@Composable
fun AchievementBadge(
    iconEmoji: String,
    tier: Int,
    progress: Float,
    isUnlocked: Boolean,
    newlyUnlocked: Boolean = false,
    size: Dp = 72.dp,
    modifier: Modifier = Modifier,
) {
    val tierColors = when (tier) {
        AchievementTier.GOLD   -> listOf(Color(0xFFFFD700), Color(0xFFFFA500))
        AchievementTier.SILVER -> listOf(Color(0xFFC0C0C0), Color(0xFF808080))
        else                   -> listOf(Color(0xFFCD7F32), Color(0xFF8B4513)) // Bronze
    }

    val trackColor  = Color.White.copy(alpha = 0.15f)
    val lockedAlpha = if (isUnlocked) 1f else 0.35f

    // Animate progress arc
    val animatedProgress by animateFloatAsState(
        targetValue = progress.coerceIn(0f, 1f),
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessLow,
        ),
        label = "achievementProgress",
    )

    // Shimmer glow when newly unlocked
    val shimmerTransition = rememberInfiniteTransition(label = "shimmer")
    val shimmerAlpha by shimmerTransition.animateFloat(
        initialValue = 0f,
        targetValue = if (newlyUnlocked) 0.8f else 0f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 700, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "shimmerAlpha",
    )

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.size(size),
    ) {
        // Progress ring canvas
        Canvas(modifier = Modifier.size(size)) {
            val strokeWidth = size.toPx() * 0.09f
            val inset       = strokeWidth / 2f
            val arcSize     = Size(this.size.width - strokeWidth, this.size.height - strokeWidth)
            val topLeft     = Offset(inset, inset)

            // Track
            drawArc(
                color = trackColor,
                startAngle = -90f,
                sweepAngle = 360f,
                useCenter = false,
                style = Stroke(width = strokeWidth, cap = StrokeCap.Round),
                topLeft = topLeft,
                size = arcSize,
            )

            // Progress fill with tier gradient
            if (animatedProgress > 0f) {
                drawArc(
                    brush = Brush.sweepGradient(colors = tierColors),
                    startAngle = -90f,
                    sweepAngle = animatedProgress * 360f,
                    useCenter = false,
                    style = Stroke(width = strokeWidth, cap = StrokeCap.Round),
                    topLeft = topLeft,
                    size = arcSize,
                )
            }

            // Shimmer glow layer
            if (newlyUnlocked) {
                drawArc(
                    color = Color.White.copy(alpha = shimmerAlpha),
                    startAngle = -90f,
                    sweepAngle = 360f,
                    useCenter = false,
                    style = Stroke(width = strokeWidth * 1.8f, cap = StrokeCap.Round),
                    topLeft = topLeft,
                    size = arcSize,
                )
            }
        }

        // Inner circle background
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(size * 0.78f)
                .clip(CircleShape)
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            tierColors.first().copy(alpha = if (isUnlocked) 0.35f else 0.1f),
                            Color(0xFF1E293B),
                        ),
                    ),
                )
                .alpha(lockedAlpha),
        ) {
            Text(
                text = if (isUnlocked) iconEmoji else "🔒",
                fontSize = (size.value * 0.33f).sp,
                textAlign = TextAlign.Center,
            )
        }

        // Tier label (bottom-right pip)
        if (isUnlocked) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(size * 0.28f)
                    .clip(CircleShape)
                    .background(
                        brush = Brush.linearGradient(colors = tierColors),
                    )
                    .align(Alignment.BottomEnd),
            ) {
                Text(
                    text = when (tier) {
                        AchievementTier.GOLD   -> "G"
                        AchievementTier.SILVER -> "S"
                        else                   -> "B"
                    },
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = (size.value * 0.11f).sp,
                )
            }
        }
    }
}
