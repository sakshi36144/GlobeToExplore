package com.exmin.globetoexplore.communityscreen

import android.provider.CalendarContract
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
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
import com.exmin.globetoexplore.communityitemdesign.Community
import com.exmin.globetoexplore.communityitemdesign.CommunityItem

@Composable
@Preview(showSystemUi = true)
fun communityscreen() {
    val communityList = listOf(
        Community(R.drawable.man, "Tech Enthusiasts", "256 members"),
        Community(R.drawable.person, "Travel Buddies", "178 members"),
        Community(R.drawable.man, "Food Lovers", "342 members"),
        Community(R.drawable.person, "Movie Geeks", "221 members"),
        Community(R.drawable.man, "Art & Design", "189 members")
    )
    var isSearching by remember { mutableStateOf(false) }
    var search by remember { mutableStateOf("") }
    var showMenu by remember { mutableStateOf(true) }

    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFFFDEAD)) // 👈 Background color
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
                                text = "Community",
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
                                    DropdownMenu(
                                        expanded = showMenu,
                                        onDismissRequest = { showMenu = false }
                                    ) {

                                        DropdownMenuItem(
                                            text = { Text(text = "Settings") },
                                            onClick = { showMenu = false })
                                    }
                                }
                            }
                        }
                    }

                    HorizontalDivider(color = colorResource(id = R.color.maroon))
                }
            }
        } , bottomBar = {
            bottomnavigation()
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .background(Color(0xFFFFDEAD))
            ) {
                // 👇 You can add your main Community screen content here
                Button(onClick={},colors= ButtonDefaults.buttonColors(containerColor =colorResource(id= R.color.maroon)
                ), modifier = Modifier.fillMaxWidth().padding(16.dp)) {
                    Text(
                        text = "Start a new Community", fontSize = 16.sp, fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.skin)
                    )
                }
            }
            Spacer(modifier=Modifier.height(18.dp))
            Text(text="Your Community", fontSize = 45.sp, fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )

            // ✅ Corrected LazyColumn block (no syntax error)
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 3.dp,vertical=125.dp)
            )
            {
                items(communityList.size) { index ->
                    CommunityItem(community = communityList[index])
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }

        }
    )
}
