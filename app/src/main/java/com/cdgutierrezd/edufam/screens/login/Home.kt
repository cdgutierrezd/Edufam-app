package com.cdgutierrezd.edufam.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cdgutierrezd.edufam.R
import com.cdgutierrezd.edufam.components.StatCard
import com.cdgutierrezd.edufam.ui.theme.BlueBlackGround
import com.cdgutierrezd.edufam.ui.theme.BlueButton
import com.cdgutierrezd.edufam.ui.theme.White
import kotlinx.serialization.Serializable

@Serializable
data object Home

@Preview
@Composable
fun Home() {
    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(BlueBlackGround)
                    .padding(horizontal = 16.dp, vertical = 12.dp)
                    .padding(WindowInsets.statusBars.asPaddingValues()),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(text = "Hello", style = MaterialTheme.typography.bodyMedium)
                    Text(
                        text = "Familia Perez",
                        style = MaterialTheme.typography.bodyLarge,
                        maxLines = 1,
                        overflow = TextOverflow.Visible
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.avatar_01),
                    contentDescription = "avatar",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                )
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.TopStart
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(32.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.avatar_01),
                    contentDescription = "avatar",
                    modifier = Modifier
                        .size(150.dp)
                        .clip(CircleShape)
                        .align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "Pepito Perez",
                    style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.Bold),
                    maxLines = 1,
                    overflow = TextOverflow.Visible,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(24.dp))
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = Color(White.value))
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    )
                    {
                        Image(
                            painter = painterResource(R.drawable.ic_01),
                            contentDescription = "avatar",
                            modifier = Modifier
                                .size(60.dp)
                                .clip(CircleShape)
                        )
                        Column(
                            modifier = Modifier.padding(horizontal = 15.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text("Promedio General", style = MaterialTheme.typography.bodyMedium)
                            Text(
                                "3.62",
                                style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.Bold)
                            )
                        }
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    /* ---------  Card 1  --------- */
                    StatCard("En riesgo", "2", modifier = Modifier.weight(1f))
                    /* ---------  Card 2  --------- */
                    StatCard("En riesgo", "2", modifier = Modifier.weight(1f))
                }
                Spacer(modifier = Modifier.height(24.dp))
                Button(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth()
                        .height(65.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = BlueButton
                    )
                ){
                    Text(text = "Ver ultima actividad", fontSize = 20.sp)
                }
            }
        }
    }
}