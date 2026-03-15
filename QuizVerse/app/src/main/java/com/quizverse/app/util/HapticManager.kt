package com.quizverse.app.util

import android.content.Context
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import androidx.core.content.getSystemService

/**
 * Provides haptic feedback for in-game events.
 * Uses [VibrationEffect] on API 26+ and falls back to the deprecated [Vibrator.vibrate]
 * on older devices for maximum compatibility.
 *
 * Usage:
 *   val haptic = HapticManager(context)
 *   haptic.enabled = userPrefsEnabled
 *   haptic.vibrateCorrect()
 */
class HapticManager(context: Context) {

    /** Controls whether any vibration is triggered. Toggle from settings. */
    var enabled: Boolean = true

    private val vibrator: Vibrator = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        val manager = context.getSystemService<VibratorManager>()
        manager?.defaultVibrator
            ?: context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    } else {
        @Suppress("DEPRECATION")
        context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    }

    // ---- Public methods ----------------------------------------------------

    /** Short pleasant buzz for a correct answer. */
    fun vibrateCorrect() = vibrate(
        pattern   = longArrayOf(0, 50),
        amplitude = 80
    )

    /** Double buzz for a wrong answer. */
    fun vibrateWrong() = vibrate(
        pattern   = longArrayOf(0, 80, 60, 80),
        amplitude = 200
    )

    /** Long, strong buzz when the player levels up. */
    fun vibrateLevelUp() = vibrate(
        pattern   = longArrayOf(0, 100, 80, 100, 80, 200),
        amplitude = 255
    )

    /** Rapid short pulses to warn the player that time is running out. */
    fun vibrateWarning() = vibrate(
        pattern   = longArrayOf(0, 30, 30, 30),
        amplitude = 120
    )

    // ---- Private helpers --------------------------------------------------

    /**
     * Executes a vibration pattern.
     * On API 26+ each segment uses the given [amplitude] (0–255).
     * On older APIs, amplitude is not supported and only the [pattern] timings are used.
     *
     * @param pattern    Alternating off/on milliseconds as per [VibrationEffect.createWaveform].
     * @param amplitude  Vibration strength for API 26+ (0–255; 255 = max).
     */
    private fun vibrate(pattern: LongArray, amplitude: Int) {
        if (!enabled) return
        if (!vibrator.hasVibrator()) return

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val amplitudes = IntArray(pattern.size) { index ->
                // Even indices are "off" durations — use 0 amplitude; odd are "on"
                if (index % 2 == 0) 0 else amplitude
            }
            val effect = VibrationEffect.createWaveform(pattern, amplitudes, -1)
            vibrator.vibrate(effect)
        } else {
            @Suppress("DEPRECATION")
            vibrator.vibrate(pattern, -1)
        }
    }
}
