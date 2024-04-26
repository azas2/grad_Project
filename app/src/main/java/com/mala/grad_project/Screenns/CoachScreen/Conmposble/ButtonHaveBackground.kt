package com.mala.grad_project.Screenns.CoachScreen.Conmposble

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.ui.theme.hinttextColor

@Composable
fun outlineButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text:String
) {
    Button(
        onClick = onClick,
        modifier = modifier
            ,
        colors = ButtonDefaults.buttonColors(
            Color.White
        ), border = BorderStroke(1.dp, hinttextColor),
        shape = RoundedCornerShape(15.dp)
    ){
        Text(
            text =text,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            color = Color.White
        )

    }
}
