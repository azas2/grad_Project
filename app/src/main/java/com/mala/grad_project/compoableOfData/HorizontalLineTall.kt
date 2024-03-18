package com.mala.grad_project.compoableOfData

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp
import com.mala.grad_project.ui.theme.CircleUnSelected


@Composable
fun HorizontalLineTall(){
    Canvas(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 15.dp, start = 5.dp, end = 5.dp) ){
        drawLine(

            color = CircleUnSelected,
            start = Offset(0f, size.height / 2),
            end = Offset(size.width, size.height / 2),
            strokeWidth = 3.dp.toPx(),
            cap = StrokeCap.Round
        )
    }
}