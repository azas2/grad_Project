package com.mala.grad_project.newCardExersize

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun TestViewNewCard(){
    ExerciseList(exerciseCount = 10)

}
@Composable
fun ExerciseList(exerciseCount: Int) {
    LazyRow(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.spacedBy(10.dp), // Spacing between items
        verticalAlignment = Alignment.CenterVertically // Center items vertically
    ) {
        items(exerciseCount) {
            NewCardExersize()
        }
    }
}

