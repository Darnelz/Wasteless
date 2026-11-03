package com.example.nowaste.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nowaste.ui.elements.CentredColumn
import com.example.nowaste.ui.elements.CentredTitleText
import com.example.nowaste.ui.elements.DescriptionText
import com.example.nowaste.ui.elements.DisplayCardLG
import com.example.nowaste.ui.elements.DisplayCardMD
import com.example.nowaste.ui.elements.DisplayCardSM
import com.example.nowaste.ui.elements.HorizontalScrollingBox
import com.example.nowaste.ui.elements.ItemText
import com.example.nowaste.ui.elements.ScrollableColumn
import com.example.nowaste.ui.elements.TitleText
import com.example.nowaste.ui.elements.TitleRow
import com.example.nowaste.ui.functions.populateExpiry
import com.example.nowaste.ui.functions.populateRecipes
import com.example.nowaste.ui.functions.populateStorage

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    ScrollableColumn(modifier = modifier) {
        DisplayStorage(modifier)

        DisplayExpiry(modifier)

        DisplayRecipes(modifier)
    }
}


//function for the storage display area

@Composable
fun DisplayStorage(modifier: Modifier) {
    val storageLocations = populateStorage()
    HorizontalScrollingBox(modifier = modifier) {
        TitleText(modifier, "My Items")
        TitleRow(modifier) {
            storageLocations.forEachIndexed { index, location ->
                if (index == 0) {
                    DisplayCardLG(modifier = modifier, text = location)
                } else {
                    DisplayCardMD(modifier = modifier, text = location)
                }
            }
        }

    }
}

@Composable
fun DisplayExpiry(modifier: Modifier) {
    val expiryItems = populateExpiry().toList()
    HorizontalScrollingBox(modifier = modifier) {
        TitleText(modifier, "Expiring Soon")
        TitleRow(modifier) {
            expiryItems.forEach { item ->
                Box {
                    CentredColumn(modifier) {
                        DisplayCardSM(item.first, modifier)
                        DescriptionText(
                            modifier,
                            "Expires in " + item.second.toString() + " days"
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun DisplayRecipes(modifier: Modifier) {
    val recipes = populateRecipes().toList()
    CentredColumn(modifier) {
        CentredTitleText(modifier, "Recommended Recipes")
        ItemText(modifier, "Based on all the items you have in your inventory")

        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            maxItemsInEachRow = 2,
            horizontalArrangement = Arrangement.Center,
            verticalArrangement = Arrangement.spacedBy(0.dp),
        ) {
            recipes.forEach { recipe ->
                Box(modifier = modifier) {
                    Column(
                        modifier = modifier,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        DisplayCardMD("", modifier)
                        ItemText(modifier, recipe.first)
                        DescriptionText(modifier, "Updated " + recipe.second + " days ago")
                    }
                }

            }
        }
    }
}

