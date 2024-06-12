package com.mala.grad_project.newCardExersize

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
fun NewCardExersize() {
    Box(
        modifier = Modifier
            .size(width = 300.dp, height = 250.dp)
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
        }
    }
}


@Composable
@Preview
fun test_NewCardExersize(){
    NewCardExersize()
}