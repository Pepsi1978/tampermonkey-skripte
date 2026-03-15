package com.quizverse.app.ui.screens

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.quizverse.app.QuizVerseApp
import com.quizverse.app.ui.navigation.Screen
import com.quizverse.app.ui.theme.Accent
import com.quizverse.app.ui.theme.Primary
import com.quizverse.app.ui.theme.Secondary
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.delay

// Data model for a home screen navigation card
private data class HomeCard(
    val emoji: String,
    val title: String,
    val description: String,
    val gradientStart: Color,
    val gradientEnd: Color,
    val route: String
)

// Navigation cards displayed on the home screen
private val homeCards = listOf(
    HomeCard(
        emoji = "🎯",
        title = "Quiz starten",
        description = "Wähle eine Kategorie und teste dein Wissen",
        gradientStart = Primary,
        gradientEnd = Color(0xFFA855F7),
        route = Screen.Category.route
    ),
    HomeCard(
        emoji = "⚡",
        title = "Tägliche Herausforderung",
        description = "Neues Quiz jeden Tag – bleib am Ball!",
        gradientStart = Secondary,
        gradientEnd = Color(0xFFF43F5E),
        route = Screen.DailyChallenge.route
    ),
    HomeCard(
        emoji = "🏆",
        title = "Bestenliste",
        description = "Sieh wie du gegen andere abschneidest",
        gradientStart = Color(0xFFF59E0B),
        gradientEnd = Color(0xFFEF4444),
        route = Screen.Leaderboard.route
    ),
    HomeCard(
        emoji = "👤",
        title = "Profil",
        description = "Deine Statistiken und Erfolge im Überblick",
        gradientStart = Accent,
        gradientEnd = Color(0xFF06B6D4),
        route = Screen.Profile.route
    ),
    HomeCard(
        emoji = "⚙️",
        title = "Einstellungen",
        description = "App nach deinen Wünschen anpassen",
        gradientStart = Color(0xFF6366F1),
        gradientEnd = Color(0xFF8B5CF6),
        route = Screen.Settings.route
    )
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    val app = LocalContext.current.applicationContext as QuizVerseApp

    // Entrance animation for the logo/title
    val logoScale = remember { Animatable(0.6f) }
    val logoAlpha = remember { Animatable(0f) }
    val subtitleAlpha = remember { Animatable(0f) }

    LaunchedEffect(Unit) {
        // Animate logo with a spring bounce
        logoScale.animateTo(
            targetValue = 1f,
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
            )
        )
    }
    LaunchedEffect(Unit) {
        logoAlpha.animateTo(1f, animationSpec = tween(500))
        delay(200)
        subtitleAlpha.animateTo(1f, animationSpec = tween(600))
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        // Subtle top gradient decoration
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Primary.copy(alpha = 0.12f),
                            Color.Transparent
                        )
                    )
                )
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(56.dp))

            // Animated app logo emoji
            Text(
                text = "🧠",
                fontSize = 64.sp,
                modifier = Modifier
                    .scale(logoScale.value)
                    .alpha(logoAlpha.value)
            )

            Spacer(modifier = Modifier.height(12.dp))

            // App title with entrance animation
            Text(
                text = "QuizVerse",
                style = MaterialTheme.typography.displayMedium,
                fontWeight = FontWeight.ExtraBold,
                color = Primary,
                modifier = Modifier
                    .scale(logoScale.value)
                    .alpha(logoAlpha.value)
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Subtitle with fade-in
            Text(
                text = "Wissen ist Abenteuer",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.alpha(subtitleAlpha.value)
            )

            Spacer(modifier = Modifier.height(40.dp))

            // Navigation cards with staggered entrance animations
            homeCards.forEachIndexed { index, card ->
                AnimatedHomeCard(
                    card = card,
                    delayMillis = 300 + index * 80,
                    onClick = {
                        if (card.route == Screen.Category.route) {
                            app.soundManager.playCheerStart()
                        }
                        navController.navigate(card.route)
                    }
                )
                Spacer(modifier = Modifier.height(12.dp))
            }

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

// Single navigation card with slide-up + fade entrance animation
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AnimatedHomeCard(
    card: HomeCard,
    delayMillis: Int,
    onClick: () -> Unit
) {
    val offsetY = remember { Animatable(40f) }
    val alpha = remember { Animatable(0f) }

    LaunchedEffect(Unit) {
        delay(delayMillis.toLong())
        // Animate both offset and alpha in parallel
        offsetY.animateTo(
            targetValue = 0f,
            animationSpec = tween(400, easing = FastOutSlowInEasing)
        )
    }
    LaunchedEffect(Unit) {
        delay(delayMillis.toLong())
        alpha.animateTo(1f, animationSpec = tween(400))
    }

    Card(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .alpha(alpha.value),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp,
            pressedElevation = 8.dp
        ),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(card.gradientStart, card.gradientEnd)
                    )
                )
                .padding(horizontal = 20.dp, vertical = 18.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Category emoji in a semi-transparent circle
                Box(
                    modifier = Modifier
                        .size(52.dp)
                        .clip(RoundedCornerShape(14.dp))
                        .background(Color.White.copy(alpha = 0.2f)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = card.emoji,
                        fontSize = 26.sp
                    )
                }

                // Title and description
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = card.title,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = card.description,
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.White.copy(alpha = 0.85f)
                    )
                }

                // Arrow indicator
                Text(
                    text = "›",
                    fontSize = 24.sp,
                    color = Color.White.copy(alpha = 0.8f),
                    fontWeight = FontWeight.Light
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}
