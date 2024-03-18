package com.mala.grad_project.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LetGoSubTitle(
    text: String
){
    Text(
        modifier = Modifier.padding(top = 10.dp),
        text = text,
        color = Color.Gray,
        fontSize = 18.sp,
        fontWeight = FontWeight.ExtraLight
    )
}