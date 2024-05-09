package com.mala.grad_project.composables

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mala.grad_project.ui.theme.BackGroundLetgo

@Composable
fun line(color:Color){
    Canvas(modifier = androidx.compose.ui.Modifier.height(40.dp).padding(bottom = 3.dp, end = 4.dp)){
        val canvasWidth = size.width
        val canvasHeight = size.height
        drawLine(
            start = Offset(x = canvasWidth/2f, y = 0f),
            end = Offset(x = canvasWidth/2f, y = canvasHeight),
            strokeWidth =3f,
            color = color,

        )
    }
}
