package com.mala.grad_project.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mala.grad_project.ui.theme.whenfouces

@Composable
fun ShapeOfKey(
    color:Color
){
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(text = "+20"
            , modifier = Modifier
                .height(20.dp)
                .padding(start=2.dp, end = 5.dp)
                , color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        line(color)
    }
}
