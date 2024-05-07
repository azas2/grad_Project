package com.mala.grad_project.Screenns.CoachScreen.Screen

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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.Screenns.CoachScreen.Conmposble.CardOfCustomerReview
import com.mala.grad_project.Screenns.CoachScreen.Conmposble.LineTextViewChoachScreen
import com.mala.grad_project.Screenns.Home.composblefunction.BellImage
import com.mala.grad_project.Screenns.Home.composblefunction.CircleCoachImage
import com.mala.grad_project.Screenns.Home.composblefunction.StarRatingBarCoach
import com.mala.grad_project.ui.theme.circleColor
import com.mala.grad_project.ui.theme.hinttextColor
import com.mala.grad_project.uitls.UserReview

@Composable
fun CoachScreen(

){

    val reviewList = listOf(
       UserReview("Ahmed alaa", R.drawable.man, 4f,"this is goo coach very recommended"),
        UserReview("Ahmed salah", R.drawable.man, 4f,"this is goo coach very recommended"),
        UserReview("Ahmed gamal", R.drawable.man, 4f,"this is goo coach very recommended"),
    )
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White),

    ) {
        var rating by remember { mutableStateOf(1f) }
        Box(
            Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(hinttextColor)
                .padding(top = 30.dp)

        ){
            Column {

                Row(
                    Modifier.fillMaxWidth()
                        .padding(start=10.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    CircleCoachImage(painterResource(id = R.drawable.man),55)
                    BellImage(painterResource(id = R.drawable.run))
                }

            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 0.dp, top = 10.dp)

        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                Arrangement.Center,
                Alignment.CenterHorizontally
            ) {
                CircleCoachImage(painter= painterResource(id = R.drawable.man) , size =150)
                    Text(
                        text = "Captain:ahmed Alaa",
                        Modifier
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize =20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    StarRatingBarCoach(maxStars =6, rating =6f, onRatingChanged = {
                        rating = it
                    })
                    Row (
                        Modifier.fillMaxWidth()
                            .padding(start = 0.dp,top=5.dp),
                            Arrangement.Center
                    ){
                        Text(
                            text = "number of clients : ",
                            Modifier.wrapContentSize(),
                            textAlign = TextAlign.Center,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = circleColor
                        )
                        Text(modifier = Modifier.wrapContentSize(),
                            text = "10",
                            fontSize =15.sp,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Normal,
                            color = Color.Black,
                        )
                    }

                }
            }
        Spacer(modifier = Modifier.height(15.dp))
        LineTextViewChoachScreen("My portfolio")
        Spacer(modifier = Modifier.height(15.dp))
        Spacer(modifier = Modifier.height(15.dp))
        CardOfCustomerReview()
        }




    }


@Composable
@Preview
fun test_Coach(){
    CoachScreen()
}
