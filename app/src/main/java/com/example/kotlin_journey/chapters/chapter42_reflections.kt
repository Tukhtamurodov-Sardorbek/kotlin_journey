package com.example.kotlin_journey.chapters

import kotlin.reflect.KClass

fun main() {
    val kclass: KClass<_Class> = _Class::class
    val clasclas: Class<_Class> = _Class::class.java

    val func = _Class::displayText

}

class _Class(val text: String) {
    fun displayText() {
        println(text)
    }
}