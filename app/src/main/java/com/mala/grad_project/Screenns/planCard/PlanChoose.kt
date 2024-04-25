package com.mala.grad_project.Screenns.planCard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.Screenns.CoachScreen.Conmposble.LineTextViewChoachScreen
import com.mala.grad_project.Screenns.Home.composblefunction.BellImage
import com.mala.grad_project.Screenns.Home.composblefunction.CircleCoachImage
import com.mala.grad_project.Screenns.Home.composblefunction.StarRatingBarCoach
import com.mala.grad_project.ui.theme.circleColor
import com.mala.grad_project.ui.theme.hinttextColor

@Composable
fun PlanChoose() {
    var selectedPlan by remember { mutableStateOf("") }
    var rating by remember { mutableStateOf(1f) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)

    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(hinttextColor)
                .padding(top = 30.dp)

        ) {
            Column {

                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    CircleCoachImage(painterResource(id = R.drawable.man), 55)
                    BellImage(painterResource(id = R.drawable.run))
                }

            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, top = 30.dp)
        ) {
            CircleCoachImage(painterResource(id = R.drawable.man), 120)
            Column {
                Text(
                    text = "Captain:ahmed Alaa",
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp, start = 5.dp),
                    textAlign = TextAlign.Start,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
                StarRatingBarCoach(maxStars = 6, rating = 6f, onRatingChanged = {
                    rating = it
                }, paddingStart = 10)
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(start = 0.dp, top = 5.dp),
                    Arrangement.Start
                ) {
                    Text(
                        text = "number of clients : ",
                        Modifier
                            .wrapContentSize()
                            .padding(start = 10.dp),
                        textAlign = TextAlign.Start,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = circleColor
                    )
                    Text(
                        modifier = Modifier.wrapContentSize(),
                        text = "10",
                        fontSize = 15.sp,
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.Normal,
                        color = Color.Black,
                    )
                }

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        LineTextViewPlanScreen("Choose the package that suits you")
        Spacer(modifier = Modifier.height(20.dp))
        Column(
            Modifier.fillMaxWidth(),
            horizontalAlignment=Alignment.CenterHorizontally
        ) {

            Row {
                PlanCard(
                    isSelected = selectedPlan == "Plan 1",
                    numberOfMonth = 1,
                    price = 300,
                    onclick = {
                        selectedPlan = "Plan 1"
                    }
                )
                PlanCard(
                    isSelected = selectedPlan == "Plan 2",
                    numberOfMonth = 3,
                    price = 850,
                    onclick = {
                        selectedPlan = "Plan 2"
                    }
                )
            }
            Row() {
                PlanCard(
                    isSelected = selectedPlan == "Plan 3",
                    numberOfMonth = 6,
                    price = 1600,
                    onclick = {
                        selectedPlan = "Plan 3"
                    }
                )
                PlanCard(
                    isSelected = selectedPlan == "Plan 4",
                    numberOfMonth = 12,
                    price = 3000,
                    onclick = {
                        selectedPlan = "Plan 4"
                    }
                )
            }
        }
    }
}

@Composable
@Preview
fun test_planChoose(){
    PlanChoose()
}

