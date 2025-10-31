package com.cdgutierrezd.edufam.components

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun profileCard(
    name:String,
    image: Int
){
    Image(
        painter = painterResource(id = image),
        contentDescription = "avatar",
        modifier = Modifier
            .size(150.dp)
            .clip(CircleShape)
    )
    Text(
        text = name,
        style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.Bold),
        maxLines = 1,
        overflow = TextOverflow.Visible,
    )
}