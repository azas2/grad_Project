package com.mala.grad_project.Screenns.Home.composblefunction

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Warning
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.compoableOfData.IconOfImageProfile
import com.mala.grad_project.ui.theme.Sinupcolor
import com.mala.grad_project.ui.theme.circleColor

@Composable
fun HomeItem(/*make hir object*/) {
    var rating by remember { mutableStateOf(1f) }
    Box(modifier = Modifier
        .size(width = 390.dp, height = 85.dp)
        .padding(start = 20.dp, top = 8.dp)
        .shadow(elevation = 10.dp)){
        Card(
            Modifier
                .size(width = 350.dp, height = 150.dp)
                .background(Color.White, RoundedCornerShape(50.dp))
                .clickable { /*click*/ }
                ,colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Text(
                text = "coachname",
                Modifier
                    .padding(start = 100.dp, top = 10.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Start,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            ShowNumberofClients(number = 10)
             StarRatingBar(maxStars =6, rating = 2.0f, onRatingChanged = {
                rating = it
            },90,10 )
        }
    }

    CircleCoachImage(painter = painterResource(id = R.drawable.man),90)
}
@Preview
@Composable
fun showScreen(){
    HomeItem()
}
@Composable
fun ShowNumberofClients(
    number:Int
){
    Row (
        Modifier.size(width = 390.dp, height = 15.dp)
    .padding(start = 80.dp)
    ){
        Text(
            text = "number of clients : ",
            Modifier
                .padding(start=20.dp),
            textAlign = TextAlign.Start,
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold,
            color = circleColor
        )
        Text(modifier = Modifier,
            text = "$number",
            fontSize =10.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
        )
    }
}

