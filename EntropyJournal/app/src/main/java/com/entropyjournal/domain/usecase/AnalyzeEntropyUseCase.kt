package com.entropyjournal.domain.usecase

import com.entropyjournal.data.repository.AdviceRepository
import com.entropyjournal.data.repository.JournalRepository
import kotlinx.coroutines.flow.first
import javax.inject.Inject

class AnalyzeEntropyUseCase @Inject constructor(
    private val journalRepository: JournalRepository,
    private val adviceRepository: AdviceRepository
) {
    suspend operator fun invoke(): Result<Unit> {
        val entries = journalRepository.getAllEntries().first()
        if (entries.isEmpty()) return Result.failure(Exception("Keine Tagebucheinträge vorhanden"))

        val allText = entries.joinToString("\n\n---\n\n") { entry ->
            "[${com.entropyjournal.util.DateTimeFormatter.formatFull(entry.timestamp)}]\n${entry.displayText}"
        }

        return adviceRepository.analyzeEntropy(allText)
    }
}
