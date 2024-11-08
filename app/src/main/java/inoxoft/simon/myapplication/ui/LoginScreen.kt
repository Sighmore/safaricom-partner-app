package inoxoft.simon.myapplication.ui

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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import inoxoft.simon.myapplication.ui.theme.green
import inoxoft.simon.myapplication.ui.theme.white
import inoxoft.simon.myapplication.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(modifier: Modifier, navController: NavHostController){

    var phoneNumber by remember { mutableStateOf("") }
    var  pin by remember { mutableStateOf("") }



    Box (
        modifier= Modifier
            .fillMaxSize()
            .background(green)
    ){
        Box(
            modifier= Modifier
                .fillMaxSize()
                .offset(0.dp,250.dp)
                .background(white)
        ){

        }
        Box(
            modifier= Modifier
                .fillMaxSize()
                .offset(0.dp,100.dp)
                .padding(start = 16.dp, end = 16.dp,bottom = 200.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(white)
        ){
            Column (modifier = Modifier
                .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Image(
                    painter = painterResource(id = R.drawable.mpesa),
                    contentDescription = "Mpesa"
                )
                Spacer(modifier = Modifier.height(12.dp))
                Row (
                    modifier= Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Gray)
                        .fillMaxWidth(0.5f)
                        .padding(2.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ){
                    Text(
                        modifier= Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .background(white)
                            .padding(start = 6.dp, end = 6.dp, top = 2.dp, bottom = 2.dp)
                        ,
                        text = "Agent Login",
                        fontSize = 9.sp
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(modifier= Modifier.padding(3.dp),
                        text = "DSA Login",
                        fontSize = 9.sp
                    )
                }
                Spacer(modifier = Modifier.height(24.dp))
                OutlinedTextField(modifier= Modifier
                    .fillMaxWidth(),
                    value = phoneNumber,
                    onValueChange = {phoneNumber=it},

                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Green,    // Border color when focused
                        unfocusedBorderColor = Color.Gray   // Border color when not focused
                    ),

                    shape = RoundedCornerShape(20.dp),
                    label = {
                        Text(text = "Phone Number",fontSize = 13.sp)
                    })
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(modifier= Modifier
                    .fillMaxWidth(),
                    value = pin,
                    onValueChange = {pin=it},

                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Green,    // Border color when focused
                        unfocusedBorderColor = Color.Gray   // Border color when not focused
                    ),

                    shape = RoundedCornerShape(20.dp),
                    label = {
                        Text(text = "Enter Your Pin",fontSize = 13.sp)

                    })
                Spacer(modifier= Modifier.height(8.dp))
                Text(modifier= Modifier.align(Alignment.Start),
                    text = "Reset Pin",
                    color = green,
                    fontSize = 12.sp
                )
                Spacer(modifier= Modifier.height(8.dp))

                Button(
                    modifier = Modifier.width(250.dp)
                    ,
                    onClick = {
                        navController.navigate("home")
                    },
                    colors =  ButtonDefaults.buttonColors(
                        containerColor = Color.Gray,
                    )
                ) {
                    Text(text = "LOG IN")
                }

            }
        }
    }


}