package com.example.kotlin_journey.chapters

fun main() {
    // NULL SAFETY
    var name: String? = null
    println(name?.length) // Safe call operator (?.)

    name = "John"
    println(name!!.length) // Not-null assertion operator (!!)

    // Elvis operator (?:)
    val length = name?.length ?: 0
    println(length)

    var dynamic: Any = "String"
    val castToString = dynamic as? String
}