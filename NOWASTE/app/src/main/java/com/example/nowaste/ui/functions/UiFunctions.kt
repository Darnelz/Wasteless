package com.example.nowaste.ui.functions


// modify to your preferences for backend stuff just returning, add a comma in the string part of the array list to add stuff from your database etc and loop through it
fun populateStorage(): ArrayList<String> {
    // todo implement storage in database
    val items = ArrayList<String>()
    items.add("Fridge")
    items.add("Freezer")
    items.add("Cupboard")

    return items
}


fun fetchItems(): Triple<ArrayList<String>, ArrayList<String>, ArrayList<String>> {
    // todo function to get all items in the storage db
    val fridge = ArrayList<String>()
    val freezer = ArrayList<String>()
    val cupboard = ArrayList<String>()
    fridge.add("Beef")
    fridge.add("Chicken")
    fridge.add("Pork")
    fridge.add("Sausages")
    freezer.add("Ice Cream")
    freezer.add("Ice Lollies")
    freezer.add("Ice Cubes")
    cupboard.add("Soy Sauce")
    cupboard.add("Katsu Curry Cubes")
    cupboard.add("Foxes Viennese")
    return Triple(fridge, freezer, cupboard)
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