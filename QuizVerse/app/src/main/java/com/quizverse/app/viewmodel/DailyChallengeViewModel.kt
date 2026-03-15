package com.quizverse.app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.quizverse.app.data.database.entities.Question
import com.quizverse.app.data.repository.QuizRepository
import com.quizverse.app.util.Constants
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.time.LocalDate

/**
 * ViewModel for the Daily Challenge screen.
 *
 * Specifics compared to the regular QuizViewModel:
 * - Always loads exactly [Constants.DAILY_QUESTION_COUNT] mixed-category questions.
 * - Checks whether today's challenge has already been completed before starting.
 * - Uses difficulty level 2 (Mittel) as the fixed daily difficulty.
 * - Saves the completion date and updates the daily-challenge streak on finish.
 */
class DailyChallengeViewModel(private val repository: QuizRepository) : ViewModel() {

    // ---- UI state ----------------------------------------------------------

    data class DailyChallengeUiState(
        val currentQuestion: Question? = null,
        val questionIndex: Int = 0,
        val totalQuestions: Int = Constants.DAILY_QUESTION_COUNT,
        val score: Int = 0,
        /** Consecutive correct answers within this session */
        val streak: Int = 0,
        /** Seconds left on the countdown timer */
        val timeRemaining: Int = 0,
        val isAnswered: Boolean = false,
        val selectedAnswer: Int = -1,
        val isCorrect: Boolean = false,
        val showExplanation: Boolean = false,
        val isLoading: Boolean = false,
        val isFinished: Boolean = false,
        /** True when the player has already completed today's challenge */
        val alreadyCompleted: Boolean = false,
        val errorMessage: String? = null
    )

    private val _uiState = MutableStateFlow(DailyChallengeUiState())
    val uiState: StateFlow<DailyChallengeUiState> = _uiState.asStateFlow()

    // ---- Internal state ----------------------------------------------------

    private val dailyDifficulty = 2 // Fixed: Mittel
    private var questions: List<Question> = emptyList()
    private var timerJob: Job? = null
    /** Tracks how many questions were answered correctly across the session. */
    private var correctCount: Int = 0

    // ---- Public API --------------------------------------------------------

    /**
     * Loads today's daily challenge if it has not been completed yet.
     * Sets [DailyChallengeUiState.alreadyCompleted] to true and returns early if it has.
     */
    fun loadDailyChallenge() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }

            // Check completion status
            val progress = repository.getProgress().first()
            val today    = LocalDate.now().toString()
            if (progress?.lastDailyChallengeDate == today) {
                _uiState.update { it.copy(isLoading = false, alreadyCompleted = true) }
                return@launch
            }

            try {
                questions = repository.getDailyQuestions(Constants.DAILY_QUESTION_COUNT)
                if (questions.isEmpty()) {
                    _uiState.update {
                        it.copy(isLoading = false, errorMessage = "Keine Fragen verfügbar.")
                    }
                    return@launch
                }

                _uiState.update {
                    it.copy(
                        isLoading       = false,
                        totalQuestions  = questions.size,
                        questionIndex   = 0,
                        score           = 0,
                        streak          = 0,
                        isFinished      = false,
                        alreadyCompleted = false,
                        currentQuestion = questions[0]
                    )
                }
                startTimer()
            } catch (e: Exception) {
                _uiState.update {
                    it.copy(isLoading = false, errorMessage = e.localizedMessage)
                }
            }
        }
    }

    /** Records the player's answer and updates score / streak. */
    fun submitAnswer(answerIndex: Int) {
        val state = _uiState.value
        if (state.isAnswered || state.currentQuestion == null) return

        timerJob?.cancel()

        val correct   = answerIndex == state.currentQuestion.correctAnswer
        val newScore  = state.score + if (correct) calculateScore(state) else 0
        val newStreak = if (correct) state.streak + 1 else 0
        if (correct) correctCount++

        viewModelScope.launch {
            repository.updateStreak(correct)
            if (correct) {
                val xpGained = Constants.XP_BASE * dailyDifficulty
                repository.updateXpAndLevel(xpGained)
            }
        }

        _uiState.update {
            it.copy(
                isAnswered     = true,
                selectedAnswer = answerIndex,
                isCorrect      = correct,
                showExplanation = true,
                score          = newScore,
                streak         = newStreak
            )
        }
    }

    /** Moves to the next question, or finishes the challenge if all questions are done. */
    fun nextQuestion() {
        val state     = _uiState.value
        val nextIndex = state.questionIndex + 1

        if (nextIndex >= questions.size) {
            finishChallenge()
            return
        }

        _uiState.update {
            it.copy(
                questionIndex   = nextIndex,
                currentQuestion = questions[nextIndex],
                isAnswered      = false,
                selectedAnswer  = -1,
                isCorrect       = false,
                showExplanation = false,
                timeRemaining   = Constants.TIMER_DURATIONS[dailyDifficulty] ?: 20
            )
        }
        startTimer()
    }

    // ---- Private helpers ---------------------------------------------------

    private fun startTimer() {
        timerJob?.cancel()
        val duration = Constants.TIMER_DURATIONS[dailyDifficulty] ?: 20
        _uiState.update { it.copy(timeRemaining = duration) }

        timerJob = viewModelScope.launch {
            for (remaining in duration - 1 downTo 0) {
                delay(1_000L)
                _uiState.update { it.copy(timeRemaining = remaining) }
            }
            // Timer expired — auto-submit as wrong
            if (!_uiState.value.isAnswered) {
                submitAnswer(-1)
            }
        }
    }

    private fun calculateScore(state: DailyChallengeUiState): Int {
        val base         = 100.0
        val diffMult     = Constants.DIFFICULTY_MULTIPLIERS[dailyDifficulty] ?: 1.5
        val maxTime      = (Constants.TIMER_DURATIONS[dailyDifficulty] ?: 20).toDouble()
        val timeFraction = (state.timeRemaining / maxTime).coerceIn(0.0, 1.0)
        val timeBonus    = timeFraction * 50.0
        val streakBonus  = (state.streak * 5.0).coerceAtMost(50.0)
        return ((base + timeBonus + streakBonus) * diffMult).toInt()
    }

    private fun finishChallenge() {
        timerJob?.cancel()
        val state = _uiState.value
        val today = LocalDate.now().toString()

        viewModelScope.launch {
            // Persist completion date and update daily streak
            val progress = repository.getProgress().first()
            if (progress != null) {
                repository.saveDailyChallengeCompletion(today, progress.dailyChallengeStreak + 1)
            }

            // Save high score using the running correctCount tracked in submitAnswer
            repository.saveHighScore(
                mode       = "daily",
                categoryId = null,
                score      = state.score,
                answered   = state.totalQuestions,
                correct    = correctCount,
                difficulty = dailyDifficulty
            )

            repository.checkAndUnlockAchievements()
        }

        _uiState.update { it.copy(isFinished = true) }
    }

    override fun onCleared() {
        super.onCleared()
        timerJob?.cancel()
    }
}
