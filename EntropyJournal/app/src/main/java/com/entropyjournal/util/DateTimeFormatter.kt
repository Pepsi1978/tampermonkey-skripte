package com.entropyjournal.util

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.concurrent.TimeUnit

object DateTimeFormatter {

    private val fullFormat = SimpleDateFormat("EE, d. MMMM yyyy · HH:mm 'Uhr'", Locale.GERMAN)
    private val timeOnly = SimpleDateFormat("HH:mm", Locale.GERMAN)
    private val dateOnly = SimpleDateFormat("d. MMMM yyyy", Locale.GERMAN)

    fun formatFull(timestamp: Long): String {
        return fullFormat.format(Date(timestamp))
    }

    fun formatTime(timestamp: Long): String {
        return timeOnly.format(Date(timestamp))
    }

    fun formatDate(timestamp: Long): String {
        return dateOnly.format(Date(timestamp))
    }

    fun formatRelative(timestamp: Long): String {
        val now = System.currentTimeMillis()
        val diff = now - timestamp

        return when {
            diff < TimeUnit.MINUTES.toMillis(1) -> "gerade eben"
            diff < TimeUnit.HOURS.toMillis(1) -> {
                val minutes = TimeUnit.MILLISECONDS.toMinutes(diff)
                "vor $minutes ${if (minutes == 1L) "Minute" else "Minuten"}"
            }
            diff < TimeUnit.DAYS.toMillis(1) -> {
                val hours = TimeUnit.MILLISECONDS.toHours(diff)
                "vor $hours ${if (hours == 1L) "Stunde" else "Stunden"}"
            }
            diff < TimeUnit.DAYS.toMillis(7) -> {
                val days = TimeUnit.MILLISECONDS.toDays(diff)
                "vor $days ${if (days == 1L) "Tag" else "Tagen"}"
            }
            else -> formatDate(timestamp)
        }
    }

    fun formatDuration(seconds: Int): String {
        val minutes = seconds / 60
        val secs = seconds % 60
        return String.format(Locale.GERMAN, "%02d:%02d", minutes, secs)
    }
}
