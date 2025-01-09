package com.example.kotlin_journey.chapters

fun String.greetor():String {
    return "Hello, $this!"
}

fun Int.customMultiplier():Int {
    return this * 10
}

fun main() {
    val name = "John"
    println(name.greetor())
    println(12.customMultiplier())
}