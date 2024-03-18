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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.mala.grad_project.R
import com.mala.grad_project.ui.theme.circleColor


@Composable
fun CircleOutlinePreview(  onclick:()->Unit,painter: Painter
) {

    Box (contentAlignment = Alignment.Center){

        val borderWidth = 1.dp
        Image(
            painter = painter,
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
        IconOfImageProfile(onclick)
    }
}
@Composable
fun IconOfImageProfile(
    onclick:()->Unit
){
    Box(modifier = Modifier
        .width(200.dp)
        .padding(top = 150.dp, end = 160.dp)
        .clip(shape = RoundedCornerShape(50.dp))
        .clickable {
                   onclick()
        }
        , contentAlignment = Alignment.Center,
    ){
        Canvas(modifier = Modifier.size(40.dp)){
            drawCircle(color= Color.White)
        }
        Image(modifier = Modifier.size(25.dp),painter = painterResource(id = R.drawable.camera), contentDescription = "Image Error")
    }
}
