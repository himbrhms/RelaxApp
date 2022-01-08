package com.himbrhms.relaxapp.ui.util.waves

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import com.himbrhms.relaxapp.ui.data.Feature
import com.himbrhms.relaxapp.ui.util.standardQuadFromTo

@Composable
fun WavesPainting(maxWidth: Int, maxHeight: Int, color1: Color, color2: Color) {
    // Medium colored path
    val mediumColoredPoint1 = Offset(0f, maxHeight * 0.3f)
    val mediumColoredPoint2 = Offset(maxWidth * 0.1f, maxHeight * 0.35f)
    val mediumColoredPoint3 = Offset(maxWidth * 0.4f, maxHeight * 0.05f)
    val mediumColoredPoint4 = Offset(maxWidth * 0.75f, maxHeight * 0.7f)
    val mediumColoredPoint5 = Offset(maxWidth * 1.4f, -maxHeight.toFloat())

    val mediumColoredPath = Path().apply {
        moveTo(mediumColoredPoint1.x, mediumColoredPoint1.y)
        standardQuadFromTo(mediumColoredPoint1, mediumColoredPoint2)
        standardQuadFromTo(mediumColoredPoint2, mediumColoredPoint3)
        standardQuadFromTo(mediumColoredPoint3, mediumColoredPoint4)
        standardQuadFromTo(mediumColoredPoint4, mediumColoredPoint5)
        lineTo(maxWidth.toFloat() + 100f, maxHeight.toFloat() + 100f)
        lineTo(-100f, maxHeight.toFloat() + 100f)
        close()
    }

    // Light colored path
    val lightPoint1 = Offset(0f, maxHeight * 0.35f)
    val lightPoint2 = Offset(maxWidth * 0.1f, maxHeight * 0.4f)
    val lightPoint3 = Offset(maxWidth * 0.3f, maxHeight * 0.35f)
    val lightPoint4 = Offset(maxWidth * 0.65f, maxHeight.toFloat())
    val lightPoint5 = Offset(maxWidth * 1.4f, -maxHeight.toFloat() / 3f)

    val lightColoredPath = Path().apply {
        moveTo(lightPoint1.x, lightPoint1.y)
        standardQuadFromTo(lightPoint1, lightPoint2)
        standardQuadFromTo(lightPoint2, lightPoint3)
        standardQuadFromTo(lightPoint3, lightPoint4)
        standardQuadFromTo(lightPoint4, lightPoint5)
        lineTo(maxWidth.toFloat() + 100f, maxHeight.toFloat() + 100f)
        lineTo(-100f, maxHeight.toFloat() + 100f)
        close()
    }
    Canvas(
        modifier = Modifier
            .fillMaxSize()
    ) {
        drawPath(
            path = mediumColoredPath,
            color = color2
        )
        drawPath(
            path = lightColoredPath,
            color = color1
        )
    }
}