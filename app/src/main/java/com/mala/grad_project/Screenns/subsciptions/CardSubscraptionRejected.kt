import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mala.grad_project.R
import com.mala.grad_project.Screenns.subsciptions.Calender
import com.mala.grad_project.Screenns.subsciptions.CalenderCoustemSize
import com.mala.grad_project.data.model.show_plans_exercises
import com.mala.grad_project.ui.theme.blue1
import com.mala.grad_project.ui.theme.brightYellow
import com.mala.grad_project.ui.theme.darkYellow

@Composable
fun CardSubscraptionRejected(
    getPlansResponse: show_plans_exercises
){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        Arrangement.Center

    ){
    Box (
        Modifier
            .padding(10.dp)
            .shadow(elevation = 20.dp)
            
    ){


        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(5.dp))
            ,
            colors = CardDefaults.cardColors(Color.White)
        ) {
            Spacer(modifier = Modifier.height(50.dp))
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                Arrangement.SpaceBetween
            ) {
                Column {
                    Row {
                        Text(
                            text ="Captain: ",

                            fontWeight = FontWeight.Bold,
                            color = blue1,
                            fontSize = 20.sp
                        )
                        Text(
                            text ="${getPlansResponse.coach.fname} ${getPlansResponse.coach.lname}",
                            fontWeight = FontWeight.Bold,
                            color = blue1,
                            fontSize = 20.sp
                        )
                    }
                    Row{
                        Text(

                            text ="Package: ",
                            modifier = Modifier.padding(top=5.dp),
                            fontSize = 15.sp,
                            color = darkYellow,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text ="${getPlansResponse.`package`.number_of_months} Months",
                            modifier = Modifier.padding(top=5.dp),
                            fontSize = 15.sp,
                            color = blue1,
                            fontWeight = FontWeight.Bold

                        )
                    }
                    Row (
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        if (getPlansResponse.payment_status == "REJECTED"){
                            Image(
                                painter = painterResource(id = R.drawable.remove),
                                contentDescription = null,
                                Modifier
                                    .size(25.dp)
                                    .padding(top = 2.dp)

                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Rejected",
                                fontSize = 15.sp,
                                color = brightYellow

                            )
                        }
                    }

                }
                Column {
                    CalenderCoustemSize(typeOfText = "Start date", date =getPlansResponse.`package`.start_date, painterResource(id = R.drawable.calander), iconSize = 20, fontsize =10 )
                    CalenderCoustemSize(typeOfText = "End date", date =getPlansResponse.`package`.end_date, painterResource(id = R.drawable.truecalander), iconSize = 20, fontsize = 10 )

                }

            }

        }
    }
    }
}
