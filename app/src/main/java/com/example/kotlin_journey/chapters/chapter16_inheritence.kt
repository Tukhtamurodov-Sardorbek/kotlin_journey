package com.example.kotlin_journey.chapters

// By default all classes in Kotlin are final, so they can't be inherited
// To allow inheritance, use the open keyword
// Similarly, functions and properties are also final by default
// To allow overriding, use the open keyword

// In Kotlin we can't inherit from multiple classes, but we can implement multiple interfaces

open class Vehicle(
    private val name: String,
    private val maxSpeed: Double,
) {
    open fun display() {
        println("Vehicle: $name, $maxSpeed")
    }
}


class Car(
    private val name: String,
    private val maxSpeed: Double,
    private val numberOfSits: Int,
) : Vehicle(name, maxSpeed) {

    override fun display() {
        println("Car: $name, $maxSpeed, $numberOfSits")
    }
}

class Bike(
    private val name: String,
    private val maxSpeed: Double,
    private val numberOfGears: Int,
) : Vehicle(name, maxSpeed) {

    override fun display() {
        println("Bike: $name, $maxSpeed, $numberOfGears")
    }
}

fun main() {
    val vehicle = Vehicle("Vehicle", 100.0)
    vehicle.display()

    val car = Car("Car", 200.0, 5)
    car.display()

    val bike = Bike("Bike", 150.0, 6)
    bike.display()
}