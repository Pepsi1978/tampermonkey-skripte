package com.quizverse.app.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.quizverse.app.ui.navigation.Screen
import com.quizverse.app.ui.theme.AnimalsEnd
import com.quizverse.app.ui.theme.AnimalsStart
import com.quizverse.app.ui.theme.DortmundEnd
import com.quizverse.app.ui.theme.DortmundStart
import com.quizverse.app.ui.theme.FilmEnd
import com.quizverse.app.ui.theme.FilmStart
import com.quizverse.app.ui.theme.FoodEnd
import com.quizverse.app.ui.theme.FoodStart
import com.quizverse.app.ui.theme.GeoEnd
import com.quizverse.app.ui.theme.GeoStart
import com.quizverse.app.ui.theme.HerthaEnd
import com.quizverse.app.ui.theme.HerthaStart
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

// Data model for a category displayed as a full-width row
private data class CategoryItem(
    val id: Int,
    val name: String,
    val emoji: String,
    val gradientStart: Color,
    val gradientEnd: Color,
    val subcategories: List<CategoryItem> = emptyList()
)

// ── Main categories — IDs MUST match categoryId in Question entities ────────
private val categories = listOf(
    CategoryItem(11, "Alle Kategorien", "\uD83C\uDF1F", MixedStart, MixedEnd),
    CategoryItem(1, "Weltgeographie", "\uD83C\uDF0D", GeoStart, GeoEnd),
    CategoryItem(2, "Wissenschaft & Natur", "\uD83D\uDD2C", ScienceStart, ScienceEnd),
    CategoryItem(3, "Geschichte", "\uD83D\uDCDC", HistoryStart, HistoryEnd),
    CategoryItem(4, "Film & Fernsehen", "\uD83C\uDFAC", FilmStart, FilmEnd),
    CategoryItem(5, "Musik", "\uD83C\uDFB5", MusicStart, MusicEnd),
    // Sport has Bundesliga subcategories
    CategoryItem(
        id = 6, name = "Sport", emoji = "\u26BD",
        gradientStart = SportStart, gradientEnd = SportEnd,
        subcategories = listOf(
            CategoryItem(13, "Hertha BSC", "\uD83D\uDC99", HerthaStart, HerthaEnd),
            CategoryItem(14, "Borussia Dortmund", "\uD83D\uDC9B", DortmundStart, DortmundEnd),
        )
    ),
    CategoryItem(7, "Technologie", "\uD83D\uDCBB", TechStart, TechEnd),
    CategoryItem(8, "Essen & Trinken", "\uD83C\uDF73", FoodStart, FoodEnd),
    CategoryItem(9, "Tierwelt", "\uD83D\uDC3E", AnimalsStart, AnimalsEnd),
    CategoryItem(10, "Sprache & Literatur", "\uD83D\uDCDA", LiteratureStart, LiteratureEnd),
    CategoryItem(12, "Logik & Denksport", "\uD83E\uDDE0", LogicStart, LogicEnd),
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
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item { Spacer(modifier = Modifier.height(4.dp)) }

            itemsIndexed(categories) { index, category ->
                CategoryRow(
                    category = category,
                    cardIndex = index,
                    animationDelayMillis = index * 50,
                    onCategoryClick = { id ->
                        navController.navigate(Screen.Difficulty.createRoute(id))
                    }
                )
            }

            item { Spacer(modifier = Modifier.height(16.dp)) }
        }
    }
}

