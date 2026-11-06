package com.example.nowaste.ui.elements

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TitleText(modifier: Modifier, displayText: String) {
    Text(
        modifier = modifier.padding(horizontal = 10.dp),
        text = displayText,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    )
}

@Composable
fun CentredTitleText(modifier: Modifier, displayText: String) {
    Text(
        modifier = modifier.padding(horizontal = 10.dp),
        text = displayText,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        textAlign = TextAlign.Center
    )
}


@Composable
fun ItemText(modifier: Modifier, displayText: String) {
    Text(
        modifier = modifier.padding(horizontal = 10.dp),
        text = displayText,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        textAlign = TextAlign.Center
    )
}

@Composable
fun DescriptionText(modifier: Modifier, displayText: String) {
    Text(
        modifier = modifier.padding(horizontal = 10.dp),
        text = displayText,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp,
        textAlign = TextAlign.Center
    )
}