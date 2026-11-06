package com.example.nowaste.ui.elements

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.SearchBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DisplayCardLG(text: String, modifier: Modifier) {
    Card(
        modifier = modifier
            .size(250.dp, 250.dp)
            .padding(horizontal = 10.dp)
    ) {
        ItemText(modifier = modifier.padding(5.dp), text)
    }

}

@Composable
fun DisplayCardMD(text: String, modifier: Modifier) {

    Card(
        modifier = modifier
            .size(180.dp, 180.dp)
            .padding(horizontal = 6.dp)
    ) {
        ItemText(modifier = modifier.padding(5.dp), text)
    }

}

@Composable
fun DisplayCardSM(text: String, modifier: Modifier) {

    Card(
        modifier = modifier
            .size(120.dp, 120.dp)
            .padding(horizontal = 5.dp)
    ) {
        ItemText(modifier = modifier.padding(5.dp), text)
    }

}

@Composable
fun WideCard(largeText: String, smallText: String, modifier: Modifier) {
    Card(
        modifier = modifier
            .height(140.dp)
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
    ) {
        if (smallText.isEmpty()) {
            CentredColumn(modifier) {
                TitleText(modifier = modifier.padding(5.dp), largeText)
            }
        } else {
            CentredColumn(modifier) {
                TitleText(modifier = modifier, largeText)
                ItemText(modifier = modifier, smallText)
            }
        }
    }
}