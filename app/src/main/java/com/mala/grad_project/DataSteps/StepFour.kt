package com.mala.grad_project.DataSteps

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.*
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.mala.grad_project.R
import com.mala.grad_project.compoableOfData.CircleOutlinePreview
import com.mala.grad_project.compoableOfData.TwoButton
import com.mala.grad_project.composables.Spacer150
import com.mala.grad_project.composables.Spacer30


// step 4
@Composable

fun PickingPhoto(
    onNextScreen: () -> Unit,
    onBackScreen: () -> Unit
) {
    var photoUri: Uri? by remember { mutableStateOf(null) }
    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.PickVisualMedia()) { uri ->
        photoUri = uri
    }

    val painter = if (photoUri != null) {
        rememberAsyncImagePainter(
            ImageRequest.Builder(LocalContext.current)
                .data(data = photoUri)
                .build()
        )
    } else {
        painterResource(id = R.drawable.man)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer30()

        CircleOutlinePreview(onclick = {
                launcher.launch(
                    PickVisualMediaRequest(
                        mediaType = ActivityResultContracts.PickVisualMedia.ImageOnly
                    )
                )
            }
        , painter = painter)

        Spacer150()
        Spacer150()
        TwoButton(onNextScreen = { onNextScreen() }, onBackScreen = { onBackScreen() }, text = "Finish")
    }
}
