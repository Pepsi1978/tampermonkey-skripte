package com.quizverse.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.compose.rememberNavController
import com.quizverse.app.ui.navigation.QuizVerseNavGraph
import com.quizverse.app.ui.theme.AppTheme
import com.quizverse.app.ui.theme.QuizVerseTheme

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Render content edge-to-edge (behind status & navigation bars).
        enableEdgeToEdge()

        val app = applicationContext as QuizVerseApp

        setContent {
            val windowSizeClass = calculateWindowSizeClass(this)
            val navController = rememberNavController()

            // Observe dark mode setting reactively
            val darkMode by app.settingsRepository.darkModeEnabled.collectAsState()
            val appTheme = if (darkMode) AppTheme.DARK else AppTheme.LIGHT

            QuizVerseTheme(appTheme = appTheme, windowSizeClass = windowSizeClass) {
                QuizVerseNavGraph(
                    navController = navController,
                    windowSizeClass = windowSizeClass
                )
            }
        }
    }
}
