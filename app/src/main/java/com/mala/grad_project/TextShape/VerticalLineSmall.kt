package com.mala.grad_project.TextShape

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Composable
fun VerticalLineSmall(
    color: Color,
    height: Dp,
    width: Dp,
    modifier: Modifier = Modifier
){
    Box(
        modifier = modifier
            .width(width)
            .height(height)
            .background(color)
    )

}