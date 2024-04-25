package com.mala.grad_project.Screenns.Home.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SearchBarColors
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.Coach
import com.mala.grad_project.R
import com.mala.grad_project.Screenns.Home.composblefunction.BellImage
import com.mala.grad_project.Screenns.Home.composblefunction.CircleCoachImage
import com.mala.grad_project.Screenns.Home.composblefunction.HomeItem
import com.mala.grad_project.Screenns.Home.composblefunction.SearchTextField
import com.mala.grad_project.ui.theme.hinttextColor

@Composable
fun HomeScreen(){
    var textField by remember { mutableStateOf("") }

    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .height(210.dp)
                .background(hinttextColor)
                .padding(top = 50.dp, start = 10.dp, end = 10.dp)
        ){
            Column {

            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                CircleCoachImage(painterResource(id = R.drawable.man),50)
                BellImage(painterResource(id = R.drawable.run))
            }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Choose the right coach for you",
                    fontWeight = FontWeight.Bold,
                    color=Color.White,
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(10.dp))
                SearchTextField(
                    textField = textField,
                    onValueChange = {textField=it},
                    trailingIcon = {
                        IconButton(
                            onClick = { textField = "" }
                        ) {
                            Icon(Icons.Default.Clear, contentDescription = "Clear Icon")
                        }
                    }
                )

            }
        }


    }
}
@Preview
@Composable
fun ShowHomeScreen(){
    HomeScreen()
}
@Composable
fun LazyListWithHomeItems(items: List<Coach>) {
    LazyColumn {
        items(items) { item ->
            HomeItem(item)
        }
    }
}

