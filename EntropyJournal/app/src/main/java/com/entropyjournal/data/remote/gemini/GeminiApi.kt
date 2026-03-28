package com.entropyjournal.data.remote.gemini

import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface GeminiApi {

    @POST("models/gemini-2.0-flash-lite:generateContent")
    suspend fun improveText(
        @Query("key") apiKey: String,
        @Body request: GeminiRequest
    ): GeminiResponse

    @POST("models/gemini-2.0-flash:generateContent")
    suspend fun analyzeEntropy(
        @Query("key") apiKey: String,
        @Body request: GeminiRequest
    ): GeminiResponse
}
