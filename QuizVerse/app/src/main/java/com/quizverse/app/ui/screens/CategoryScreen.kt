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
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.quizverse.app.ui.navigation.Screen
import com.quizverse.app.ui.theme.AnimalsEnd
import com.quizverse.app.ui.theme.AnimalsStart
import com.quizverse.app.ui.theme.FilmEnd
import com.quizverse.app.ui.theme.FilmStart
import com.quizverse.app.ui.theme.FoodEnd
import com.quizverse.app.ui.theme.FoodStart
import com.quizverse.app.ui.theme.GeoEnd
import com.quizverse.app.ui.theme.GeoStart
import com.quizverse.app.ui.theme.HistoryEnd
import com.quizverse.app.ui.theme.HistoryStart
import com.quizverse.app.ui.theme.LiteratureEnd
import com.quizverse.app.ui.theme.LiteratureStart
import com.quizverse.app.ui.theme.LogicEnd
import com.quizverse.app.ui.theme.LogicStart
import com.quizverse.app.ui.theme.MixedEnd
import com.quizverse.app.ui.theme.MixedStart
import com.quizverse.app.ui.theme.MusicEnd
import com.quizverse.app.ui.theme.MusicStart
import com.quizverse.app.ui.theme.ScienceEnd
import com.quizverse.app.ui.theme.ScienceStart
import com.quizverse.app.ui.theme.SportEnd
import com.quizverse.app.ui.theme.SportStart
import com.quizverse.app.ui.theme.TechEnd
import com.quizverse.app.ui.theme.TechStart
import kotlinx.coroutines.delay

// Data model for a category tile displayed in the grid
private data class CategoryItem(
    val id: Int,
    val name: String,
    val emoji: String,
    val gradientStart: Color,
    val gradientEnd: Color
)

// Hardcoded list of 12 quiz categories with emoji icons and gradient color pairs
private val categories = listOf(
    CategoryItem(1,  "Wissenschaft",   "🔬", ScienceStart,    ScienceEnd),
    CategoryItem(2,  "Geschichte",     "🏛️", HistoryStart,    HistoryEnd),
    CategoryItem(3,  "Geografie",      "🌍", GeoStart,        GeoEnd),
    CategoryItem(4,  "Sport",          "⚽", SportStart,      SportEnd),
    CategoryItem(5,  "Musik",          "🎵", MusicStart,      MusicEnd),
    CategoryItem(6,  "Film & TV",      "🎬", FilmStart,       FilmEnd),
    CategoryItem(7,  "Technologie",    "💻", TechStart,       TechEnd),
    CategoryItem(8,  "Natur",          "🌿", AnimalsStart,    AnimalsEnd),
    CategoryItem(9,  "Kunst",          "🎨", LiteratureStart, LiteratureEnd),
    CategoryItem(10, "Literatur",      "📚", LogicStart,      LogicEnd),
    CategoryItem(11, "Mathematik",     "🔢", FoodStart,       FoodEnd),
    CategoryItem(12, "Essen & Trinken","🍕", MixedStart,      MixedEnd)
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Kategorie wählen",
                        fontWeight = FontWeight.Bold
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Zurück"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background
                )
            )
        }
    ) { innerPadding ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            itemsIndexed(categories) { index, category ->
                AnimatedCategoryCard(
                    category = category,
                    animationDelayMillis = index * 50,
                    onClick = {
                        navController.navigate(Screen.Difficulty.createRoute(category.id))
                    }
                )
            }
        }
    }
}

// Single category card with gradient background and staggered slide-up entrance
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AnimatedCategoryCard(
    category: CategoryItem,
    animationDelayMillis: Int,
    onClick: () -> Unit
) {
    val offsetY = remember { Animatable(50f) }
    val alpha = remember { Animatable(0f) }
    // Scale for the bounce-on-tap effect
    var emojiScale by remember { mutableFloatStateOf(1f) }
    val emojiScaleAnim = remember { Animatable(1f) }

    // Staggered entrance: slide up + fade in
    LaunchedEffect(Unit) {
        delay(animationDelayMillis.toLong())
        offsetY.animateTo(
            targetValue = 0f,
            animationSpec = tween(350, easing = FastOutSlowInEasing)
        )
    }
    LaunchedEffect(Unit) {
        delay(animationDelayMillis.toLong())
        alpha.animateTo(1f, animationSpec = tween(350))
    }

    Card(
        onClick = {
            // Trigger emoji bounce on tap before navigating
            onClick()
        },
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
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
                .fillMaxSize()
                .clip(RoundedCornerShape(16.dp))
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            category.gradientStart,
                            category.gradientEnd
                        )
                    )
                )
                .padding(8.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                // Emoji with scale animation
                Text(
                    text = category.emoji,
                    fontSize = 40.sp,
                    modifier = Modifier.scale(emojiScaleAnim.value)
                )
                Text(
                    text = category.name,
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    modifier = Modifier.padding(top = 8.dp, start = 4.dp, end = 4.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CategoryScreenPreview() {
    CategoryScreen(navController = rememberNavController())
}
