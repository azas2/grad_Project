package com.mala.grad_project.newCardExersize

import android.os.Build
import android.util.Log
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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import coil.ComponentRegistry
import coil.ImageLoader
import coil.compose.rememberImagePainter
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import com.mala.grad_project.data.model.Exercise
import com.mala.grad_project.ui.theme.blue1
import com.mala.grad_project.ui.theme.blue2
import com.mala.grad_project.ui.theme.moreBrightYellow
@Composable
fun NewCardExersize(
    exersize: Exercise
) {
    val samllCardVisable:Boolean
    var showDialog by remember { mutableStateOf(false) }
    samllCardVisable = if(showDialog==true){
        false
    }else{
        true
    }
    Box(
        modifier = Modifier
            .size(width = 250.dp, height = 320.dp)
            .padding(10.dp)
    ) {
        // Background Box with blur effect
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(20.dp))
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.White,
                            moreBrightYellow
                        )
                    )
                )
                .blur(radius = 50.dp)
        )

        // Foreground content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // GIF

            ExersizeGifCard(
                exersize ="https://media.giphy.com/media/3oEjI6SIIHBdRxXI40/giphy.gif",
                visible = samllCardVisable,
               onclick = {showDialog=true}
            , sizewidth = 200,
                sizeheight = 150)

            Text(
                text = exersize.name,
                textAlign = TextAlign.Start,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = blue2,
                modifier = Modifier.fillMaxWidth()
            )

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(2.dp)
            ) {
                Text(
                    text = "Number of repetitions",
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = blue1,
                )
                Text(
                    text = exersize.times,
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = blue1,
                    modifier = Modifier.padding(start = 10.dp)
                )
            }

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(2.dp)
            ) {
                Text(
                    text = "Break time",
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = blue1,
                )
                Text(
                    text = "${exersize.rest}s",
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = blue1,
                    modifier = Modifier.padding(start = 10.dp)
                )
            }
        }
    }

    // Show dialog if showDialog is true
    if (showDialog) {
        Dialog(onDismissRequest = { showDialog = false }) {
            GifImageDialog(
                exersize ="",
                onDismiss = { showDialog = false }
            )
        }
    }

    if (showDialog==true) {
        Dialog(onDismissRequest = { showDialog = false }) {
            GifImageDialog(
                exersize = "https://media.giphy.com/media/3oEjI6SIIHBdRxXI40/giphy.gif",
                onDismiss = { showDialog = false }
            )
        }
    }

}

@Composable
fun GifImageDialog(
    exersize: String,
    onDismiss: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(280.dp,450.dp)
            .clickable { onDismiss() },
        contentAlignment = Alignment.Center
    ) {
        ExersizeGifCard(
            exersize = exersize
            , visible = true
            , sizewidth = 250,
            sizeheight = 190
        )
    }
}