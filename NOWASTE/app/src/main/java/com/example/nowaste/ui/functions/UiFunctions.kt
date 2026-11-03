package com.example.nowaste.ui.functions


// modify to your preferences for backend stuff just returning, add a comma in the string part of the array list to add stuff from your database etc and loop through it
fun populateStorage(): ArrayList<String> {
    val items = ArrayList<String>()
    items.add("Fridge")
    items.add("Freezer")
    items.add("Cupboard")

    return items
}


fun populateExpiry(): MutableMap<String, Int> {
    val items = mutableMapOf<String, Int>()
    items["Bread"] = 3
    items["Chicken"] = 6
    items["Spring Onions"] = 3
    items["Salmon"] = 2

    return items
}


fun populateRecipes(): MutableMap<String, Int> {
    val items = mutableMapOf<String, Int>()
    repeat(20) { index ->
        items["Recipe ${index + 1}"] = 2
    }
    return items
}