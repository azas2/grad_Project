package com.mala.grad_project.Screenns.Home.composblefunction

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun BellImage(
    painter: Painter
) {

    Image(
        painter = painter,
        modifier = Modifier.size(44.dp)
            .padding(bottom = 10.dp, end = 10.dp),
        contentDescription = null
    )
}