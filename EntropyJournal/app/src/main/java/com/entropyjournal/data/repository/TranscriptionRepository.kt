package com.entropyjournal.data.repository

import com.entropyjournal.data.remote.groq.GroqApi
import com.entropyjournal.data.remote.groq.GroqTranscriptionRequest
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TranscriptionRepository @Inject constructor(
    private val groqApi: GroqApi
) {
    suspend fun transcribeAudio(audioFile: File): Result<String> {
        return try {
            val response = groqApi.transcribe(
                file = GroqTranscriptionRequest.createFilePart(audioFile),
                model = GroqTranscriptionRequest.createModelPart(),
                language = GroqTranscriptionRequest.createLanguagePart(),
                responseFormat = GroqTranscriptionRequest.createResponseFormatPart()
            )
            Result.success(response.text)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
