package com.entropyjournal.ui.screens.dashboard

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.entropyjournal.domain.model.Advice
import com.entropyjournal.domain.model.AdvicePriority
import com.entropyjournal.ui.components.AdviceCategoryCard
import com.entropyjournal.ui.components.GlassCard
import com.entropyjournal.ui.components.NeonDivider
import com.entropyjournal.ui.components.ParticleBackground
import com.entropyjournal.ui.components.PulsingOrb
import com.entropyjournal.ui.components.ShimmerLoadingEffect
import com.entropyjournal.ui.theme.CosmosBlack
import com.entropyjournal.ui.theme.NeonAmber
import com.entropyjournal.ui.theme.NeonCyan
import com.entropyjournal.ui.theme.NeonRed
import com.entropyjournal.ui.theme.TextMuted
import com.entropyjournal.ui.theme.TextPrimary
import com.entropyjournal.ui.theme.TextSecondary

@Composable
fun DashboardScreen(viewModel: DashboardViewModel) {
    val blocks by viewModel.adviceBlocks.collectAsState()
    val uiState by viewModel.uiState.collectAsState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(CosmosBlack)
    ) {
        ParticleBackground()

        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Dashboard", style = MaterialTheme.typography.headlineMedium)
                    IconButton(onClick = { viewModel.refreshDashboard() }) {
                        Icon(Icons.Rounded.Refresh, "Aktualisieren", tint = NeonCyan)
                    }
                }
            }

            if (uiState.isLoading) {
                item {
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        ShimmerLoadingEffect(height = 80.dp, cornerRadius = 20.dp)
                        ShimmerLoadingEffect(height = 40.dp, cornerRadius = 12.dp)
                        Text("Dashboard wird aktualisiert...", color = TextSecondary, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }

            if (blocks.isEmpty() && !uiState.isLoading) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("Noch keine Analyse", style = MaterialTheme.typography.titleLarge, color = TextMuted)
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                "Erstelle mindestens 3 Tagebucheintr\u00e4ge,\ndann analysiert die KI deine Muster.",
                                style = MaterialTheme.typography.bodyMedium,
                                color = TextMuted,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }

            if (blocks.isNotEmpty()) {
                // Overall analysis card with average entropy orb
                item {
                    val overallAnalysis = blocks.firstOrNull()?.overallAnalysis ?: ""
                    val avgEntropy = blocks.map { it.entropyLevel }.average().toFloat()

                    GlassCard(glowColor = NeonCyan, glowIntensity = 0.2f) {
                        Column {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                PulsingOrb(entropyLevel = avgEntropy, size = 48.dp)
                                Spacer(modifier = Modifier.width(12.dp))
                                Text("Gesamtanalyse", style = MaterialTheme.typography.titleLarge)
                            }
                            Spacer(modifier = Modifier.height(12.dp))
                            Text(
                                text = overallAnalysis,
                                style = MaterialTheme.typography.bodyLarge,
                                color = TextSecondary
                            )
                        }
                    }
                }

                // Horizontally scrollable category chips
                item {
                    Row(
                        modifier = Modifier.horizontalScroll(rememberScrollState()),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        blocks.forEachIndexed { index, block ->
                            AdviceCategoryCard(
                                block = block,
                                isSelected = index == uiState.selectedCategoryIndex,
                                onClick = { viewModel.selectCategory(index) }
                            )
                        }
                    }
                }

                // Summary and advice list for the selected category
                val selectedBlock = blocks.getOrNull(uiState.selectedCategoryIndex)
                if (selectedBlock != null) {
                    item {
                        NeonDivider()
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = selectedBlock.categorySummary,
                            style = MaterialTheme.typography.bodyMedium,
                            color = TextSecondary
                        )
                    }

                    itemsIndexed(selectedBlock.advices) { _, advice ->
                        AdviceCard(advice = advice)
                    }
                }
            }
        }
    }
}

@Composable
private fun AdviceCard(advice: Advice) {
    GlassCard(
        glowColor = when (advice.priority) {
            AdvicePriority.HIGH -> NeonRed
            AdvicePriority.MEDIUM -> NeonAmber
            AdvicePriority.LOW -> NeonCyan
        },
        glowIntensity = 0.1f
    ) {
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = when (advice.priority) {
                        AdvicePriority.HIGH -> "\uD83D\uDD34"
                        AdvicePriority.MEDIUM -> "\uD83D\uDFE0"
                        AdvicePriority.LOW -> "\uD83D\uDD35"
                    }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = advice.title,
                    style = MaterialTheme.typography.titleMedium,
                    color = TextPrimary
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = advice.description,
                style = MaterialTheme.typography.bodyMedium,
                color = TextSecondary
            )
            if (advice.connection.isNotBlank()) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "\u2197 ${advice.connection}",
                    style = MaterialTheme.typography.labelMedium,
                    color = NeonCyan.copy(alpha = 0.7f)
                )
            }
        }
    }
}
