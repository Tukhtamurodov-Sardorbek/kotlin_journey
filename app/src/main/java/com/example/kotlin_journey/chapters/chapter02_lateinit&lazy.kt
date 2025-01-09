package com.example.kotlin_journey.chapters

/// Late init variables are initialized later
/// They are initialized before they are used but not at the time of declaration
/// Cannot be used with Primitive types in Kotlin: Byte, Short, Int, Long, Float, Double, Char, Boolean

// Lazy variables are initialized when they are first accessed
// They are useful for expensive operations that you want to delay until they are actually needed

// lateinit vs lazy
// lateinit -> Non-nullable variable that will be initialized later
// lazy -> Variable that will be initialized when it is first accessed

fun main() {
    val example = LateInitExample()
    example.initName() // Initialize the lateinit variable
    example.printNameWithCheck()
    example.id = "123"  // Initialize the lateinit variable
    example.printIdWithCheck()

    example.lazyOperationPerformer // First ever time of calling the lazy variable => so it's initialized right here

}

class LateInitExample {
    lateinit var name: String
    lateinit var id: String

    // lateinit var a: Int // Error: Cannot be used with Primitive types

    // * lazy vaiables are initialized whenever they are called
    val lazyOperationPerformer: Unit by lazy {
        HeavyOperationHandler.performOperation()
    }
    val lazyValue: HeavyOperationHandler by lazy {
        HeavyOperationHandler.performOperation()
        HeavyOperationHandler()
    }


    fun initName() {
        name = "Kotlin"
    }

    fun printNameWithCheck() {
        // To check if a lateinit variable is initialized
        // To avoid UninitializedPropertyAccessException
        if (::name.isInitialized) {
            println(name)
        } else {
            println("Name is not initialized")
        }
    }

    fun printIdWithCheck() {
        // To check if a lateinit variable is initialized
        // To avoid UninitializedPropertyAccessException
        if (::id.isInitialized) {
            println(id)
        } else {
            println("Id is not initialized")
        }
    }
}

class HeavyOperationHandler {
    companion object {
        // Simulate a heavy operation
        fun performOperation() {
            println("Performing heavy operation...")
            Thread.sleep(2000) // Simulate time-consuming task
            println("Finished heavy operation...")
        }
    }

    // Simulate a heavy operation
    fun performOperation() {
        println("Performing heavy operation...")
        Thread.sleep(2000) // Simulate time-consuming task
        println("Finished heavy operation...")
    }
}