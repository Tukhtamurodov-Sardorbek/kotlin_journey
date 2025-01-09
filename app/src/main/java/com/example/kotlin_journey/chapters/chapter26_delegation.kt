package com.example.kotlin_journey.chapters

// INTERFACE DELEGATION
interface Sound {
    fun makeSound()
}

class Dog : Sound {
    override fun makeSound() = println("Bark")
}

class Cat : Sound {
    override fun makeSound() = println("Meow")
}

// The Animal class delegates the implementation of the Sound interface to the sound object.
// If the Sound interface has a method makeSound, the Animal class doesn’t need to implement it manually.
// Instead, when makeSound is called on an Animal object, the call is delegated to the sound instance passed to the Animal constructor.
class Animal(private val sound: Sound) : Sound by sound


// PROPERTY DELEGATION
class LazyProperty {
    val value: String by lazy { "Hello, World!" }
}

fun main() {
    val dog = Animal(Dog())
    val cat = Animal(Cat())

    dog.makeSound()
    cat.makeSound()

    val lazyProperty = LazyProperty().value
    println(lazyProperty)

}