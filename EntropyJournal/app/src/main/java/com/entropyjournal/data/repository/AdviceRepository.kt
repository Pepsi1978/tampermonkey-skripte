package com.entropyjournal.data.repository

import android.content.SharedPreferences
import com.entropyjournal.data.local.dao.AdviceDashboardDao
import com.entropyjournal.data.local.entity.AdviceBlockEntity
import com.entropyjournal.data.remote.gemini.GeminiApi
import com.entropyjournal.data.remote.gemini.GeminiRequestBuilder
import com.entropyjournal.domain.model.AdviceBlock
import com.entropyjournal.domain.model.AdvicePriority
import com.entropyjournal.domain.model.Advice
import com.entropyjournal.util.Constants
import com.squareup.moshi.Moshi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.json.JSONArray
import org.json.JSONObject
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AdviceRepository @Inject constructor(
    private val geminiApi: GeminiApi,
    private val adviceDashboardDao: AdviceDashboardDao,
    private val encryptedPrefs: SharedPreferences
) {
    private val entropyAnalysisSystemPrompt = """
Du bist ein empathischer, hochintelligenter Lebensberater und Muster-Analyst.
Deine Aufgabe ist es, aus den Tagebucheinträgen eines Nutzers wiederkehrende Quellen
persönlicher Entropie zu identifizieren und daraus ein kohärentes Ratschlags-Dashboard
zu erstellen.

Definition: „Persönliche Entropie" umfasst alles, was Unordnung, Stress, Energieverlust,
Schmerz, Schlafprobleme, emotionale Belastung oder Kontrollverlust im Leben des Nutzers
erzeugt.

Analysiere die Tagebucheinträge und erstelle ein JSON-Objekt mit folgendem Schema:

{
  "gesamtanalyse": "Ein kurzer, empathischer Absatz (3–5 Sätze)...",
  "kategorien": [
    {
      "name": "Kategoriename",
      "icon": "material_icon_name",
      "farbe": "#HEX",
      "entropie_level": 0.0,
      "zusammenfassung": "Kurze Zusammenfassung...",
      "ratschlaege": [
        {
          "titel": "Kurzer Titel",
          "beschreibung": "Ausführliche Empfehlung (3–5 Sätze)...",
          "prioritaet": "hoch",
          "verknuepfung": "Querverbindung zu anderen Kategorien..."
        }
      ]
    }
  ]
}

Verwende diese Standard-Kategorien (erweitere bei Bedarf):
- Schlaf (icon: bedtime, farbe: #6C63FF)
- Arbeit (icon: work, farbe: #FF6B6B)
- Fitness (icon: fitness_center, farbe: #4ECDC4)
- Ernährung (icon: restaurant, farbe: #FFE66D)
- Mentale Gesundheit (icon: psychology, farbe: #A78BFA)
- Beziehungen (icon: people, farbe: #F472B6)
- Zuhause (icon: home, farbe: #34D399)
- Persönliche Entwicklung (icon: trending_up, farbe: #60A5FA)

Regeln:
- Schreibe auf Deutsch, klar und direkt, ohne Floskeln.
- Jeder Ratschlag muss sich auf konkrete Muster beziehen.
- Maximal 3 Ratschläge pro Kategorie.
- Antworte ausschließlich mit dem JSON-Objekt.
    """.trimIndent()

    fun getAllAdviceBlocks(): Flow<List<AdviceBlock>> {
        return adviceDashboardDao.getAll().map { entities ->
            entities.map { it.toDomain() }
        }
    }

    suspend fun analyzeEntropy(allEntriesText: String): Result<Unit> {
        return try {
            val apiKey = encryptedPrefs.getString(Constants.PREF_GEMINI_API_KEY, "") ?: ""
            if (apiKey.isBlank()) return Result.failure(IllegalStateException("Gemini API-Key nicht konfiguriert"))

            val request = GeminiRequestBuilder.build(
                userText = allEntriesText,
                systemPrompt = entropyAnalysisSystemPrompt
            )
            val response = geminiApi.analyzeEntropy(apiKey = apiKey, request = request)
            val jsonText = response.extractText() ?: return Result.failure(Exception("Keine Antwort von Gemini"))

            val cleanJson = jsonText.trim().removePrefix("```json").removePrefix("```").removeSuffix("```").trim()
            val blocks = parseAdviceJson(cleanJson)

            adviceDashboardDao.deleteAll()
            adviceDashboardDao.upsertAll(blocks)

            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    private fun parseAdviceJson(jsonString: String): List<AdviceBlockEntity> {
        val json = JSONObject(jsonString)
        val overallAnalysis = json.getString("gesamtanalyse")
        val categories = json.getJSONArray("kategorien")
        val now = System.currentTimeMillis()

        return (0 until categories.length()).map { i ->
            val cat = categories.getJSONObject(i)
            val adviceArray = cat.getJSONArray("ratschlaege")

            AdviceBlockEntity(
                categoryName = cat.getString("name"),
                categoryIcon = cat.getString("icon"),
                categoryColor = cat.getString("farbe"),
                entropyLevel = cat.getDouble("entropie_level").toFloat(),
                categorySummary = cat.getString("zusammenfassung"),
                adviceJson = adviceArray.toString(),
                overallAnalysis = overallAnalysis,
                lastUpdated = now,
                basedOnEntryCount = 0
            )
        }
    }
}

private fun AdviceBlockEntity.toDomain(): AdviceBlock {
    val advices = try {
        val array = JSONArray(adviceJson)
        (0 until array.length()).map { i ->
            val obj = array.getJSONObject(i)
            Advice(
                title = obj.getString("titel"),
                description = obj.getString("beschreibung"),
                priority = when (obj.optString("prioritaet", "mittel")) {
                    "hoch" -> AdvicePriority.HIGH
                    "niedrig" -> AdvicePriority.LOW
                    else -> AdvicePriority.MEDIUM
                },
                connection = obj.optString("verknuepfung", "")
            )
        }
    } catch (e: Exception) {
        emptyList()
    }

    return AdviceBlock(
        id = id,
        categoryName = categoryName,
        categoryIcon = categoryIcon,
        categoryColor = categoryColor,
        entropyLevel = entropyLevel,
        categorySummary = categorySummary,
        advices = advices,
        overallAnalysis = overallAnalysis,
        lastUpdated = lastUpdated,
        basedOnEntryCount = basedOnEntryCount
    )
}
