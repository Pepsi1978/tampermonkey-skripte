package com.entropyjournal.ui.screens.settings

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Visibility
import androidx.compose.material.icons.rounded.VisibilityOff
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.entropyjournal.ui.components.GlassCard
import com.entropyjournal.ui.components.NeonDivider
import com.entropyjournal.ui.theme.CosmosBlack
import com.entropyjournal.ui.theme.CosmosDeep
import com.entropyjournal.ui.theme.CosmosSurface
import com.entropyjournal.ui.theme.NeonCyan
import com.entropyjournal.ui.theme.NeonRed
import com.entropyjournal.ui.theme.TextMuted
import com.entropyjournal.ui.theme.TextPrimary
import com.entropyjournal.ui.theme.TextSecondary
import com.entropyjournal.util.DateTimeFormatter

@Composable
fun SettingsScreen(
    viewModel: SettingsViewModel,
    onSignOut: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(CosmosBlack)
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("Einstellungen", style = MaterialTheme.typography.headlineMedium)

        // Account section
        GlassCard {
            Column {
                Text("Konto", style = MaterialTheme.typography.titleMedium, color = NeonCyan)
                Spacer(modifier = Modifier.height(12.dp))
                uiState.userProfile?.let { profile ->
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        androidx.compose.foundation.layout.Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(CosmosSurface),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = profile.displayName.take(1).uppercase(),
                                style = MaterialTheme.typography.titleMedium,
                                color = NeonCyan
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(profile.displayName, style = MaterialTheme.typography.bodyLarge)
                            Text(profile.email, style = MaterialTheme.typography.bodyMedium, color = TextSecondary)
                        }
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    uiState.lastSyncTimestamp?.let { ts ->
                        Text(
                            "Letzte Synchronisation: ${DateTimeFormatter.formatFull(ts)}",
                            style = MaterialTheme.typography.labelMedium
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Button(
                            onClick = { viewModel.syncNow() },
                            enabled = !uiState.isSyncing,
                            colors = ButtonDefaults.buttonColors(containerColor = NeonCyan, contentColor = CosmosBlack)
                        ) { Text(if (uiState.isSyncing) "Synchronisiere..." else "Jetzt synchronisieren") }
                        OutlinedButton(
                            onClick = { viewModel.showLogoutDialog(true) },
                            colors = ButtonDefaults.outlinedButtonColors(contentColor = NeonRed)
                        ) { Text("Abmelden") }
                    }
                    uiState.syncMessage?.let { msg ->
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(msg, style = MaterialTheme.typography.labelMedium, color = TextSecondary)
                    }
                }
            }
        }

        // API Keys section
        GlassCard {
            Column {
                Text("API-Schlüssel", style = MaterialTheme.typography.titleMedium, color = NeonCyan)
                Spacer(modifier = Modifier.height(12.dp))
                ApiKeyField(
                    label = "Groq API-Key",
                    value = uiState.groqApiKey,
                    onValueChange = { viewModel.updateGroqApiKey(it) }
                )
                Spacer(modifier = Modifier.height(8.dp))
                ApiKeyField(
                    label = "Gemini API-Key",
                    value = uiState.geminiApiKey,
                    onValueChange = { viewModel.updateGeminiApiKey(it) }
                )
            }
        }

        // Text improvement section
        GlassCard {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text("Textverbesserung", style = MaterialTheme.typography.titleMedium, color = NeonCyan)
                    Text("Standardmäßig aktivieren", style = MaterialTheme.typography.bodyMedium, color = TextSecondary)
                }
                Switch(
                    checked = uiState.textImprovementDefault,
                    onCheckedChange = { viewModel.updateTextImprovementDefault(it) },
                    colors = SwitchDefaults.colors(checkedTrackColor = NeonCyan)
                )
            }
        }

        // Recording section
        GlassCard {
            Column {
                Text("Aufnahme", style = MaterialTheme.typography.titleMedium, color = NeonCyan)
                Spacer(modifier = Modifier.height(8.dp))
                Text("Max. Aufnahmedauer: ${uiState.maxRecordingDuration} Min.", style = MaterialTheme.typography.bodyMedium, color = TextSecondary)
                Slider(
                    value = uiState.maxRecordingDuration.toFloat(),
                    onValueChange = { viewModel.updateMaxRecordingDuration(it.toInt()) },
                    valueRange = 1f..10f,
                    steps = 8,
                    colors = SliderDefaults.colors(thumbColor = NeonCyan, activeTrackColor = NeonCyan)
                )
            }
        }

        // Dashboard section
        GlassCard {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text("Dashboard", style = MaterialTheme.typography.titleMedium, color = NeonCyan)
                    Text("Automatisch aktualisieren", style = MaterialTheme.typography.bodyMedium, color = TextSecondary)
                }
                Switch(
                    checked = uiState.autoUpdateDashboard,
                    onCheckedChange = { viewModel.updateAutoUpdateDashboard(it) },
                    colors = SwitchDefaults.colors(checkedTrackColor = NeonCyan)
                )
            }
        }

        // About section
        GlassCard {
            Column {
                Text("Über die App", style = MaterialTheme.typography.titleMedium, color = NeonCyan)
                Spacer(modifier = Modifier.height(8.dp))
                Text("Entropy Journal v1.0.0", style = MaterialTheme.typography.bodyMedium, color = TextSecondary)
                Text("Dein persönliches KI-Tagebuch", style = MaterialTheme.typography.bodyMedium, color = TextMuted)
            }
        }

        Spacer(modifier = Modifier.height(80.dp))
    }

    // Logout dialog
    if (uiState.showLogoutDialog) {
        AlertDialog(
            onDismissRequest = { viewModel.showLogoutDialog(false) },
            containerColor = CosmosDeep,
            title = { Text("Abmelden?", color = TextPrimary) },
            text = { Text("Möchtest du dich wirklich abmelden?", color = TextSecondary) },
            confirmButton = {
                Button(
                    onClick = {
                        viewModel.signOut()
                        onSignOut()
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = NeonRed)
                ) { Text("Abmelden") }
            },
            dismissButton = {
                OutlinedButton(onClick = { viewModel.showLogoutDialog(false) }) { Text("Abbrechen", color = TextSecondary) }
            }
        )
    }
}

@Composable
private fun ApiKeyField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit
) {
    var visible by remember { mutableStateOf(false) }

    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label, color = TextMuted) },
        visualTransformation = if (visible) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            IconButton(onClick = { visible = !visible }) {
                Icon(
                    if (visible) Icons.Rounded.VisibilityOff else Icons.Rounded.Visibility,
                    contentDescription = if (visible) "Verbergen" else "Anzeigen",
                    tint = TextSecondary
                )
            }
        },
        modifier = Modifier.fillMaxWidth(),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = CosmosSurface,
            unfocusedContainerColor = CosmosSurface,
            focusedTextColor = TextPrimary,
            cursorColor = NeonCyan,
            focusedIndicatorColor = NeonCyan,
            unfocusedIndicatorColor = Color.Transparent
        ),
        singleLine = true,
        shape = RoundedCornerShape(12.dp)
    )
}
