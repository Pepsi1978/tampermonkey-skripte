package com.entropyjournal.util

object Constants {
    // API Base URLs
    const val GROQ_BASE_URL = "https://api.groq.com/openai/v1/"
    const val GEMINI_BASE_URL = "https://generativelanguage.googleapis.com/v1beta/"

    // Groq
    const val GROQ_TRANSCRIPTION_MODEL = "whisper-large-v3-turbo"
    const val GROQ_LANGUAGE = "de"

    // Gemini models
    const val GEMINI_FLASH_LITE = "gemini-2.0-flash-lite"
    const val GEMINI_FLASH = "gemini-2.0-flash"

    // Audio recording
    const val DEFAULT_MAX_RECORDING_DURATION_MINUTES = 5
    const val AUDIO_SAMPLE_RATE = 16000
    const val AUDIO_CHANNELS = 1 // mono

    // Sync
    const val SYNC_DEBOUNCE_MS = 30_000L      // 30 seconds
    const val ANALYSIS_DEBOUNCE_MS = 60_000L   // 60 seconds
    const val DRIVE_BACKUP_FILENAME = "entropy_journal_backup.db"

    // SharedPreferences keys
    const val PREF_GROQ_API_KEY = "groq_api_key"
    const val PREF_GEMINI_API_KEY = "gemini_api_key"
    const val PREF_TEXT_IMPROVEMENT_DEFAULT = "text_improvement_default"
    const val PREF_MAX_RECORDING_DURATION = "max_recording_duration"
    const val PREF_AUTO_UPDATE_DASHBOARD = "auto_update_dashboard"
    const val PREF_GOOGLE_ACCOUNT_NAME = "google_account_name"
    const val PREF_GOOGLE_ACCOUNT_EMAIL = "google_account_email"
    const val PREF_GOOGLE_AVATAR_URL = "google_avatar_url"
    const val PREF_LAST_SYNC_TIMESTAMP = "last_sync_timestamp"

    // Google OAuth — user must configure their own Client ID
    const val GOOGLE_WEB_CLIENT_ID = "YOUR_WEB_CLIENT_ID_HERE"

    // Encrypted SharedPreferences file name
    const val ENCRYPTED_PREFS_NAME = "entropy_journal_secure_prefs"
}
