package com.mala.grad_project.Screenns.planCard

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
    listOfPackage: packeges,
    onPlanSelected: (Int) -> Unit
) {
    Column(
        modifier = Modifier
            .size(190.dp, height = 210.dp)
            .padding(15.dp)
            .shadow(elevation = 10.dp)
            .clickable { onPlanSelected(listOfPackage.id) }
            .border(
                width = 2.dp,
                color = if (listOfPackage.isSelected) circleColor else Color.Transparent,
                shape = RoundedCornerShape(16.dp)
            )
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .background(Color(0xFF003566), RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
        ) {
            Text(
                text = "${listOfPackage.numberOfMonth} Month",
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(top = 30.dp, start = 30.dp)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .background(Color.White, RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp))
                .padding(top = 20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "${listOfPackage.price}",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = hinttextColor
                )
                Text(
                    text = "L.E",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = hinttextColor,
                    modifier = Modifier.padding(start = 5.dp)
                )
            }
        }
    }
}



