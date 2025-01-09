package com.example.kotlin_journey.chapters

infix fun Point.moveBy(offset: Int): Point {
    return Point(this.OX + offset, this.OY + offset)
}

fun main() {
    // public infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
    val pair = 1 to "ONE"

    val point = Point(1, 2)
    val point2 = point.moveBy(10)
    val point3 = point moveBy 1
    println(point2)
    println(point3)

}