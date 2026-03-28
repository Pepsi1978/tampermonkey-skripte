package com.entropyjournal.data.remote.googledrive

import android.content.Context
import android.content.SharedPreferences
import com.entropyjournal.util.Constants
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential
import com.google.api.client.http.FileContent
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.gson.GsonFactory
import com.google.api.services.drive.Drive
import com.google.api.services.drive.DriveScopes
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DriveBackupManager @Inject constructor(
    @ApplicationContext private val context: Context,
    private val encryptedPrefs: SharedPreferences
) {
    private fun getDriveService(): Drive? {
        val accountEmail = encryptedPrefs.getString(Constants.PREF_GOOGLE_ACCOUNT_EMAIL, null)
            ?: return null

        val credential = GoogleAccountCredential.usingOAuth2(
            context, listOf(DriveScopes.DRIVE_APPDATA)
        ).apply {
            selectedAccountName = accountEmail
        }

        return Drive.Builder(
            NetHttpTransport(),
            GsonFactory.getDefaultInstance(),
            credential
        )
            .setApplicationName("Entropy Journal")
            .build()
    }

    suspend fun backup(databaseFile: File): Result<Unit> = withContext(Dispatchers.IO) {
        try {
            val driveService = getDriveService()
                ?: return@withContext Result.failure(IllegalStateException("Nicht angemeldet"))

            val existingFiles = driveService.files().list()
                .setSpaces("appDataFolder")
                .setQ("name = '${Constants.DRIVE_BACKUP_FILENAME}'")
                .setFields("files(id)")
                .execute()

            existingFiles.files?.forEach { file ->
                driveService.files().delete(file.id).execute()
            }

            val fileMetadata = com.google.api.services.drive.model.File().apply {
                name = Constants.DRIVE_BACKUP_FILENAME
                parents = listOf("appDataFolder")
            }

            val mediaContent = FileContent("application/octet-stream", databaseFile)
            driveService.files().create(fileMetadata, mediaContent)
                .setFields("id")
                .execute()

            encryptedPrefs.edit()
                .putLong(Constants.PREF_LAST_SYNC_TIMESTAMP, System.currentTimeMillis())
                .apply()

            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
