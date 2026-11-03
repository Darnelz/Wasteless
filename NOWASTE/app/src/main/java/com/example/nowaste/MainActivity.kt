package com.example.nowaste

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import com.example.nowaste.ui.theme.NOWASTETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NOWASTETheme {
                NOWASTEApp()
            }
        }
    }
}

@PreviewScreenSizes
@Composable
fun NOWASTEApp() {
    var currentDestination by rememberSaveable { mutableStateOf(AppDestinations.HOME) }

    NavigationSuiteScaffold(
        navigationSuiteItems = {
            AppDestinations.entries.forEach {
                item(
                    icon = {
                        Icon(
                            painterResource(it.icon),
                            contentDescription = it.label
                        )
                    },
                    label = { Text(it.label) },
                    selected = it == currentDestination,
                    onClick = { currentDestination = it }
                )
            }
        }
    ) {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            HomeScreen(
                name = "Android",
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

enum class AppDestinations(
    val label: String,
    val icon: Int,
) {
    HOME("Home", R.drawable.ic_home),
    MYITEMS("My Items", R.drawable.ic_favorite),
    SHOPPING("Shopping", R.drawable.ic_account_box),
    INSIGHTS("Insights", R.drawable.ic_account_box)
}

@Composable
fun HomeScreen(name: String, modifier: Modifier = Modifier) {

    Column(modifier = modifier) {
        Box(modifier = modifier) {
            Text(text = "My Items")
            Spacer(modifier = modifier.height(20.dp))
            Row(modifier = modifier) {

                DisplayCard("Fridge", modifier)

                DisplayCard("Freezer", modifier)

                DisplayCard("Misc", modifier)


            }


        }

        Box(modifier = modifier) {
            Text(text = "Expiring Soon")
            Spacer(modifier = modifier.height(20.dp))
            Row(modifier = modifier) {
                DisplayCard("Bread", modifier)

                DisplayCard("Chicken", modifier)

                DisplayCard("Spring Onion", modifier)

                DisplayCard("Salmon", modifier)


            }

        }

        Box(modifier = modifier) {
            Column(modifier = modifier) {
                Text(
                    text = "Reccomended Recipies",
                    modifier.padding(bottom = 10.dp)
                )



                Text(text = "Based on all the items you have on your inventory")



                Row(modifier = modifier) {
                    DisplayCard("Chicken Pasta", modifier)

                    DisplayCard("Stir fry", modifier)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NOWASTETheme {
        HomeScreen("Android")
    }
}


@Composable
fun DisplayCard(text: String, modifier: Modifier) {

    Card(modifier = modifier.size(160.dp, 50.dp)) {
        Text(text = text)

    }

}