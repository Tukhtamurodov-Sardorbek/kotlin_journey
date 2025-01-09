package com.example.kotlin_journey.chapters


class KotlinInJavaExample {
    // If we don't use @JvmField annotation
    // It will cause an error in Java compiler while accessing value field

    var defaultVariable = 1

    @JvmField
    var directlyAccessableVariable = 1
}

// @JvmStatic make the method or property static when accessed from Java
object KotlinUtility {
    @JvmStatic
    fun printer(message: String) {
        println(message)
    }
}