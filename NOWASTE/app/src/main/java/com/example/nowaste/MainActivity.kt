package com.example.nowaste

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.navigation.compose.rememberNavController
import com.example.nowaste.ui.navigation.Routes
import com.example.nowaste.ui.screens.BaseScreen
import com.example.nowaste.ui.screens.HomeScreen
import com.example.nowaste.ui.screens.currentRoute
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
    val navController = rememberNavController()
    val selectedRoute = currentRoute(navController)

    NavigationSuiteScaffold(
        navigationSuiteItems = {
            AppDestinations.entries.forEach { destination ->
                item(
                    icon = {
                        Icon(
                            painterResource(destination.icon),
                            contentDescription = destination.label
                        )
                    },
                    label = { Text(destination.label) },
                    selected = selectedRoute == destination.route,
                    onClick = {
                        navController.navigate(destination.route) {
                            popUpTo(navController.graph.startDestinationId) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                )
            }
        }
    ) {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            BaseScreen(
                navController = navController,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

enum class AppDestinations(
    val label: String,
    val icon: Int,
    val route: String
) {
    HOME("Home", R.drawable.ic_home, Routes.Home.route),
    ITEMS("My Items", R.drawable.ic_favorite, Routes.Items.route),
    SHOPPING("Shopping", R.drawable.ic_account_box, Routes.Shopping.route),
    INSIGHTS("Insights", R.drawable.ic_account_box, Routes.Insights.route)
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NOWASTETheme {
        HomeScreen()
    }
}


