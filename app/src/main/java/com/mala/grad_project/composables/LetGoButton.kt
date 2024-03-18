package com.mala.grad_project.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.ui.theme.circleColor
import com.mala.grad_project.ui.theme.fontFamily

@Composable
fun LetGoButton(
    text:String,
    onclick: ()-> Unit

){
    Button(onClick = onclick,
        modifier = Modifier.fillMaxWidth()
        ,
        shape = RoundedCornerShape(15.dp),
        colors = ButtonDefaults.buttonColors(
            circleColor
        )
    ) {
        Text(
            text =text,
            fontSize = 25.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
    }
}