package com.mala.grad_project.Screenns.Home.composblefunction

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mala.grad_project.ui.theme.circleColor

@Composable
fun SearchTextField(
    textField: String,
    onValueChange: (String) -> Unit,
    trailingIcon: @Composable (() -> Unit)? = null,
    ){
    Box(
        modifier = Modifier
            .background(color = Color.Transparent)
            .fillMaxWidth()   ) {
        TextField(
            value = textField,
            onValueChange = onValueChange,
            leadingIcon = {

                Icon(Icons.Default.Search, contentDescription = "Add Icon")
            }
            , modifier = Modifier.fillMaxWidth().background(Color.Transparent),
            trailingIcon = {
                if (textField.isNotEmpty()) {
                    trailingIcon?.invoke()
                }

            }, placeholder = {
                Text("Search")
            },

        )
        Canvas(modifier = Modifier.matchParentSize()) {
            drawLine(
                color = circleColor,
                start = Offset(0f, size.height),
                end = Offset(size.width, size.height),
                strokeWidth = 5f
            )
        }
    }
}
