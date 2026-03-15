package com.quizverse.app.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/** Milestones at which the fire emoji grows larger and a pulse triggers. */
private val STREAK_MILESTONES = setOf(5, 10, 20, 50, 100)

/**
 * Displays the current player streak with a fire emoji that grows with the streak
 * and pulses at milestone values (5, 10, 20, 50, 100).
 *
 * @param streak   Current streak count.
 * @param modifier Optional layout modifier.
 */
@Composable
fun StreakCounter(
    streak: Int,
    modifier: Modifier = Modifier,
) {
    val isMilestone = streak in STREAK_MILESTONES

    // Continuous pulse at milestone streaks
    val infiniteTransition = rememberInfiniteTransition(label = "streakPulse")
    val pulseScale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = if (isMilestone) 1.25f else 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 600, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "streakEmojiPulse",
    )

    // Emoji grows logarithmically with streak (max ×2.4)
    val emojiSize = (24f + (kotlin.math.ln((streak + 1).toDouble()) * 4f)).coerceIn(24.0, 52.0).toFloat()

    // Number colour gets warmer with streak
    val numberColor by animateColorAsState(
        targetValue = when {
            streak >= 50  -> Color(0xFFFF4500)   // deep orange-red
            streak >= 20  -> Color(0xFFFF6B35)   // orange
            streak >= 10  -> Color(0xFFFFA500)   // amber
            streak >= 5   -> Color(0xFFFFD700)   // gold
            else          -> Color(0xFFFFFFFF)   // white
        },
        animationSpec = tween(durationMillis = 500),
        label = "streakColor",
    )

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier,
    ) {
        // Fire emoji with dynamic scale
        Text(
            text = when {
                streak >= 50  -> "🔥"
                streak >= 20  -> "🔥"
                streak >= 10  -> "🔥"
                streak >= 5   -> "🔥"
                else          -> "🔥"
            },
            fontSize = emojiSize.sp,
            modifier = Modifier.scale(pulseScale),
        )

        Column(horizontalAlignment = Alignment.Start) {
            Text(
                text = streak.toString(),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 22.sp,
                color = numberColor,
            )
            Text(
                text = "Streak",
                style = MaterialTheme.typography.labelSmall,
                color = Color.White.copy(alpha = 0.7f),
            )
        }

        // Milestone badge
        if (isMilestone) {
            Text(
                text = "🎉",
                fontSize = 18.sp,
                modifier = Modifier.padding(start = 4.dp),
            )
        }
    }
}
