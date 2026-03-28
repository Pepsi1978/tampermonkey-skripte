package com.entropyjournal.ui.screens.entrydetail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults.SecondaryIndicator
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.entropyjournal.ui.components.GlassCard
import com.entropyjournal.ui.components.NeonDivider
import com.entropyjournal.ui.theme.CosmosBlack
import com.entropyjournal.ui.theme.CosmosDeep
import com.entropyjournal.ui.theme.CosmosLayer
import com.entropyjournal.ui.theme.NeonAmber
import com.entropyjournal.ui.theme.NeonCyan
import com.entropyjournal.ui.theme.NeonEmerald
import com.entropyjournal.ui.theme.NeonRed
import com.entropyjournal.ui.theme.TextMuted
import com.entropyjournal.ui.theme.TextPrimary
import com.entropyjournal.ui.theme.TextSecondary
import com.entropyjournal.util.DateTimeFormatter

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun EntryDetailScreen(
    viewModel: EntryDetailViewModel,
    onBack: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(uiState.isDeleted) {
        if (uiState.isDeleted) onBack()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(CosmosBlack)
    ) {
        TopAppBar(
            title = { Text("Eintrag", color = TextPrimary) },
            navigationIcon = {
                IconButton(onClick = onBack) {
                    Icon(Icons.AutoMirrored.Rounded.ArrowBack, "Zurück", tint = TextPrimary)
                }
            },
            actions = {
                IconButton(onClick = { viewModel.showDeleteDialog(true) }) {
                    Icon(Icons.Rounded.Delete, "Löschen", tint = NeonRed)
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent)
        )

        uiState.entry?.let { entry ->
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Timestamp and mood
                GlassCard {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(DateTimeFormatter.formatFull(entry.timestamp), style = MaterialTheme.typography.labelMedium)
                            Text(DateTimeFormatter.formatRelative(entry.timestamp), style = MaterialTheme.typography.labelMedium, color = TextMuted)
                        }
                        Text(
                            text = when (entry.moodTag) {
                                "positiv" -> "\uD83D\uDFE2"
                                "belastend" -> "\uD83D\uDD34"
                                else -> "\uD83D\uDFE1"
                            },
                            modifier = Modifier.size(28.dp)
                        )
                    }
                }

                // Entropy score
                entry.entropyScore?.let { score ->
                    GlassCard(
                        glowColor = when {
                            score < 0.33f -> NeonEmerald
                            score < 0.66f -> NeonAmber
                            else -> NeonRed
                        }
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("Entropie-Score: ", style = MaterialTheme.typography.bodyMedium, color = TextSecondary)
                            Text(
                                text = String.format("%.0f%%", score * 100),
                                style = MaterialTheme.typography.titleMedium,
                                color = when {
                                    score < 0.33f -> NeonEmerald
                                    score < 0.66f -> NeonAmber
                                    else -> NeonRed
                                }
                            )
                        }
                    }
                }

                // Text content with tab switching
                var selectedTab by remember { mutableIntStateOf(0) }

                if (entry.isImproved && entry.improvedText != null) {
                    TabRow(
                        selectedTabIndex = selectedTab,
                        containerColor = Color.Transparent,
                        contentColor = NeonCyan,
                        indicator = { tabPositions ->
                            if (selectedTab < tabPositions.size) {
                                SecondaryIndicator(Modifier.tabIndicatorOffset(tabPositions[selectedTab]), color = NeonCyan)
                            }
                        }
                    ) {
                        Tab(selected = selectedTab == 0, onClick = { selectedTab = 0 }) {
                            Text("Verbessert", modifier = Modifier.padding(8.dp), color = if (selectedTab == 0) NeonCyan else TextMuted)
                        }
                        Tab(selected = selectedTab == 1, onClick = { selectedTab = 1 }) {
                            Text("Original", modifier = Modifier.padding(8.dp), color = if (selectedTab == 1) NeonCyan else TextMuted)
                        }
                    }
                }

                GlassCard {
                    Text(
                        text = if (selectedTab == 1) entry.rawText else entry.displayText,
                        style = MaterialTheme.typography.bodyLarge
                    )
                }

                // Category tags
                if (!entry.adviceCategoryTags.isNullOrBlank()) {
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        entry.adviceCategoryTags.split(",").map { it.trim() }.filter { it.isNotBlank() }.forEach { tag ->
                            Surface(shape = RoundedCornerShape(8.dp), color = CosmosLayer) {
                                Text(tag, modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp), style = MaterialTheme.typography.labelMedium, color = NeonCyan)
                            }
                        }
                    }
                }

                // Recording duration
                Text(
                    text = "Aufnahmedauer: ${DateTimeFormatter.formatDuration(entry.audioDurationSeconds)}",
                    style = MaterialTheme.typography.labelMedium,
                    color = TextMuted
                )

                Spacer(modifier = Modifier.height(80.dp))
            }
        }
    }

    // Delete dialog
    if (uiState.showDeleteDialog) {
        AlertDialog(
            onDismissRequest = { viewModel.showDeleteDialog(false) },
            containerColor = CosmosDeep,
            title = { Text("Eintrag löschen?", color = TextPrimary) },
            text = { Text("Diesen Eintrag unwiderruflich löschen?", color = TextSecondary) },
            confirmButton = {
                Button(
                    onClick = { viewModel.deleteEntry() },
                    colors = ButtonDefaults.buttonColors(containerColor = NeonRed)
                ) { Text("Löschen") }
            },
            dismissButton = {
                OutlinedButton(onClick = { viewModel.showDeleteDialog(false) }) { Text("Abbrechen", color = TextSecondary) }
            }
        )
    }
}
