package com.mala.grad_project.Screenns.subsciptions

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import com.mala.grad_project.ui.theme.blue1
import com.mala.grad_project.ui.theme.brightYellow
import com.mala.grad_project.ui.theme.circleColor
import com.mala.grad_project.ui.theme.darkYellow


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
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Select payment method",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
    Spacer(modifier = Modifier.height(30.dp))
        Payment(painter = painterResource(id = R.drawable.visa), type = "Visa",isSelected =selectedPayment==payWay.VISA ){
            selectedPayment = payWay.VISA


        }
        Spacer(modifier = Modifier.height(30.dp))
        Payment(painter = painterResource(id = R.drawable.paybal), type="Paypal",isSelected = selectedPayment== payWay.PAYBAL){
            selectedPayment= payWay.PAYBAL

        }
        Spacer(modifier = Modifier.height(50.dp))
        Row{
            outlineButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(1f)
                    .padding(2.dp),
                text =" Back",
                )
            BlueButton(
                onClick = { /*TODO*/ },
                Modifier
                    .weight(1f)
                    .padding(2.dp),
                text = "Continue")
        }
    }

}