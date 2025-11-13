package com.exmin.globetoexplore.updatescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exmin.globetoexplore.R
import com.exmin.globetoexplore.bottomnavigation.bottomnavigation
import androidx.compose.ui.graphics.Color
@Composable
@Preview(showSystemUi = true)
fun updatescreen(){
    val scrollState = rememberScrollState()
    val samplestatus =listOf(
        statusdata(image=R.drawable.person2, name = "Anu", time = "10.00"),
        statusdata(image=R.drawable.person, name= "Anam",time="11.15"),
        statusdata(image = R.drawable.man, name="ayush", time = "11.00")
    )
    val samplechannels=listOf(
        channels(image = R.drawable.agree, name = "Nest Roots", description = "Latest news and updates from nest roots"),
        channels(image = R.drawable.person, name = "Nesting", description = "Latest news and updates from nest roots")
    )
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {/*todo*/},
                containerColor = colorResource(id = R.color.maroon),
                modifier = Modifier.size(67.dp)
            ) {
                Icon(painter = painterResource(id=R.drawable.camera),
                    contentDescription = null,
                    modifier = Modifier.size(30.dp),
                    tint = colorResource(id = R.color.skin)
                )
            }
        },
        bottomBar = {
            bottomnavigation()
        },
        topBar = {TopBar()}
    ) { Column(modifier = Modifier.padding(it).fillMaxSize().verticalScroll(scrollState) .background(colorResource(id = R.color.skin))) {
        Text(
            text = "status",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.maroon),
            modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp)
        )
        mystatus()
        samplestatus.forEach {
            statusItem(statusdata =it)
        }
        Spacer(modifier=Modifier.height(16.dp))
        HorizontalDivider(color=colorResource(id = R.color.maroon)
        )
        Text(text = "Channels",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color=colorResource(id = R.color.maroon),
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp))

        Spacer(modifier = Modifier.height(8.dp))
        Column(modifier=Modifier.padding(horizontal = 16.dp)) {
        Text(text = "Stay updated on topics tht matter to you.find channels to follow below.", color =colorResource(id = R.color.maroon))
        Spacer(modifier=Modifier.height(32.dp))
            Text(text = "Find channels to follow",color=colorResource(id=R.color.maroon))
        }
        Spacer(modifier = Modifier.height(16.dp))
        samplechannels.forEach {
            channelItem(channels=it)
        }
       }
    }
}