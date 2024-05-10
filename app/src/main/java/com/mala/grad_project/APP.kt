package com.mala.grad_project

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import com.mala.grad_project.Screenns.subsciptions.PlanUIScreen
import com.mala.grad_project.Screenns.subsciptions.paymentScreen
import com.mala.grad_project.TextShape.OutlinedCardWithTextAndButton
import com.mala.grad_project.data.model.Coach
import com.mala.grad_project.data.model.Exercise
import com.mala.grad_project.data.model.Msg
import com.mala.grad_project.data.model.Package
import com.mala.grad_project.data.model.show_plans_exercises
import com.mala.grad_project.newCardExersize.NewCardExersize

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun App() {
// null
    //ACCEPTED
    //REJECTED
    //UNSUBSCRIBED
    //COMPLETED
    val fakeData = show_plans_exercises(
        coach = Coach("Atef", "Mohamed", "Coaches/17148580687589.jpg"),
        error_msg = "",
        id = 1,
        `package` = Package(number_of_months = 1, start_date = "2024-04-23", end_date = "2024-06-08 "),
        payment_status = "UNSUBSCRIBED",
        status = false,
        msg = listOf(
            Msg(
                id = "2",
                name = "",
                day = "sunday",
                exercises = listOf(
                    Exercise("gif", "run", "20", "10")
                )
        ),
            Msg(
                id = "1",
            name = "",
            day = "saturday",
            exercises = listOf(
                Exercise("gif", "go", "20", "10")
            )


        ),
                    Msg(
                    id = "1",
            name = "",
            day = "Monday",
                exercises = listOf(
                 Exercise("gif", "hard work", "20", "10")
                )
            )
        )
    )



    Scaffold{
        OutlinedCardWithTextAndButton()
    }
}
