package com.example.kotlin_journey.chapters

fun main() {
    var a = 10
    var b = 20

    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b
    val remainder = a % b

    val isGreater = a > b
    val isLess = a < b
    val isEqual = a == b
    val isNotEqual = a != b

    val prefixIncrement = ++a
    val prefixDecrement = --a

    val postIncrement = a++
    val postDecrement = a--

    val and = isGreater && isLess
    val or = isGreater || isLess
    val not = !isGreater

    val bitwiseAnd = a and b
    val bitwiseOr = a or b
    val bitwiseXor = a xor b
    val bitwiseInv = a.inv()
    val bitwiseShiftLeft = a shl 2
    val bitwiseShiftRight = a shr 2
    val bitwiseShiftRightZeroFill = a ushr 2


    a += 5
    b -= 5


}