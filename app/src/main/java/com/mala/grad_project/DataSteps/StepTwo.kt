package com.mala.grad_project.DataSteps

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mala.grad_project.compoableOfData.OwenTextField
import com.mala.grad_project.compoableOfData.TwoButton
import com.mala.grad_project.composables.Spacer30
import com.mala.grad_project.composables.Spacer50
import com.mala.grad_project.presentation.screens.ChecktoError


//step two
@Composable
fun DataScreen(
    onNextScreen:()->Unit,
    onBackScreen:()->Unit
) {

    var state by remember { mutableStateOf("") }
    var state2 by remember { mutableStateOf("") }
    var state3 by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(10.dp)
    ) {
        Spacer30()

        OwenTextField(
            state = state,
            onValueChange = { state = it },
            holder = "Enter your age",
            text = "What is your age?",isError = ChecktoError(state)
        )
        Spacer30()
        OwenTextField(state =state2
            , onValueChange ={state2=it}
            , holder ="What is your Weight"
            , text ="What is your age?",
            isError = ChecktoError(state2)
        )
        Spacer30()
        OwenTextField(state =state3 , onValueChange ={state3=it} , holder ="Enter your tall" , text ="What is your tall?" ,isError = ChecktoError(state3))
        Spacer50()
        Spacer30()
        TwoButton(onNextScreen = { onNextScreen() },onBackScreen={onBackScreen()}, text ="Next")

    }
}
