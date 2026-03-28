package com.entropyjournal.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Bedtime
import androidx.compose.material.icons.rounded.FitnessCenter
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.People
import androidx.compose.material.icons.rounded.Psychology
import androidx.compose.material.icons.rounded.Restaurant
import androidx.compose.material.icons.rounded.TrendingUp
import androidx.compose.material.icons.rounded.Work
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.entropyjournal.domain.model.AdviceBlock
import com.entropyjournal.ui.theme.NeonAmber
import com.entropyjournal.ui.theme.NeonCyan
import com.entropyjournal.ui.theme.NeonEmerald
import com.entropyjournal.ui.theme.NeonRed
import com.entropyjournal.ui.theme.TextSecondary

@Composable
fun AdviceCategoryCard(
    block: AdviceBlock,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val categoryColor = try {
        Color(android.graphics.Color.parseColor(block.categoryColor))
    } catch (e: Exception) {
        NeonCyan
    }

    ThreeDCard(
        modifier = modifier.width(120.dp),
        glowColor = if (isSelected) categoryColor else categoryColor.copy(alpha = 0.3f)
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = getIconForCategory(block.categoryIcon),
                contentDescription = block.categoryName,
                tint = categoryColor,
                modifier = Modifier.size(28.dp)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = block.categoryName,
                style = MaterialTheme.typography.labelMedium,
                color = if (isSelected) categoryColor else TextSecondary,
                textAlign = TextAlign.Center,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(4.dp))
            EntropyLevelIndicator(
                level = block.entropyLevel,
                color = categoryColor
            )
        }
    }
}

@Composable
private fun EntropyLevelIndicator(
    level: Float,
    color: Color,
    modifier: Modifier = Modifier
) {
    val indicatorColor = when {
        level < 0.33f -> NeonEmerald
        level < 0.66f -> NeonAmber
        else -> NeonRed
    }

    androidx.compose.foundation.Canvas(
        modifier = modifier.size(40.dp, 20.dp)
    ) {
        drawArc(
            color = color.copy(alpha = 0.2f),
            startAngle = 180f,
            sweepAngle = 180f,
            useCenter = false,
            style = androidx.compose.ui.graphics.drawscope.Stroke(width = 3.dp.toPx())
        )
        drawArc(
            color = indicatorColor,
            startAngle = 180f,
            sweepAngle = 180f * level,
            useCenter = false,
            style = androidx.compose.ui.graphics.drawscope.Stroke(
                width = 3.dp.toPx(),
                cap = androidx.compose.ui.graphics.StrokeCap.Round
            )
        )
    }
}

fun getIconForCategory(iconName: String): ImageVector {
    return when (iconName) {
        "bedtime" -> Icons.Rounded.Bedtime
        "work" -> Icons.Rounded.Work
        "fitness_center" -> Icons.Rounded.FitnessCenter
        "restaurant" -> Icons.Rounded.Restaurant
        "psychology" -> Icons.Rounded.Psychology
        "people" -> Icons.Rounded.People
        "home" -> Icons.Rounded.Home
        "trending_up" -> Icons.Rounded.TrendingUp
        else -> Icons.Rounded.Psychology
    }
}
