package com.exmin.globetoexplore.updatescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
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
    ) { Column(modifier = Modifier.padding(it).fillMaxSize().verticalScroll(scrollState)) {
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
    }
    }
}