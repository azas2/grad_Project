package com.mala.grad_project.Screenns.planCard

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.Screenns.CoachScreen.Conmposble.CircleCoachImage
import com.mala.grad_project.Screenns.CoachScreen.Conmposble.StarReview
import com.mala.grad_project.ui.theme.circleColor
import com.mala.grad_project.ui.theme.hinttextColor

@Composable
fun PlanCard(
    isSelected: Boolean,
    numberOfMonth:Int,
     price:Int,
    onclick: () -> Unit

){
    Column(
        modifier = Modifier
            .size(190.dp, height = 220.dp)
            .padding(15.dp)
            .shadow(elevation = 10.dp)
            .clickable { onclick()}
            .border(2.dp, if (isSelected) circleColor else Color.Transparent, RoundedCornerShape(16.dp))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1.5f)
                .background(hinttextColor, RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .height(90.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "$numberOfMonth Month",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color=Color.White,
                    modifier = Modifier.padding(top=50.dp)
                )

            }

        }


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)

                .background(
                    Color.White,
                    RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp)
                )
        ){
            Row (
                modifier = Modifier.fillMaxWidth()
                    .padding(top=20.dp, start = 40.dp)
            ){
                Text(
                    text = "$price",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color= hinttextColor
                )
                Text(
                    text = "L.E",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color= hinttextColor,
                    modifier =Modifier.padding(start = 5.dp, end = 30.dp)
                )
            }
        }
    }
}


