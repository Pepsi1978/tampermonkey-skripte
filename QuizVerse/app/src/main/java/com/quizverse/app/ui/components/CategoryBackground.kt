package com.quizverse.app.ui.components

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.drawscope.withTransform
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

// ─────────────────────────────────────────────────────────────────────────────
// CategoryBackground
//
// Draws animated, category-specific background shapes behind screen content.
// All shapes are semi-transparent (alpha 0.08–0.15) to keep foreground readable.
// Uses only Canvas primitives — no external dependencies, no emoji.
// ─────────────────────────────────────────────────────────────────────────────

/**
 * Full-screen animated background layer for a quiz category screen.
 *
 * Place this composable BEHIND the main content using a Box:
 * ```
 * Box {
 *     CategoryBackground(categoryId = 1)
 *     // … your content …
 * }
 * ```
 *
 * @param categoryId  The quiz category (1–14). Unknown IDs fall back to a
 *                    neutral star/circle mix using the brand primary colour.
 */
@Composable
fun CategoryBackground(categoryId: Int) {
    // ── Shared infinite transition ────────────────────────────────────────────
    val transition = rememberInfiniteTransition(label = "catBg_$categoryId")

    // Float offsets — three speeds so elements don't move in lockstep
    val floatA by transition.animateFloat(
        initialValue = 0f, targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(3500, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "floatA",
    )
    val floatB by transition.animateFloat(
        initialValue = 1f, targetValue = 0f,
        animationSpec = infiniteRepeatable(
            animation = tween(4200, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "floatB",
    )
    val floatC by transition.animateFloat(
        initialValue = 0f, targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(5000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "floatC",
    )

    // Horizontal drift — two different speeds
    val driftX1 by transition.animateFloat(
        initialValue = -1f, targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(5500, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "driftX1",
    )
    val driftX2 by transition.animateFloat(
        initialValue = 1f, targetValue = -1f,
        animationSpec = infiniteRepeatable(
            animation = tween(6000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "driftX2",
    )

    // Single continuous rotation 0→360°
    val rotation by transition.animateFloat(
        initialValue = 0f, targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(10000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart,
        ),
        label = "rotation",
    )

    Canvas(modifier = Modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height

        // Amplitude helpers — scale float [-1..1] → pixel offset
        fun vAmp(f: Float, scale: Float = 28f) = f * scale
        fun hAmp(f: Float, scale: Float = 22f) = f * scale

        when (categoryId) {

            // ─── 1 · Geography ────────────────────────────────────────────────
            // Circles (globes), triangles (mountains), wavy lines (rivers)
            1 -> {
                val c = Color(0xFF22C55E)

                // Large globe outline – top-left, slow drift
                drawGlobeOutline(
                    color  = c.copy(alpha = 0.10f),
                    center = Offset(w * 0.12f + hAmp(driftX1), h * 0.18f + vAmp(floatA)),
                    radius = w * 0.10f,
                    strokeWidth = 3f,
                )
                // Small globe – bottom-right
                drawGlobeOutline(
                    color  = c.copy(alpha = 0.08f),
                    center = Offset(w * 0.85f + hAmp(driftX2), h * 0.75f + vAmp(floatB)),
                    radius = w * 0.07f,
                    strokeWidth = 2f,
                )
                // Mountain triangle – top-right
                drawMountainTriangle(
                    color  = c.copy(alpha = 0.12f),
                    tip    = Offset(w * 0.80f + hAmp(driftX1, 14f), h * 0.08f + vAmp(floatC, 18f)),
                    base   = w * 0.14f,
                    height = h * 0.10f,
                )
                // Mountain triangle – bottom-left
                drawMountainTriangle(
                    color  = c.copy(alpha = 0.09f),
                    tip    = Offset(w * 0.20f + hAmp(driftX2, 10f), h * 0.55f + vAmp(floatA, 20f)),
                    base   = w * 0.10f,
                    height = h * 0.07f,
                )
                // Wavy river line – middle horizontal
                drawWavyLine(
                    color       = c.copy(alpha = 0.10f),
                    startX      = w * 0.05f,
                    endX        = w * 0.45f,
                    baseY       = h * 0.40f + vAmp(floatB, 25f),
                    amplitude   = h * 0.02f,
                    segments    = 6,
                    strokeWidth = 3f,
                )
                // Wavy river line – lower right
                drawWavyLine(
                    color       = c.copy(alpha = 0.08f),
                    startX      = w * 0.55f,
                    endX        = w * 0.95f,
                    baseY       = h * 0.65f + vAmp(floatC, 20f),
                    amplitude   = h * 0.015f,
                    segments    = 5,
                    strokeWidth = 2f,
                )
                // Rotating globe accent – centre
                rotate(rotation * 0.4f, Offset(w * 0.5f, h * 0.5f)) {
                    drawGlobeOutline(
                        color  = c.copy(alpha = 0.06f),
                        center = Offset(w * 0.5f, h * 0.5f),
                        radius = w * 0.18f,
                        strokeWidth = 1.5f,
                    )
                }
            }

            // ─── 2 · Science ──────────────────────────────────────────────────
            // Atom rings, molecule dots, crystal diamonds
            2 -> {
                val c = Color(0xFF3B82F6)

                // Atom – top-left
                drawAtomRings(
                    color  = c.copy(alpha = 0.12f),
                    center = Offset(w * 0.18f + hAmp(driftX1), h * 0.15f + vAmp(floatA)),
                    radius = w * 0.09f,
                    rotation = rotation,
                    strokeWidth = 2.5f,
                )
                // Atom – bottom-right
                drawAtomRings(
                    color  = c.copy(alpha = 0.09f),
                    center = Offset(w * 0.78f + hAmp(driftX2), h * 0.78f + vAmp(floatB)),
                    radius = w * 0.07f,
                    rotation = rotation * 0.7f,
                    strokeWidth = 2f,
                )
                // Crystal diamond – top-right
                drawDiamond(
                    color  = c.copy(alpha = 0.11f),
                    center = Offset(w * 0.82f + hAmp(driftX1, 12f), h * 0.22f + vAmp(floatC, 22f)),
                    width  = w * 0.08f,
                    height = h * 0.06f,
                    strokeWidth = 2f,
                )
                // Crystal diamond – left middle
                drawDiamond(
                    color  = c.copy(alpha = 0.09f),
                    center = Offset(w * 0.10f + hAmp(driftX2, 10f), h * 0.55f + vAmp(floatA, 18f)),
                    width  = w * 0.06f,
                    height = h * 0.04f,
                    strokeWidth = 1.5f,
                )
                // Molecule dot cluster – centre-right
                drawMoleculeDots(
                    color  = c.copy(alpha = 0.10f),
                    center = Offset(w * 0.65f + hAmp(driftX1, 16f), h * 0.42f + vAmp(floatB, 20f)),
                    dotRadius = 5f,
                    bondLength = w * 0.05f,
                )
                // Small nucleus dot – bottom-left
                drawCircle(
                    color  = c.copy(alpha = 0.13f),
                    radius = w * 0.025f,
                    center = Offset(w * 0.25f + hAmp(driftX2, 8f), h * 0.82f + vAmp(floatC, 15f)),
                )
                // Large rotating atom ring – background
                rotate(rotation * 0.3f, Offset(w * 0.5f, h * 0.5f)) {
                    drawAtomRings(
                        color  = c.copy(alpha = 0.05f),
                        center = Offset(w * 0.5f, h * 0.5f),
                        radius = w * 0.22f,
                        rotation = 0f,
                        strokeWidth = 1.5f,
                    )
                }
            }

            // ─── 3 · History ──────────────────────────────────────────────────
            // Scrolls (rectangles), order stars, clock circles
            3 -> {
                val c = Color(0xFFF97316) // matches HistoryStart in theme

                // Scroll rectangle – top-left
                drawScroll(
                    color  = c.copy(alpha = 0.11f),
                    center = Offset(w * 0.15f + hAmp(driftX1), h * 0.16f + vAmp(floatA)),
                    width  = w * 0.10f,
                    height = h * 0.07f,
                    strokeWidth = 2.5f,
                )
                // Scroll rectangle – right middle
                drawScroll(
                    color  = c.copy(alpha = 0.09f),
                    center = Offset(w * 0.82f + hAmp(driftX2), h * 0.48f + vAmp(floatB)),
                    width  = w * 0.08f,
                    height = h * 0.055f,
                    strokeWidth = 2f,
                )
                // Order star – top-right
                drawStar(
                    color  = c.copy(alpha = 0.12f),
                    center = Offset(w * 0.78f + hAmp(driftX1, 14f), h * 0.12f + vAmp(floatC)),
                    outerR = w * 0.06f,
                    innerR = w * 0.025f,
                    points = 6,
                    rotationDeg = rotation * 0.5f,
                )
                // Order star – bottom-left
                drawStar(
                    color  = c.copy(alpha = 0.10f),
                    center = Offset(w * 0.20f + hAmp(driftX2, 10f), h * 0.80f + vAmp(floatA, 20f)),
                    outerR = w * 0.04f,
                    innerR = w * 0.017f,
                    points = 6,
                    rotationDeg = rotation * 0.35f,
                )
                // Clock circle – centre-left
                drawClockCircle(
                    color  = c.copy(alpha = 0.10f),
                    center = Offset(w * 0.30f + hAmp(driftX1, 18f), h * 0.52f + vAmp(floatB, 22f)),
                    radius = w * 0.07f,
                    rotation = rotation,
                    strokeWidth = 2f,
                )
                // Clock circle – bottom-right
                drawClockCircle(
                    color  = c.copy(alpha = 0.08f),
                    center = Offset(w * 0.72f + hAmp(driftX2, 12f), h * 0.74f + vAmp(floatC, 18f)),
                    radius = w * 0.05f,
                    rotation = rotation * 1.3f,
                    strokeWidth = 1.5f,
                )
                // Large faded scroll – background
                drawScroll(
                    color  = c.copy(alpha = 0.04f),
                    center = Offset(w * 0.5f + hAmp(driftX1, 8f), h * 0.5f + vAmp(floatA, 10f)),
                    width  = w * 0.28f,
                    height = h * 0.18f,
                    strokeWidth = 1.5f,
                )
            }

            // ─── 4 · Film ─────────────────────────────────────────────────────
            // Film strips (rectangles), Hollywood stars, spotlights (circles)
            4 -> {
                val c = Color(0xFFEC4899) // matches FilmStart

                // Film strip – top horizontal
                drawFilmStrip(
                    color  = c.copy(alpha = 0.11f),
                    topLeft = Offset(w * 0.05f, h * 0.08f + vAmp(floatA, 18f)),
                    width  = w * 0.38f,
                    height = h * 0.06f,
                    frames = 4,
                    strokeWidth = 2f,
                )
                // Film strip – bottom right
                drawFilmStrip(
                    color  = c.copy(alpha = 0.09f),
                    topLeft = Offset(w * 0.55f + hAmp(driftX2, 10f), h * 0.82f + vAmp(floatB, 14f)),
                    width  = w * 0.38f,
                    height = h * 0.05f,
                    frames = 4,
                    strokeWidth = 1.5f,
                )
                // Hollywood star – top-right
                drawStar(
                    color  = c.copy(alpha = 0.13f),
                    center = Offset(w * 0.82f + hAmp(driftX1, 12f), h * 0.18f + vAmp(floatC, 20f)),
                    outerR = w * 0.07f,
                    innerR = w * 0.030f,
                    points = 5,
                    rotationDeg = rotation * 0.4f,
                )
                // Hollywood star – left middle
                drawStar(
                    color  = c.copy(alpha = 0.10f),
                    center = Offset(w * 0.15f + hAmp(driftX2, 14f), h * 0.46f + vAmp(floatA, 22f)),
                    outerR = w * 0.05f,
                    innerR = w * 0.022f,
                    points = 5,
                    rotationDeg = rotation * 0.6f,
                )
                // Spotlight circle – top-left
                drawCircle(
                    color  = c.copy(alpha = 0.08f),
                    radius = w * 0.09f,
                    center = Offset(w * 0.18f + hAmp(driftX1, 16f), h * 0.20f + vAmp(floatB, 18f)),
                )
                drawCircle(
                    color  = c.copy(alpha = 0.04f),
                    radius = w * 0.14f,
                    center = Offset(w * 0.18f + hAmp(driftX1, 16f), h * 0.20f + vAmp(floatB, 18f)),
                )
                // Spotlight circle – bottom-right
                drawCircle(
                    color  = c.copy(alpha = 0.07f),
                    radius = w * 0.08f,
                    center = Offset(w * 0.75f + hAmp(driftX2), h * 0.62f + vAmp(floatC, 20f)),
                )
            }

            // ─── 5 · Music ────────────────────────────────────────────────────
            // Note ovals, sound waves (wavy lines), circles
            5 -> {
                val c = Color(0xFF8B5CF6)

                // Sound wave – upper left
                drawWavyLine(
                    color       = c.copy(alpha = 0.11f),
                    startX      = w * 0.05f,
                    endX        = w * 0.50f,
                    baseY       = h * 0.22f + vAmp(floatA, 20f),
                    amplitude   = h * 0.025f,
                    segments    = 7,
                    strokeWidth = 3f,
                )
                // Sound wave – lower right
                drawWavyLine(
                    color       = c.copy(alpha = 0.09f),
                    startX      = w * 0.50f,
                    endX        = w * 0.95f,
                    baseY       = h * 0.70f + vAmp(floatB, 18f),
                    amplitude   = h * 0.020f,
                    segments    = 6,
                    strokeWidth = 2.5f,
                )
                // Musical note oval – top-right
                drawNoteOval(
                    color  = c.copy(alpha = 0.12f),
                    center = Offset(w * 0.78f + hAmp(driftX1, 12f), h * 0.16f + vAmp(floatC, 20f)),
                    rx = w * 0.055f,
                    ry = h * 0.038f,
                    rotation = rotation * 0.6f,
                )
                // Musical note oval – left middle
                drawNoteOval(
                    color  = c.copy(alpha = 0.10f),
                    center = Offset(w * 0.20f + hAmp(driftX2, 14f), h * 0.54f + vAmp(floatA, 22f)),
                    rx = w * 0.045f,
                    ry = h * 0.030f,
                    rotation = rotation * 0.4f,
                )
                // Resonance circle – centre
                drawCircle(
                    color  = c.copy(alpha = 0.07f),
                    radius = w * 0.15f,
                    center = Offset(w * 0.5f + hAmp(driftX1, 10f), h * 0.5f + vAmp(floatB, 12f)),
                    style  = Stroke(width = 2f),
                )
                drawCircle(
                    color  = c.copy(alpha = 0.05f),
                    radius = w * 0.25f,
                    center = Offset(w * 0.5f + hAmp(driftX1, 10f), h * 0.5f + vAmp(floatB, 12f)),
                    style  = Stroke(width = 1.5f),
                )
                // Small beat circle – bottom-left
                drawCircle(
                    color  = c.copy(alpha = 0.10f),
                    radius = w * 0.04f,
                    center = Offset(w * 0.22f + hAmp(driftX2, 8f), h * 0.82f + vAmp(floatC, 16f)),
                )
            }

            // ─── 6 · Sport ────────────────────────────────────────────────────
            // Balls (circles), Olympic rings, goal triangles
            6 -> {
                val c = Color(0xFF22C55E)

                // Ball – top-left
                drawBallCircle(
                    color  = c.copy(alpha = 0.11f),
                    center = Offset(w * 0.15f + hAmp(driftX1), h * 0.18f + vAmp(floatA)),
                    radius = w * 0.07f,
                    strokeWidth = 2.5f,
                )
                // Ball – right middle
                drawBallCircle(
                    color  = c.copy(alpha = 0.09f),
                    center = Offset(w * 0.82f + hAmp(driftX2), h * 0.50f + vAmp(floatB)),
                    radius = w * 0.055f,
                    strokeWidth = 2f,
                )
                // Olympic rings – lower
                drawOlympicRings(
                    color  = c.copy(alpha = 0.08f),
                    center = Offset(w * 0.50f + hAmp(driftX1, 8f), h * 0.78f + vAmp(floatC, 16f)),
                    ringR  = w * 0.05f,
                    strokeWidth = 2f,
                )
                // Goal triangle – top-right
                drawMountainTriangle(
                    color  = c.copy(alpha = 0.10f),
                    tip    = Offset(w * 0.80f + hAmp(driftX2, 12f), h * 0.10f + vAmp(floatA, 18f)),
                    base   = w * 0.10f,
                    height = h * 0.08f,
                )
                // Goal triangle – bottom-left
                drawMountainTriangle(
                    color  = c.copy(alpha = 0.08f),
                    tip    = Offset(w * 0.22f + hAmp(driftX1, 10f), h * 0.58f + vAmp(floatB, 20f)),
                    base   = w * 0.08f,
                    height = h * 0.06f,
                )
                // Large faded ball – background accent
                drawCircle(
                    color  = c.copy(alpha = 0.04f),
                    radius = w * 0.22f,
                    center = Offset(w * 0.5f, h * 0.35f + vAmp(floatC, 8f)),
                    style  = Stroke(width = 1.5f),
                )
            }

            // ─── 7 · Technology ───────────────────────────────────────────────
            // Chip rectangles, data diamonds, pixel squares
            7 -> {
                val c = Color(0xFF3B82F6)

                // Chip rectangle – top-left
                drawChipRect(
                    color  = c.copy(alpha = 0.12f),
                    center = Offset(w * 0.18f + hAmp(driftX1), h * 0.15f + vAmp(floatA)),
                    width  = w * 0.12f,
                    height = w * 0.08f,
                    pins   = 3,
                    strokeWidth = 2f,
                )
                // Chip rectangle – bottom-right
                drawChipRect(
                    color  = c.copy(alpha = 0.09f),
                    center = Offset(w * 0.78f + hAmp(driftX2), h * 0.75f + vAmp(floatB)),
                    width  = w * 0.10f,
                    height = w * 0.066f,
                    pins   = 3,
                    strokeWidth = 1.5f,
                )
                // Data diamond – top-right
                drawDiamond(
                    color  = c.copy(alpha = 0.11f),
                    center = Offset(w * 0.80f + hAmp(driftX1, 14f), h * 0.20f + vAmp(floatC, 20f)),
                    width  = w * 0.07f,
                    height = h * 0.05f,
                    strokeWidth = 2f,
                )
                // Data diamond – left middle
                drawDiamond(
                    color  = c.copy(alpha = 0.09f),
                    center = Offset(w * 0.12f + hAmp(driftX2, 10f), h * 0.55f + vAmp(floatA, 18f)),
                    width  = w * 0.05f,
                    height = h * 0.035f,
                    strokeWidth = 1.5f,
                )
                // Pixel squares cluster – right
                drawPixelCluster(
                    color  = c.copy(alpha = 0.10f),
                    topLeft = Offset(w * 0.60f + hAmp(driftX1, 12f), h * 0.38f + vAmp(floatB, 18f)),
                    pixelSize = w * 0.022f,
                    gap = w * 0.008f,
                    cols = 3, rows = 3,
                )
                // Pixel squares cluster – bottom-left
                drawPixelCluster(
                    color  = c.copy(alpha = 0.08f),
                    topLeft = Offset(w * 0.08f + hAmp(driftX2, 8f), h * 0.72f + vAmp(floatC, 14f)),
                    pixelSize = w * 0.018f,
                    gap = w * 0.007f,
                    cols = 3, rows = 3,
                )
                // Rotating circuit ring – background
                rotate(rotation * 0.25f, Offset(w * 0.5f, h * 0.5f)) {
                    drawChipRect(
                        color  = c.copy(alpha = 0.04f),
                        center = Offset(w * 0.5f, h * 0.5f),
                        width  = w * 0.35f,
                        height = w * 0.22f,
                        pins   = 4,
                        strokeWidth = 1f,
                    )
                }
            }

            // ─── 8 · Food ─────────────────────────────────────────────────────
            // Plate circles, fruit ovals, pizza triangles
            8 -> {
                val c = Color(0xFFF59E0B)

                // Plate circle – top-left
                drawPlateCircle(
                    color  = c.copy(alpha = 0.11f),
                    center = Offset(w * 0.16f + hAmp(driftX1), h * 0.18f + vAmp(floatA)),
                    radius = w * 0.08f,
                    strokeWidth = 2.5f,
                )
                // Plate circle – right middle
                drawPlateCircle(
                    color  = c.copy(alpha = 0.09f),
                    center = Offset(w * 0.82f + hAmp(driftX2), h * 0.52f + vAmp(floatB)),
                    radius = w * 0.06f,
                    strokeWidth = 2f,
                )
                // Fruit oval – top-right
                drawNoteOval(
                    color  = c.copy(alpha = 0.12f),
                    center = Offset(w * 0.78f + hAmp(driftX1, 12f), h * 0.14f + vAmp(floatC, 20f)),
                    rx = w * 0.065f,
                    ry = h * 0.040f,
                    rotation = rotation * 0.3f,
                )
                // Fruit oval – bottom-left
                drawNoteOval(
                    color  = c.copy(alpha = 0.09f),
                    center = Offset(w * 0.22f + hAmp(driftX2, 12f), h * 0.76f + vAmp(floatA, 18f)),
                    rx = w * 0.050f,
                    ry = h * 0.032f,
                    rotation = rotation * 0.4f,
                )
                // Pizza triangle – right-lower
                drawMountainTriangle(
                    color  = c.copy(alpha = 0.11f),
                    tip    = Offset(w * 0.72f + hAmp(driftX1, 10f), h * 0.62f + vAmp(floatB, 20f)),
                    base   = w * 0.11f,
                    height = h * 0.09f,
                )
                // Pizza triangle – upper area
                drawMountainTriangle(
                    color  = c.copy(alpha = 0.08f),
                    tip    = Offset(w * 0.40f + hAmp(driftX2, 14f), h * 0.28f + vAmp(floatC, 18f)),
                    base   = w * 0.08f,
                    height = h * 0.065f,
                )
                // Small fruit dot – bottom-right
                drawCircle(
                    color  = c.copy(alpha = 0.10f),
                    radius = w * 0.030f,
                    center = Offset(w * 0.85f + hAmp(driftX2, 6f), h * 0.85f + vAmp(floatA, 12f)),
                )
            }

            // ─── 9 · Animals ──────────────────────────────────────────────────
            // Paw circles, eggs (ovals), snake paths (wavy)
            9 -> {
                val c = Color(0xFF14B8A6)

                // Paw print set – top-left
                drawPawGroup(
                    color  = c.copy(alpha = 0.12f),
                    center = Offset(w * 0.18f + hAmp(driftX1), h * 0.18f + vAmp(floatA)),
                    scale  = w * 0.07f,
                )
                // Paw print set – bottom-right
                drawPawGroup(
                    color  = c.copy(alpha = 0.09f),
                    center = Offset(w * 0.78f + hAmp(driftX2), h * 0.76f + vAmp(floatB)),
                    scale  = w * 0.055f,
                )
                // Egg oval – top-right
                drawEggOval(
                    color  = c.copy(alpha = 0.11f),
                    center = Offset(w * 0.80f + hAmp(driftX1, 12f), h * 0.15f + vAmp(floatC, 18f)),
                    rx = w * 0.045f,
                    ry = h * 0.060f,
                )
                // Egg oval – left middle
                drawEggOval(
                    color  = c.copy(alpha = 0.09f),
                    center = Offset(w * 0.12f + hAmp(driftX2, 10f), h * 0.54f + vAmp(floatA, 20f)),
                    rx = w * 0.035f,
                    ry = h * 0.046f,
                )
                // Snake path – upper
                drawWavyLine(
                    color       = c.copy(alpha = 0.10f),
                    startX      = w * 0.30f,
                    endX        = w * 0.75f,
                    baseY       = h * 0.35f + vAmp(floatB, 22f),
                    amplitude   = h * 0.030f,
                    segments    = 8,
                    strokeWidth = 4f,
                )
                // Snake path – lower
                drawWavyLine(
                    color       = c.copy(alpha = 0.08f),
                    startX      = w * 0.10f,
                    endX        = w * 0.55f,
                    baseY       = h * 0.68f + vAmp(floatC, 18f),
                    amplitude   = h * 0.022f,
                    segments    = 7,
                    strokeWidth = 3f,
                )
                // Small paw single – centre right
                drawCircle(
                    color  = c.copy(alpha = 0.10f),
                    radius = w * 0.022f,
                    center = Offset(w * 0.62f + hAmp(driftX1, 8f), h * 0.52f + vAmp(floatA, 14f)),
                )
            }

            // ─── 10 · Literature ──────────────────────────────────────────────
            // Books (rectangles), open pages (triangles), text lines
            10 -> {
                val c = Color(0xFF8B5CF6)

                // Book rectangle – top-left
                drawBookRect(
                    color  = c.copy(alpha = 0.12f),
                    center = Offset(w * 0.16f + hAmp(driftX1), h * 0.17f + vAmp(floatA)),
                    width  = w * 0.09f,
                    height = h * 0.08f,
                    strokeWidth = 2.5f,
                )
                // Book rectangle – bottom-right
                drawBookRect(
                    color  = c.copy(alpha = 0.09f),
                    center = Offset(w * 0.80f + hAmp(driftX2), h * 0.75f + vAmp(floatB)),
                    width  = w * 0.08f,
                    height = h * 0.066f,
                    strokeWidth = 2f,
                )
                // Open page triangle – top-right
                drawOpenPageTriangle(
                    color  = c.copy(alpha = 0.11f),
                    center = Offset(w * 0.76f + hAmp(driftX1, 12f), h * 0.20f + vAmp(floatC, 18f)),
                    spread = w * 0.09f,
                    height = h * 0.06f,
                )
                // Open page triangle – left
                drawOpenPageTriangle(
                    color  = c.copy(alpha = 0.09f),
                    center = Offset(w * 0.22f + hAmp(driftX2, 10f), h * 0.54f + vAmp(floatA, 20f)),
                    spread = w * 0.07f,
                    height = h * 0.046f,
                )
                // Text lines group – centre-right
                drawTextLines(
                    color  = c.copy(alpha = 0.09f),
                    topLeft = Offset(w * 0.55f + hAmp(driftX1, 14f), h * 0.42f + vAmp(floatB, 16f)),
                    lineWidth = w * 0.18f,
                    lines = 4,
                    lineSpacing = h * 0.018f,
                    strokeWidth = 2f,
                )
                // Text lines group – bottom-left
                drawTextLines(
                    color  = c.copy(alpha = 0.07f),
                    topLeft = Offset(w * 0.06f + hAmp(driftX2, 8f), h * 0.72f + vAmp(floatC, 14f)),
                    lineWidth = w * 0.15f,
                    lines = 3,
                    lineSpacing = h * 0.015f,
                    strokeWidth = 1.5f,
                )
                // Rotating book accent – background
                rotate(rotation * 0.2f, Offset(w * 0.5f, h * 0.5f)) {
                    drawBookRect(
                        color  = c.copy(alpha = 0.04f),
                        center = Offset(w * 0.5f, h * 0.5f),
                        width  = w * 0.26f,
                        height = h * 0.20f,
                        strokeWidth = 1f,
                    )
                }
            }

            // ─── 11 · All Categories (Mixed) ──────────────────────────────────
            // Stars, circles, triangles in multiple accent colours
            11 -> {
                val colors = listOf(
                    Color(0xFFF43F5E), Color(0xFF3B82F6), Color(0xFF22C55E),
                    Color(0xFFF59E0B), Color(0xFF8B5CF6), Color(0xFF14B8A6),
                )

                // Star top-left – rose
                drawStar(
                    color  = colors[0].copy(alpha = 0.12f),
                    center = Offset(w * 0.15f + hAmp(driftX1), h * 0.14f + vAmp(floatA)),
                    outerR = w * 0.07f, innerR = w * 0.030f, points = 5,
                    rotationDeg = rotation * 0.5f,
                )
                // Circle top-right – blue
                drawCircle(
                    color  = colors[1].copy(alpha = 0.10f),
                    radius = w * 0.07f,
                    center = Offset(w * 0.82f + hAmp(driftX2, 12f), h * 0.16f + vAmp(floatB)),
                    style  = Stroke(width = 2.5f),
                )
                // Triangle right-middle – green
                drawMountainTriangle(
                    color  = colors[2].copy(alpha = 0.11f),
                    tip    = Offset(w * 0.86f + hAmp(driftX1, 10f), h * 0.45f + vAmp(floatC, 20f)),
                    base   = w * 0.09f, height = h * 0.07f,
                )
                // Star bottom-right – amber
                drawStar(
                    color  = colors[3].copy(alpha = 0.12f),
                    center = Offset(w * 0.78f + hAmp(driftX2), h * 0.80f + vAmp(floatA, 18f)),
                    outerR = w * 0.06f, innerR = w * 0.025f, points = 5,
                    rotationDeg = rotation * 0.6f,
                )
                // Circle bottom-left – violet
                drawCircle(
                    color  = colors[4].copy(alpha = 0.10f),
                    radius = w * 0.06f,
                    center = Offset(w * 0.18f + hAmp(driftX1, 14f), h * 0.78f + vAmp(floatB, 18f)),
                )
                // Diamond centre – teal
                drawDiamond(
                    color  = colors[5].copy(alpha = 0.10f),
                    center = Offset(w * 0.5f + hAmp(driftX2, 10f), h * 0.5f + vAmp(floatC, 14f)),
                    width  = w * 0.10f, height = h * 0.07f, strokeWidth = 2f,
                )
                // Large rotating star – background
                drawStar(
                    color  = colors[0].copy(alpha = 0.04f),
                    center = Offset(w * 0.5f, h * 0.5f),
                    outerR = w * 0.25f, innerR = w * 0.10f, points = 6,
                    rotationDeg = rotation * 0.2f,
                )
            }

            // ─── 12 · Logic ───────────────────────────────────────────────────
            // Gear-like circles, diamonds, puzzle squares
            12 -> {
                val c = Color(0xFF0EA5E9)

                // Gear circle – top-left
                drawGearCircle(
                    color  = c.copy(alpha = 0.12f),
                    center = Offset(w * 0.16f + hAmp(driftX1), h * 0.17f + vAmp(floatA)),
                    radius = w * 0.08f,
                    teeth  = 8,
                    toothDepth = w * 0.022f,
                    rotation = rotation,
                    strokeWidth = 2f,
                )
                // Gear circle – bottom-right (counter-rotate)
                drawGearCircle(
                    color  = c.copy(alpha = 0.09f),
                    center = Offset(w * 0.80f + hAmp(driftX2), h * 0.76f + vAmp(floatB)),
                    radius = w * 0.06f,
                    teeth  = 6,
                    toothDepth = w * 0.017f,
                    rotation = -rotation,
                    strokeWidth = 1.5f,
                )
                // Diamond – top-right
                drawDiamond(
                    color  = c.copy(alpha = 0.11f),
                    center = Offset(w * 0.80f + hAmp(driftX1, 12f), h * 0.20f + vAmp(floatC, 20f)),
                    width  = w * 0.08f, height = h * 0.055f, strokeWidth = 2f,
                )
                // Diamond – left middle
                drawDiamond(
                    color  = c.copy(alpha = 0.09f),
                    center = Offset(w * 0.14f + hAmp(driftX2, 10f), h * 0.56f + vAmp(floatA, 18f)),
                    width  = w * 0.06f, height = h * 0.040f, strokeWidth = 1.5f,
                )
                // Puzzle square cluster – centre-right
                drawPuzzleSquares(
                    color  = c.copy(alpha = 0.10f),
                    topLeft = Offset(w * 0.58f + hAmp(driftX1, 14f), h * 0.40f + vAmp(floatB, 18f)),
                    size   = w * 0.07f,
                    strokeWidth = 2f,
                )
                // Puzzle square cluster – bottom-left
                drawPuzzleSquares(
                    color  = c.copy(alpha = 0.08f),
                    topLeft = Offset(w * 0.08f + hAmp(driftX2, 8f), h * 0.72f + vAmp(floatC, 14f)),
                    size   = w * 0.055f,
                    strokeWidth = 1.5f,
                )
                // Large gear – background
                drawGearCircle(
                    color  = c.copy(alpha = 0.04f),
                    center = Offset(w * 0.5f, h * 0.5f),
                    radius = w * 0.20f,
                    teeth  = 12,
                    toothDepth = w * 0.035f,
                    rotation = rotation * 0.3f,
                    strokeWidth = 1.5f,
                )
            }

            // ─── 13 · Hertha BSC ──────────────────────────────────────────────
            // Circles and wave lines in blue/white tones
            13 -> {
                val cBlue  = Color(0xFF1A5276)
                val cLight = Color(0xFF2E86C1)

                // Large crest circle – top-centre
                drawCircle(
                    color  = cBlue.copy(alpha = 0.13f),
                    radius = w * 0.12f,
                    center = Offset(w * 0.50f + hAmp(driftX1, 10f), h * 0.14f + vAmp(floatA)),
                    style  = Stroke(width = 3f),
                )
                // Inner crest ring
                drawCircle(
                    color  = cLight.copy(alpha = 0.09f),
                    radius = w * 0.07f,
                    center = Offset(w * 0.50f + hAmp(driftX1, 10f), h * 0.14f + vAmp(floatA)),
                    style  = Stroke(width = 2f),
                )
                // Wave – upper band
                drawWavyLine(
                    color       = cLight.copy(alpha = 0.12f),
                    startX      = w * 0.04f,
                    endX        = w * 0.96f,
                    baseY       = h * 0.30f + vAmp(floatB, 20f),
                    amplitude   = h * 0.020f,
                    segments    = 9,
                    strokeWidth = 3f,
                )
                // Wave – lower band
                drawWavyLine(
                    color       = cBlue.copy(alpha = 0.10f),
                    startX      = w * 0.04f,
                    endX        = w * 0.96f,
                    baseY       = h * 0.64f + vAmp(floatC, 18f),
                    amplitude   = h * 0.018f,
                    segments    = 9,
                    strokeWidth = 2.5f,
                )
                // Circle – bottom-left
                drawCircle(
                    color  = cBlue.copy(alpha = 0.10f),
                    radius = w * 0.07f,
                    center = Offset(w * 0.18f + hAmp(driftX2, 12f), h * 0.76f + vAmp(floatA, 18f)),
                    style  = Stroke(width = 2f),
                )
                // Circle – bottom-right
                drawCircle(
                    color  = cLight.copy(alpha = 0.09f),
                    radius = w * 0.055f,
                    center = Offset(w * 0.80f + hAmp(driftX1, 14f), h * 0.80f + vAmp(floatB, 16f)),
                    style  = Stroke(width = 2f),
                )
                // Rotating outer ring – background
                rotate(rotation * 0.15f, Offset(w * 0.5f, h * 0.5f)) {
                    drawCircle(
                        color  = cBlue.copy(alpha = 0.04f),
                        radius = w * 0.28f,
                        center = Offset(w * 0.5f, h * 0.5f),
                        style  = Stroke(width = 1.5f),
                    )
                }
            }

            // ─── 14 · BVB Dortmund ────────────────────────────────────────────
            // Circles and triangles in yellow/black tones
            14 -> {
                val cYellow = Color(0xFFFDD835)
                val cDark   = Color(0xFF212121)

                // Bold circle – top-left
                drawCircle(
                    color  = cYellow.copy(alpha = 0.15f),
                    radius = w * 0.10f,
                    center = Offset(w * 0.16f + hAmp(driftX1), h * 0.16f + vAmp(floatA)),
                    style  = Stroke(width = 3f),
                )
                // Filled circle accent – top-left
                drawCircle(
                    color  = cYellow.copy(alpha = 0.07f),
                    radius = w * 0.07f,
                    center = Offset(w * 0.16f + hAmp(driftX1), h * 0.16f + vAmp(floatA)),
                )
                // Triangle – right
                drawMountainTriangle(
                    color  = cYellow.copy(alpha = 0.13f),
                    tip    = Offset(w * 0.85f + hAmp(driftX2, 10f), h * 0.30f + vAmp(floatB, 18f)),
                    base   = w * 0.12f, height = h * 0.09f,
                )
                // Triangle – lower-left
                drawMountainTriangle(
                    color  = cDark.copy(alpha = 0.08f),
                    tip    = Offset(w * 0.28f + hAmp(driftX1, 12f), h * 0.68f + vAmp(floatC, 18f)),
                    base   = w * 0.10f, height = h * 0.08f,
                )
                // Small circle – right-lower
                drawCircle(
                    color  = cYellow.copy(alpha = 0.11f),
                    radius = w * 0.055f,
                    center = Offset(w * 0.78f + hAmp(driftX2, 10f), h * 0.72f + vAmp(floatA, 16f)),
                    style  = Stroke(width = 2f),
                )
                // Star – centre
                drawStar(
                    color  = cYellow.copy(alpha = 0.10f),
                    center = Offset(w * 0.50f + hAmp(driftX1, 8f), h * 0.52f + vAmp(floatB, 14f)),
                    outerR = w * 0.08f, innerR = w * 0.035f, points = 5,
                    rotationDeg = rotation * 0.4f,
                )
                // Large circle – background
                drawCircle(
                    color  = cYellow.copy(alpha = 0.04f),
                    radius = w * 0.28f,
                    center = Offset(w * 0.5f, h * 0.5f + vAmp(floatC, 6f)),
                    style  = Stroke(width = 2f),
                )
                // Dark accent – background triangle
                drawMountainTriangle(
                    color  = cDark.copy(alpha = 0.05f),
                    tip    = Offset(w * 0.50f, h * 0.10f),
                    base   = w * 0.50f, height = h * 0.35f,
                )
            }

            // ─── Fallback ─────────────────────────────────────────────────────
            else -> {
                val c = Color(0xFF6C63FF)
                drawStar(
                    color  = c.copy(alpha = 0.10f),
                    center = Offset(w * 0.5f, h * 0.5f),
                    outerR = w * 0.15f, innerR = w * 0.06f, points = 6,
                    rotationDeg = rotation,
                )
                drawCircle(
                    color  = c.copy(alpha = 0.07f),
                    radius = w * 0.22f,
                    center = Offset(w * 0.5f, h * 0.5f),
                    style  = Stroke(width = 1.5f),
                )
            }
        }
    }
}

// ─────────────────────────────────────────────────────────────────────────────
// Private drawing helpers — each draws one semantic "symbol" onto the canvas
// ─────────────────────────────────────────────────────────────────────────────

/** Draws a globe outline: equator line + two latitude arcs + outer circle. */
private fun DrawScope.drawGlobeOutline(
    color: Color, center: Offset, radius: Float, strokeWidth: Float,
) {
    val stroke = Stroke(width = strokeWidth)
    // Outer circle
    drawCircle(color = color, radius = radius, center = center, style = stroke)
    // Equator
    drawLine(
        color = color, start = Offset(center.x - radius, center.y),
        end = Offset(center.x + radius, center.y), strokeWidth = strokeWidth,
    )
    // Vertical meridian
    drawLine(
        color = color, start = Offset(center.x, center.y - radius),
        end = Offset(center.x, center.y + radius), strokeWidth = strokeWidth,
    )
    // Longitude oval (simplified with arc)
    val ovalPath = Path().apply {
        addOval(
            Rect(
                left = center.x - radius * 0.5f, top = center.y - radius,
                right = center.x + radius * 0.5f, bottom = center.y + radius,
            )
        )
    }
    drawPath(path = ovalPath, color = color, style = stroke)
}

/** Draws a mountain / triangle pointing upward. */
private fun DrawScope.drawMountainTriangle(
    color: Color, tip: Offset, base: Float, height: Float,
) {
    val path = Path().apply {
        moveTo(tip.x, tip.y)
        lineTo(tip.x - base / 2f, tip.y + height)
        lineTo(tip.x + base / 2f, tip.y + height)
        close()
    }
    drawPath(path = path, color = color)
}

/** Draws a wavy line (sine approximation using cubic bezier segments). */
private fun DrawScope.drawWavyLine(
    color: Color, startX: Float, endX: Float, baseY: Float,
    amplitude: Float, segments: Int, strokeWidth: Float,
) {
    val segWidth = (endX - startX) / segments
    val path = Path().apply {
        moveTo(startX, baseY)
        for (i in 0 until segments) {
            val x0 = startX + i * segWidth
            val x1 = x0 + segWidth
            val cy = if (i % 2 == 0) baseY - amplitude else baseY + amplitude
            cubicTo(
                x0 + segWidth * 0.25f, cy,
                x0 + segWidth * 0.75f, cy,
                x1, baseY,
            )
        }
    }
    drawPath(path = path, color = color, style = Stroke(width = strokeWidth, cap = StrokeCap.Round))
}

/** Draws three overlapping ellipses to suggest an atom orbital structure. */
private fun DrawScope.drawAtomRings(
    color: Color, center: Offset, radius: Float, rotation: Float, strokeWidth: Float,
) {
    val stroke = Stroke(width = strokeWidth)
    withTransform({ rotate(rotation, center) }) {
        // Ring 1 – horizontal
        drawOval(
            color = color,
            topLeft = Offset(center.x - radius, center.y - radius * 0.35f),
            size = Size(radius * 2f, radius * 0.7f),
            style = stroke,
        )
        // Ring 2 – 60°
        rotate(60f, center) {
            drawOval(
                color = color,
                topLeft = Offset(center.x - radius, center.y - radius * 0.35f),
                size = Size(radius * 2f, radius * 0.7f),
                style = stroke,
            )
        }
        // Ring 3 – 120°
        rotate(120f, center) {
            drawOval(
                color = color,
                topLeft = Offset(center.x - radius, center.y - radius * 0.35f),
                size = Size(radius * 2f, radius * 0.7f),
                style = stroke,
            )
        }
    }
    // Nucleus dot
    drawCircle(color = color, radius = radius * 0.12f, center = center)
}

/** Draws a diamond (rhombus) shape. */
private fun DrawScope.drawDiamond(
    color: Color, center: Offset, width: Float, height: Float, strokeWidth: Float,
) {
    val path = Path().apply {
        moveTo(center.x, center.y - height / 2f)
        lineTo(center.x + width / 2f, center.y)
        lineTo(center.x, center.y + height / 2f)
        lineTo(center.x - width / 2f, center.y)
        close()
    }
    drawPath(path = path, color = color, style = Stroke(width = strokeWidth))
}

/** Draws a small molecule: central dot + 4 bonded satellite dots. */
private fun DrawScope.drawMoleculeDots(
    color: Color, center: Offset, dotRadius: Float, bondLength: Float,
) {
    drawCircle(color = color, radius = dotRadius, center = center)
    val satellites = listOf(
        Offset(center.x, center.y - bondLength),
        Offset(center.x + bondLength, center.y),
        Offset(center.x, center.y + bondLength),
        Offset(center.x - bondLength, center.y),
    )
    satellites.forEach { pos ->
        drawLine(color = color, start = center, end = pos, strokeWidth = 1.5f)
        drawCircle(color = color, radius = dotRadius * 0.7f, center = pos)
    }
}

/** Draws a star polygon with [points] points. */
private fun DrawScope.drawStar(
    color: Color, center: Offset, outerR: Float, innerR: Float,
    points: Int, rotationDeg: Float,
) {
    val path = Path()
    val step = (2.0 * PI / points).toFloat()
    val half = step / 2f
    val startAngle = Math.toRadians(rotationDeg.toDouble() - 90.0).toFloat()
    for (i in 0 until points) {
        val outerAngle = startAngle + i * step
        val innerAngle = outerAngle + half
        val ox = center.x + outerR * cos(outerAngle)
        val oy = center.y + outerR * sin(outerAngle)
        val ix = center.x + innerR * cos(innerAngle)
        val iy = center.y + innerR * sin(innerAngle)
        if (i == 0) path.moveTo(ox, oy) else path.lineTo(ox, oy)
        path.lineTo(ix, iy)
    }
    path.close()
    drawPath(path = path, color = color)
}

/** Draws a clock circle: outer ring + hour/minute hands. */
private fun DrawScope.drawClockCircle(
    color: Color, center: Offset, radius: Float, rotation: Float, strokeWidth: Float,
) {
    val stroke = Stroke(width = strokeWidth)
    drawCircle(color = color, radius = radius, center = center, style = stroke)
    // Hour hand (short)
    val hourAngle = Math.toRadians((rotation * 0.5f - 90f).toDouble()).toFloat()
    drawLine(
        color = color,
        start = center,
        end = Offset(center.x + cos(hourAngle) * radius * 0.45f, center.y + sin(hourAngle) * radius * 0.45f),
        strokeWidth = strokeWidth * 1.5f,
        cap = StrokeCap.Round,
    )
    // Minute hand (long)
    val minAngle = Math.toRadians((rotation - 90f).toDouble()).toFloat()
    drawLine(
        color = color,
        start = center,
        end = Offset(center.x + cos(minAngle) * radius * 0.70f, center.y + sin(minAngle) * radius * 0.70f),
        strokeWidth = strokeWidth,
        cap = StrokeCap.Round,
    )
}

/** Draws a scroll rectangle with curved ends. */
private fun DrawScope.drawScroll(
    color: Color, center: Offset, width: Float, height: Float, strokeWidth: Float,
) {
    val stroke = Stroke(width = strokeWidth)
    val left  = center.x - width / 2f
    val top   = center.y - height / 2f
    drawRect(color = color, topLeft = Offset(left, top), size = Size(width, height), style = stroke)
    // Rolled ends (two small ellipses left and right)
    val rollW = width * 0.10f
    val rollH = height * 0.6f
    drawOval(
        color = color,
        topLeft = Offset(left - rollW / 2f, center.y - rollH / 2f),
        size = Size(rollW, rollH),
        style = stroke,
    )
    drawOval(
        color = color,
        topLeft = Offset(left + width - rollW / 2f, center.y - rollH / 2f),
        size = Size(rollW, rollH),
        style = stroke,
    )
}

/** Draws a simplified film strip: outer rectangle + evenly spaced frame notches. */
private fun DrawScope.drawFilmStrip(
    color: Color, topLeft: Offset, width: Float, height: Float, frames: Int, strokeWidth: Float,
) {
    val stroke = Stroke(width = strokeWidth)
    drawRect(color = color, topLeft = topLeft, size = Size(width, height), style = stroke)
    val notchW = height * 0.35f
    val notchH = height * 0.20f
    val gap = width / (frames + 1)
    for (i in 1..frames) {
        val x = topLeft.x + gap * i - notchW / 2f
        // Top notch
        drawRect(
            color = color,
            topLeft = Offset(x, topLeft.y),
            size = Size(notchW, notchH),
        )
        // Bottom notch
        drawRect(
            color = color,
            topLeft = Offset(x, topLeft.y + height - notchH),
            size = Size(notchW, notchH),
        )
    }
}

/** Draws a plate: outer circle + inner ring. */
private fun DrawScope.drawPlateCircle(
    color: Color, center: Offset, radius: Float, strokeWidth: Float,
) {
    val stroke = Stroke(width = strokeWidth)
    drawCircle(color = color, radius = radius, center = center, style = stroke)
    drawCircle(color = color, radius = radius * 0.65f, center = center, style = stroke)
}

/** Draws a ball: outer circle + curved stitch lines. */
private fun DrawScope.drawBallCircle(
    color: Color, center: Offset, radius: Float, strokeWidth: Float,
) {
    val stroke = Stroke(width = strokeWidth)
    drawCircle(color = color, radius = radius, center = center, style = stroke)
    // Horizontal arc
    val arcPath = Path().apply {
        moveTo(center.x - radius * 0.6f, center.y)
        cubicTo(
            center.x - radius * 0.3f, center.y - radius * 0.5f,
            center.x + radius * 0.3f, center.y - radius * 0.5f,
            center.x + radius * 0.6f, center.y,
        )
    }
    drawPath(path = arcPath, color = color, style = Stroke(width = strokeWidth * 0.8f, cap = StrokeCap.Round))
}

/** Draws a row of 5 interconnected rings (Olympic ring style). */
private fun DrawScope.drawOlympicRings(
    color: Color, center: Offset, ringR: Float, strokeWidth: Float,
) {
    val step = ringR * 1.7f
    val startX = center.x - step * 2f
    for (i in 0 until 5) {
        val cx = startX + i * step
        val cy = center.y + if (i % 2 == 0) 0f else ringR * 0.6f
        drawCircle(
            color = color, radius = ringR,
            center = Offset(cx, cy),
            style = Stroke(width = strokeWidth),
        )
    }
}

/** Draws a musical note oval + optional stem. */
private fun DrawScope.drawNoteOval(
    color: Color, center: Offset, rx: Float, ry: Float, rotation: Float,
) {
    withTransform({ rotate(rotation, center) }) {
        drawOval(
            color = color,
            topLeft = Offset(center.x - rx, center.y - ry),
            size = Size(rx * 2f, ry * 2f),
        )
        // Stem
        drawLine(
            color = color,
            start = Offset(center.x + rx * 0.9f, center.y),
            end = Offset(center.x + rx * 0.9f, center.y - ry * 3.5f),
            strokeWidth = rx * 0.18f,
            cap = StrokeCap.Round,
        )
    }
}

/** Draws a CPU chip: rectangle + pin lines on top and bottom. */
private fun DrawScope.drawChipRect(
    color: Color, center: Offset, width: Float, height: Float, pins: Int, strokeWidth: Float,
) {
    val stroke = Stroke(width = strokeWidth)
    val left = center.x - width / 2f
    val top  = center.y - height / 2f
    drawRect(color = color, topLeft = Offset(left, top), size = Size(width, height), style = stroke)
    val pinLen = height * 0.3f
    val gap = width / (pins + 1)
    for (i in 1..pins) {
        val x = left + gap * i
        // Top pin
        drawLine(
            color = color, start = Offset(x, top), end = Offset(x, top - pinLen),
            strokeWidth = strokeWidth, cap = StrokeCap.Round,
        )
        // Bottom pin
        drawLine(
            color = color, start = Offset(x, top + height), end = Offset(x, top + height + pinLen),
            strokeWidth = strokeWidth, cap = StrokeCap.Round,
        )
    }
}

/** Draws a cols×rows grid of small squares (pixel cluster). */
private fun DrawScope.drawPixelCluster(
    color: Color, topLeft: Offset, pixelSize: Float, gap: Float, cols: Int, rows: Int,
) {
    val step = pixelSize + gap
    for (row in 0 until rows) {
        for (col in 0 until cols) {
            drawRect(
                color = color,
                topLeft = Offset(topLeft.x + col * step, topLeft.y + row * step),
                size = Size(pixelSize, pixelSize),
            )
        }
    }
}

/** Draws a book: filled rectangle + central spine line. */
private fun DrawScope.drawBookRect(
    color: Color, center: Offset, width: Float, height: Float, strokeWidth: Float,
) {
    val stroke = Stroke(width = strokeWidth)
    val left = center.x - width / 2f
    val top  = center.y - height / 2f
    drawRect(color = color, topLeft = Offset(left, top), size = Size(width, height), style = stroke)
    // Spine
    drawLine(
        color = color,
        start = Offset(center.x, top),
        end = Offset(center.x, top + height),
        strokeWidth = strokeWidth,
    )
}

/** Draws an open book (V shape) to represent a spread page. */
private fun DrawScope.drawOpenPageTriangle(
    color: Color, center: Offset, spread: Float, height: Float,
) {
    val path = Path().apply {
        moveTo(center.x - spread, center.y)
        lineTo(center.x, center.y + height)
        lineTo(center.x + spread, center.y)
    }
    drawPath(path = path, color = color, style = Stroke(width = 2f, cap = StrokeCap.Round))
    // Spine crease
    drawLine(
        color = color,
        start = Offset(center.x, center.y),
        end = Offset(center.x, center.y + height),
        strokeWidth = 1.5f,
        cap = StrokeCap.Round,
    )
}

/** Draws several horizontal lines to suggest text. */
private fun DrawScope.drawTextLines(
    color: Color, topLeft: Offset, lineWidth: Float, lines: Int, lineSpacing: Float, strokeWidth: Float,
) {
    for (i in 0 until lines) {
        val w = if (i == lines - 1) lineWidth * 0.6f else lineWidth // last line shorter
        drawLine(
            color = color,
            start = Offset(topLeft.x, topLeft.y + i * lineSpacing),
            end   = Offset(topLeft.x + w, topLeft.y + i * lineSpacing),
            strokeWidth = strokeWidth,
            cap = StrokeCap.Round,
        )
    }
}

/** Draws a paw group: one large central pad + three smaller toe pads. */
private fun DrawScope.drawPawGroup(color: Color, center: Offset, scale: Float) {
    drawCircle(color = color, radius = scale * 0.35f, center = center)
    val toeR = scale * 0.18f
    val offsets = listOf(
        Offset(-scale * 0.38f, -scale * 0.40f),
        Offset(0f,              -scale * 0.52f),
        Offset( scale * 0.38f, -scale * 0.40f),
    )
    offsets.forEach { o -> drawCircle(color = color, radius = toeR, center = center + o) }
}

/** Draws an egg-shaped oval (slightly taller than wide, shifted top narrower). */
private fun DrawScope.drawEggOval(color: Color, center: Offset, rx: Float, ry: Float) {
    drawOval(
        color = color,
        topLeft = Offset(center.x - rx, center.y - ry),
        size = Size(rx * 2f, ry * 2f),
        style = Stroke(width = 2f),
    )
}

/** Draws a gear-like circle: inner circle + regularly-spaced rectangular teeth. */
private fun DrawScope.drawGearCircle(
    color: Color, center: Offset, radius: Float, teeth: Int,
    toothDepth: Float, rotation: Float, strokeWidth: Float,
) {
    val stroke = Stroke(width = strokeWidth)
    drawCircle(color = color, radius = radius * 0.6f, center = center, style = stroke)
    val angleStep = (2.0 * PI / teeth).toFloat()
    val toothW = angleStep * 0.4f
    for (i in 0 until teeth) {
        val angle = Math.toRadians(rotation.toDouble()).toFloat() + i * angleStep
        val innerR = radius
        val outerR = radius + toothDepth
        val a1 = angle - toothW / 2f
        val a2 = angle + toothW / 2f
        val path = Path().apply {
            moveTo(center.x + innerR * cos(a1), center.y + innerR * sin(a1))
            lineTo(center.x + outerR * cos(a1), center.y + outerR * sin(a1))
            lineTo(center.x + outerR * cos(a2), center.y + outerR * sin(a2))
            lineTo(center.x + innerR * cos(a2), center.y + innerR * sin(a2))
            close()
        }
        drawPath(path = path, color = color)
    }
}

/** Draws two interlocking squares (simplified puzzle piece hint). */
private fun DrawScope.drawPuzzleSquares(
    color: Color, topLeft: Offset, size: Float, strokeWidth: Float,
) {
    val stroke = Stroke(width = strokeWidth)
    drawRect(color = color, topLeft = topLeft, size = Size(size, size), style = stroke)
    drawRect(
        color = color,
        topLeft = Offset(topLeft.x + size * 0.4f, topLeft.y + size * 0.4f),
        size = Size(size, size),
        style = stroke,
    )
}
