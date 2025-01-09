package com.example.kotlin_journey.chapters

// ANY & NOTHING
// Any is the supertype of all types in Kotlin
// Nothing is a subtype of all types in Kotlin

fun main() {
    val obj: Any = "Hello, World!"

    val str1: String? = obj as? String
    val str2: String = obj as String

    val result = try {
        throwException("An error occurred")
    } catch (e: NumberFormatException) {
        "Conversion failed"
    }

}

// If a function has the return type of Nothing, it means that it never returns (always throws an exception).
fun throwException(message: String): Nothing {
    throw NumberFormatException(message)
}