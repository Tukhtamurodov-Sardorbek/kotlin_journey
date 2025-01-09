package com.example.kotlin_journey.chapters

enum class Direction(private val degree: Int) {
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(270);

    fun getDegree(): Int = degree
    fun description(): String = "Direction: $name, Degree: $degree"
}

fun main() {
    val direction = Direction.EAST
    println(direction.getDegree()) // 90
    println(direction.description()) // Direction: EAST, Degree: 90

    println(direction.ordinal) // 1
    println(Direction.entries.joinToString { it.name }) // NORTH, EAST, SOUTH, WEST
}
