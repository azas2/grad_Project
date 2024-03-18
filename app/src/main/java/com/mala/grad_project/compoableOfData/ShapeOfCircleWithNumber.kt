package com.mala.grad_project.compoableOfData

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ShapeOfSmallCircle(passnumber:String, StateColor: Color){
    Box(modifier = Modifier.size(30.dp)) {
        Circle(StateColor)
        Text(modifier = Modifier.padding(start =8.5.dp, top = 1.5.dp),
            text = passnumber,
            color = Color.White,
            fontSize = 19.sp,
            fontWeight = FontWeight.Bold
        )
    }

}