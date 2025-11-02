package com.exmin.globetoexplore.Homescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exmin.globetoexplore.R
import com.exmin.globetoexplore.bottomnavigation.bottomnavigation

@Composable
@Preview(showSystemUi = true)
fun HomeScreen() {
    val chatData=listOf(
        chatlistmodel(R.drawable.img,
            name ="salman",
            time ="10.00am",
            message = "hii"),
        chatlistmodel(R.drawable.person,
            name ="Ansika",
            time ="10.03am",
            message = "hello"),
        chatlistmodel(R.drawable.person2,
            name ="Reetu",
            time ="10.15am",
            message = "hii"),
        )

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* TODO: Add action */ },
                containerColor = colorResource(id = R.color.maroon),
                modifier = Modifier.size(65.dp),
                contentColor = colorResource(id = R.color.skin)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.chat),
                    contentDescription = null,
                    modifier = Modifier.size(38.dp)
                )
            }
        },
        bottomBar = {
            bottomnavigation()
        },
        containerColor = colorResource(id = R.color.skin)
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            // Main screen UI
            Box(modifier = Modifier.fillMaxWidth()){
                Spacer(modifier= Modifier.height(26.dp))
                Text(
                    text = "GlobeToExplore",
                    fontSize = 28.sp,
                    color=colorResource(id=R.color.maroon),
                    modifier=Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 16.dp),
                    fontWeight= FontWeight.Bold
                )
                Row (modifier= Modifier.align(Alignment.CenterEnd)){
                    IconButton(onClick = {/*todo*/}){
                        Icon(
                            painter=painterResource(id = R.drawable.camera),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            tint = colorResource(id = R.color.maroon)
                        )
                    }
                    IconButton(onClick = {/*todo*/}){
                        Icon(
                            painter=painterResource(id = R.drawable.search),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            tint = colorResource(id = R.color.maroon)

                        )
                    }
                    IconButton(onClick = {/*todo*/}){
                        Icon(
                            painter=painterResource(id = R.drawable.threedots),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            tint = colorResource(id = R.color.maroon)
                        )
                    }
                }
            }
            HorizontalDivider()
            LazyColumn {
                items(chatData) {chatItem:chatlistmodel ->
                    chatdesign(chatdeginmodel = chatItem)
                }
            }
        }
    }
}
