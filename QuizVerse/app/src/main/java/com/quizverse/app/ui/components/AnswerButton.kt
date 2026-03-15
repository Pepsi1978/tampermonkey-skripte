package com.quizverse.app.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ripple
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/** Visual state of an answer button. */
enum class AnswerState { Default, Selected, Correct, Wrong }

/**
 * A single answer option button with rich visual feedback.
 *
 * Supports:
 * - Letter prefix badge (A / B / C / D)
 * - Animated colour transitions between states
 * - Horizontal shake animation on wrong answers
 * - Scale-up on press via [MutableInteractionSource]
 *
 * @param letter       One of "A", "B", "C", "D".
 * @param text         The answer text.
 * @param state        Current [AnswerState] driving colour and icon.
 * @param onClick      Invoked when the button is tapped (only active in [AnswerState.Default]).
 * @param modifier     Optional layout modifier.
 */
@Composable
fun AnswerButton(
    letter: String,
    text: String,
    state: AnswerState,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    // ── Colours ────────────────────────────────────────────────────────────
    val backgroundDefault  = Color(0xFF1E293B)
    val backgroundSelected = Color(0xFF3B4A6B)
    val backgroundCorrect  = Color(0xFF15803D)
    val backgroundWrong    = Color(0xFFB91C1C)

    val borderDefault   = Color(0xFF334155)
    val borderSelected  = Color(0xFF6366F1)
    val borderCorrect   = Color(0xFF4ADE80)
    val borderWrong     = Color(0xFFF87171)

    val targetBackground by animateColorAsState(
        targetValue = when (state) {
            AnswerState.Default  -> backgroundDefault
            AnswerState.Selected -> backgroundSelected
            AnswerState.Correct  -> backgroundCorrect
            AnswerState.Wrong    -> backgroundWrong
        },
        animationSpec = tween(durationMillis = 300),
        label = "answerBg",
    )

    val targetBorder by animateColorAsState(
        targetValue = when (state) {
            AnswerState.Default  -> borderDefault
            AnswerState.Selected -> borderSelected
            AnswerState.Correct  -> borderCorrect
            AnswerState.Wrong    -> borderWrong
        },
        animationSpec = tween(durationMillis = 300),
        label = "answerBorder",
    )

    // ── Shake animation (wrong answer) ────────────────────────────────────
    val shakeOffset = remember { Animatable(0f) }

    LaunchedEffect(state) {
        if (state == AnswerState.Wrong) {
            repeat(4) {
                shakeOffset.animateTo(
                    targetValue = if (it % 2 == 0) 10f else -10f,
                    animationSpec = tween(durationMillis = 70, easing = LinearEasing),
                )
            }
            shakeOffset.animateTo(0f, animationSpec = tween(durationMillis = 70))
        }
    }

    // ── Press scale animation ──────────────────────────────────────────────
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val scale by animateFloatAsState(
        targetValue = if (isPressed) 0.96f else 1f,
        animationSpec = spring(dampingRatio = Spring.DampingRatioLowBouncy),
        label = "answerScale",
    )

    // ── Status icon ────────────────────────────────────────────────────────
    val statusIcon = when (state) {
        AnswerState.Correct  -> "✓"
        AnswerState.Wrong    -> "✗"
        AnswerState.Selected -> "→"
        AnswerState.Default  -> ""
    }

    Row(
        modifier = modifier
            .graphicsLayer { translationX = shakeOffset.value }
            .scale(scale)
            .clip(RoundedCornerShape(16.dp))
            .background(targetBackground)
            .border(
                width = 1.5.dp,
                color = targetBorder,
                shape = RoundedCornerShape(16.dp),
            )
            .clickable(
                interactionSource = interactionSource,
                indication = ripple(bounded = true, color = Color.White.copy(alpha = 0.1f)),
                enabled = state == AnswerState.Default,
                onClick = onClick,
            )
            .padding(horizontal = 16.dp, vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        // Letter badge
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(32.dp)
                .clip(CircleShape)
                .background(
                    when (state) {
                        AnswerState.Default  -> Color(0xFF334155)
                        AnswerState.Selected -> Color(0xFF6366F1)
                        AnswerState.Correct  -> Color(0xFF4ADE80)
                        AnswerState.Wrong    -> Color(0xFFF87171)
                    }
                ),
        ) {
            Text(
                text = if (statusIcon.isNotEmpty()) statusIcon else letter,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
            )
        }

        // Answer text
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.White,
            fontWeight = if (state != AnswerState.Default) FontWeight.SemiBold else FontWeight.Normal,
            modifier = Modifier.weight(1f),
        )
    }
}
