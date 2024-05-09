package com.mala.grad_project.Screenns.subsciptions

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.data.model.show_plans_exercises
import com.mala.grad_project.ui.theme.blue1
import com.mala.grad_project.ui.theme.brightYellow
import com.mala.grad_project.ui.theme.darkYellow

@Composable
fun CardOfSubscription(
    getPlansResponse: show_plans_exercises
){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        Arrangement.Center

    ){


        Box(
            Modifier
                .padding(10.dp)
                .shadow(elevation = 30.dp)

        ) {


            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(RoundedCornerShape(5.dp)),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    Arrangement.SpaceBetween
                ) {
                    Column {
                        Spacer(modifier = Modifier.height(50.dp))
                        Row {
                            Text(
                                text = "Captain: ",

                                fontWeight = FontWeight.Bold,
                                color = blue1,
                                fontSize = 20.sp
                            )
                            Text(
                                text = "${getPlansResponse.coach.fname} ${getPlansResponse.coach.lname}",
                                fontWeight = FontWeight.Bold,
                                color = blue1,
                                fontSize = 20.sp
                            )
                        }
                        Row {
                            Text(

                                text = "Package: ",
                                modifier = Modifier.padding(top = 5.dp),
                                fontSize = 15.sp,
                                color = darkYellow,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "${getPlansResponse.`package`.number_of_months} Months",
                                modifier = Modifier.padding(top = 5.dp),
                                fontSize = 15.sp,
                                color = blue1,
                                fontWeight = FontWeight.Bold

                            )
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(modifier = Modifier.height(50.dp))

                            if (getPlansResponse.payment_status == "null") {
                                Image(
                                    painter = painterResource(id = R.drawable.wating),
                                    contentDescription = null,
                                    Modifier
                                        .size(22.dp)
                                        .padding(top = 2.dp)

                                )
                                Text(
                                    text = "Waiting",
                                    fontSize = 19.sp,
                                    color = brightYellow

                                )
                            }
                        }

                    }
                    Column {
                        Spacer(modifier = Modifier.height(50.dp))
                        CalenderCoustemSize(
                            typeOfText = "Start date",
                            date = getPlansResponse.`package`.start_date,
                            painterResource(id = R.drawable.calander),
                            iconSize = 25,
                            fontsize = 15
                        )
                        CalenderCoustemSize(
                            typeOfText = "End date",
                            date = getPlansResponse.`package`.end_date,
                            painterResource(id = R.drawable.truecalander),
                            iconSize = 25,
                            fontsize = 15
                        )

                    }

                }

            }
        }
    }
}
