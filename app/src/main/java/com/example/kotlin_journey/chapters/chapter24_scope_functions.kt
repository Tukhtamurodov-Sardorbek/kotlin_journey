package com.example.kotlin_journey.chapters

import java.io.File

// Scope Functions
//// let, run, with, apply, also

fun main() {
    val user: User? = null
    letExample(user)
    runExample(user)
    withExample(user)
    applyExample(user)
    alsoExample(user)
}

fun letExample(user: User?) {
    if (user != null) {
        println(user.name)
        println(user.age)
    }

    val name: String = user?.name ?: "Unknown"
    println(name)

    // let is used to execute a block of code only if the object is not null
    user?.let {
        println(it.name)
        println(it.age)
    }

    val nameLength = user?.let { it.name.length } ?: 0
    println(nameLength)
    println("* let example completed")
}

fun runExample(user: User?) {
    var resultText: String = ""

    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello ")
    stringBuilder.append("World ")
    stringBuilder.append("USING TRADITIONAL WAY")
    resultText = stringBuilder.toString()
    println(resultText)

    // run is used to execute a block of code and return the result
    resultText = stringBuilder.run {
        append("Hello ")
        append("World ")
        append("USING RUN")
        append("\n* run example completed")
        toString()
    }

    println(resultText)
}

fun withExample(user: User?) {

    val currentUser = user ?: User("johnID", 0, "John")
    // with is used to perform multiple operations on an object without repeatedly referencing it and return the result
    val resultText = with(currentUser) {
        var year = 2024
        println("Hello $name, you are $age years old in the year $year.")
        println("Time is passing ...")
        Thread.sleep(400)
        println("Time is passing ...")
        Thread.sleep(400)
        year++

        println("Oh $name, you are now $age years old as of $year!")
        "* with example completed"
    }
    println(resultText)
}

fun applyExample(user: User?) {
    // apply is used to perform multiple operations on an object and return the object itself
    val simpleClass = SimpleClass().apply {
        text = "Hello"
        number = 42
        println(this)
    }


    val currentUser = user ?: User("johnID", 0, "John")
    val resultText = currentUser.apply {
        var year = 2024
        println("Hello $name, you are $age years old in the year $year.")
        println("Time is passing ...")
        Thread.sleep(400)
        println("Time is passing ...")
        Thread.sleep(400)
        year++

        println("Oh $name, you are now $age years old as of $year!")
        "* apply example completed"
    }
    println(resultText)
}

fun alsoExample(user: User?) {
    // also is used to perform additional operations on an object and return the object itself
    val file = File("example.txt").also {
        it.createNewFile()
        println("File created: ${it.name}")
    }


    val currentUser = user ?: User("johnID", 0, "John")
    val resultText = currentUser.also {
        var year = 2024
        println("Hello ${it.name}, you are ${it.age} years old in the year $year.")
        println("Time is passing ...")
        Thread.sleep(400)
        println("Time is passing ...")
        Thread.sleep(400)
        year++

        println("Oh ${it.name}, you are now ${it.age} years old as of $year!")
        "* also example completed"
    }
    println(resultText)
}

class SimpleClass {
    var text: String = ""
    var number: Int = 0

    override fun toString(): String {
        return "SimpleClass(text='$text', number=$number)"
    }
}