package com.example.kotlin_journey.chapters

fun main(){
    println("Enter your name: ")
    // Reads a line of text from the console until it encounters a newline character (\n)
    // Returns null if the end of the input stream is reached (e.g., if the user presses Ctrl+D or if the input stream is closed).
    val name = readLine() // String?
    println("Hello, $name!")
    println("How old are you?")
    // Reads a line of text from the console until it encounters a newline character (\n)
    // Throws an IOException if the end of the input stream is reached (e.g., if the user presses Ctrl+D or if the input stream is closed).
    val age = readln() // String
    println("Oh, you are $age years old.")
    println("What is your favorite number?")
    // Reads a line of text from the console until it encounters a newline character (\n)
    // Returns null if the end of the input stream is reached (e.g., if the user presses Ctrl+D or if the input stream is closed).
    val number = readlnOrNull() // String?
    println("Your favorite number is $number.")

}