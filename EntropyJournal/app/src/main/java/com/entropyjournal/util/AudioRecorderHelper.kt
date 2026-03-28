package com.entropyjournal.util

import android.annotation.SuppressLint
import android.media.AudioFormat
import android.media.AudioRecord
import android.media.MediaRecorder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.withContext
import java.io.File
import java.io.FileOutputStream
import java.io.RandomAccessFile
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AudioRecorderHelper @Inject constructor() {

    private var audioRecord: AudioRecord? = null
    private var isRecording = false

    private val _amplitude = MutableStateFlow(0f)
    val amplitude: StateFlow<Float> = _amplitude

    private val _durationSeconds = MutableStateFlow(0)
    val durationSeconds: StateFlow<Int> = _durationSeconds

    private val sampleRate = Constants.AUDIO_SAMPLE_RATE // 16000
    private val channelConfig = AudioFormat.CHANNEL_IN_MONO
    private val audioFormat = AudioFormat.ENCODING_PCM_16BIT
    private val bufferSize = AudioRecord.getMinBufferSize(sampleRate, channelConfig, audioFormat)

    @SuppressLint("MissingPermission")
    suspend fun startRecording(outputFile: File): Unit = withContext(Dispatchers.IO) {
        if (isRecording) return@withContext

        audioRecord = AudioRecord(
            MediaRecorder.AudioSource.MIC,
            sampleRate,
            channelConfig,
            audioFormat,
            bufferSize * 2
        )

        isRecording = true
        _durationSeconds.value = 0

        audioRecord?.startRecording()

        val outputStream = FileOutputStream(outputFile)
        val buffer = ShortArray(bufferSize / 2)
        var totalSamplesWritten = 0L

        // Write placeholder WAV header (44 bytes), will be updated after recording
        val placeholderHeader = ByteArray(44)
        outputStream.write(placeholderHeader)

        val startTime = System.currentTimeMillis()

        try {
            while (isRecording && isActive) {
                val readCount = audioRecord?.read(buffer, 0, buffer.size) ?: 0
                if (readCount > 0) {
                    // Calculate amplitude for visualization
                    var sum = 0L
                    for (i in 0 until readCount) {
                        sum += buffer[i] * buffer[i]
                    }
                    val rms = Math.sqrt(sum.toDouble() / readCount).toFloat()
                    _amplitude.value = (rms / Short.MAX_VALUE).coerceIn(0f, 1f)

                    // Write PCM data as little-endian bytes
                    val byteBuffer = ByteArray(readCount * 2)
                    for (i in 0 until readCount) {
                        byteBuffer[i * 2] = (buffer[i].toInt() and 0xFF).toByte()
                        byteBuffer[i * 2 + 1] = (buffer[i].toInt() shr 8 and 0xFF).toByte()
                    }
                    outputStream.write(byteBuffer)
                    totalSamplesWritten += readCount

                    // Update duration
                    val elapsed = (System.currentTimeMillis() - startTime) / 1000
                    _durationSeconds.value = elapsed.toInt()
                }
            }
        } finally {
            outputStream.close()
        }

        // Update WAV header with correct file size
        val totalDataSize = totalSamplesWritten * 2 // 16-bit = 2 bytes per sample
        writeWavHeader(outputFile, totalDataSize)

        _amplitude.value = 0f
    }

    fun stopRecording() {
        isRecording = false
        audioRecord?.stop()
        audioRecord?.release()
        audioRecord = null
    }

    fun isCurrentlyRecording(): Boolean = isRecording

    private fun writeWavHeader(file: File, dataSize: Long) {
        val raf = RandomAccessFile(file, "rw")
        val totalFileSize = dataSize + 36 // 44 - 8 header bytes

        raf.seek(0)
        // RIFF header
        raf.writeBytes("RIFF")
        raf.writeIntLE((totalFileSize).toInt())
        raf.writeBytes("WAVE")

        // fmt sub-chunk
        raf.writeBytes("fmt ")
        raf.writeIntLE(16) // sub-chunk size
        raf.writeShortLE(1) // PCM format
        raf.writeShortLE(Constants.AUDIO_CHANNELS.toShort()) // mono
        raf.writeIntLE(sampleRate) // sample rate
        raf.writeIntLE(sampleRate * Constants.AUDIO_CHANNELS * 2) // byte rate
        raf.writeShortLE((Constants.AUDIO_CHANNELS * 2).toShort()) // block align
        raf.writeShortLE(16) // bits per sample

        // data sub-chunk
        raf.writeBytes("data")
        raf.writeIntLE(dataSize.toInt())

        raf.close()
    }
}

// Extension functions for little-endian writing to RandomAccessFile
private fun RandomAccessFile.writeIntLE(value: Int) {
    write(value and 0xFF)
    write((value shr 8) and 0xFF)
    write((value shr 16) and 0xFF)
    write((value shr 24) and 0xFF)
}

private fun RandomAccessFile.writeShortLE(value: Short) {
    write(value.toInt() and 0xFF)
    write((value.toInt() shr 8) and 0xFF)
}
