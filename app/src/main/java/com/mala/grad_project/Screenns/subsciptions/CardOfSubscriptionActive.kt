package com.mala.grad_project.Screenns.subsciptions

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.ui.theme.circleColor
import com.mala.grad_project.ui.theme.hinttextColor

@Composable
fun CardOfSubscriptionActive(
    /*
    captainName:String,
    packageNumber:String,
    state:String,
    startDate:String,
    endDate:String

     */
){
    Card(
        modifier = Modifier
            .width(260.dp)
            .height(70.dp)
            .clip(RoundedCornerShape(5.dp))
            .shadow(elevation = 10.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(10.dp),
            Arrangement.SpaceBetween
        ) {
            Column {
                Row {
                    Text(
                        text ="Captain: ",

                        fontWeight = FontWeight.Bold,
                        color = hinttextColor,
                        fontSize = 15.sp
                    )
                    Text(
                        text ="nameOfCaptain",
                        fontWeight = FontWeight.Bold,
                        color = hinttextColor,
                        fontSize = 15.sp
                    )
                }
                Row{
                    Text(

                        text ="Package: ",
                        modifier = Modifier.padding(top=5.dp),
                        fontSize = 10.sp,
                        color = circleColor,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text ="numberOfMonth",
                        modifier = Modifier.padding(top=5.dp),
                        fontSize = 10.sp,
                        color = hinttextColor,
                       fontWeight = FontWeight.Bold

                    )
                }
                Row {

                    Image(
                        painter = painterResource(id = R.drawable.colock) ,
                        contentDescription =null,
                        Modifier
                            .size(15.dp)
                            .padding(top = 2.dp)

                    )
                    Text(
                        text ="state her",
                        fontSize = 8.sp,
                        color = circleColor

                    )
                }

            }

            Column {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.calander)
                        , contentDescription =null,
                        modifier = Modifier.size(10.dp)
                    )
                }
            }
           
        }

    }
}
@Composable
@Preview
fun showMe(){
    CardOfSubscriptionActive()
}