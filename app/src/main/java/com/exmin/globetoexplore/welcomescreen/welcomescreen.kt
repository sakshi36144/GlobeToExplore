package com.exmin.globetoexplore.welcomescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.exmin.globetoexplore.R
import java.nio.file.WatchEvent
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showSystemUi = true)
fun welcomescreen(){
    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFFFDEAD))) {
    Column (modifier =Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Image(painter = painterResource(R.drawable.logo), contentDescription = null,
            modifier= Modifier.size(200.dp).clip(CircleShape))
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Welcome to GlobeToExplore", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
Row {
    Text(text = "Read our", color = Color.Gray)
    Spacer(modifier = Modifier.width(8.dp))
    Text(text="Privacy Policy", color = colorResource(R.color.maroon))
    Spacer(modifier = Modifier.width(8.dp))
    Text(text = "Tap 'agree and continue ' to",color = Color.Gray)
}
        Row {
            Text(text = "accept the",color = Color.Gray)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Team of Services", color = colorResource(R.color.maroon))
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick ={TODO()},
            modifier = Modifier.size(280.dp,43.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor =colorResource(R.color.maroon))){
            Text(text = "Agree and Continue ", fontSize = 16.sp)
        }
    }
}}