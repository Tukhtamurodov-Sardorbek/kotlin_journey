package com.example.kotlin_journey.chapters

fun main() {
    // Arrays are mutable in Kotlin
    // Arrays are created using the arrayOf() function
    // Arrays can be created using the array() function
    // Arrays can be created using the intArrayOf() function
    // Arrays can be created using the charArrayOf() function
    // Arrays can be created using the booleanArrayOf() function
    // Arrays can be created using the doubleArrayOf() function
    // Arrays can be created using the floatArrayOf() function
    // Arrays can be created using the longArrayOf() function
    // Arrays can be created using the shortArrayOf() function
    // Arrays can be created using the byteArrayOf() function
    // Arrays can be created using the emptyArray() function

    // Arrays can be created using the Array() constructor
    // Arrays can be created using the Array() constructor with a lambda
    // Arrays can be created using the Array() constructor with a size and a lambda
    // Arrays can be created using the Array() constructor with a size and a lambda with index
    // Arrays can be created using the Array() constructor with a size and a lambda with index and value
    // Arrays can be created using the Array() constructor with a size and a lambda with index and value and type
    // Arrays can be created using the Array() constructor with a size and a lambda with index and value and type and type
    // Arrays can be created using the Array() constructor with a size and a lambda with index and value and type and type and type
    // Arrays can be created using the Array() constructor with a size and a lambda with index and value and type and type and type and type
    // Arrays can be created using the Array() constructor with a size and a lambda with index and value and type and type and type and type and type
    // Arrays can be created using the Array() constructor with a size and a lambda with index and value and type and type and type and type and type and type
    // Arrays can be created using the Array() constructor with a size and a lambda with index and value and type and type and type and type and type and type and type
    // Arrays can be created using the Array() constructor with a size and a lambda with index and value and type and type and type and type and type and type and type and type

    val namesArray: Array<String> = arrayOf("Alice", "Bob", "Charlie")
    val namesConstuctor = Array(3) { "Alice" }
    val numbersArray = Array(5) { it * 2 }
    println(namesArray.contentToString())
    println(namesConstuctor.contentToString())
    println(numbersArray.contentToString())


    val intArray1 = IntArray(5) { it * it }
    val intArray2 = intArrayOf(1, 2, 3, 4, 5)
    val floatArray = FloatArray(5) { 1.0f }

    println(intArray1.contentToString())
    println(intArray2.contentToString())
    println(floatArray.contentToString())


    val matrix = Array(3) {
        IntArray(3) { it2 ->
            when (it) {
                0 -> it2 + 1
                1 -> it2 + 4
                else -> it2 + 7
            }
        }
    }
    println(matrix.contentDeepToString())
    println("matrix[1][2]: ${matrix[1][2]}")

    val matrix2 = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9),
    )
    println(matrix2.contentDeepToString())
    println("matrix2[1][2]: ${matrix2[1][2]}")
    println("Matrix2 first raw: ${matrix2[0].contentToString()}")
    println("Matrix2 first column: ${matrix2.map { it[0] }}")

}