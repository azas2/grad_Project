package com.mala.grad_project.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Warning
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.composables.LetGoButton
import com.mala.grad_project.composables.Spacer150
import com.mala.grad_project.composables.Spacer30
import com.mala.grad_project.composables.Spacer50
import com.mala.grad_project.ui.theme.Sinupcolor
import com.mala.grad_project.ui.theme.WhenUnFouces
import com.mala.grad_project.ui.theme.circleColorLogin
import com.mala.grad_project.ui.theme.headerOutTextFieldColor
import com.mala.grad_project.ui.theme.hinttextColor
import com.mala.grad_project.ui.theme.whenfouces
import com.mala.grad_project.composables.ShapeOfKey as ShapeOfKey


@SuppressLint("RememberReturnType")
@OptIn(ExperimentalMaterial3Api::class)

@Composable
    fun LogInScreen(){
        var state by rememberSaveable { mutableStateOf("")}
        val interactionSource = remember { MutableInteractionSource() }
        val mutable_isError = true
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(androidx.compose.ui.graphics.Color.White)
            .padding(20.dp),
    ) {
        //Subtitle
        Spacer30()
        Box {
            ShapeWithText()
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                text= stringResource(id = R.string.LogIn_Welcome_back),
                color = Color.Black,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                modifier = Modifier.padding(start = 5.dp, top = 50.dp),
                text= stringResource(id = R.string.Login_Subtitle),
                color = hinttextColor,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal
            )
        }
        Spacer50()
        Text(modifier = Modifier.padding(start = 10.dp),
            text= stringResource(id = R.string.Signup_Mobile_number),
            color = headerOutTextFieldColor,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        TextFieldKey(interactionSource,state,{ state=it },isError = mutable_isError,stringResource(id = R.string.Signup_Enter_your_mobile_number))
        Spacer150()

        LetGoButton(text = stringResource(id = R.string.Log_in) ) {/* write here*/}
        Spacer30()
        ShowDontHaveAccount()

    }
}

@Composable
@Preview
fun test2(){
LogInScreen()
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldKey(
    interactionSource:MutableInteractionSource,
    state:String,
    OnValueChange:(String) -> Unit,
    isError :Boolean,
    placeholder:String

) {
    ProvideTextStyle(TextStyle(color = Color.Black)) {
        val isFocused by interactionSource.collectIsFocusedAsState()
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
               ,
            interactionSource = interactionSource,
            value = state.toString(),
            onValueChange = { OnValueChange(it) },
            placeholder = {
                Text(
                    text = placeholder,
                    color = hinttextColor
                )
            },
            maxLines = 1,
            singleLine = true,
            leadingIcon = {
                if (isFocused && !isError)
                    ShapeOfKey(color = whenfouces)
                else ShapeOfKey(color = WhenUnFouces)
                if(isError==true){
                    ShapeOfKey(color = Color.Red)
                }
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = whenfouces,
                unfocusedBorderColor = WhenUnFouces,
                disabledTextColor = Color.Black
            ),
            shape = RoundedCornerShape(9.dp),
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number
            ),
            supportingText = {
                if (isError)
                    ShowThisNumberIsNotRegistered()
            },
            isError = isError
        )
    }
}


@Composable
fun ShapeWithText(){
        Canvas(modifier = Modifier
            .size(79.dp, 80.dp)
            .padding(end = 9.dp, top = 5.dp, bottom = 5.dp)
            .shadow(elevation = 15.dp, shape = RoundedCornerShape(150.dp), spotColor = Color.Black),
            ){
            drawCircle(
                color = circleColorLogin,
                center=center,
                radius =180f,
            )
        }
}
@Composable
fun ShowDontHaveAccount(){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center,
    ){
        Text(
            text = stringResource(id = R.string.Don_t_have_account),
            fontSize = 14.sp,
            color = Color.Black,
            fontWeight = FontWeight.Normal
        )
        Text(modifier = Modifier
            .padding(start = 3.dp)
            .clickable { /*go to signup*/ },
            text = stringResource(id = R.string.Sign_up),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            color = Sinupcolor,
            textDecoration = TextDecoration.Underline
        )
    }
}
@Composable
fun ShowThisNumberIsNotRegistered(){
    Row (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ){
        Icon(modifier = Modifier.padding(top=3.dp),imageVector = Icons.Outlined.Warning, contentDescription =null )
        Text(
            modifier = Modifier.padding(top=12.dp),
            text = stringResource(id = R.string.This_number_is_not_registered_Please),
            fontSize = 8.sp,
            color = Color.Red,
            fontWeight = FontWeight.Normal
        )
        Text(modifier = Modifier
            .padding(top = 12.dp, start =3.dp)
            .clickable { /*go to signup*/ },
            text = stringResource(id = R.string.Login_create_an_account),
            fontSize = 8.sp,
            fontWeight = FontWeight.Normal,
            color = Sinupcolor,
            textDecoration = TextDecoration.Underline
        )
    }
}