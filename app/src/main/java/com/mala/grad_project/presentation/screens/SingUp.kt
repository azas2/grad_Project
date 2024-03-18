package com.mala.grad_project.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.composables.HeadText
import com.mala.grad_project.composables.ShapeOfKey
import com.mala.grad_project.composables.Spacer30
import com.mala.grad_project.composables.Spacer50
import com.mala.grad_project.composables.TextLogin
import com.mala.grad_project.ui.theme.WhenUnFouces
import com.mala.grad_project.ui.theme.hinttextColor
import com.mala.grad_project.ui.theme.whenfouces

@Composable
fun SingUpScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(androidx.compose.ui.graphics.Color.White)
            .padding(20.dp)
    ) {
        var state by remember { mutableStateOf("") }
        val interactionSource = remember { MutableInteractionSource() }

        Spacer30()
        Box {
            ShapeWithText()
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                text= stringResource(id = R.string.Signup_Create_your_account),
                color = Color.Black,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                modifier = Modifier.padding(start = 5.dp, top = 50.dp),
                text= stringResource(id = R.string.Enter_your_details_to_continue),
                color = hinttextColor,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal
            )
        }
        Spacer50()
        Column {
            HeadText(text = stringResource(id = R.string.Signup_First_name))

            MyTextField(state =state,
                    {
                        state=it
                    }, placeHolder = stringResource(id = R.string.Signup_Enter_your_first_name)
                )
            Spacer30()
            HeadText(text = stringResource(id = R.string.Signup_Last_Name))
            MyTextField(state =state,
                {
                    state=it
                }, stringResource(id = R.string.Signup_Enter_your_last_name)
            )
            HeadText(text = stringResource(id = R.string.Signup_Mobile_number))
            TextFieldKey(state =state, OnValueChange = {state=it},interactionSource = interactionSource, isError = false,
                 placeholder = stringResource(id = R.string.Signup_Enter_your_mobile_number)
            )
            MyTextField(state =state,
                {
                    state=it
                }, stringResource(id = R.string.Signup_Enter_your_mobile_number)
            )

        }

    }
}
@Preview
@Composable
fun TestSinUp(){
    SingUpScreen()
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField(
    state:String,
    OnValueChange:(String) -> Unit,
    placeHolder:String

) {
    ProvideTextStyle(TextStyle(color = Color.Black)) {
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
              ,
            value = state.toString(),
            onValueChange = { OnValueChange(it) },
            placeholder = {
                Text(
                    text = placeHolder,
                    textAlign = TextAlign.Start,
                    color = hinttextColor
                )
            },
            maxLines = 1,
            singleLine = true,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = whenfouces,
                unfocusedBorderColor = WhenUnFouces,
                disabledTextColor = Color.Black
            ),
            shape = RoundedCornerShape(9.dp),
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number
            ),

        )
    }
}