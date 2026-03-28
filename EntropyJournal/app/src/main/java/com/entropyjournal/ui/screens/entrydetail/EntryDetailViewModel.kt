package com.entropyjournal.ui.screens.entrydetail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.entropyjournal.data.repository.JournalRepository
import com.entropyjournal.domain.model.JournalEntry
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class EntryDetailUiState(
    val entry: JournalEntry? = null,
    val showOriginalText: Boolean = true,
    val showDeleteDialog: Boolean = false,
    val isDeleted: Boolean = false
)

@HiltViewModel
class EntryDetailViewModel @Inject constructor(
    private val journalRepository: JournalRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _uiState = MutableStateFlow(EntryDetailUiState())
    val uiState: StateFlow<EntryDetailUiState> = _uiState

    private val entryId: Long = savedStateHandle.get<Long>("entryId") ?: 0L

    init {
        loadEntry()
    }

    private fun loadEntry() {
        viewModelScope.launch {
            val entry = journalRepository.getEntryById(entryId)
            _uiState.value = _uiState.value.copy(entry = entry)
        }
    }

    fun toggleTextVersion() {
        _uiState.value = _uiState.value.copy(
            showOriginalText = !_uiState.value.showOriginalText
        )
    }

    fun showDeleteDialog(show: Boolean) {
        _uiState.value = _uiState.value.copy(showDeleteDialog = show)
    }

    fun deleteEntry() {
        viewModelScope.launch {
            _uiState.value.entry?.let { entry ->
                journalRepository.deleteEntry(entry)
                _uiState.value = _uiState.value.copy(isDeleted = true, showDeleteDialog = false)
            }
        }
    }
}
