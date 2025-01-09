package com.example.kotlin_journey.chapters

fun interface MyFunctionalInterface {
    fun execute()
}

fun main() {
    // Lambda function to calculate the square of a number
    // val VARIABLE_NAME: (PARAMETER_TYPE) -> RETURN_TYPE = { PARAMETER -> BODY }
    // 1. VARIABLE_NAME: The name of the variable that holds the lambda function.
    // 2. (PARAMETER_TYPE) -> RETURN_TYPE: The type signature of the lambda function.
    // 3. { PARAMETER -> BODY }: The body of the lambda function.
    val square: (Int) -> Int = { x -> x * x }
    println(square(2))

    val sum: (Double, Double) -> Double = { a: Double, b ->
        val result = a + b
        println("The sum of $a and $b is $result")
        result
    }
    val result = sum(3.0, 4.0)

    val factorial = { n: Int ->
        require(n >= 0) { "Factorial is not defined for negative numbers." }
        val factorialOfn =
            if (n == 0) 1 else (1..n).map { it.toLong() }.reduce { acc, i -> acc * i }
        println("The factorial of $n is $factorialOfn")
        factorialOfn
    }

    val factorialOf9 = factorial(9)

    val sumWithReceiver: Int.() -> Int = { this + 1 }
    println(sumWithReceiver(9))


    val functionalInterfaceImpl: MyFunctionalInterface = MyFunctionalInterface {
        println("executing ...")
    }
    functionalInterfaceImpl.execute()
}