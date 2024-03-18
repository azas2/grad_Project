package com.mala.grad_project.compoableOfData

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mala.grad_project.R
import com.mala.grad_project.ui.theme.circleColor


@Composable
fun CircleOutlinePreview(
) {
    Box (contentAlignment = Alignment.Center){

        val borderWidth = 0.5.dp
        Image(
            painter = painterResource(id = R.drawable.man),
            contentDescription = "error image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(230.dp)
                .border(
                    BorderStroke(borderWidth, circleColor),
                    CircleShape
                )
                .padding(borderWidth)
                .clip(CircleShape)
        )
        IconOfImageProfile()
    }
}
@Composable
fun IconOfImageProfile(

){
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 150.dp, end = 160.dp)
        .clip(shape = RoundedCornerShape(50.dp))
        .clickable {
            // here intent of image
        }
        , contentAlignment = Alignment.Center,
    ){
        Canvas(modifier = Modifier.size(40.dp)){
            drawCircle(color= Color.White)
        }
        Image(modifier = Modifier.size(25.dp),painter = painterResource(id = R.drawable.camera), contentDescription = "Image Error")
    }
}
