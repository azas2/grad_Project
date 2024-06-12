package com.mala.grad_project.newCardExersize

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.ui.theme.blue1
import com.mala.grad_project.ui.theme.blue2
import com.mala.grad_project.ui.theme.brightYellow
import com.mala.grad_project.ui.theme.darkYellow
import com.mala.grad_project.ui.theme.moreBrightYellow

@Composable
fun NewCardExersize() {
    Box(
        modifier = Modifier
            .size(width = 280.dp, height = 300.dp)
            .padding(10.dp)

    ) {
        // Background Box with blur effect
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(20.dp))
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.White,
                            moreBrightYellow
                        )
                    )
                )
                .blur(radius = 50.dp)
        )

        // Foreground content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            ExersizeGifCard()
            Text(
                text = "Exersize name",
                textAlign = TextAlign.Start,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = blue2,
                modifier = Modifier.fillMaxWidth()

            )
            Row(
                horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxWidth().padding(2.dp)

            ){
            Text(
                text = "Number of repetitions",
                textAlign = TextAlign.Center,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = blue1,
                )
                Text(
                    text = "15",
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = blue1,
                    modifier = Modifier.padding(start =10.dp)
                )


            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
                        .padding(2.dp)

            ){
                Text(
                    text = "Break time",
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = blue1,
                )
                Text(
                    text = "15 s",
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = blue1,
                    modifier = Modifier.padding(start =10.dp)
                )


            }
        }
    }
}


@Composable
@Preview
fun test_NewCardExersize(){
    NewCardExersize()
}