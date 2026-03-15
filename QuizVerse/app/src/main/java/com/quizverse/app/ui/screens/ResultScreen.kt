package com.quizverse.app.ui.screens

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.quizverse.app.ui.navigation.Screen
import kotlinx.coroutines.delay
import kotlin.math.roundToInt
import kotlin.random.Random

// Confetti particle data
private data class ConfettiParticle(
    val x: Float,         // Horizontal position 0..1
    val color: Color,
    val size: Float,
    val speedFactor: Float // Variation in fall speed
)

// A small set of vivid confetti colors
private val confettiColors = listOf(
    Color(0xFF6C63FF),
    Color(0xFFFF6584),
    Color(0xFF43E97B),
    Color(0xFFF59E0B),
    Color(0xFF3B82F6),
    Color(0xFFEC4899),
    Color(0xFF14B8A6)
)

// Generate a fixed list of confetti particles once
private val confettiParticles = List(30) {
    ConfettiParticle(
        x = Random.nextFloat(),
        color = confettiColors[it % confettiColors.size],
        size = Random.nextFloat() * 10f + 6f,
        speedFactor = Random.nextFloat() * 0.5f + 0.75f
    )
}

// Returns performance label and emoji based on percentage score
private fun performanceText(percent: Int): Pair<String, String> = when {
    percent < 30 -> "Weiter üben!" to "😅"
    percent < 60 -> "Gut gemacht!" to "👍"
    percent < 80 -> "Sehr gut!" to "🎉"
    else         -> "Hervorragend!" to "🏆"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ResultScreen(
    score: Int,
    total: Int,
    correct: Int,
    categoryId: Int,
    navController: NavHostController
) {
    val percent = if (total > 0) (correct * 100) / total else 0
    val (performanceLabel, performanceEmoji) = performanceText(percent)

    // Count-up animation for score display
    var displayedScore by remember { mutableIntStateOf(0) }
    val cardScale = remember { Animatable(0.6f) }
    val cardAlpha = remember { Animatable(0f) }
    val buttonsAlpha = remember { Animatable(0f) }

    // Score count-up
    LaunchedEffect(score) {
        val steps = 40
        val stepDelay = 600L / steps
        val step = score / steps.toFloat()
        repeat(steps) { i ->
            delay(stepDelay)
            displayedScore = ((i + 1) * step).roundToInt().coerceAtMost(score)
        }
        displayedScore = score
    }

    // Result card spring entrance
    LaunchedEffect(Unit) {
        delay(100)
        cardScale.animateTo(
            targetValue = 1f,
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessMedium
            )
        )
    }
    LaunchedEffect(Unit) {
        cardAlpha.animateTo(1f, animationSpec = tween(300))
        delay(400)
        buttonsAlpha.animateTo(1f, animationSpec = tween(400))
    }

    // Infinite confetti fall animation
    val infiniteTransition = rememberInfiniteTransition(label = "confetti")
    val confettiFall by infiniteTransition.animateFloat(
        initialValue = -0.1f,
        targetValue = 1.1f,
        animationSpec = infiniteRepeatable(
            animation = tween(3000, easing = LinearEasing)
        ),
        label = "confettiFall"
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Ergebnis",
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background
                )
            )
        }
    ) { innerPadding ->
        BoxWithConstraints(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            val boxWidthPx = constraints.maxWidth.toFloat()
            val boxHeightPx = constraints.maxHeight.toFloat()

            // Confetti particles falling over the screen
            if (percent >= 60) {
                confettiParticles.forEach { particle ->
                    val fallY = ((confettiFall + particle.speedFactor * 0.3f) % 1.2f - 0.05f)
                    Box(
                        modifier = Modifier
                            .offset {
                                IntOffset(
                                    x = (particle.x * boxWidthPx).roundToInt(),
                                    y = (fallY * boxHeightPx).roundToInt()
                                )
                            }
                    ) {
                        Box(
                            modifier = Modifier
                                .size(particle.size.dp)
                                .clip(CircleShape)
                                .background(particle.color.copy(alpha = 0.75f))
                        )
                    }
                }
            }

            // Main content
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                // Animated result card
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .scale(cardScale.value)
                        .alpha(cardAlpha.value),
                    shape = RoundedCornerShape(24.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(24.dp))
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(
                                        Color(0xFF6C63FF),
                                        Color(0xFFA855F7)
                                    )
                                )
                            )
                            .padding(32.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            // Performance emoji
                            Text(
                                text = performanceEmoji,
                                fontSize = 56.sp
                            )

                            Spacer(modifier = Modifier.height(12.dp))

                            Text(
                                text = performanceLabel,
                                style = MaterialTheme.typography.headlineSmall,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.height(24.dp))

                            // Count-up score display
                            Text(
                                text = "$displayedScore",
                                style = MaterialTheme.typography.displayLarge,
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.White
                            )

                            Text(
                                text = "Punkte",
                                style = MaterialTheme.typography.titleMedium,
                                color = Color.White.copy(alpha = 0.8f)
                            )

                            Spacer(modifier = Modifier.height(20.dp))

                            // Divider line
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth(0.6f)
                                    .height(1.dp)
                                    .background(Color.White.copy(alpha = 0.3f))
                            )

                            Spacer(modifier = Modifier.height(20.dp))

                            // Correct / Total row
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(32.dp)
                            ) {
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(
                                        text = "$correct",
                                        style = MaterialTheme.typography.headlineMedium,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White
                                    )
                                    Text(
                                        text = "Richtig",
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = Color.White.copy(alpha = 0.75f)
                                    )
                                }
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(
                                        text = "${total - correct}",
                                        style = MaterialTheme.typography.headlineMedium,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White
                                    )
                                    Text(
                                        text = "Falsch",
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = Color.White.copy(alpha = 0.75f)
                                    )
                                }
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(
                                        text = "$percent%",
                                        style = MaterialTheme.typography.headlineMedium,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White
                                    )
                                    Text(
                                        text = "Treffer",
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = Color.White.copy(alpha = 0.75f)
                                    )
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(32.dp))

                // Action buttons with fade-in
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .alpha(buttonsAlpha.value),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    // Play the same category again
                    Button(
                        onClick = {
                            navController.navigate(Screen.Difficulty.createRoute(categoryId)) {
                                popUpTo(Screen.Category.route)
                            }
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(54.dp),
                        shape = RoundedCornerShape(14.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF6C63FF)
                        )
                    ) {
                        Text(
                            text = "🔄  Nochmal spielen",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    // Navigate back to home screen
                    OutlinedButton(
                        onClick = {
                            navController.navigate(Screen.Home.route) {
                                popUpTo(Screen.Home.route) { inclusive = true }
                            }
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(54.dp),
                        shape = RoundedCornerShape(14.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = null,
                            modifier = Modifier.padding(end = 8.dp)
                        )
                        Text(
                            text = "Startseite",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ResultScreenPreview() {
    ResultScreen(
        score = 850,
        total = 10,
        correct = 8,
        categoryId = 1,
        navController = rememberNavController()
    )
}
