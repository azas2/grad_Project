package com.mala.grad_project

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.mala.grad_project.Screenns.Home.screen.HomeScreen
import com.mala.grad_project.Screenns.planCard.PlanChoose
import com.mala.grad_project.presentation.screens.DataFun
import com.mala.grad_project.presentation.screens.LetsGo
import com.mala.grad_project.presentation.screens.LogInScreen
import com.mala.grad_project.presentation.screens.LoginSecond

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun App(){
    Scaffold {
        PlanChoose()
    }
}