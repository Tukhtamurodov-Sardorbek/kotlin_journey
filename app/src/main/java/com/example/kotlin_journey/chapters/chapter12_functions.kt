package com.example.kotlin_journey.chapters


/// fun FUNCTION_NAME(PARAMETER_NAME: PARAMETER_TYPE): RETURN_TYPE {}

fun main() {
    printer2()
    printer2("Hello, Kotlin!")
    printer2(message = "Hello, World!")

    val sum = add2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    printer(sum)
}

/// void type
fun printer(message: Any) {
    println(message.toString())
}

/// With return type
fun add(a: Int, b: Int): Int {
    return a + b
}

/// Single expression function
fun multiply(a: Int, b: Int): Int = a * b

/// Default parameter
fun printer2(message: Any = "Default message"): Unit {
    println(message.toString())
}

/// vararg
fun add2(vararg numbers: Int): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}