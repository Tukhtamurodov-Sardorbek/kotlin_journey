package com.example.kotlin_journey.chapters

// Pair and Triple are data classes used to store 2 and 3 values respectively

fun main() {
    val pair: Pair<String, String> = Pair("1", "one")
    print("$pair ")
    print("${pair.first} ")
    print("${pair.second} ")

    println("")
    val pair2 = 1 to "ONE"
    print("$pair2 ")
    print("${pair2.first} ")
    print("${pair2.second} ")

    println("")
    val triple = Triple(1, "ONE", 1.0f)
    print("$triple ")
    print("${triple.first} ")
    print("${triple.second} ")
    print("${triple.third} ")

}