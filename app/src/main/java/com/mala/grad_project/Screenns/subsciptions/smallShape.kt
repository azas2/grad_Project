package com.mala.grad_project.Screenns.subsciptions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SmallShape(){
    Box(
        modifier = Modifier
            .width(50.dp)
            .height(10.dp)
            .shadow(elevation = 10.dp)
            .background(Color.White, RoundedCornerShape(50.dp))
    ){
        Text(
            modifier = Modifier.wrapContentSize(),
            text ="1.1.2024",

        )
    }

}


@Composable
@Preview
fun testSmallShape(){
    SmallShape()
}