package com.entropyjournal.ui.screens.journal

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Cloud
import androidx.compose.material.icons.rounded.CloudDone
import androidx.compose.material.icons.rounded.CloudOff
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults.SecondaryIndicator
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.entropyjournal.ui.components.AnimatedMicButton
import com.entropyjournal.ui.components.GlassCard
import com.entropyjournal.ui.components.ShimmerLoadingEffect
import com.entropyjournal.ui.components.TimelineItem
import com.entropyjournal.ui.theme.CosmosBlack
import com.entropyjournal.ui.theme.CosmosDeep
import com.entropyjournal.ui.theme.CosmosSurface
import com.entropyjournal.ui.theme.NeonCyan
import com.entropyjournal.ui.theme.NeonEmerald
import com.entropyjournal.ui.theme.NeonRed
import com.entropyjournal.ui.theme.TextMuted
import com.entropyjournal.ui.theme.TextPrimary
import com.entropyjournal.ui.theme.TextSecondary

@Composable
fun JournalScreen(
    viewModel: JournalViewModel,
    onEntryClick: (Long) -> Unit
) {
    val entries by viewModel.entries.collectAsState()
    val uiState by viewModel.uiState.collectAsState()
    val amplitude by viewModel.amplitude.collectAsState()
    val duration by viewModel.durationSeconds.collectAsState()
    val snackbarHostState = remember { SnackbarHostState() }

    LaunchedEffect(uiState.errorMessage) {
        uiState.errorMessage?.let {
            snackbarHostState.showSnackbar(it)
            viewModel.clearError()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(CosmosBlack)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Search bar
            AnimatedVisibility(visible = uiState.isSearchActive) {
                TextField(
                    value = uiState.searchQuery,
                    onValueChange = { viewModel.setSearchQuery(it) },
                    placeholder = { Text("Einträge durchsuchen...", color = TextMuted) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = CosmosDeep,
                        unfocusedContainerColor = CosmosDeep,
                        focusedTextColor = TextPrimary,
                        cursorColor = NeonCyan,
                        focusedIndicatorColor = NeonCyan,
                        unfocusedIndicatorColor = Color.Transparent
                    ),
                    trailingIcon = {
                        IconButton(onClick = { viewModel.toggleSearch() }) {
                            Icon(Icons.Rounded.Close, "Suche schließen", tint = TextSecondary)
                        }
                    },
                    singleLine = true,
                    shape = RoundedCornerShape(12.dp)
                )
            }

            // Sync status + search toggle
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Tagebuch",
                    style = MaterialTheme.typography.headlineMedium
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = when (uiState.syncStatus) {
                            SyncStatus.SYNCED -> Icons.Rounded.CloudDone
                            SyncStatus.ERROR -> Icons.Rounded.CloudOff
                            else -> Icons.Rounded.Cloud
                        },
                        contentDescription = "Sync-Status",
                        tint = when (uiState.syncStatus) {
                            SyncStatus.SYNCED -> NeonEmerald
                            SyncStatus.SYNCING -> NeonCyan
                            SyncStatus.ERROR -> NeonRed
                            else -> TextMuted
                        },
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    IconButton(onClick = { viewModel.toggleSearch() }) {
                        Icon(Icons.Rounded.Search, "Suchen", tint = TextSecondary)
                    }
                }
            }

            // Entry list
            if (uiState.recordingState == RecordingState.TRANSCRIBING) {
                Column(modifier = Modifier.padding(16.dp)) {
                    ShimmerLoadingEffect(height = 20.dp)
                    Spacer(modifier = Modifier.height(8.dp))
                    ShimmerLoadingEffect(height = 16.dp, modifier = Modifier.fillMaxWidth(0.7f))
                    Spacer(modifier = Modifier.height(16.dp))
                    Text("Transkribiere...", color = TextSecondary, style = MaterialTheme.typography.bodyMedium)
                }
            }

            if (entries.isEmpty() && uiState.recordingState == RecordingState.IDLE) {
                Box(
                    modifier = Modifier.weight(1f).fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("Noch keine Einträge", style = MaterialTheme.typography.titleLarge, color = TextMuted)
                        Spacer(modifier = Modifier.height(8.dp))
                        Text("Tippe auf das Mikrofon um zu starten", style = MaterialTheme.typography.bodyMedium, color = TextMuted, textAlign = TextAlign.Center)
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier.weight(1f),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(entries, key = { it.id }) { entry ->
                        TimelineItem(
                            entry = entry,
                            onClick = { onEntryClick(entry.id) }
                        )
                    }
                }
            }
        }

        // Recording overlay
        AnimatedVisibility(
            visible = uiState.recordingState == RecordingState.RECORDING,
            enter = fadeIn() + slideInVertically { it },
            exit = fadeOut() + slideOutVertically { it },
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            RecordingOverlay(
                amplitude = amplitude,
                durationSeconds = duration
            )
        }

        // Mic button
        AnimatedMicButton(
            isRecording = uiState.recordingState == RecordingState.RECORDING,
            onClick = { viewModel.toggleRecording() },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp)
        )

        // Preview dialog
        if (uiState.showPreviewDialog) {
            PreviewDialog(
                rawText = uiState.rawText,
                improvedText = uiState.improvedText,
                isImproving = uiState.recordingState == RecordingState.IMPROVING,
                onImproveClick = { viewModel.improveText() },
                onSave = { viewModel.saveEntry() },
                onDismiss = { viewModel.dismissPreview() }
            )
        }

        SnackbarHost(
            hostState = snackbarHostState,
            modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 100.dp)
        ) { data ->
            Snackbar(snackbarData = data, containerColor = CosmosDeep, contentColor = TextPrimary)
        }
    }
}

