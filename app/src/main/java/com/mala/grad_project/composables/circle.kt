package com.mala.grad_project.composables

import android.R.color
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mala.grad_project.R
import com.mala.grad_project.ui.theme.circleColor

@Preview
@Composable
fun circle(){

    Canvas(modifier = Modifier.size(290.dp,290.dp) ){
        scale(scaleX = 8f, scaleY = 8f) {
            drawCircle(circleColor, radius = 20.dp.toPx())
        }
    }
    Image(
        painter = painterResource(id = R.drawable.user)
        , contentDescription ="let go Image",
        alignment = Alignment.BottomCenter,
        modifier = Modifier.size(332.dp,250.dp),
        contentScale = ContentScale.FillBounds
    )
}