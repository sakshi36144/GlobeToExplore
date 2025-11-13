package com.exmin.globetoexplore.updatescreen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.window.PopupProperties
import com.exmin.globetoexplore.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TopBar() {
    var isSearching by remember { mutableStateOf(false) }
    var search by remember { mutableStateOf("") }
    var showManu by remember { mutableStateOf(false) }
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
                        text = "Update",
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
                        IconButton(onClick = { /* camera click */ }) {
                            Icon(
                                painter = painterResource(id = R.drawable.camera),
                                contentDescription = "Camera",
                                modifier = Modifier.size(24.dp),
                                tint = colorResource(id = R.color.maroon)
                            )
                        }
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
                                showManu = true }) {
                                Icon(
                                    painter = painterResource(id = R.drawable.threedots),
                                    contentDescription = "Menu",
                                    modifier = Modifier.size(24.dp),
                                    tint = colorResource(id = R.color.maroon)
                                )
                                DropdownMenu(
                                    expanded = showManu,
                                    onDismissRequest = { showManu = false }
                                ) {
                                    DropdownMenuItem(
                                        text = { Text(text = "Status Privacy") },
                                        onClick = { showManu = false })
                                    DropdownMenuItem(
                                        text = { Text(text = "Create Channel") },
                                        onClick = { showManu = false })
                                    DropdownMenuItem(
                                        text = { Text(text = "Settings") },
                                        onClick = { showManu = false })
                                }

                            }

                        }
                    }
                }
                HorizontalDivider(color = colorResource(id = R.color.maroon))
            }

        }
    }

