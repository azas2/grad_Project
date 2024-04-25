package com.mala.grad_project.Screenns.Home.composblefunction

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.mala.grad_project.ui.theme.circleColor

@Composable
fun CircleCoachImage(
    painter: Painter,
    size:Int,
    paddingStart:Int?=null,
    paddingEnd:Int?=null,
    paddingTop:Int?=null,
    paddingBottom:Int?=null

) {

    Box (contentAlignment = Alignment.TopStart){

        val borderWidth = 1.dp
        Image(
            painter = painter,
            contentDescription = "error image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(size.dp)

                .padding(start = paddingStart?.dp ?: 1.dp, end = paddingEnd?.dp ?:1.dp, top = paddingTop?.dp ?:1.dp, bottom = paddingBottom?.dp ?:1.dp)


                .border(
                    BorderStroke(borderWidth, circleColor),
                    CircleShape
                )
                .clip(CircleShape)
        )
    }
}