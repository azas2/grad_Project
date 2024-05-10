package com.mala.grad_project

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import com.mala.grad_project.EditProfile.EditProfile
import com.mala.grad_project.Screenns.subsciptions.PlanUIScreen
import com.mala.grad_project.Screenns.subsciptions.paymentScreen
import com.mala.grad_project.TextShape.OutlinedCardWithTextAndButton
import com.mala.grad_project.data.model.Coach
import com.mala.grad_project.data.model.Exercise
import com.mala.grad_project.data.model.Msg
import com.mala.grad_project.data.model.Package
import com.mala.grad_project.data.model.show_plans_exercises
import com.mala.grad_project.data.model.updateProfile.update_profile
import com.mala.grad_project.newCardExersize.NewCardExersize

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun App() {


    val getFakeUserData=update_profile("", msg = com.mala.grad_project.data.model.updateProfile.Msg("ammar", lname = "yasser", phone = "01092329104", img = "Trainees/17150827606174.png"),true)
    Scaffold{
        EditProfile(getFakeUserData)
    }
}
