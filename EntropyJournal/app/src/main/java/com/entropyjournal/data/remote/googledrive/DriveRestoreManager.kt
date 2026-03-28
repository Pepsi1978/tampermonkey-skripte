package com.entropyjournal.data.remote.googledrive

import android.content.Context
import android.content.SharedPreferences
import com.entropyjournal.util.Constants
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.gson.GsonFactory
import com.google.api.services.drive.Drive
import com.google.api.services.drive.DriveScopes
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.io.FileOutputStream
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DriveRestoreManager @Inject constructor(
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

    suspend fun hasBackup(): Boolean = withContext(Dispatchers.IO) {
        try {
            val driveService = getDriveService() ?: return@withContext false
            val files = driveService.files().list()
                .setSpaces("appDataFolder")
                .setQ("name = '${Constants.DRIVE_BACKUP_FILENAME}'")
                .setFields("files(id)")
                .execute()
            !files.files.isNullOrEmpty()
        } catch (e: Exception) {
            false
        }
    }

    suspend fun restore(targetFile: File): Result<Unit> = withContext(Dispatchers.IO) {
        try {
            val driveService = getDriveService()
                ?: return@withContext Result.failure(IllegalStateException("Nicht angemeldet"))

            val files = driveService.files().list()
                .setSpaces("appDataFolder")
                .setQ("name = '${Constants.DRIVE_BACKUP_FILENAME}'")
                .setFields("files(id)")
                .execute()

            val backupFile = files.files?.firstOrNull()
                ?: return@withContext Result.failure(Exception("Kein Backup gefunden"))

            FileOutputStream(targetFile).use { outputStream ->
                driveService.files().get(backupFile.id).executeMediaAndDownloadTo(outputStream)
            }

            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
