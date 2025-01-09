package com.example.kotlin_journey.chapters

// The `object` keyword in Kotlin is used to:
// * create a singleton
// * create an anonymous object
// * create a companion object for static members of a class
// * create a factory object
// * create an object expression

object SingletonExample {
    var name: String = "Singleton"
}

class StaticExample {
    companion object {
        const val staticDataMember = "Static Value"
        fun staticDataMethod() {
            println("This is a static method")
        }
    }
}

class MyClass {
    // Nested Singleton
    object Nested {
        fun nestedFunction() = "Nested function called"
    }
}

class FactoryExample(var text: String) {
    companion object Factory {
        fun create(txt: String): FactoryExample {
            val instance = FactoryExample(txt)
            println("LOOK: ${instance.text}")
            return instance
        }
    }
}


fun main() {
    // * Singleton
    println(SingletonExample.name)
    SingletonExample.name = "Updated Singleton"
    println(SingletonExample.name)

    // * Static members
    println(StaticExample.staticDataMember)
    StaticExample.staticDataMethod()

    // * Anonymous object
    val anonymousImplementation = object : MyInterface {
        override val publicDataMember: String
            get() = "Anonymous"

        override fun abstractMemberFunction() {
            println("Anonymous implementation")
        }
    }
    anonymousImplementation.abstractMemberFunction()

    // Access the nested object and call its function
    val result = MyClass.Nested.nestedFunction()
    println(result) // Output: Nested function called

    val factory = FactoryExample.create("Hello, Factory!")
}