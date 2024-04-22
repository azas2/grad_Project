package com.mala.grad_project.Screenns.CoachScreen.Conmposble

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.Screenns.Home.composblefunction.StarRatingBar
import com.mala.grad_project.ui.theme.hinttextColor

@Composable
fun CardOfCustomerReview(
    /*
    nameOfUser:String,
    image:String,
    rateNumber:Int,
    comment:String
*/
){
    var rating by remember { mutableStateOf(1f) }
        Column(
            modifier = Modifier
                .size(320.dp, height = 210.dp)
                .padding(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color.White, RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
            ) {
                Column {

                    Row(
                        Modifier.fillMaxWidth()
                    ) {
                        CircleCoachImage(
                            painterResource(id = R.drawable.man), 50
                        )


                        Column {
                            Text(
                                text = "Ahmed alaa",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 20.dp, top = 20.dp)
                            )
                            StarReview(maxStars =6, rating = 6.0f, onRatingChanged = {
                                rating = it
                            },20,10 )
                        }

                    }


                }
            }


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)

                    .background(
                        hinttextColor,
                        RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp)
                    )
            ){
                Text(
                    text = "hello mr ahmed is gooddhfghjghdfjhggsjfbg ",
                    fontSize = 15.sp,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Bold,
                     color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth().height(80.dp)
                        .padding(start=10.dp,end=10.dp,top=20.dp)

                )
            }
        }
    }




@Composable
@Preview
fun testme(){
    CardOfCustomerReview()
}
@Composable
fun blueSheapOfCard(){
    Image(

        painter = painterResource(id =R.drawable.rectangle )
        , contentDescription =null,
        Modifier.size(width = 200.dp, height = 90.dp)
    )
}