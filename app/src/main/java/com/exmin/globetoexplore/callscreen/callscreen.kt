package com.exmin.globetoexplore.callscreen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
fun callscreen() {
    var isSearching by remember { mutableStateOf(false) }
    var search by remember { mutableStateOf("") }
    var showMenu by remember { mutableStateOf(false) }
     val sampleCall=listOf(
         Call(R.drawable.person, name = "Bhuvan",time="Yesterday,8:30 PM", isMissed = true),
                 Call(R.drawable.person2, name = "Ram",time="Yesterday,8:00 PM", isMissed = true),
    Call(R.drawable.man, name = "Bhuvan",time="Yesterday,8:15 PM", isMissed = false)


     )
    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFFFDEAD))
                    .padding(horizontal = 8.dp, vertical = 8.dp)
            ) {
                Column {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp, vertical = 4.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        // Left side — Title or Search Bar
                        if (isSearching) {
                            TextField(
                                value = search,
                                onValueChange = { search = it },
                                placeholder = { Text(text = "Search") },
                                colors = TextFieldDefaults.colors(
                                    unfocusedContainerColor = Color.Transparent,
                                    focusedContainerColor = Color.Transparent,
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color.Transparent
                                ),
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(end = 8.dp),
                                singleLine = true
                            )
                        } else {
                            Text(
                                text = "Calls",
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                                color = colorResource(id = R.color.maroon),
                                modifier = Modifier
                                    .padding(start = 8.dp)
                                    .weight(1f)
                            )
                        }

                        // Right side — Icons
                        Row {
                            if (isSearching) {
                                IconButton(onClick = { isSearching = false }) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.cross),
                                        contentDescription = "Close",
                                        modifier = Modifier.size(24.dp)
                                    )
                                }
                            } else {
                                IconButton(onClick = { isSearching = true }) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.search),
                                        contentDescription = "Search",
                                        modifier = Modifier.size(24.dp),
                                        tint = colorResource(id = R.color.maroon)
                                    )
                                }

                                IconButton(onClick = {
                                    Log.d("TOPBAR", "threeDots clicked")
                                    showMenu = true
                                }) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.threedots),
                                        contentDescription = "Menu",
                                        modifier = Modifier.size(24.dp),
                                        tint = colorResource(id = R.color.maroon)
                                    )
                                }

                                // ✅ DropdownMenu outside IconButton
                                DropdownMenu(
                                    expanded = showMenu,
                                    onDismissRequest = { showMenu =  true}
                                ) {
                                    DropdownMenuItem(
                                        text = { Text(text = "Settings") },
                                        onClick = { showMenu = false }
                                    )
                                }
                            }
                        }
                    }
                    HorizontalDivider(color = colorResource(id = R.color.maroon))
                }

            }
        }, bottomBar = {
            bottomnavigation()
        },floatingActionButton = {
            FloatingActionButton(
                onClick = { /* TODO: Add action */ },
                containerColor = colorResource(id = R.color.maroon),
                modifier = Modifier.size(65.dp),
                contentColor = colorResource(id = R.color.skin)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.telephone),
                    contentDescription = null,
                    modifier = Modifier.size(38.dp)
                )
            }
        },
        content = { paddingValues ->

            Column(modifier = Modifier.padding(paddingValues)
                .fillMaxSize()
                .background(Color(0xFFFFDEAD))) {
                favoritesection()
                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.maroon)),
                     modifier = Modifier.fillMaxWidth().padding(16.dp)
                    ){
                    Text(
                        text="Start a new call",
                        color = colorResource(id = R.color.skin),
                        fontSize = 16.sp,
                        fontWeight=FontWeight.Bold
                    )

                }
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text="Recent Calls",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier=Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                    color = colorResource(id = R.color.maroon)
                )
                LazyColumn {
                    items(sampleCall){data->
                          callitemdesign(data)
                    }
                }
            }
        }
    )
}
