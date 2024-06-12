package com.mala.grad_project.Screenns.subsciptions

import android.os.Build.VERSION.SDK_INT
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.ImageLoader
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import com.mala.grad_project.ui.theme.blue2
import com.mala.grad_project.ui.theme.brightYellow

import androidx.compose.ui.platform.LocalDensity
import coil.ComponentRegistry
import coil.compose.rememberImagePainter
import com.mala.grad_project.data.model.Exercise

@Composable
fun ExerSizeCard(
 exersize: Exercise
){
    var visible by remember {
        mutableStateOf(true)
    }
    Card(
        modifier = Modifier
            .wrapContentSize()
            .padding(5.dp)
            .clip(RoundedCornerShape(30.dp))
            .shadow(elevation = 10.dp)
            , colors = CardDefaults.cardColors(Color.White)
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ){

            Box (
                Modifier.padding(top=30.dp)
            ){

            }
                Column(
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .size(200.dp,150.dp)
                        .padding(20.dp)
                ) {

                    Text(
                        modifier = Modifier
                            .wrapContentWidth()
                        ,
                        text =exersize.exercise,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        color= blue2
                    )
                    Row (
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(
                            modifier = Modifier,
                            text ="number of repetion ",
                            fontSize = 15.sp,
                            textAlign = TextAlign.Center
                        )
                        Text(
                            modifier = Modifier
                                .wrapContentSize(),
                            text ="${exersize.times}",
                            fontSize = 10.sp,
                            textAlign = TextAlign.Center,
                            color= brightYellow
                        )
                    }
                    Row (
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            modifier = Modifier,
                            text ="Break time ",
                            fontSize = 15.sp,
                            textAlign = TextAlign.Center
                        )
                        Text(
                            modifier = Modifier
                                .wrapContentSize(),
                            text ="  ${exersize.rest }",
                            fontSize = 10.sp,
                            textAlign = TextAlign.Center,
                            color= brightYellow
                        )
                    }
                }

            }

        Divider(color = Color.Black, thickness = 1.dp, modifier = Modifier.padding(horizontal = 8.dp))

    }
}
