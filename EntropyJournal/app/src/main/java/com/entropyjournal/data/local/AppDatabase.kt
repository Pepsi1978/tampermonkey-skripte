package com.entropyjournal.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.entropyjournal.data.local.dao.AdviceDashboardDao
import com.entropyjournal.data.local.dao.JournalEntryDao
import com.entropyjournal.data.local.entity.AdviceBlockEntity
import com.entropyjournal.data.local.entity.JournalEntryEntity

@Database(
    entities = [JournalEntryEntity::class, AdviceBlockEntity::class],
    version = 1,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun journalEntryDao(): JournalEntryDao
    abstract fun adviceDashboardDao(): AdviceDashboardDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "entropy_journal_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
