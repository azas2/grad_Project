package com.mala.grad_project.newCardExersize

import android.os.Build
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.ComponentRegistry
import coil.ImageLoader
import coil.compose.rememberImagePainter
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import com.mala.grad_project.R
import com.mala.grad_project.data.model.Exercise

@Composable
fun ExersizeGifCard(
    exersize: String,
    visible: Boolean,
    onclick:( () -> Unit)?=null,
    sizeheight:Int?=null,
    sizewidth:Int?=null
){
    Box(
        Modifier
            .padding(10.dp)
            .shadow(elevation = 30.dp)

    ){
        Card (
            modifier = Modifier.size(width =sizewidth!!.dp, height = sizeheight!!.dp)
            ,
            colors=CardDefaults.cardColors(
                Color.White
            )
        ){
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
                    .clickable { onclick?.let { it() } }
            ){
                GifImage(exersize,visible = true)
            }

        }
    }
}


@Composable
fun GifImage(
    exersize: String,
    visible: Boolean
) {
    val density = LocalDensity.current
    val context = LocalContext.current
    val imageLoader = ImageLoader.Builder(context)
        .components(fun ComponentRegistry.Builder.() {
            if (Build.VERSION.SDK_INT >= 28) {
                add(ImageDecoderDecoder.Factory())
            } else {
                add(GifDecoder.Factory())
            }
        })
        .build()

    AnimatedVisibility(
        visible = visible,
        enter = slideInVertically(
            initialOffsetY = { with(density) { -40.dp.roundToPx() } }
        ) + expandVertically(expandFrom = Alignment.Top) + fadeIn(initialAlpha = 0.3f),
        exit = slideOutVertically() + shrinkVertically() + fadeOut(),
        modifier = Modifier.padding(8.dp)
    ) {

        Image(
            painter = rememberImagePainter(
                data = exersize,
                imageLoader = imageLoader
            ),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .clip(RoundedCornerShape(30.dp))


        )

    }
}
