package com.mala.grad_project

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.mala.grad_project.Screenns.CoachScreen.Screen.CoachScreen
import com.mala.grad_project.Screenns.Home.screen.HomeScreen
import com.mala.grad_project.Screenns.Menu.menuScreen
import com.mala.grad_project.Screenns.planCard.PlanChoose
import com.mala.grad_project.Screenns.subsciptions.ExerSizeCard
import com.mala.grad_project.Screenns.subsciptions.ExerSizeScreen
import com.mala.grad_project.domain.Entity.Coach
import com.mala.grad_project.domain.Entity.Exercise
import com.mala.grad_project.domain.Entity.Msg
import com.mala.grad_project.domain.Entity.show_plans_exercises
import com.mala.grad_project.presentation.screens.DataFun
import com.mala.grad_project.presentation.screens.LetsGo
import com.mala.grad_project.presentation.screens.LogInScreen
import com.mala.grad_project.presentation.screens.LoginSecond
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxSize
import com.mala.grad_project.domain.Entity.Package

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun App() {
    val fakeData = show_plans_exercises(
        coach = Coach("Atef", "Mohamed", "Coaches/17148580687589.jpg"),
        error_msg = "",
        `package` = Package("2024-04-23 ", 3, "2024-06-07 11:42:16"),
        payment_status = "COMPLETED",
        status = true,
        msg = listOf(
            Msg(
                id = 29,
                name = "Starter",
                day = "tuesday",
                exercises = listOf(
                    Exercise("run", "sports/2.gif", 10, 20),
                    Exercise("stoomck", "sports/1.gif", 5, 30)
                )
            ),
            Msg(
                id = 30,
            name = "Starter",
            day = "Saturday",
            exercises = listOf(
                Exercise("run", "sports/2.gif", 10, 20),
                Exercise("stoomck", "sports/1.gif", 5, 30)
            )
        )
        )
    )

    Scaffold {
        ExerSizeScreen(fakeData)
    }
}
