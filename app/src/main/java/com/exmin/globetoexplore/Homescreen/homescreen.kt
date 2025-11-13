package com.exmin.globetoexplore.Homescreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exmin.globetoexplore.R
import com.exmin.globetoexplore.bottomnavigation.bottomnavigation

@Composable
@Preview(showSystemUi = true)
fun HomeScreen() {
    val chatData = listOf(
        chatdeginmodel(R.drawable.img, "Salman", "10:00 AM", "Hi"),
        chatdeginmodel(R.drawable.person, "Anshika", "10:03 AM", "Hello"),
        chatdeginmodel(R.drawable.person2, "Reetu", "10:15 AM", "Hi")
    )

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* TODO */ },
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
        bottomBar = { bottomnavigation() },
        containerColor = colorResource(id = R.color.skin)
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Box(modifier = Modifier.fillMaxWidth()) {
                Spacer(modifier = Modifier.height(26.dp))
                Text(
                    text = "GlobeToExplore",
                    fontSize = 28.sp,
                    color = colorResource(id = R.color.maroon),
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 16.dp),
                    fontWeight = FontWeight.Bold
                )
                Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(id = R.drawable.camera),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            tint = colorResource(id = R.color.maroon)
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(id = R.drawable.search),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            tint = colorResource(id = R.color.maroon)
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(id = R.drawable.threedots),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            tint = colorResource(id = R.color.maroon)
                        )
                    }
                }
            }
            HorizontalDivider()
            LazyColumn {
                items(chatData) { chatItem ->
                    chatdesign(chatdeginmodel = chatItem)
                }
            }
        }
    }
}