// ── Full-width category row with neumorphic 3D style and floating animation ──
@Composable
private fun CategoryRow(
    category: CategoryItem,
    cardIndex: Int,
    animationDelayMillis: Int,
    onCategoryClick: (Int) -> Unit
) {
    val alpha = remember { Animatable(0f) }
    var expanded by remember { mutableStateOf(false) }
    val hasSubcategories = category.subcategories.isNotEmpty()

    // Entrance fade-in with stagger delay
    LaunchedEffect(Unit) {
        delay(animationDelayMillis.toLong())
        alpha.animateTo(1f, animationSpec = tween(350, easing = FastOutSlowInEasing))
    }

    // ── Continuous floating animation — each card gets unique timing ─────────
    // Base duration varies per card index to stagger the floating rhythm
    val floatDurationY = 2800 + cardIndex * 230
    val floatDurationX = 3600 + cardIndex * 180

    val floatTransition = rememberInfiniteTransition(label = "float_${category.id}")

    // Vertical bob: ±3.5dp, subtle and gentle
    val floatY = floatTransition.animateFloat(
        initialValue = -3.5f,
        targetValue = 3.5f,
        animationSpec = infiniteRepeatable(
            animation = tween(floatDurationY, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "float_y_${category.id}"
    )

    // Horizontal sway: ±2dp, even subtler
    val floatX = floatTransition.animateFloat(
        initialValue = -2f,
        targetValue = 2f,
        animationSpec = infiniteRepeatable(
            animation = tween(floatDurationX, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "float_x_${category.id}"
    )

    // ── Press interaction ────────────────────────────────────────────────────
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    // Card sinks down when pressed
    val pressTranslateY by animateFloatAsState(
        targetValue = if (isPressed) 5f else 0f,
        animationSpec = spring(stiffness = Spring.StiffnessHigh),
        label = "neu_translateY_${category.id}"
    )
    val pressScale by animateFloatAsState(
        targetValue = if (isPressed) 0.975f else 1f,
        animationSpec = spring(stiffness = Spring.StiffnessHigh),
        label = "neu_scale_${category.id}"
    )
    // Outer shadow: visible when raised, disappears when pressed
    val outerShadowAlpha by animateFloatAsState(
        targetValue = if (isPressed) 0f else 1f,
        animationSpec = tween(100),
        label = "neu_outerShadow_${category.id}"
    )
    // Inner shadow: appears when pressed (inset neumorphic look)
    val innerShadowAlpha by animateFloatAsState(
        targetValue = if (isPressed) 0.6f else 0f,
        animationSpec = tween(100),
        label = "neu_innerShadow_${category.id}"
    )
    // Top-left highlight edge intensity
    val highlightAlpha by animateFloatAsState(
        targetValue = if (isPressed) 0.08f else 0.5f,
        animationSpec = tween(100),
        label = "neu_highlight_${category.id}"
    )
    // Bottom-right shadow edge intensity
    val edgeShadowAlpha by animateFloatAsState(
        targetValue = if (isPressed) 0.5f else 0.25f,
        animationSpec = tween(100),
        label = "neu_edgeShadow_${category.id}"
    )

    val shape = RoundedCornerShape(16.dp)
    val cr = CornerRadius(16.dp.value, 16.dp.value)

    Column(modifier = Modifier.alpha(alpha.value)) {
        // Main category card — raw Box with neumorphic 3D style (no Card/CardDefaults)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .graphicsLayer {
                    scaleX = pressScale
                    scaleY = pressScale
                    // Combine float offset with press sink
                    translationY = (floatY.value + pressTranslateY).dp.toPx()
                    translationX = floatX.value.dp.toPx()
                    this.shape = shape
                    clip = false
                    // Neumorphic outer shadow — only visible when raised
                    shadowElevation = 10.dp.toPx() * outerShadowAlpha
                    ambientShadowColor = Color.Black.copy(alpha = 0.3f * outerShadowAlpha)
                    spotShadowColor = Color.Black.copy(alpha = 0.4f * outerShadowAlpha)
                }
                .clip(shape)
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(category.gradientStart, category.gradientEnd)
                    )
                )
                // ── Neumorphic 3D edges drawn over the gradient background ────
                .drawWithContent {
                    drawContent()

                    val w = size.width
                    val h = size.height

                    // Top highlight edge — bright white strip (light from top-left)
                    drawRoundRect(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.White.copy(alpha = highlightAlpha),
                                Color.Transparent
                            ),
                            startY = 0f,
                            endY = 6.dp.toPx()
                        ),
                        size = Size(w, 6.dp.toPx()),
                        cornerRadius = cr
                    )
                    // Left highlight edge
                    drawRoundRect(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color.White.copy(alpha = highlightAlpha * 0.7f),
                                Color.Transparent
                            ),
                            startX = 0f,
                            endX = 5.dp.toPx()
                        ),
                        size = Size(5.dp.toPx(), h),
                        cornerRadius = cr
                    )

                    // Bottom shadow edge — dark strip
                    drawRoundRect(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black.copy(alpha = edgeShadowAlpha)
                            ),
                            startY = h - 6.dp.toPx(),
                            endY = h
                        ),
                        topLeft = Offset(0f, h - 6.dp.toPx()),
                        size = Size(w, 6.dp.toPx()),
                        cornerRadius = cr
                    )
                    // Right shadow edge
                    drawRoundRect(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black.copy(alpha = edgeShadowAlpha * 0.6f)
                            ),
                            startX = w - 5.dp.toPx(),
                            endX = w
                        ),
                        topLeft = Offset(w - 5.dp.toPx(), 0f),
                        size = Size(5.dp.toPx(), h),
                        cornerRadius = cr
                    )

                    // Inner shadow overlay when pressed (inset neumorphic effect)
                    if (innerShadowAlpha > 0.01f) {
                        // Top-left inner shadow (dark = pushed in)
                        drawRoundRect(
                            brush = Brush.linearGradient(
                                colors = listOf(
                                    Color.Black.copy(alpha = innerShadowAlpha * 0.5f),
                                    Color.Transparent
                                ),
                                start = Offset(0f, 0f),
                                end = Offset(w * 0.3f, h * 0.3f)
                            ),
                            size = size,
                            cornerRadius = cr
                        )
                        // Bottom-right inner highlight (floor of pressed area)
                        drawRoundRect(
                            brush = Brush.linearGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.White.copy(alpha = innerShadowAlpha * 0.2f)
                                ),
                                start = Offset(w * 0.7f, h * 0.7f),
                                end = Offset(w, h)
                            ),
                            size = size,
                            cornerRadius = cr
                        )
                    }

                    // Thin white border stroke around the entire card
                    drawRoundRect(
                        color = Color.White.copy(alpha = highlightAlpha * 0.4f),
                        size = size,
                        cornerRadius = cr,
                        style = Stroke(width = 1.5.dp.toPx())
                    )
                }
                .clickable(
                    interactionSource = interactionSource,
                    indication = null // Visual feedback handled via neumorphic animations above
                ) {
                    if (hasSubcategories) {
                        expanded = !expanded
                    } else {
                        onCategoryClick(category.id)
                    }
                }
                .padding(horizontal = 20.dp, vertical = 16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                // Emoji in semi-transparent circle
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(RoundedCornerShape(14.dp))
                        .background(Color.White.copy(alpha = 0.2f)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = category.emoji, fontSize = 24.sp)
                }

                Spacer(modifier = Modifier.width(16.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = category.name,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    if (hasSubcategories) {
                        Text(
                            text = "${category.subcategories.size} Vereine",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.White.copy(alpha = 0.8f)
                        )
                    }
                }

                if (hasSubcategories) {
                    Icon(
                        imageVector = if (expanded) Icons.Default.KeyboardArrowUp
                        else Icons.Default.KeyboardArrowDown,
                        contentDescription = if (expanded) "Einklappen" else "Ausklappen",
                        tint = Color.White,
                        modifier = Modifier.size(28.dp)
                    )
                } else {
                    Text(
                        text = "\u203A",
                        fontSize = 24.sp,
                        color = Color.White.copy(alpha = 0.8f),
                        fontWeight = FontWeight.Light
                    )
                }
            }
        }

        // ── Clickable main "Sport allgemein" button when expanded ──
        if (hasSubcategories) {
            AnimatedVisibility(
                visible = expanded,
                enter = expandVertically(animationSpec = tween(250)),
                exit = shrinkVertically(animationSpec = tween(200))
            ) {
                Column(
                    modifier = Modifier.padding(start = 24.dp, top = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    // "Alle Sport-Fragen" button
                    SubcategoryCard(
                        emoji = "\u26BD",
                        name = "Sport allgemein",
                        gradientStart = category.gradientStart.copy(alpha = 0.7f),
                        gradientEnd = category.gradientEnd.copy(alpha = 0.7f),
                        onClick = { onCategoryClick(category.id) }
                    )

                    // Individual club subcategories
                    category.subcategories.forEach { sub ->
                        SubcategoryCard(
                            emoji = sub.emoji,
                            name = sub.name,
                            gradientStart = sub.gradientStart,
                            gradientEnd = sub.gradientEnd,
                            onClick = { onCategoryClick(sub.id) }
                        )
                    }
                }
            }
        }
    }
}

