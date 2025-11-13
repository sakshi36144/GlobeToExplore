package com.exmin.globetoexplore.callscreen

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exmin.globetoexplore.R
import org.w3c.dom.Text

@Composable
@Preview(showSystemUi = true)
fun favoritesection(){
    val samplefavorites=listOf(
        favoritecontant(R.drawable.agree,"salman"),
        favoritecontant(R.drawable.person, "raj"),
        favoritecontant(R.drawable.person2,"davi"),
        favoritecontant(R.drawable.img,"davansh"),
        favoritecontant(R.drawable.agree,"davansh"),
        favoritecontant(R.drawable.img,"sakshi")
    )
    Column(modifier=Modifier.padding(start = 25.dp,top=8.dp)) {
        Text(text="Favorites",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.maroon),
            modifier= Modifier.padding(bottom = 8.dp)
            )
        Row(modifier=Modifier.fillMaxWidth()
            .horizontalScroll(rememberScrollState())){
samplefavorites.forEach {
favoriteitem(it)
}

        }
    }
}
data class favoritecontant(
    val image:Int,val name:String,
)