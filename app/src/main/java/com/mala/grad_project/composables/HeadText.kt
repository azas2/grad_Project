package com.mala.grad_project.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.ui.theme.headerOutTextFieldColor

@Composable
fun HeadText(text:String){
    Text(modifier = Modifier.padding(start = 10.dp),
        text= text,
        color = headerOutTextFieldColor,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold
    )
}