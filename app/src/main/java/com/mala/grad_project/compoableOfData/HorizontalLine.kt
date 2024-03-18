package com.mala.grad_project.compoableOfData

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalLine(stateColor: Color){
    Canvas(modifier = Modifier
        .size(width = 70.dp, height = 1.dp)
        .padding(start = 5.dp, end = 5.dp)
    ){
        drawLine(

            color = stateColor,
            start = Offset(0f, size.height / 2),
            end = Offset(size.width, size.height / 2),
            strokeWidth = 8.dp.toPx(),
            cap = StrokeCap.Round
        )
    }
}