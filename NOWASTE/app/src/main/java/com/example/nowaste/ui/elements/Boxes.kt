package com.example.nowaste.ui.elements

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalScrollingBox(
    modifier: Modifier,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .horizontalScroll(rememberScrollState())
            .padding(horizontal = 10.dp)
            .fillMaxWidth(),
    ) {
        content()
    }
}