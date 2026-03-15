package com.quizverse.app.util

import android.content.Context
import android.media.AudioAttributes
import android.media.SoundPool
import com.quizverse.app.R

/**
 * Manages all in-game sound effects via Android's [SoundPool].
 * SoundPool is used for short, low-latency clips (correct, wrong, tick, etc.).
 *
 * Usage:
 *   val sounds = SoundManager(context)
 *   sounds.enabled = userPrefsEnabled
 *   sounds.playCorrect()
 */
class SoundManager(context: Context) {

    /** Controls whether any sounds are played. Toggle from settings. */
    var enabled: Boolean = true

    private val soundPool: SoundPool
    private var soundCorrect: Int     = 0
    private var soundWrong: Int       = 0
    private var soundLevelUp: Int     = 0
    private var soundTick: Int        = 0
    private var soundAchievement: Int = 0
    private var soundClick: Int       = 0

    init {
        val attributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_GAME)
            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
            .build()

        soundPool = SoundPool.Builder()
            .setMaxStreams(4)
            .setAudioAttributes(attributes)
            .build()

        // Load all sound resources — add the actual raw resource files under res/raw/
        soundCorrect     = loadSafe(context, R.raw.sound_correct)
        soundWrong       = loadSafe(context, R.raw.sound_wrong)
        soundLevelUp     = loadSafe(context, R.raw.sound_level_up)
        soundTick        = loadSafe(context, R.raw.sound_tick)
        soundAchievement = loadSafe(context, R.raw.sound_achievement)
        soundClick       = loadSafe(context, R.raw.sound_click)
    }

    // ---- Public methods ----------------------------------------------------

    /** Played when the player selects a correct answer. */
    fun playCorrect() = play(soundCorrect)

    /** Played when the player selects a wrong answer or time runs out. */
    fun playWrong() = play(soundWrong)

    /** Played when the player levels up. */
    fun playLevelUp() = play(soundLevelUp)

    /** Played every second of the countdown timer. */
    fun playTick() = play(soundTick, volume = 0.4f)

    /** Played when an achievement is unlocked. */
    fun playAchievement() = play(soundAchievement)

    /** Played on button taps and navigation actions. */
    fun playClick() = play(soundClick, volume = 0.6f)

    /** Releases all SoundPool resources. Call from the Activity/Application's onDestroy. */
    fun release() {
        soundPool.release()
    }

    // ---- Private helpers --------------------------------------------------

    private fun play(soundId: Int, volume: Float = 1.0f) {
        if (!enabled || soundId == 0) return
        soundPool.play(soundId, volume, volume, 1, 0, 1.0f)
    }

    /**
     * Loads a sound resource without throwing if the resource is missing.
     * Returns 0 (invalid ID) when the resource does not exist yet.
     */
    private fun loadSafe(context: Context, resId: Int): Int {
        return try {
            soundPool.load(context, resId, 1)
        } catch (e: Exception) {
            0
        }
    }
}
