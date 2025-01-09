package com.example.kotlin_journey.chapters

// Visibility modifiers: public, private, protected, internal
// public: default visibility modifier
// private: visible only within the class
// protected: visible within the class and its subclasses
// internal: visible within the same module

class Person {
    private var _id: String = ""
    private var _name: String = ""
    private var _profession: String = ""
    private var _age: Int = 0
    private lateinit var _address: String
    var isMarried: Boolean = false

    var id: String
        get() = _id
        set(value) {
            _id = value
        }
    var name: String
        get() = _name
        set(value) = run { _name = value }
    var profession: String
        get() = _profession
        set(value) = run { _profession = value }
    var age: Int
        get() = _age
        set(value) = run { _age = value }
    var address: String
        get() = _address
        set(value) = run { _address = value }


    override fun toString(): String {
        var strBuilder: StringBuilder = StringBuilder()
        strBuilder.append("Person: $_id, $_name, $_age, $_profession, $isMarried")
        if (::_address.isInitialized) {
            strBuilder.append(", $_address")
        }
        return strBuilder.toString()
    }
}

// Primary constructor
class Person1(
    private val id: String,
    private val name: String,
    private val age: Int,
    private val professionField: String,
    val isMarriedField: Boolean,
) {
    private val _id: String
    private val _name: String
    private val _profession: String
    private var _age: Int = 0
    private lateinit var _address: String
    var isMarried: Boolean = false

    init {
        this._id = id
        this._age = age
        this._name = name
        this._profession = professionField
        this.isMarried = isMarriedField

        println("Person1: $_id, $_name, $_age, $_profession, $isMarried")
    }

    // Getters & Setters
    val personID: String
        get() = _id

    val personName: String
        get() = _name

    var personAge: Int
        get() = _age
        set(value) = run { _age = value }

    var address: String
        get() = _address
        set(value) {
            _address = value
        }
    val profession: String
        get() = _profession

    // Methods
    fun getName(): String = _name

    var initializeAddress = { address: String -> _address = address }
    var setAddress: (String) -> Unit = { address -> _address = address }
}

class Person2 private constructor(
    private val _id: String,
    private val _name: String,
    private val _age: Int,
    private val _profession: String,
    val isMarriedField: Boolean,
) {
    private lateinit var _address: String

    init {
        _address = "unknown"
    }

    /// factory constructor
    companion object {
        fun create(
            id: String,
            name: String,
            age: Int,
            profession: String,
            isMarried: Boolean
        ): Person2 {
            return Person2(id, name, age, profession, isMarried)
        }
    }

    constructor(
        person: Person1
    ) : this(
        person.personID,
        person.personName,
        person.personAge,
        person.profession,
        person.isMarriedField
    ) {
        _address = person.address
    }

    val name: String
        get() = _name

    val profession: String
        get() = _profession

    val age: Int
        get() = _age

    val address: String
        get() = _address

}

fun main() {
    val person = Person()
    person.id = "1"
    person.age = 30
    person.name = "John"
    person.profession = "Engineer"
    person.isMarried = false
    person.address = "123 Main St"
    println("Person: $person \n")

    val person1 = Person1("1", "John", 30, "Engineer", false)
    person1.address = "123 Main St"
    println("Person1: ${person1.address}")
    println("Person1: ${person1.getName()}")
    println("Person1: ${person1.personAge}")
    person1.personAge = 31
    println("Person1: ${person1.personAge} \n")


    val person2 = Person2.create("2", "Jane", 25, "Doctor", true)
    println("Person2: ${person2.name}, ${person2.age}, ${person2.profession}, ${person2.address} \n")

    val person3 = Person2(person1)
    println("Person3: ${person3.name}, ${person3.age}, ${person3.profession}, ${person3.address}\n")

}