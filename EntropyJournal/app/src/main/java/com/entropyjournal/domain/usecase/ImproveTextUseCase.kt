package com.entropyjournal.domain.usecase

import android.content.SharedPreferences
import com.entropyjournal.data.remote.gemini.GeminiApi
import com.entropyjournal.data.remote.gemini.GeminiRequestBuilder
import com.entropyjournal.util.Constants
import javax.inject.Inject

class ImproveTextUseCase @Inject constructor(
    private val geminiApi: GeminiApi,
    private val encryptedPrefs: SharedPreferences
) {
    private val systemPrompt = """
Du bist ein deutscher Textoptimierer. Deine einzige Aufgabe ist es, den folgenden
gesprochenen und transkribierten deutschen Text sprachlich zu verbessern.

Regeln:
- Korrigiere Grammatik, Rechtschreibung und Zeichensetzung.
- Formuliere unklare oder abgehackte Sätze flüssiger, aber behalte den Inhalt,
  die Bedeutung und den persönlichen Stil des Sprechers vollständig bei.
- Füge NICHTS hinzu, das nicht im Original enthalten ist.
- Entferne Füllwörter (ähm, also, sozusagen, quasi) nur dann, wenn sie den
  Lesefluss stören.
- Behalte die Ich-Perspektive bei.
- Gib NUR den verbesserten Text zurück, ohne Erklärungen, ohne Anführungszeichen,
  ohne Einleitungen.
    """.trimIndent()

    suspend operator fun invoke(rawText: String): Result<String> {
        return try {
            val apiKey = encryptedPrefs.getString(Constants.PREF_GEMINI_API_KEY, "") ?: ""
            if (apiKey.isBlank()) return Result.failure(IllegalStateException("Gemini API-Key nicht konfiguriert"))

            val request = GeminiRequestBuilder.build(
                userText = rawText,
                systemPrompt = systemPrompt
            )
            val response = geminiApi.improveText(apiKey = apiKey, request = request)
            val improvedText = response.extractText()
                ?: return Result.failure(Exception("Keine Antwort von Gemini"))

            Result.success(improvedText.trim())
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
