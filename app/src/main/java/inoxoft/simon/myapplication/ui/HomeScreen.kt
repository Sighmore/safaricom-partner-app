package inoxoft.simon.myapplication.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import inoxoft.simon.myapplication.ui.theme.green
import inoxoft.simon.myapplication.ui.theme.white
import inoxoft.simon.myapplication.R


@Composable
fun HomeScreen(modifier: Modifier, navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(green)
    ){
        Box(modifier = Modifier
            .fillMaxSize()
            .offset(0.dp,180.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(white)
        ){

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopStart)
                .padding(10.dp)
        ) {
            Box(modifier = Modifier
                .size(40.dp)
                .offset(20.dp,30.dp)
                .clip(shape = CircleShape)
                .background(white)
                .padding(4.dp)
            ){
                Text(modifier=Modifier
                    .align(Alignment.Center),
                    text = "BK",
                    fontSize = 20.sp,
                    color = Color.Red,
                )
            }
            Column(
                modifier = Modifier
                    .offset(20.dp,25.dp)
                    .padding(start = 9.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = "Karibu",
                    fontSize = 8.sp,
                    color = white
                )
                Spacer(modifier = Modifier.padding(0.dp))
                Text(
                    text = "Beatrice Kuria \uD83D\uDC4B",
                    fontSize = 15.sp,
                    color = white,
                    fontWeight = FontWeight.Bold,
                )
            }
            Spacer(modifier = Modifier.fillMaxWidth(0.4f))
            //notification icon
            Icon(modifier = Modifier
                .offset(50.dp,40.dp),
                imageVector = androidx.compose.material.icons.Icons.Default.Notifications,
                contentDescription = "Notifications",
                tint = white
            )
        }

        Row {
            Box(modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .offset(30.dp,300.dp)
                .background(white)
                .fillMaxWidth(0.45f)
                .fillMaxHeight(0.18f)
                .padding(10.dp)
            ){
             Row (
                 modifier = Modifier
             ){
                 Icon(
                     painter = painterResource(id = R.drawable.sim),
                     contentDescription = "Notifications",
                     modifier = Modifier.size(30.dp),
                     tint = green
                 )

                 Icon(
                     modifier = Modifier
                         .offset(70.dp,5.dp),
                     imageVector = Icons.Default.ArrowForward,
                     contentDescription = "sim",
                     tint = green
                 )

             }
                Text(modifier = Modifier
                    .align(Alignment.BottomStart),
                    text = "Sim \nRegistration",
                    color = green,
                    fontSize = 18.sp,
                )
            }
        }
    }
}














