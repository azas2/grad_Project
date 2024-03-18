package com.mala.grad_project.DataSteps

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.compoableOfData.OwenTextFieldWithUploadIcon
import com.mala.grad_project.compoableOfData.TwoButton
import com.mala.grad_project.composables.Spacer50
import com.mala.grad_project.ui.theme.hinttextColor

private fun getFileName(uri: Uri): String {

    return uri.pathSegments.lastOrNull()?:"Unknown"

}
//step3
@Composable
fun UploadInbodyScreen(
    onNextScreen:()->Unit,
    onBackScreen:()->Unit,
    onSkip:()->Unit
) {
    var selectedFileUri by remember { mutableStateOf<Uri?>(null) }
    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        selectedFileUri = uri
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(10.dp)
    ) {
        Spacer50()
        var state by remember { mutableStateOf("") }
        OwenTextFieldWithUploadIcon(selectedFileUri?.let { getFileName(it) } ?: "",{state=it},"Upload your inbody ","Upload your inbody", onclick = {
            launcher.launch("application/*")
        })
        Text(modifier = Modifier
            .padding(start = 250.dp, end = 30.dp, top = 10.dp)
            .clickable { onSkip() },
            text ="Skip now" ,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = hinttextColor,
            textDecoration = TextDecoration.Underline
        )
        Spacer50()
        Spacer50()
        Spacer50()
        TwoButton(onNextScreen = { onNextScreen() },onBackScreen={onBackScreen()}, text = "next")

    }
}