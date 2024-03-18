package com.mala.grad_project.presentation.screens
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.opengl.Visibility
import android.provider.MediaStore
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.BorderStroke
import androidx.compose.material.TextFieldDefaults.textFieldColors

import androidx.compose.foundation.Canvas
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
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.IconButton
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.PaintingStyle
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.mala.grad_project.DataSteps.DataScreen
import com.mala.grad_project.DataSteps.GenderScreen
import com.mala.grad_project.DataSteps.PickingPhoto
import com.mala.grad_project.DataSteps.UploadInbodyScreen
import com.mala.grad_project.R
import com.mala.grad_project.compoableOfData.CardOfGender
import com.mala.grad_project.compoableOfData.Circle
import com.mala.grad_project.compoableOfData.CircleOutlinePreview
import com.mala.grad_project.compoableOfData.HorizontalLine
import com.mala.grad_project.compoableOfData.HorizontalLineTall
import com.mala.grad_project.compoableOfData.OwenTextField
import com.mala.grad_project.compoableOfData.OwenTextFieldWithUploadIcon
import com.mala.grad_project.compoableOfData.ShapeOfSmallCircle
import com.mala.grad_project.compoableOfData.TwoButton
import com.mala.grad_project.composables.Spacer150
import com.mala.grad_project.composables.Spacer30
import com.mala.grad_project.composables.Spacer50
import com.mala.grad_project.ui.theme.CircleUnSelected
import com.mala.grad_project.ui.theme.GenderBackGround
import com.mala.grad_project.ui.theme.Sinupcolor
import com.mala.grad_project.ui.theme.WhenUnFouces
import com.mala.grad_project.ui.theme.circleColor
import com.mala.grad_project.ui.theme.fontColor
import com.mala.grad_project.ui.theme.hinttextColor
import com.mala.grad_project.ui.theme.whenfouces


sealed class Screen {
    object Gender : Screen()
    object  Data : Screen()
    object Inbody : Screen()
    object Image : Screen()
    object Succes:Screen()
}

@Composable
fun DataFun(){
    var StanderColor2 by remember { mutableStateOf(CircleUnSelected) }
    var StanderColor3 by remember { mutableStateOf(CircleUnSelected) }
    var CircleOfColor4 by remember { mutableStateOf(CircleUnSelected) }
Column(
modifier = Modifier
    .fillMaxSize()
    .background(Color.White)
) {
    val currentScreen: MutableState<Screen> = remember { mutableStateOf(Screen.Gender) }
    Spacer30()
    Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(2.dp)
                .background(Color.White)
        ){
            Row (modifier = Modifier
                .fillMaxWidth()
                ,Arrangement.SpaceEvenly,
                Alignment.CenterVertically){
                Spacer30()
                ShapeOfSmallCircle("1", circleColor)
                HorizontalLine(circleColor)
                ShapeOfSmallCircle("2", StanderColor2 )
                HorizontalLine(StanderColor2)
                ShapeOfSmallCircle("3", StanderColor3)
                HorizontalLine(StanderColor3)
                ShapeOfSmallCircle("4", CircleOfColor4)
                }
                  HorizontalLineTall()
            }
        when(val screen=currentScreen.value){
           Screen.Gender ->{
               GenderScreen(onNextScreen = {currentScreen.value = Screen.Data
                   StanderColor2= circleColor
               } )
           }
            Screen.Data -> {
                // Display the First screen
                DataScreen(
                    onNextScreen = {
                        currentScreen.value=Screen.Inbody
                        StanderColor3= circleColor },
                    onBackScreen = {
                    currentScreen.value=Screen.Gender
                    StanderColor2= CircleUnSelected })
            }

            Screen.Inbody ->{
                    UploadInbodyScreen(
                        onNextScreen ={
                            currentScreen.value=Screen.Image
                            CircleOfColor4= circleColor
                        },
                        onBackScreen = {currentScreen.value=Screen.Inbody
                            StanderColor3= CircleUnSelected
                        },
                        onSkip = {
                            currentScreen.value=Screen.Image
                            CircleOfColor4= circleColor
                        }
                    )
                }
            Screen.Image ->{
                PickingPhoto(
                    onNextScreen = { currentScreen.value=Screen.Succes }
                    , onBackScreen = {}
                )
            }
            else ->{}
        }
    }


}

@Composable
@Preview
fun ShowMe(){
DataFun()
}
fun ChecktoError(State:String):Boolean{
    if(State=="")
        return true
    else
        return false
}

