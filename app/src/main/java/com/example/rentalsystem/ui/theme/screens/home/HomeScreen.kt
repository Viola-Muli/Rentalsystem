package com.example.rentalsystem.ui.theme.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.rentalsystem.R
import com.example.rentalsystem.navigation.ROUT_ABOUT
import com.example.rentalsystem.ui.theme.Darkergreen
import com.example.rentalsystem.ui.theme.Darkgreen


@Composable
fun HomeScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Darkergreen),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(painter = painterResource(id = R.drawable.homeimg),
            contentDescription ="home",
            modifier = Modifier
                .size(200.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )





        Text(
            text ="MagicBricks",
            fontSize = 75.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Gray,
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            text ="Your better choice",
            fontSize = 30.sp,
        )

        Spacer(modifier = Modifier.height(180.dp))



        Button(onClick = { navController.navigate(ROUT_ABOUT) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 70.dp, end = 70.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(100.dp)

        ) {
            Text(
                text = "Get started?"
            )
            
        }






    }



}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

}

