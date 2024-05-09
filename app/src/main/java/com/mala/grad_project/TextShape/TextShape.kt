package com.mala.grad_project.TextShape

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Colors
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.composables.line
import com.mala.grad_project.ui.theme.darkYellow

@Composable
fun OutlinedCardWithTextAndButton(
   buttonText: String,
    onButtonClick: () -> Unit
) {
    Box(modifier = Modifier.padding(5.dp)){
    Card(
        shape = RoundedCornerShape(50.dp),
        border = BorderStroke(1.dp, Color.Gray),
        modifier = Modifier
            .fillMaxWidth()
            .height(42.dp)
        ,
        colors = CardDefaults.cardColors(
            Color.White
        )

    ) {
        val context = LocalContext.current

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(42.dp),
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                Box(modifier = Modifier.padding(top = 5.dp, start = 5.dp)){
                    Row {
                        FloatingActionButton(
                            onClick = {
                                val intent = Intent(Intent.ACTION_OPEN_DOCUMENT)
                                intent.type = "*/*"
                                intent.addCategory(Intent.CATEGORY_OPENABLE)
                                context.startActivity(intent)
                            },
                            backgroundColor = darkYellow,
                            contentColor = Color.White,
                            modifier = Modifier.size(30.dp)
                        ){
                            Icon(Icons.Filled.Add,"")
                        }
                        Text(
                            text = "Type Message",
                            fontSize =13.sp,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(top = 5.dp, start = 5.dp)
                                .wrapContentWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                lineWitheSend(onButtonClick = onButtonClick)
            }
            }
        }
    }
}




@Composable
fun lineWitheSend(
    onButtonClick: () -> Unit
){
    Row(
        modifier = Modifier.padding(top = 5.dp, start = 5.dp,end=10.dp).fillMaxWidth(),
        Arrangement.End
    ){
        VerticalLineSmall(color = Color.Gray, height = 30.dp, width = 1.dp, modifier = Modifier.padding(end=3.dp))
        FloatingActionButton(
            onClick = {onButtonClick()},
            backgroundColor = darkYellow,
            contentColor = Color.White,
            modifier = Modifier.size(30.dp)
        ){
            Icon(Icons.Filled.Send,"")
        }

    }
}
