@file:Suppress("UNUSED_EXPRESSION")

package com.example.kotlin_journey.chapters

enum class OperationType {
    add, sub, mul, div
}

// Higher-order functions are functions that can take other functions as parameters or return functions

fun higherOrderSimpleFunction(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun higherOrderShortenedFunction(a: Int, b: Int, operation: (Int, Int) -> Int) = operation(a, b)

val higherOrderLambdaFunction: (Int, Int, (Int, Int) -> Int) -> Int = { a, b, operation ->
    operation(a, b)
}

inline fun basicInlineFunction(block: () -> Unit) {
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis()
    println("Execution time: ${end - start} ms")
}

fun returnFunction(operation: OperationType): (Int, Int) -> Int {
    return when (operation) {
        OperationType.add -> { a, b -> a + b }
        OperationType.sub -> { a, b -> a - b }
        OperationType.mul -> { a, b -> a * b }
        OperationType.div -> { a, b -> a / b }
        else -> { _, _ -> 0 }
    }
}

fun main() {
//    val result1 = higherOrderSimpleFunction(10, 20, )
    val result1 = higherOrderSimpleFunction(10, 20, { a, b -> a + b })
    val result2 = higherOrderShortenedFunction(10, 20) { a, b ->
        a + b
    }
    val expression = { a: Int, b: Int -> a + b }
    val result3 = higherOrderLambdaFunction(10, 20, expression)
    val expression2: (Int, Int) -> Int = { a, b -> a + b }
    val result4 = higherOrderLambdaFunction(10, 20, expression2)

    println(result1)
    println(result2)
    println(result3)
    println(result4)

    basicInlineFunction {
        for (i in 1..1_000_000) {
//            println(i)
        }
    }

    val operation = returnFunction(OperationType.mul)
    println(operation(10, 20))
}