package com.mala.grad_project.Screenns.subsciptions

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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.Screenns.CoachScreen.Conmposble.LineTextViewChoachScreen
import com.mala.grad_project.Screenns.Home.composblefunction.BellImage
import com.mala.grad_project.Screenns.Home.composblefunction.CircleCoachImage
import com.mala.grad_project.domain.Entity.Exercise
import com.mala.grad_project.domain.Entity.show_plans_exercises

import com.mala.grad_project.ui.theme.brightYellow
import com.mala.grad_project.ui.theme.hinttextColor


@Composable
fun ExerSizeScreen(
    showPlansExercises: show_plans_exercises
) {
    Column(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.onPrimary)
    ) {
        var selectedDay by remember { mutableStateOf<String?>(null) }

        CoachData(
            showPlansExercises.coach.fname,
            lastname = showPlansExercises.coach.lname,
            "${showPlansExercises.`package`.number_of_months}",
            startDate = showPlansExercises.`package`.start_date,
            endDate = showPlansExercises.`package`.end_date,
            painter = null
        )

        Text(
            text = "Current month",
            modifier = Modifier.fillMaxWidth(),
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            color = brightYellow,
            fontWeight = FontWeight.Bold,
        )
        HorizontalDivider()
        val daysOfWeek = showPlansExercises.msg.map { it.day.toLowerCase() to it.day.capitalize() }



        LazyRow {
            itemsIndexed(daysOfWeek) { index, (day, fullName) ->
                WeekDayCard(
                    dayOfWeek = day,
                    fullName = fullName,
                    isSelected = fullName.equals(selectedDay, ignoreCase = true),
                ) {
                    selectedDay = fullName
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        LineTextViewChoachScreen("Shoulder Day")
        selectedDay?.let { day ->
            val exercisesForSelectedDay = showPlansExercises.msg
                .find { it.day.equals(day, ignoreCase = true) }
                ?.exercises ?: emptyList()
            DisplayExercisesForDay(selectedDay = day, exercises = exercisesForSelectedDay)
        }
    }
}




    @Composable
    fun DisplayExercisesForDay(selectedDay: String?, exercises: List<Exercise>) {
        selectedDay?.let {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
            ) {
                Text(
                    text = "Exercises for $selectedDay",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ) {
                    items(exercises) { exercise ->
                        ExerSizeCard(exersize = exercise)
                    }
                }
            }
        }
    }


