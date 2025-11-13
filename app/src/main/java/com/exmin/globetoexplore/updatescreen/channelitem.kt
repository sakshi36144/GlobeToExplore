package com.exmin.globetoexplore.updatescreen


import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.exmin.globetoexplore.R
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.sp

@Composable

fun channelItem(channels: channels) {
    var isFollowing by remember { mutableStateOf(false) }
    Spacer(modifier = Modifier.height(50.dp))
    Row(
        modifier = Modifier
            .fillMaxHeight()
            .padding(horizontal = 16.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Channel image
        Image(
            painter = painterResource(id = channels.image),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .padding(end = 12.dp)
        )

        // Channel text info
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = channels.name,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = colorResource(id = R.color.maroon)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = channels.description,
                fontSize = 14.sp,
                color = Color.Gray
            )
        }

        // Follow/Following Button
        Button(
            onClick = { isFollowing = !isFollowing },
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isFollowing)
                    Color(0xFFC32148) // lighter maroon for "Following"
                else
                    Color(0xFF800000) // dark maroon for "Follow"
            ),
            modifier = Modifier
                .height(36.dp)
                .width(100.dp) // ensures horizontal alignment
        ) {
            Text(
                text = if (isFollowing) "Following" else "Follow",
                color = colorResource(id = R.color.skin),
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

data class channels(val image:Int,val name:String,val description:String)