// ── Subcategory card with neumorphic 3D style (indented, slightly smaller) ───
@Composable
private fun SubcategoryCard(
    emoji: String,
    name: String,
    gradientStart: Color,
    gradientEnd: Color,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    // Press animations — same neumorphic pattern as the main card
    val pressTranslateY by animateFloatAsState(
        targetValue = if (isPressed) 5f else 0f,
        animationSpec = spring(stiffness = Spring.StiffnessHigh),
        label = "sub_translateY"
    )
    val pressScale by animateFloatAsState(
        targetValue = if (isPressed) 0.975f else 1f,
        animationSpec = spring(stiffness = Spring.StiffnessHigh),
        label = "sub_scale"
    )
    val outerShadowAlpha by animateFloatAsState(
        targetValue = if (isPressed) 0f else 1f,
        animationSpec = tween(100),
        label = "sub_outerShadow"
    )
    val innerShadowAlpha by animateFloatAsState(
        targetValue = if (isPressed) 0.6f else 0f,
        animationSpec = tween(100),
        label = "sub_innerShadow"
    )
    val highlightAlpha by animateFloatAsState(
        targetValue = if (isPressed) 0.08f else 0.5f,
        animationSpec = tween(100),
        label = "sub_highlight"
    )
    val edgeShadowAlpha by animateFloatAsState(
        targetValue = if (isPressed) 0.5f else 0.25f,
        animationSpec = tween(100),
        label = "sub_edgeShadow"
    )

    val shape = RoundedCornerShape(12.dp)
    val cr = CornerRadius(12.dp.value, 12.dp.value)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .graphicsLayer {
                scaleX = pressScale
                scaleY = pressScale
                translationY = pressTranslateY.dp.toPx()
                this.shape = shape
                clip = false
                shadowElevation = 8.dp.toPx() * outerShadowAlpha
                ambientShadowColor = Color.Black.copy(alpha = 0.3f * outerShadowAlpha)
                spotShadowColor = Color.Black.copy(alpha = 0.4f * outerShadowAlpha)
            }
            .clip(shape)
            .background(
                Brush.horizontalGradient(
                    colors = listOf(gradientStart, gradientEnd)
                )
            )
            // ── Neumorphic 3D edges for subcategory card ──────────────────
            .drawWithContent {
                drawContent()

                val w = size.width
                val h = size.height

                // Top highlight edge
                drawRoundRect(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.White.copy(alpha = highlightAlpha),
                            Color.Transparent
                        ),
                        startY = 0f,
                        endY = 5.dp.toPx()
                    ),
                    size = Size(w, 5.dp.toPx()),
                    cornerRadius = cr
                )
                // Left highlight edge
                drawRoundRect(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color.White.copy(alpha = highlightAlpha * 0.7f),
                            Color.Transparent
                        ),
                        startX = 0f,
                        endX = 4.dp.toPx()
                    ),
                    size = Size(4.dp.toPx(), h),
                    cornerRadius = cr
                )

                // Bottom shadow edge
                drawRoundRect(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black.copy(alpha = edgeShadowAlpha)
                        ),
                        startY = h - 5.dp.toPx(),
                        endY = h
                    ),
                    topLeft = Offset(0f, h - 5.dp.toPx()),
                    size = Size(w, 5.dp.toPx()),
                    cornerRadius = cr
                )
                // Right shadow edge
                drawRoundRect(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black.copy(alpha = edgeShadowAlpha * 0.6f)
                        ),
                        startX = w - 4.dp.toPx(),
                        endX = w
                    ),
                    topLeft = Offset(w - 4.dp.toPx(), 0f),
                    size = Size(4.dp.toPx(), h),
                    cornerRadius = cr
                )

                // Inner shadow when pressed
                if (innerShadowAlpha > 0.01f) {
                    drawRoundRect(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color.Black.copy(alpha = innerShadowAlpha * 0.5f),
                                Color.Transparent
                            ),
                            start = Offset(0f, 0f),
                            end = Offset(w * 0.3f, h * 0.3f)
                        ),
                        size = size,
                        cornerRadius = cr
                    )
                    drawRoundRect(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.White.copy(alpha = innerShadowAlpha * 0.2f)
                            ),
                            start = Offset(w * 0.7f, h * 0.7f),
                            end = Offset(w, h)
                        ),
                        size = size,
                        cornerRadius = cr
                    )
                }

                // Thin white border stroke
                drawRoundRect(
                    color = Color.White.copy(alpha = highlightAlpha * 0.4f),
                    size = size,
                    cornerRadius = cr,
                    style = Stroke(width = 1.5.dp.toPx())
                )
            }
            .clickable(
                interactionSource = interactionSource,
                indication = null // Visual feedback handled via neumorphic animations above
            ) { onClick() }
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.White.copy(alpha = 0.2f)),
                contentAlignment = Alignment.Center
            ) {
                Text(text = emoji, fontSize = 18.sp)
            }

            Spacer(modifier = Modifier.width(12.dp))

            Text(
                text = name,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                modifier = Modifier.weight(1f)
            )

            Text(
                text = "\u203A",
                fontSize = 20.sp,
                color = Color.White.copy(alpha = 0.7f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CategoryScreenPreview() {
    CategoryScreen(navController = rememberNavController())
}
