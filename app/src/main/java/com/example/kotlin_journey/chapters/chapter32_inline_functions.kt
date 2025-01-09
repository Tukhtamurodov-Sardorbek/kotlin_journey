package com.example.kotlin_journey.chapters

// Inline functions are copied directly into their calling site
inline fun calculate(operation: () -> Unit) {
    return operation()
}

// inline is used only in higher-order functions!
inline fun addInline(a: Int, b: Int): Int {
    return a + b
}

inline fun execute(crossinline block: () -> Unit) {
    println("Before execution")
    block() // if the block function is not crossinline, then its return statement can cause termination of execute method
    println("After execution")
}

fun main() {
    val result = calculate {
        println("Calculate ...")
    }

    execute {
        println("bloc is being executed ...")
//        return // if the parameter function is not crossinline, then the parameter function's return can terminate the execute method
    }
}