package com.mala.grad_project.Screenns.Menu

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.ui.theme.circleColor
import com.mala.grad_project.ui.theme.hinttextColor

@Composable
fun MenuSettings(
    text:String,
    painter: Painter,
    onClick :()->Unit
){
    Box(
        modifier = Modifier
            .background(color = Color.Transparent)
            .fillMaxWidth()
            .clickable { onClick() }
    )
    {
        Row (
            Modifier.fillMaxWidth()
        ){
            Image(
                modifier = Modifier.size(40.dp).padding(start =10.dp ,bottom = 2.dp),
                painter = painter
                , contentDescription =null)
            Text(
                text =text,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color=hinttextColor,
                modifier = Modifier.weight(1f)
                    .padding(start=10.dp, bottom =12.dp)
                   ,
                textAlign = TextAlign.Start
            )
        }
        Canvas(modifier = Modifier.matchParentSize().padding(start=15.dp,end=15.dp)) {
            drawLine(

                color = hinttextColor,
                start = Offset(0f, size.height),
                end = Offset(size.width, size.height),
                strokeWidth = 5f
            )
        }
    }
}
