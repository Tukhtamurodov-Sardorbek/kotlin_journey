package com.example.kotlin_journey.chapters

// Sequences are a powerful feature to handle collections in a more efficient and lazy way compared to traditional collections

fun main() {
    val sequenceNumbers = sequenceOf(1, 2, 3, 4, 5, 6)
    println(sequenceNumbers.toList())

    val numbersListToSequence = listOf(1, 2, 3, 4, 5).asSequence()
    println(numbersListToSequence)

    val result = sequenceNumbers.filter { it % 2 == 0 }.map { it * it }
    println(result)
}