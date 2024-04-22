package com.mala.grad_project.Screenns.planCard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PlanChoose(){
    var selectedPlan by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(10.dp)
    ) {
        Row {
            PlanCard(
                isSelected = selectedPlan == "Plan 1",
                numberOfMonth = 1,
                price = 300,
                onclick = {
                    selectedPlan="plan1"
                }
            )
            PlanCard(
                isSelected = selectedPlan == "Plan 2",
                numberOfMonth = 3,
                price = 850,
               onclick = {
                   selectedPlan="plan2"
               }
            )
        }
        Row(Modifier.fillMaxWidth()) {
            PlanCard(
                isSelected = selectedPlan == "Plan 3",
                numberOfMonth = 6,
                price = 1600,
                onclick = {
                    selectedPlan = "Plan 3 "
                }

            )
            PlanCard(
                isSelected = selectedPlan == "Plan 4",
                numberOfMonth = 12,
                price = 3000,
                onclick = {
                    selectedPlan="Plan 4"
                }
            )
        }
    }
}
@Composable
@Preview
fun test_planChoose(){
    PlanChoose()
}
fun hello(){

}