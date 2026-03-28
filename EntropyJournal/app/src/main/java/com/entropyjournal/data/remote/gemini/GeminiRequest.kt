package com.entropyjournal.data.remote.gemini

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GeminiRequest(
    @Json(name = "contents") val contents: List<GeminiContent>,
    @Json(name = "systemInstruction") val systemInstruction: GeminiContent? = null
)

@JsonClass(generateAdapter = true)
data class GeminiContent(
    @Json(name = "parts") val parts: List<GeminiPart>
)

@JsonClass(generateAdapter = true)
data class GeminiPart(
    @Json(name = "text") val text: String
)

// Helper to build requests easily
object GeminiRequestBuilder {
    fun build(userText: String, systemPrompt: String? = null): GeminiRequest {
        val contents = listOf(
            GeminiContent(parts = listOf(GeminiPart(text = userText)))
        )
        val systemInstruction = systemPrompt?.let {
            GeminiContent(parts = listOf(GeminiPart(text = it)))
        }
        return GeminiRequest(contents = contents, systemInstruction = systemInstruction)
    }
}
