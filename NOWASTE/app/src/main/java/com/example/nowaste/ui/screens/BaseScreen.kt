package com.example.nowaste.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.nowaste.ui.navigation.Routes

@Composable
fun BaseScreen(navController: NavHostController, modifier: Modifier) {
    NavHost(navController = navController, startDestination = Routes.Home.route) {
        composable(Routes.Home.route) {
            HomeScreen(modifier = modifier)
        }
        composable(Routes.Items.route) { ItemScreen(modifier = modifier) }

        composable(Routes.Shopping.route) { ShoppingScreen(modifier = modifier) }

        composable(Routes.Insights.route) { InsightsScreen(modifier = modifier) }

    }
}

@Composable
fun currentRoute(navController: NavController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}