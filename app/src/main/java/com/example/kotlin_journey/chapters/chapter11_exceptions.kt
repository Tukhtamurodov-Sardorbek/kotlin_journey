package com.example.kotlin_journey.chapters

fun main() {
    trycatcher({
        val quotient = 10 / 0
        println("Quotient: $quotient")
    })

    trycatcher { throw CustomException("This is my own custom exception") }
    trycatcher { throw Exception("This is an exception") }
}


fun trycatcher(callback: () -> Unit) {
    try {
        callback()
    } catch (e: ArithmeticException) {
        println("ArithmeticException Exception: $e")
    } catch (e: CustomException) {
        println("CustomException Exception: $e")
    } catch (e: Exception) {
        println("Exception: $e")
    } finally {
        println("Finally block\n")
    }
}

class CustomException(message: String) : Exception(message) {
    override fun toString(): String {
        return "CustomException: $message"
    }
}