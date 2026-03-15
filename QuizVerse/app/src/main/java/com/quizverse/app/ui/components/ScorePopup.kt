package com.quizverse.app.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Floating score label (e.g. "+100") that animates upward and fades out.
 *
 * Usage: place this composable at the desired anchor position and control
 * visibility through [visible]. Once [visible] becomes true, the animation
 * plays automatically. Pass [onAnimationEnd] to hide the popup after
 * the animation completes.
 *
 * @param score          Score delta to display (e.g. "+100", "+250 ⚡").
 * @param visible        Whether the popup is currently showing.
 * @param color          Text colour; defaults to a vivid gold.
 * @param onAnimationEnd Called when the exit animation finishes.
 * @param modifier       Optional layout modifier.
 */
@Composable
fun ScorePopup(
    score: String,
    visible: Boolean,
    color: Color = Color(0xFFFFD700),
    onAnimationEnd: () -> Unit = {},
    modifier: Modifier = Modifier,
) {
    if (!visible) return

    // Y-offset: animates from 0 → -120 px (floats upward)
    val offsetY = remember { Animatable(0f) }
    // Alpha: stays at 1 for the first 400 ms, then fades to 0
    val alpha = remember { Animatable(1f) }

    LaunchedEffect(visible) {
        // Run movement and fade in parallel using separate launch inside LaunchedEffect scope
        launch {
            offsetY.animateTo(
                targetValue = -120f,
                animationSpec = tween(durationMillis = 900, easing = FastOutSlowInEasing),
            )
        }
        launch {
            delay(400)
            alpha.animateTo(
                targetValue = 0f,
                animationSpec = tween(durationMillis = 500, easing = LinearEasing),
            )
        }
        // Wait for the longer animation to finish, then signal completion
        delay(900)
        onAnimationEnd()
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .offset { IntOffset(x = 0, y = offsetY.value.toInt()) }
            .alpha(alpha.value),
    ) {
        // Shadow layer (offset slightly)
        Text(
            text = score,
            color = Color.Black.copy(alpha = 0.4f),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 28.sp,
            modifier = Modifier.offset(x = 1.5.dp, y = 1.5.dp),
        )
        Text(
            text = score,
            color = color,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 28.sp,
        )
    }
}
