package com.example.kotlin_journey.chapters

// It is used to create an alias for an existing type
// This can make code more readable and concise by providing a more meaningful name for a complex or less descriptive type

// 1. Simplifying the type names
// 2. Complex Generic Types
// 3. Function Types

// typedef in Dart
typealias UserId = String
typealias StringMap = Map<String, String>
typealias VoidCallback = () -> Unit

fun higherOrderFunction(func: VoidCallback) {
    func()
}

fun main() {
    val userId: UserId = "String"
    val stringMap: StringMap = mapOf("1" to "ONE")
    val voidCallback: VoidCallback = { println("VoidCallback is called") }
    voidCallback()
    higherOrderFunction(voidCallback)
}