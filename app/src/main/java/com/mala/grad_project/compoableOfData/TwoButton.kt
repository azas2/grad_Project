package com.mala.grad_project.compoableOfData

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.ui.theme.GenderBackGround
import com.mala.grad_project.ui.theme.circleColor
@Composable
fun TwoButton(
    onNextScreen:()->Unit,
    onBackScreen:()->Unit,text:String) {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween
    )
    {
        //backButton
        Button(modifier = Modifier
            .width(140.dp)
            .height(50.dp)
            .padding(bottom = 10.dp),
            onClick = {
                onBackScreen()
            }, colors = ButtonDefaults.buttonColors(
                Color.White,
                contentColor = GenderBackGround
            )
        ) {

            Icon(
                modifier = Modifier
                    .size(40.dp)
                    .padding(top = 5.dp),
                painter = painterResource(id = R.drawable.payment),
                contentDescription = "image error",
                tint = circleColor
            )
            Text(
                text = "Back", fontSize = 20.sp, fontWeight = FontWeight.Bold
            )
        }
        Button(
            modifier = Modifier
                .width(130.dp)
                .height(40.dp)
                .padding(start = 10.dp, end = 10.dp),
            onClick = { onNextScreen() },
            colors = ButtonDefaults.buttonColors(
                circleColor,
                contentColor = GenderBackGround
            )
        ) {
            Text(text = text, fontSize = 20.sp, fontWeight = FontWeight.Bold)

        }

    }
}