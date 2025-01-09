package com.example.kotlin_journey.chapters

fun main() {
    val number: Int = 10

    val isPositive = if (number > 0) {
        true
    } else if (number == 0) {
        false
    } else {
        false
    }

    val isPositive2 = if (number > 0) true else false

    val day = 30
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }

    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> {
            println("Invalid day")
             "Invalid day"
        }
    }
}