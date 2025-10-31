package com.cdgutierrezd.edufam.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun ProgressCard(
    subject: String,
    grade: Float,
    modifier: Modifier = Modifier
) {
    val progressColor = when {
        grade >= 4.0f -> Color(0xFF4CAF50)   // Verde
        grade >= 3.0f -> Color(0xFFFFC107)   // Amarillo
        else -> Color(0xFFF44336)            // Rojo
    }
    Card(
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = Modifier.fillMaxWidth().padding(8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Text(subject, fontWeight = FontWeight.Bold)
                Text(grade.toString(), color = Color.Red)
            }
            Spacer(modifier = Modifier.height(8.dp))
            CustomProgressBar(progress = grade/5f, color = progressColor)
        }
    }
}
@Composable
fun CustomProgressBar(
    progress: Float,
    color:Color,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(10.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(Color(0xFFE5E7EB)) // gris claro (track)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(progress.coerceIn(0f, 1f)) // evita que se salga de 0–1
                .fillMaxHeight()
                .background(Color(color.value)) // barra de progreso
        )
    }
}
