package com.mala.grad_project.Screenns.subsciptions

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
import com.mala.grad_project.DataSteps.Gender
import com.mala.grad_project.R
import com.mala.grad_project.composables.Spacer30
import com.mala.grad_project.composables.Spacer50
import com.mala.grad_project.ui.theme.GenderBackGround
import com.mala.grad_project.ui.theme.circleColor


enum class payWay {
    VISA,
    PAYBAL,
    Unspecified
}
@Composable
fun paymentScreen(){
    var selectedPayment by remember { mutableStateOf(payWay.Unspecified) }
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
        com.mala.grad_project.compoableOfData.CardOfGender(painter = painterResource(id = R.drawable.visa), type = "Visa",isSelected =selectedPayment==payWay.VISA ){
            selectedPayment = payWay.VISA


        }
        Spacer30()
        com.mala.grad_project.compoableOfData.CardOfGender(painter = painterResource(id = R.drawable.paybal), type="Female",isSelected = selectedPayment== payWay.PAYBAL){
            selectedPayment= payWay.PAYBAL

        }
        Spacer50()
        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 230.dp, end = 20.dp),
            onClick = {
                if(selectedPayment== payWay.Unspecified){
                    Toast.makeText(context,"select your payment way please", Toast.LENGTH_SHORT).show()
                }else{

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