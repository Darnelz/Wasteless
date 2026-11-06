package com.example.nowaste.ui.elements

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun TitleRow(modifier: Modifier, content: @Composable () -> Unit) {
    Row(modifier = modifier.padding(vertical = 15.dp).fillMaxWidth()) {
        content()
    }
}