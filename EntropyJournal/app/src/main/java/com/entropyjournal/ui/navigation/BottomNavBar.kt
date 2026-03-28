package com.entropyjournal.ui.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Analytics
import androidx.compose.material.icons.rounded.Book
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.entropyjournal.ui.theme.CosmosDeep
import com.entropyjournal.ui.theme.GlassHighlight
import com.entropyjournal.ui.theme.NeonCyan
import com.entropyjournal.ui.theme.NeonViolet
import com.entropyjournal.ui.theme.TextMuted
import com.entropyjournal.ui.theme.TextPrimary

sealed class BottomNavItem(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    data object Journal : BottomNavItem("journal", "Tagebuch", Icons.Rounded.Book)
    data object Dashboard : BottomNavItem("dashboard", "Dashboard", Icons.Rounded.Analytics)
    data object Settings : BottomNavItem("settings", "Einstellungen", Icons.Rounded.Settings)
}

@Composable
fun BottomNavBar(
    currentRoute: String?,
    onItemClick: (BottomNavItem) -> Unit
) {
    val items = listOf(BottomNavItem.Journal, BottomNavItem.Dashboard, BottomNavItem.Settings)

    NavigationBar(
        containerColor = CosmosDeep.copy(alpha = 0.95f),
        contentColor = TextPrimary,
        modifier = Modifier.height(64.dp)
    ) {
        items.forEach { item ->
            val isSelected = currentRoute == item.route
            NavigationBarItem(
                selected = isSelected,
                onClick = { onItemClick(item) },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        tint = if (isSelected) NeonCyan else TextMuted
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        color = if (isSelected) NeonCyan else TextMuted
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = NeonCyan.copy(alpha = 0.1f)
                )
            )
        }
    }
}
