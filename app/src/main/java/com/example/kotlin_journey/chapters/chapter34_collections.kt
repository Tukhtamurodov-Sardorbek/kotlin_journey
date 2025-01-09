package com.example.kotlin_journey.chapters

// Basic Collections
// List, Set, Map

fun main() {
    val list = listOf<Int>(1, 2, 3) // Immutable list
//   list.add(4) // Not possible
    list.forEach { number -> print(number) }

    println("")
    val set = setOf<Int>(1, 2, 3, 3) // Immutable set
//    mutableSet.add(4) // Not possible
    set.forEach { number -> print(number) }

    println("")
    val mutableSet = mutableSetOf<Int>(1, 2, 3, 3)
    mutableSet.add(4)
    mutableSet.forEach { number -> print(number) }


    println("")
    val map = mapOf<Int, String>(
        1 to "ONE",
        2 to "TWO",
        Pair(3, "THREE"),
        Pair(4, "FOUR"),
    )
//    map.put // Not possible
    print(map)
    println("")

    val mutableMap = mutableMapOf(
        1 to "ONE",
        2 to "TWO",
        Pair(3, "THREE"),
        Pair(4, "FOUR"),
    )
    mutableMap.put(5, "FIVE")
    print(mutableMap)


}