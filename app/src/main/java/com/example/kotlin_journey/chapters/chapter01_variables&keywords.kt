package com.example.kotlin_journey.chapters

// val is like final
// const is simply const

const val str = "hello"

fun main() {
    var a = 1 // mutable variable
    val b = 2 // immutable variable

    a = 3 // a can be reassigned
//    b = 3 // b cannot be reassigned
    println(a) // prints 3 in a separate line
    println(b) // prints 2 in a separate line

    print(a) // prints 3 in the same line
    print(b) // prints 2 in the same line
}