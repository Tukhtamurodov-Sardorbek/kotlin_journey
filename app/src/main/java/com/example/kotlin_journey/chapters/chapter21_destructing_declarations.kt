package com.example.kotlin_journey.chapters

// Destructuring declarations allow you to unpack the properties of an object into separate variables.

fun main(){
    val user1 = User("1", 25, "John Doe")
    val (id, age) = user1
    println(id) // 1
    println(age) // 25

    val (_, _, name) = user1
    println(name) // John Doe
}