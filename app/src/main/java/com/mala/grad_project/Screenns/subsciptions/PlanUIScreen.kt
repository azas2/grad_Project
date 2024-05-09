package com.mala.grad_project.Screenns.subsciptions

import CardSubscraptionRejected
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mala.grad_project.R
import com.mala.grad_project.Screenns.Home.composblefunction.BellImage
import com.mala.grad_project.Screenns.Home.composblefunction.CircleCoachImage
import com.mala.grad_project.data.model.show_plans_exercises
import com.mala.grad_project.ui.theme.hinttextColor

@Composable
fun PlanUIScreen(
    getPlansResponse: show_plans_exercises
) {

    Column(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.onPrimary)
    ) {

        Box(
            Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(hinttextColor)
        ) {
            Column {

                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, top = 25.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    CircleCoachImage(painterResource(id = R.drawable.man), 55)
                    BellImage(painterResource(id = R.drawable.run))
                }
            }

            Spacer(modifier = Modifier.height(10.dp))
        }
        when(getPlansResponse.payment_status){
            "null" -> CardOfSubscription(getPlansResponse)
            "ACCEPTED" -> CardSubscraptionPending(getPlansResponse)
            "REJECTED" -> CardSubscraptionRejected(getPlansResponse)
            "UNSUBSCRIBED" ->TextUnSupscribed(getPlansResponse)
            "COMPLETED" -> ExerSizeScreen(getPlansResponse)
        }

    }
}


