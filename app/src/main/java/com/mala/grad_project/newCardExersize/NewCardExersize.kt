package com.mala.grad_project.newCardExersize

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mala.grad_project.ui.theme.brightYellow
import com.mala.grad_project.ui.theme.darkYellow
import com.mala.grad_project.ui.theme.moreBrightYellow

@Composable
fun NewCardExersize(){
    Box(modifier = Modifier
        .size(300.dp)
        .padding(10.dp)){
    Box(
        modifier = Modifier
            .size(250.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color.White,
                        moreBrightYellow.copy(alpha = 0.9f)
                    )
                )

            )
            .blur(radius = 40.dp)
    ) {
        Column(
            modifier = Modifier
                .size(250.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

                Box(
                    modifier = Modifier
                        .size(150.dp)
                        .shadow(elevation = 20.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color.White),


                ){

                }
            }
        }
    }



    }


@Composable
@Preview
fun test_NewCardExersize(){
    NewCardExersize()
}