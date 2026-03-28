package com.entropyjournal.domain.usecase

import android.content.Context
import com.entropyjournal.data.local.AppDatabase
import com.entropyjournal.data.remote.googledrive.DriveBackupManager
import com.entropyjournal.data.remote.googledrive.DriveRestoreManager
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class SyncWithDriveUseCase @Inject constructor(
    private val driveBackupManager: DriveBackupManager,
    private val driveRestoreManager: DriveRestoreManager,
    @ApplicationContext private val context: Context
) {
    suspend fun backup(): Result<Unit> {
        val dbFile = context.getDatabasePath("entropy_journal_db")
        if (!dbFile.exists()) return Result.failure(Exception("Datenbank nicht gefunden"))
        return driveBackupManager.backup(dbFile)
    }

    suspend fun restore(): Result<Unit> {
        val dbFile = context.getDatabasePath("entropy_journal_db")
        return driveRestoreManager.restore(dbFile)
    }

    suspend fun hasBackup(): Boolean {
        return driveRestoreManager.hasBackup()
    }
}
