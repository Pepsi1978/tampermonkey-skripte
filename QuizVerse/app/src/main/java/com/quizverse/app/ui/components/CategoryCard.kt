package com.quizverse.app.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Category selection card with gradient background, emoji icon, name, question count
 * badge, and an overlay lock icon for locked categories.
 *
 * @param name           Category display name.
 * @param emoji          Category emoji shown large in the centre.
 * @param questionCount  Number of questions; shown in a badge.
 * @param isLocked       If true, renders a lock overlay.
 * @param gradientStart  Start colour of the card gradient.
 * @param gradientEnd    End colour of the card gradient.
 * @param onClick        Invoked when the card is tapped (ignored while locked).
 * @param modifier       Optional layout modifier.
 */
@Composable
fun CategoryCard(
    name: String,
    emoji: String,
    questionCount: Int,
    isLocked: Boolean,
    gradientStart: Color,
    gradientEnd: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    val scale by animateFloatAsState(
        targetValue = if (isPressed) 0.94f else 1f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMedium,
        ),
        label = "categoryCardScale",
    )

    Box(
        modifier = modifier
            .scale(scale)
            .clip(RoundedCornerShape(20.dp))
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(gradientStart, gradientEnd),
                ),
            )
            .border(
                width = 1.dp,
                color = Color.White.copy(alpha = 0.2f),
                shape = RoundedCornerShape(20.dp),
            )
            .clickable(
                interactionSource = interactionSource,
                indication = ripple(bounded = true, color = Color.White.copy(alpha = 0.2f)),
                enabled = !isLocked,
                onClick = onClick,
            )
            .padding(16.dp),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth(),
        ) {
            // Emoji icon
            Text(
                text = emoji,
                fontSize = 40.sp,
                modifier = Modifier.alpha(if (isLocked) 0.4f else 1f),
            )

            // Category name
            Text(
                text = name,
                style = MaterialTheme.typography.labelLarge,
                fontWeight = FontWeight.Bold,
                color = Color.White.copy(alpha = if (isLocked) 0.5f else 1f),
                textAlign = TextAlign.Center,
                maxLines = 2,
            )

            // Question count badge
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.White.copy(alpha = 0.2f))
                    .padding(horizontal = 10.dp, vertical = 3.dp),
            ) {
                Text(
                    text = "$questionCount Fragen",
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.White.copy(alpha = 0.9f),
                    fontWeight = FontWeight.Medium,
                )
            }
        }

        // Lock overlay
        if (isLocked) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .matchParentSize()
                    .background(Color.Black.copy(alpha = 0.45f))
                    .clip(RoundedCornerShape(20.dp)),
            ) {
                Text(
                    text = "🔒",
                    fontSize = 32.sp,
                )
            }
        }
    }
}
