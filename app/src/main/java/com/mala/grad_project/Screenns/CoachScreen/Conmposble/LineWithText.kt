package com.mala.grad_project.Screenns.CoachScreen.Conmposble

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mala.grad_project.ui.theme.hinttextColor

@Composable
fun LineTextView(
    text:String
){
    Row (
        modifier = Modifier.fillMaxWidth(),
    ){
        singleHorizontalLine()
        Text(
            text =text,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color=hinttextColor
        )
        singleHorizontalLine()
    }
}
@Preview
@Composable
fun show(){
LineTextView("hello")
}