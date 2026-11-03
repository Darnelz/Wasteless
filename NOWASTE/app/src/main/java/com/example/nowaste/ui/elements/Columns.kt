package com.example.nowaste.ui.elements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ScrollableColumn(modifier: Modifier, content: @Composable () -> Unit) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
    )
    {
        content()
    }
}

@Composable
fun CentredColumn(modifier: Modifier, content: @Composable () -> Unit) {
    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally)
    {
        content()
    }
}