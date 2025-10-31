package com.cdgutierrezd.edufam.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cdgutierrezd.edufam.components.ProgressCard

@Composable
fun GradesListScreen() {
    val subjects = listOf(
        "Matemáticas" to 2.5f,
        "Ciencias" to 3.5f,
        "Historia" to 4.2f,
        "Inglés" to 1.3f,
        "Educación Física" to 5.0f
    )

    Column(modifier = Modifier.padding(16.dp)) {
        subjects.forEach { (subject, grade) ->
            ProgressCard(subject = subject, grade = grade)
        }
    }
}