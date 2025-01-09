package com.example.kotlin_journey.chapters

fun main(){
    typeChecker("Hello")
    typeChecker("1")


    // Manual type casting
    val obj: Any? = "Hello"
    val str: String = obj as String // NOT SAFE: might throw ClassCastException
    val str2: String = obj as? String ?: "Default Value" // SAFE: won't throw ClassCastException

    val intVal = "56".toInt()
}

fun typeChecker(value: Any) {
    if (value is String) {
        // Smart casted to String
        println("Value is a String")
    } else if (value is Int) {
        // Smart casted to Int
        println("Value is an Int")
    } else if (value is Double) {
        // Smart casted to Double
        println("Value is a Double")
    } else {
        println("Value is unknown")
    }
}
