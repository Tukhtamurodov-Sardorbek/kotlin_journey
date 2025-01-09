package com.example.kotlin_journey.chapters

fun main() {
    val fruits = arrayOf("Banana", "Apple", "Orange", "Mango")

    println("for (fruit in fruits)")
    for (fruit in fruits) {
        printer(fruit, isSeparate = fruits.first() == fruit)
    }

    println("for (i in 0 until fruits.size)")
    for (i in 0 until fruits.size) {
        printer(fruits[i], isSeparate = i == 0)
    }

    println("for (i in 0 until fruits.size step 2)")
    for (i in 0 until fruits.size step 2) {
        printer(fruits[i], isSeparate = i == 0)
    }

    println("for (i in fruits.size - 1 downTo 0)")
    for (i in fruits.size - 1 downTo 0) {
        printer(fruits[i], isSeparate = i == 0)
    }

    println("for (i in fruits.size - 1 downTo 0 step 2)")
    for (i in fruits.size - 1 downTo 0 step 2) {
        printer(fruits[i], isSeparate = i == 0)
    }

    println("for (i in fruits.indices)")
    for (i in fruits.indices) {
        printer(fruits[i], isSeparate = i == 0)
    }

    println("for (i in fruits.indices step 2)")
    for (i in fruits.indices step 2) {
        printer(fruits[i], isSeparate = i == 0)
    }

    println("for (i in fruits.indices.reversed())")
    for (i in fruits.indices.reversed()) {
        printer(fruits[i], isSeparate = i == 0)
    }

    println("for (i in fruits.indices.reversed() step 2)")
    for (i in fruits.indices.reversed() step 2) {
        printer(fruits[i], isSeparate = i == 0)
    }

    var i = 0
    println("while (i < fruits.size)")
    while (i < fruits.size) {
        printer(fruits[i], isSeparate = i == 0)
        i++
    }

    i = 0
    println("do while (i < fruits.size)")
    do {
        printer(fruits[i], isSeparate = i == 0)
        i++
    } while (i < fruits.size)

    i = 0
    println("loop@ while (i < fruits.size)")
    loop@ while (i < fruits.size) {
        printer(fruits[i], isSeparate = i == 0)
        i++
        if (i == 2) {
            break@loop
        }
    }

    i = 0
    println("while (i < fruits.size)")
    while (i < fruits.size) {
        if (i == 2) {
            i++
            continue
        }
        printer(fruits[i], isSeparate = i == 0)
        i++
    }

    i = 0
    println("do while (i < fruits.size)")
    do {
        if (i == 2) {
            i++
            continue
        }
        printer(fruits[i], isSeparate = i == 0)
        i++
    } while (i < fruits.size)


    println("for (fruit in fruits) with continue")
    for (fruit in fruits) {
        if (fruit == "Apple") {
            continue
        }
        printer(fruit, isSeparate = fruits.first() == fruit)
    }

    println("for (fruit in fruits) with break")
    for (fruit in fruits) {
        if (fruit == "Apple") {
            break
        }
        printer(fruit, isSeparate = fruits.first() == fruit)
    }
}

fun printer(fruit: String, isSeparate: Boolean = false) {
    if (isSeparate) {
        print("\n* $fruit, ")
    } else {
        print("  $fruit,")
    }
}