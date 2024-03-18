package com.mala.grad_project.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.ui.theme.fontFamily

@Composable
fun TextLetGo(
    text:String,
    modifier: Modifier
){
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .height(45.dp)
        ,
        text =text ,
        fontSize = 35.sp,
        color = Color.White,
        fontWeight = FontWeight.Bold,

        )
}