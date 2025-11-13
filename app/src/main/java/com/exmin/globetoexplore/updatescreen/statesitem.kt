package com.exmin.globetoexplore.updatescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color // ✅ Correct import
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exmin.globetoexplore.R

@Composable

fun mystatus() {
    Row {
        Box {
            Image(
                painter = painterResource(id = R.drawable.img), contentDescription = null,
                modifier = Modifier.size(60.dp).clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Icon(
                painter = painterResource(id = R.drawable.plus),
                contentDescription = null,
                tint = colorResource(id = R.color.maroon),
                modifier = Modifier.size(25.dp).align(Alignment.BottomEnd).padding(2.dp).background(
                    color = colorResource(id = R.color.skin),
                    shape = RoundedCornerShape(12.dp)
                )
            )


        }
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(
                text = "My Status",
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp
            )
            Text(
                text = "Tap to add status update",
                color = Color.Gray
            )
        }
    }
}

data class statusdata(val image:Int,
                      val name:String,
                      val time:String)
@Composable

fun statusItem(statusdata: statusdata){
    Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 12.dp, vertical = 8.dp), verticalAlignment = Alignment.CenterVertically)
    {
        Image(painter=painterResource(statusdata.image),
            contentDescription = null,
            modifier=Modifier.size(60.dp).padding(4.dp).clip(CircleShape),
            contentScale=ContentScale.Crop
            )
        Spacer(modifier =Modifier.width(12.dp))
        Column {
            Text(text=statusdata.name, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text=statusdata.time, fontSize=14.sp,color=Color.Gray)
        }
    }
}

