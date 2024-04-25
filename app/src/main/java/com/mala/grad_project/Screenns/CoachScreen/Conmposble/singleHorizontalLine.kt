package com.mala.grad_project.Screenns.CoachScreen.Conmposble

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.ui.theme.circleColor

@Composable
fun singleHorizontalLine(
    mysize:Int
){
    Canvas(modifier = androidx.compose.ui.Modifier
        .width(mysize.dp)
        .height(5.dp)
        .padding(top=10.dp , start = 8.dp,end=8.dp)
        .background(circleColor,RoundedCornerShape(50.dp))) {
        drawLine(
            color =circleColor ,
            start = Offset(0f, size.height / 2),
            end = Offset(size.width, size.height / 2),
            strokeWidth = 5.0f
        )
    }
}
