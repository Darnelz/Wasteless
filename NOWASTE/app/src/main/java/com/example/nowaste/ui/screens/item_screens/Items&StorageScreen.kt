package com.example.nowaste.ui.screens.item_screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.nowaste.ui.elements.DescriptionText
import com.example.nowaste.ui.elements.GenericSearchBar
import com.example.nowaste.ui.elements.ScrollableColumn
import com.example.nowaste.ui.elements.TitleText
import com.example.nowaste.ui.elements.WideCard
import com.example.nowaste.ui.functions.fetchItems

@Composable
fun ItemScreen(modifier: Modifier) {
    val textFieldState = rememberTextFieldState()
    Column(modifier.fillMaxWidth()) {
        TitleText(modifier, "My Items")
        DisplayTotal(modifier)
        GenericSearchBar(
            textFieldState = textFieldState,
            onSearch = {},
            searchResults = listOf(
                "Fridge", "Freezer", "Cupboard"
            ),
            placeholder = "Search for your items"
        )
        ScrollableColumn(modifier = modifier) {

            StorageCards(modifier)

        }
    }
}

@Composable
fun DisplayTotal(modifier: Modifier) {
    val storageTypes = fetchItems().toList()
    var numItems = 0
    storageTypes.forEach { storage ->
        storage.forEach { _ ->
            numItems += 1
        }
    }
    DescriptionText(
        modifier = modifier,
        numItems.toString() + " items across " + storageTypes.size + " locations"
    )
}


@Composable
fun StorageCards(modifier: Modifier) {
    //todo assuming the storage is named Fridge, Freezer, Cupboard finished program will populate these names properly
    val names = ArrayList<String>()
    val storageType = fetchItems()
    names.add("Fridge")
    names.add("Freezer")
    names.add("Cupboard")

    storageType.toList().forEachIndexed { index, storage ->
        WideCard(
            modifier = modifier,
            largeText = names[index],
            smallText = storage.size.toString() + " items"
        )
    }

}