package com.example.nowaste.ui.elements

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nowaste.ui.functions.fetchItems

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GenericSearchBar(
    textFieldState: TextFieldState,
    onSearch: (String) -> Unit,
    searchResults: List<String>,
    modifier: Modifier = Modifier,
    placeholder: String
) {
    // Controls expansion state of the search bar
    var expanded by rememberSaveable { mutableStateOf(false) }
    SearchBar(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp),
        inputField = {
            SearchBarDefaults.InputField(
                query = textFieldState.text.toString(),
                onQueryChange = { textFieldState.edit { replace(0, length, it) } },
                onSearch = {
                    onSearch(textFieldState.text.toString())
                    expanded = false
                },
                expanded = expanded,
                onExpandedChange = { expanded = it },
                placeholder = { Text(placeholder) }
            )
        },
        expanded = expanded,
        onExpandedChange = { expanded = it },
    ) {
        // Display search results in a scrollable column
        Column(Modifier.verticalScroll(rememberScrollState())) {
            searchResults.forEach { result ->
                ListItem(
                    headlineContent = { Text(result) },
                    modifier = Modifier
                        .clickable {
                            textFieldState.edit { replace(0, length, result) }
                            expanded = false
                        }
                        .fillMaxWidth()
                )
            }
        }
    }
}