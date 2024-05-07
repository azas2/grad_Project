package com.mala.grad_project.Screenns.subsciptions

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults.elevation
import androidx.compose.material.LocalElevationOverlay
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.ui.theme.blue1
import com.mala.grad_project.ui.theme.blue2
import com.mala.grad_project.ui.theme.circleColor
import com.mala.grad_project.ui.theme.darkYellow


@Composable
    fun WeekDayCard(
    dayOfWeek: String, fullName: String,
    isSelected: Boolean,
    onClick: (String) -> Unit
    ) {

    Card(
            modifier = androidx.compose.ui.Modifier
                .size(95.dp)
                .padding(8.dp)
                .clickable {
                    onClick(dayOfWeek)
                }   // Use clickable modifier here
                   .shadow(elevation = 8.dp),
        colors = CardDefaults.cardColors(
                blue2
            )
            ,shape = RoundedCornerShape(10.dp),
        border = if (isSelected) BorderStroke(2.dp, darkYellow) else null,

    ) {
            Column(
                modifier = Modifier.size(80.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = dayOfWeek,
                    modifier =  Modifier.padding(top =5.dp) ,
                    fontSize = 20.sp,
                    color = Color.White,

                )
                Text(
                    text = fullName,
                    fontSize = 15.sp,
                    color = darkYellow,
                    modifier =  Modifier.padding(bottom = 1.dp)
                )
            }

        }
    }






