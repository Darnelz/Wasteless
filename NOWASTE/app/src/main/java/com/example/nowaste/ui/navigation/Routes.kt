package com.example.nowaste.ui.navigation

sealed class Routes(val route: String) {
    data object Home : Routes("home")
    data object Items : Routes("items")
    data object Shopping : Routes("shopping")
    data object Insights : Routes("insights")

}