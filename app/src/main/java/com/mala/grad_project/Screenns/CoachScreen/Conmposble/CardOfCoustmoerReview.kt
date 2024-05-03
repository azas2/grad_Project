package com.mala.grad_project.Screenns.CoachScreen.Conmposble

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.ui.theme.circleColor
import com.mala.grad_project.ui.theme.hinttextColor
import com.mala.grad_project.uitls.UserReview

@Composable
fun CardOfCustomerReview(
    // BeforeImge:Painter,
    //AfterImage:Painter,
    // comment:String
){

    Column(
        modifier = Modifier
            .size(width=170.dp, height = 160.dp)
            .padding(16.dp)
            .shadow(elevation = 10.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .weight(1f)
                .background(Color.White, RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)),

            ) {

            Row(
                Modifier.wrapContentSize().padding(start=15.dp,top=10.dp),

                ) {



                Column (
                    horizontalAlignment=Alignment.CenterHorizontally,
                    modifier = Modifier.padding(end = 10.dp)
                ){

                    Text(
                        text = "Before",
                        fontSize = 10.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Normal,
                        color = circleColor
                    )
                    Image(
                        painter = painterResource(id = R.drawable.man),
                        contentDescription = "error image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(height = 50.dp, width = 50.dp)
                            .clip(RoundedCornerShape(50.dp))


                    )
                }

                Column (
                    horizontalAlignment=Alignment.CenterHorizontally
                ){
                    Text(
                        text = "After",
                        fontSize = 10.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Normal,
                        color=circleColor
                    )

                    Image(
                        painter = painterResource(id = R.drawable.man),
                        contentDescription = "error image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(height = 50.dp, width = 50.dp)
                            .clip(RoundedCornerShape(50.dp))


                    )
                }

            }



        }


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)

                .background(
                    hinttextColor,
                    RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp)
                )
        ){
            Text(
                text = "commgjhjfhjkgdhfjghdfjjdfhkjfkjhfkdjhgfhgdfjkhdfkjhdfjgkdjfkdfjhgdfhreituereroentjskjhfkjhkjfdhsjkfhsjfkj" ,
                fontSize = 8.sp,
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .padding(start = 5.dp, end = 5.dp,top=10.dp, bottom = 10.dp)

            )
        }
    }
}



@Composable
@Preview
fun testCard(){
    CardOfCustomerReview()
}


