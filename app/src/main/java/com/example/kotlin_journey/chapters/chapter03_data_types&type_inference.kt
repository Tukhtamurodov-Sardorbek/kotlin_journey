package com.example.kotlin_journey.chapters

import java.io.File
import java.util.Calendar
import java.util.Date
import java.util.regex.Pattern

/// Use colon : after the variable name to specify the type
/// var/val variableName: Type = value
/// lateinit var/val variableName: Type

fun main() {
    // Type inference
    val inferToString = "Kotlin"
    val inferToBoolean = false


    // Explicit type
    val int: Int = 1 // Int
    val nullableInt: Int? = null // Nullable Int
    val double: Double = 1.0 // Double
    val float: Float = 1.0f // Float
    val short: Short = 32767 // Short
    val long: Long = 123456789L // Long
    val byte: Byte = 127 // Byte
    val char: Char = 'A' // Char
    val string: String = "Hello" // String
    val nullableString: String? = null // Nullable String
    val boolean: Boolean = true // Boolean

    println(int)
    println(double)
    println(float)
    println(long)
    println(short)
    println(byte)
    println(char)
    println(string)
    println(boolean)


    val list = listOf(1, 2, 3) // List<Int>
    val nullableList: List<Int>? = null // Nullable List<Int>
    val anyList: List<Any> = listOf(1, "Hello", true) // List of Any type
    println(list)
    println(nullableList)
    println(anyList)
    val array = arrayOf(1, 2, 3) // Array<Int>
    val nullableArray: Array<Int>? = null // Nullable Array<Int>
    val anyArray: Array<Any> = arrayOf(1, "Hello", true) // Array of Any type
    println(array)
    println(nullableArray)
    println(anyArray)
    val map = mapOf(1 to "One", 2 to "Two") // Map<Int, String>
    val nullableMap: Map<Int, String>? = null // Nullable Map<Int, String>
    val anyMap: Map<Int, Any> = mapOf(1 to "One", 2 to 2) // Map of Int to Any type
    println(map)
    println(nullableMap)
    println(anyMap)
    val set = setOf(1, 2, 3) // Set<Int>
    val anySet: Set<Any> = setOf(1, "Hello", true) // Set of Any type
    println(set)
    println(anySet)

    val unit: Unit = println("Hello") // Unit type
    println(unit)
    val stringBuilder = StringBuilder() // StringBuilder type
    stringBuilder.append("Hello") // Append to StringBuilder
    println(stringBuilder)
    val date = Date() // Date type
    println(date)
    val regex = Regex("Hello") // Regex type
    println(regex)
    val pattern = Pattern.compile("Hello") // Pattern type
    println(pattern)
    val calendar = Calendar.getInstance() // Calendar type
    println(calendar)
    val file = File("Hello") // File type
    println(file)
}