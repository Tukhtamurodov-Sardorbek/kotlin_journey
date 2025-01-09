package com.example.kotlin_journey.chapters

// Arithmetic Operator Functions:
// => plus: +
// => minus: -
// => times: *
// => div: /
// => rem: %
// => unaryPlus: +a
// => unaryMinus: -a
// => inc: ++
// => dec: --

// Comparison Operator Functions:
// => compareTo: <, >, <=, >=
// => equals: ==, !=

// Collection-like Operator Functions:
// => get: a[i]
// => set: a[i] = b
// => contains: in
// => iterator: for (a in b)

// Other Useful Operator Functions:
// invoke: a()

data class Point(val OX: Int, val OY: Int) {
    operator fun plus(other: Point): Point {
        return Point(OX = OX + other.OX, OY = OY + other.OY)
    }

    operator fun minus(other: Point): Point {
        return Point(OX = OX - other.OX, OY = OY - other.OY)
    }

    operator fun times(other: Point): Point {
        return Point(OX = OX * other.OX, OY = OY * other.OY)
    }

    // The invoke function is a member of a class, and when defined, you can call an instance of that class directly using parentheses (), just like a function call.
    operator fun invoke(message: String) {
        println("INVOKED!: ${message.lowercase()}")
    }
}

fun main() {
    val point = Point(1, 2)
    val point2 = Point(10, 20)

    point("My message on invoke") // This calls the invoke function

    println(point + point2)
    println(point - point2)
    println(point * point2)

    val personBuilder = PersonBuilder()
    personBuilder(
        "1",
        30,
        "John",
        "Engineer",
        false,
    )
    val person = personBuilder.build()
    println("personBuilder.name = ${personBuilder.name} \t person.name = ${person.name}")
}

class PersonBuilder {
    private var _id: String = ""
    private var _name: String = ""
    private var _profession: String = ""
    private var _age: Int = 0
    private lateinit var _address: String
    var isMarried: Boolean = false

    val name: String
        get() = _name

    var address: String
        get() = _address
        set(value) = run { _address = value }

    operator fun invoke(
        id: String, age: Int, name: String, profession: String, isMarried: Boolean
    ) {
        this._id = id
        this._age = age
        this._name = name
        this._profession = profession
        this.isMarried = isMarried
    }

    fun build(): Person {
        val instance = Person().apply {
            this.id = _id
            this.age = _age
            this.name = _name
            this.profession = _profession
            this.isMarried = this@PersonBuilder.isMarried
            this.address = if (::_address.isInitialized) _address else "123 Main St"
        }
        return instance
    }

}