@Composable
private fun PreviewDialog(
    rawText: String,
    improvedText: String?,
    isImproving: Boolean,
    onImproveClick: () -> Unit,
    onSave: () -> Unit,
    onDismiss: () -> Unit
) {
    var selectedTab by remember { mutableIntStateOf(0) }

    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = CosmosDeep,
        title = { Text("Neuer Eintrag", color = TextPrimary) },
        text = {
            Column {
                if (improvedText != null) {
                    TabRow(
                        selectedTabIndex = selectedTab,
                        containerColor = Color.Transparent,
                        contentColor = NeonCyan,
                        indicator = { tabPositions ->
                            if (selectedTab < tabPositions.size) {
                                SecondaryIndicator(
                                    Modifier.tabIndicatorOffset(tabPositions[selectedTab]),
                                    color = NeonCyan
                                )
                            }
                        }
                    ) {
                        Tab(selected = selectedTab == 0, onClick = { selectedTab = 0 }) {
                            Text("Original", modifier = Modifier.padding(8.dp), color = if (selectedTab == 0) NeonCyan else TextMuted)
                        }
                        Tab(selected = selectedTab == 1, onClick = { selectedTab = 1 }) {
                            Text("Verbessert", modifier = Modifier.padding(8.dp), color = if (selectedTab == 1) NeonCyan else TextMuted)
                        }
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                }

                Text(
                    text = if (selectedTab == 1 && improvedText != null) improvedText else rawText,
                    style = MaterialTheme.typography.bodyLarge,
                    color = TextPrimary
                )

                if (improvedText == null && !isImproving) {
                    Spacer(modifier = Modifier.height(12.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("Text verbessern", color = TextSecondary, style = MaterialTheme.typography.bodyMedium)
                        Spacer(modifier = Modifier.width(8.dp))
                        Switch(
                            checked = false,
                            onCheckedChange = { onImproveClick() },
                            colors = SwitchDefaults.colors(checkedTrackColor = NeonCyan)
                        )
                    }
                }

                if (isImproving) {
                    Spacer(modifier = Modifier.height(12.dp))
                    ShimmerLoadingEffect(height = 16.dp)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Optimiere Text...", color = TextSecondary, style = MaterialTheme.typography.bodyMedium)
                }
            }
        },
        confirmButton = {
            Button(
                onClick = onSave,
                colors = ButtonDefaults.buttonColors(containerColor = NeonCyan, contentColor = CosmosBlack)
            ) { Text("Speichern") }
        },
        dismissButton = {
            OutlinedButton(
                onClick = onDismiss,
                colors = ButtonDefaults.outlinedButtonColors(contentColor = TextSecondary)
            ) { Text("Verwerfen") }
        }
    )
}
