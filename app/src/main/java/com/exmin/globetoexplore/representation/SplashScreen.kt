package com.exmin.globetoexplore.representation

import androidx.compose.ui.text.font.FontWeight


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import com.exmin.globetoexplore.R
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavHostController
import com.exmin.globetoexplore.Navigation.Routes
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navHostController: NavHostController) {
    LaunchedEffect(Unit) {
        delay(1000)
        navHostController.navigate(Routes.WelcomeScreen){
            popUpTo<Routes.representation>{inclusive=true}
        }
    }
    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFFFDEAD))) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier.size(300.dp).clip(CircleShape).align(Alignment.Center)
        )
        Column( modifier = Modifier.align(Alignment.BottomCenter),horizontalAlignment=Alignment.CenterHorizontally) {
            Text(
                text = "From",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
               )
            Row {
                Icon(painter = painterResource(R.drawable.meta),
                    contentDescription = "META",
                    modifier = Modifier.size(34.dp),
                    tint= colorResource(R.color.maroon)
                )
                Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Meta", fontSize = 34.sp, fontWeight = FontWeight.Bold)
            }

        }
    }
}
