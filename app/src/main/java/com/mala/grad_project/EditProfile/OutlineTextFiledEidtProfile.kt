package com.mala.grad_project.EditProfile

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.mala.grad_project.ui.theme.WhenUnFouces
import com.mala.grad_project.ui.theme.hinttextColor
import com.mala.grad_project.ui.theme.whenfouces


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlineTextFieldToEditData(
    state:String,
    OnValueChange:(String) -> Unit,
    enable:Boolean

) {
    ProvideTextStyle(TextStyle(color = Color.Black)) {
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start=20.dp, end = 20.dp)
            ,
            value = state.toString(),
            onValueChange = { OnValueChange(it) },

            maxLines = 1,
            singleLine = true,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = whenfouces,
                unfocusedBorderColor = WhenUnFouces,
                disabledTextColor = Color.Black
            ),
            shape = RoundedCornerShape(9.dp),

            enabled = enable

            )
    }
}