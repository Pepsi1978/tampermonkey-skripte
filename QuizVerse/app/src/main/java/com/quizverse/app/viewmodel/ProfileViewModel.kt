package com.quizverse.app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.quizverse.app.data.repository.QuizRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

/**
 * ViewModel for the Profile screen.
 * Aggregates all player statistics from the repository into a single UI state.
 */
class ProfileViewModel(private val repository: QuizRepository) : ViewModel() {

    // ---- UI state ----------------------------------------------------------

    data class ProfileUiState(
        val level: Int = 1,
        val xp: Int = 0,
        /** XP needed to finish the current level */
        val xpForCurrentLevel: Int = 0,
        /** XP needed to reach the next level */
        val xpForNextLevel: Int = 50,
        /** Progress within the current level as a fraction 0.0–1.0 */
        val levelProgress: Float = 0f,
        val totalQuestionsAnswered: Int = 0,
        val totalCorrectAnswers: Int = 0,
        /** Correct-answer rate as a percentage 0–100 */
        val correctRate: Float = 0f,
        val longestStreak: Int = 0,
        val currentStreak: Int = 0,
        /** Category ID of the category with most questions answered; -1 if unknown */
        val favoriteCategoryId: Int = -1,
        /** Total accumulated play time in milliseconds */
        val totalPlayTimeMs: Long = 0L,
        /** Human-readable play time string, e.g. "3h 22min" */
        val totalPlayTimeFormatted: String = "0 min",
        val dailyChallengeStreak: Int = 0,
        val isLoading: Boolean = true
    )

    private val _uiState = MutableStateFlow(ProfileUiState())
    val uiState: StateFlow<ProfileUiState> = _uiState.asStateFlow()

    // ---- Initialisation ----------------------------------------------------

    init {
        observeProgress()
    }

    private fun observeProgress() {
        viewModelScope.launch {
            repository.getProgress().collect { progress ->
                if (progress == null) {
                    _uiState.update { it.copy(isLoading = false) }
                    return@collect
                }

                val level          = progress.currentLevel
                val xp             = progress.totalXp
                val xpCurrent      = repository.xpForLevel(level)
                val xpNext         = repository.xpForLevel(level + 1)
                val levelRange     = (xpNext - xpCurrent).coerceAtLeast(1)
                val levelProgress  = ((xp - xpCurrent).toFloat() / levelRange).coerceIn(0f, 1f)

                val correctRate = if (progress.totalQuestionsAnswered > 0) {
                    progress.totalCorrectAnswers.toFloat() / progress.totalQuestionsAnswered * 100f
                } else 0f

                _uiState.update {
                    it.copy(
                        level                  = level,
                        xp                     = xp,
                        xpForCurrentLevel      = xpCurrent,
                        xpForNextLevel         = xpNext,
                        levelProgress          = levelProgress,
                        totalQuestionsAnswered = progress.totalQuestionsAnswered,
                        totalCorrectAnswers    = progress.totalCorrectAnswers,
                        correctRate            = correctRate,
                        longestStreak          = progress.longestStreak,
                        currentStreak          = progress.currentStreak,
                        totalPlayTimeMs        = progress.totalPlayTime,
                        totalPlayTimeFormatted = formatPlayTime(progress.totalPlayTime),
                        dailyChallengeStreak   = progress.dailyChallengeStreak,
                        isLoading              = false
                    )
                }
            }
        }
    }

    // ---- Helpers -----------------------------------------------------------

    /**
     * Converts milliseconds into a human-readable German string.
     * Examples: "45 min", "3h 22min", "< 1 min"
     */
    private fun formatPlayTime(ms: Long): String {
        val totalMinutes = ms / 60_000L
        if (totalMinutes < 1) return "< 1 min"
        val hours   = totalMinutes / 60
        val minutes = totalMinutes % 60
        return if (hours == 0L) "${minutes} min" else "${hours}h ${minutes}min"
    }
}
