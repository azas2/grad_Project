package com.mala.grad_project.compoableOfData

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Circle(StateColor: Color){
    Canvas(modifier = Modifier.size(28.dp)){
        drawCircle(color= StateColor)
    }
}
