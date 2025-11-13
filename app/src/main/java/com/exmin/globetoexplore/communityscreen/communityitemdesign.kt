package com.exmin.globetoexplore.communityitemdesign

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exmin.globetoexplore.R

data class Community(
    val image: Int,
    val name: String,
    val memberCount: String
)

@Composable
fun CommunityItem(community: Community) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = community.image),
            contentDescription = null,
            modifier = Modifier.size(60.dp)
                .clip(CircleShape) .border(2.dp, Color.LightGray, CircleShape)
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column {
            Text(
                text = community.name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = community.memberCount,
                fontSize = 16.sp,
                color = Color.Gray
            )
        }
    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun CommunityItemPreview() {
    val community1 = Community(
        image = R.drawable.man,
        name = "Tech Enthusiasts",
        memberCount = "256 members"
    )

    val community2 = Community(
        image = R.drawable.person,
        name = "Tech Enthus",
        memberCount = "156 members"
    )

    Column {
        CommunityItem(community = community1)
        CommunityItem(community = community2)
    }
}
