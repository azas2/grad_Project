package com.mala.grad_project.compoableOfData

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.ui.theme.circleColor
import com.mala.grad_project.ui.theme.hinttextColor


@Composable
fun OwenTextFieldWithUploadIcon(
    state: String,
    onValueChange: (String) -> Unit,
    holder: String,
    text: String,

    ) {
    Column(

        modifier = Modifier.fillMaxWidth()
    ) {

        val indicatorWidth = 1.9.dp
        var indicatorColor = circleColor
        val textFieldPadding = 5.dp
        Text(modifier = Modifier.padding(bottom =5.dp),
            text = text,
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold)
        TextField(
            value =state ,
            onValueChange = onValueChange,
            modifier = Modifier
                .fillMaxWidth()
                .shadow(elevation = 30.dp)
                .drawWithContent {
                    drawContent()
                    val strokeWidth = indicatorWidth.value * density
                    val y = size.height - strokeWidth / 2
                    val cornerRadius = 50.dp.toPx()
                    drawRoundRect(
                        color = indicatorColor,
                        topLeft = Offset(textFieldPadding.toPx(), y - strokeWidth / 2),
                        size = Size(size.width - 2 * textFieldPadding.toPx(), strokeWidth),
                        cornerRadius = CornerRadius(cornerRadius),
                        style = Stroke(width = strokeWidth)
                    )
                },
            singleLine = true,
            placeholder = { Text(text = holder, textAlign = TextAlign.Start, color = hinttextColor) },
            shape = RoundedCornerShape(13.dp),
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Black,
                backgroundColor = Color.White,
                cursorColor = Color.Black,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            readOnly = true,
            trailingIcon  = { Image(
                painterResource(id = R.drawable.upload )
                , contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .clickable {
                        //intent here
                    },
            ) },
        )


    }
}