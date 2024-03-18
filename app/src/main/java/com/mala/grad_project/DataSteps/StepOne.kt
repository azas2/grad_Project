package com.mala.grad_project.DataSteps

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.compoableOfData.CardOfGender
import com.mala.grad_project.composables.Spacer30
import com.mala.grad_project.composables.Spacer50
import com.mala.grad_project.ui.theme.GenderBackGround
import com.mala.grad_project.ui.theme.circleColor


enum class Gender {
    Male,
    Female,
    Unspecified
}

// gender Screen
// step one
@Composable
fun GenderScreen(onNextScreen: () -> Unit) {
    var selectedGender by remember { mutableStateOf(Gender.Unspecified) }
    val context = LocalContext.current

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(10.dp)
        , horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer30()
        Text(
            text = "What is your gender?",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer30()
        CardOfGender(painter = painterResource(id = R.drawable.boy), type = "Male",isSelected =selectedGender==Gender.Male){
            selectedGender = Gender.Male


        }
        Spacer30()
        CardOfGender(painter = painterResource(id = R.drawable.woman), type="Female",isSelected = selectedGender==Gender.Female){
            selectedGender=Gender.Female

        }
        Spacer50()
        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 230.dp, end = 20.dp),
            onClick = {
                if(selectedGender==Gender.Unspecified){
                    Toast.makeText(context,"select your Gender please", Toast.LENGTH_SHORT).show()
                }else{
                    onNextScreen()
                }
            }
            ,    colors = ButtonDefaults.buttonColors(
                circleColor,
                contentColor = GenderBackGround
            )
        ) {
            Text(text = "next", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }
    }

}