package com.mala.grad_project.Screenns.subsciptions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.Screenns.CoachScreen.Conmposble.CircleCoachImage
import com.mala.grad_project.ui.theme.brightYellow
import com.mala.grad_project.ui.theme.circleColor
import com.mala.grad_project.ui.theme.hinttextColor

@Composable
fun CoachData(
    captainName:String,
    lastname:String,
    packageNumber:String,
    startDate:String,
    endDate:String,
    painter: Painter?=null
){
    Column(

    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(5.dp),
            Arrangement.SpaceBetween
        ) {
            Column {



                Row (
                    Modifier
                        .wrapContentWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ){
                    painter?.let { CircleCoachImage(painter = it, size = 70) }
                        Column {
                            Text(
                                text ="Captain: $captainName $lastname ",
                                fontWeight = FontWeight.Bold,
                                color = hinttextColor,
                                fontSize = 18.sp,
                                modifier = Modifier.padding(top=10.dp,start=5.dp)
                            )

                            Text(
                                text ="Package: $packageNumber Month",
                                modifier = Modifier.padding(top=5.dp,start=5.dp),
                                fontSize = 18.sp,
                                color = brightYellow,
                                fontWeight = FontWeight.Bold
                            )

                        }
}


            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                CalenderForMeduim(typeOfText = "Start date", date =startDate, painterResource(id = R.drawable.calander) , fontsize = 12, iconSize =15)
                CalenderForMeduim(typeOfText = "End date", date =endDate, painterResource(id = R.drawable.truecalander) ,fontsize = 12, iconSize =15)

            }

        }

    }
}



