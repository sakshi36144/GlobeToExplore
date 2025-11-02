package com.exmin.globetoexplore.bottomnavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.exmin.globetoexplore.R

@Composable
@Preview(showSystemUi = true)
fun bottomnavigation(){
    BottomAppBar(tonalElevation =12.dp, containerColor =colorResource(id = R.color.maroon)) {
        Row(modifier = Modifier.fillMaxWidth(),Arrangement.SpaceBetween){
            Column(modifier=Modifier.padding(horizontal = 16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(painter = painterResource(id = R.drawable.message),
                     contentDescription = null,
                    modifier = Modifier.size(38.dp),
                    tint= colorResource(id = R.color.skin)
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(text="chat",fontWeight= FontWeight.Bold, color = colorResource(R.color.skin))
            }
            Column(modifier=Modifier.padding(horizontal = 16.dp), horizontalAlignment = Alignment.CenterHorizontally){
                Icon(painter = painterResource(id = R.drawable.update),
                    contentDescription = null,
                    modifier = Modifier.size(38.dp),
                    tint= colorResource(id = R.color.skin)
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(text="Updates",fontWeight= FontWeight.Bold, color = colorResource(R.color.skin))
            }
            Column(modifier=Modifier.padding(horizontal = 16.dp), horizontalAlignment = Alignment.CenterHorizontally){
                Icon(painter = painterResource(id = R.drawable.people),
                    contentDescription = null,
                    modifier = Modifier.size(38.dp),
                    tint= colorResource(id = R.color.skin)
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(text="Communite",fontWeight= FontWeight.Bold, color = colorResource(R.color.skin))
            }
            Column(modifier=Modifier.padding(horizontal = 16.dp), horizontalAlignment = Alignment.CenterHorizontally){
                Icon(painter = painterResource(id = R.drawable.telephone),
                    contentDescription = null,
                    modifier = Modifier.size(38.dp),
                    tint= colorResource(id = R.color.skin)
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(text="Call",fontWeight= FontWeight.Bold, color = colorResource(R.color.skin))
            }
        }
    }
}