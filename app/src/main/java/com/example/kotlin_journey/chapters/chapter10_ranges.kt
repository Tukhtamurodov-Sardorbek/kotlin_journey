package com.example.kotlin_journey.chapters

fun main() {
    val from1to10 = 1..10
    val alphabets = 'a'..'z'
    val from1until10 = 1 until 10
    val from10to1 = 10 downTo 1
    val from10to2 = 10 downTo 2
    val from1to10step2 = 1..10 step 2
    val from10to1step2 = 10 downTo 1 step 2


    for (i in 0 until from1to10.count()) {
        if (i == 0) {
            print("$from1to10: ")
        }
        print(from1to10.elementAt(i))
    }

    println("\n~~~~~~~~~~~~~~~~~~~~~")

    for (item in 1..3) {
        if (item == 1) {
            print("1..3: ")
        }
        print(item)
    }

    println("\n~~~~~~~~~~~~~~~~~~~~~")

    for (i in 0 until from1until10.count()) {
        if (i == 0) {
            print("$from1until10: ")
        }
        print(from1until10.elementAt(i))
    }

    println("\n~~~~~~~~~~~~~~~~~~~~~")

    for (i in 0 until alphabets.count()) {
        if (i == 0) {
            print("$alphabets: ")
        }
        print(alphabets.elementAt(i))
    }
}