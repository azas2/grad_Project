package com.mala.grad_project

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.mala.grad_project.domain.Entity.Coach
import com.mala.grad_project.domain.Entity.Exercise
import com.mala.grad_project.domain.Entity.Msg
import com.mala.grad_project.domain.Entity.show_plans_exercises
import androidx.compose.runtime.*
import com.mala.grad_project.Screenns.subsciptions.PlanUIScreen
import com.mala.grad_project.domain.Entity.Package

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun App() {
//null
    //ACCEPTED
    //COMPLETED
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
        PlanUIScreen(fakeData)
    }
}
