package com.quizverse.app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.quizverse.app.data.repository.QuizRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.time.LocalDate

/**
 * ViewModel for the Home screen.
 * Loads player stats from the repository and exposes them as immutable UI state.
 */
class HomeViewModel(private val repository: QuizRepository) : ViewModel() {

    // ---- UI state ----------------------------------------------------------

    data class HomeUiState(
        val playerName: String = "Spieler",
        val level: Int = 1,
        val xp: Int = 0,
        /** XP needed to reach the next level */
        val xpForNextLevel: Int = 50,
        /** True when the daily challenge has not been completed today */
        val dailyChallengeAvailable: Boolean = true,
        val totalQuestionsAnswered: Int = 0,
        val currentStreak: Int = 0,
        val isLoading: Boolean = true
    )

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

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

                val today                  = LocalDate.now().toString()
                val dailyChallengeAvailable = progress.lastDailyChallengeDate != today
                val xpForNext              = repository.xpForLevel(progress.currentLevel + 1)

                _uiState.update {
                    it.copy(
                        level                   = progress.currentLevel,
                        xp                      = progress.totalXp,
                        xpForNextLevel          = xpForNext,
                        dailyChallengeAvailable = dailyChallengeAvailable,
                        totalQuestionsAnswered  = progress.totalQuestionsAnswered,
                        currentStreak           = progress.currentStreak,
                        isLoading               = false
                    )
                }
            }
        }
    }
}
