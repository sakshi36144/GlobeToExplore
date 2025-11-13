package com.exmin.globetoexplore.callscreen

import android.R.attr.onClick
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exmin.globetoexplore.R
import androidx.compose.material3.IconButton



@Composable

fun callitemdesign(call: Call){
    val  isMissed by remember {
        mutableStateOf(true)
    }
    Row(modifier = Modifier.fillMaxWidth()
        .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
       )
    {
        Image(painter= painterResource(call.image),
            contentDescription = null,
            modifier = Modifier.size(60.dp)
                .clip(CircleShape), contentScale = ContentScale.Crop
        )
        Spacer(modifier =Modifier.height(4.dp))
        Column {
            Text(text=call.name,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = colorResource(id=R.color.maroon))
            Row (){
                Icon(painter=painterResource(id=R.drawable.arrow),
                    contentDescription = null, // or "Call arrow icon"
                    tint = if(call.isMissed){
                        colorResource(id=R.color.maroon)
                    }else{
                        colorResource(id = R.color.black)
                    }, // optional
                    modifier = Modifier.size(20.dp))


                Spacer(modifier=Modifier.width(2.dp))
                Text(text=call.time, color = colorResource(id=R.color.maroon))
            }
        }
        Box(modifier = Modifier.fillMaxWidth()){
            IconButton(onClick = { /* TODO: Handle call click */ },modifier=Modifier.align(Alignment.CenterEnd)) {
                Icon(
                    painter = painterResource(id = R.drawable.telephone),
                    contentDescription = "Call icon",
                    modifier = Modifier.size(24.dp),
                    tint = colorResource(id = R.color.maroon)
                )
            }

        }
    }
}
