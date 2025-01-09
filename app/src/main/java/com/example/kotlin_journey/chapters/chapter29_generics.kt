package com.example.kotlin_journey.chapters

// GENERICS
// Generics allow you to create classes, interfaces, and functions that can operate on different types while providing type safety.
// This is useful for creating reusable and flexible code.

class GenericClass<T> {
    private val items = mutableListOf<T>()

    fun add(item: T): T {
        items.add(item)
        return item
    }

    fun delete(item: T): Boolean {
        return items.remove(item)
    }

    fun retrieve(index: Int): T {
        return items[index]
    }

    fun retrieveAll(): List<T> {
        return items.toList()
    }
}

open class Product(val id: Int, val name: String, val price: Double)

class Electronics(id: Int, name: String, price: Double) : Product(id, name, price)

fun <T> genericMethod(data: GenericClass<T>): List<T> {
    return data.retrieveAll()
}

// The * is the star-projection, representing an unknown type.
// It allows you to work with a GenericClass without knowing the exact type of T.
// The return type is List<*>, which is a list of unknown type. You can only read items from the list but cannot modify it in a type-safe manner.
fun genericMethodWithReified(data: GenericClass<*>): List<*> {
    return data.retrieveAll()
}

// The reified keyword allows you to access the type parameter T at runtime. Normally, generic types are erased at runtime (type erasure).
// By using reified, you can check the type of T at runtime and perform type-specific operations.
// This requires the function to be inline, as type reification only works for inline functions.
inline fun <reified T> genericMethodReified(data: GenericClass<T>): List<T> {
    println("The type is: ${T::class}")
    return data.retrieveAll()
}

// Type constraints can be applied to generic classes and functions to restrict the types that can be used as type arguments.
// For example, you can specify that a type must be a subclass of a particular class or implement a specific interface.
// In this example, the type constraint is applied to ensure that the type argument for T must be a subclass of Product.
// The out keyword is used to specify that the type parameter T is covariant, meaning it can be a subtype of Product.
// This means that you can pass a GenericClass of any subtype of Product to this function.
fun genericMethodWithTypeConstraint(data: GenericClass<out Product>): List<Product> {
    return data.retrieveAll()
}

fun <T : Comparable<T>> compare(data: GenericClass<T>): List<T> {
    return data.retrieveAll().sorted()
}

fun main() {
    val intList = GenericClass<Int>()
    intList.add(1)
    intList.add(2)
    println(intList.retrieveAll()) // Output: [1, 2]
    println(genericMethod(intList)) // Output: [1, 2]

    val stringList = GenericClass<String>()
    stringList.add("Hello")
    stringList.add("World")
    println(stringList.retrieveAll()) // Output: [Hello, World]
    println(genericMethod(stringList)) // Output: [Hello, World]

    val productList = GenericClass<Product>()
    productList.add(Product(1, "Laptop", 999.99))
    productList.add(Product(2, "Phone", 499.99))
    println(productList.retrieveAll()) // Output: [Product(id=1, name=Laptop, price=999.99), Product(id=2, name=Phone, price=499.99)]
    println(genericMethod(productList)) // Output: [Product(id=1, name=Laptop, price=999.99), Product(id=2, name=Phone, price=499.99)]

    val mixedData = GenericClass<Any>().apply {
        add(1)
        add("Kotlin")
    }
    println(genericMethod(mixedData)) // Output: [1, Kotlin]
    println(genericMethodWithReified(mixedData)) // Output: [1, Kotlin]


    val intData = GenericClass<Int>().apply { add(42) }
    genericMethodReified(intData) // Output: The type is: class kotlin.Int

    val electronicsData = GenericClass<Electronics>().apply { add(Electronics(3, "TV", 400.50)) }
    val products: List<Product> = genericMethodWithTypeConstraint(electronicsData)
    println(products[0].name) // Output: TV


    val people = GenericClass<ComparableExample>().apply {
        add(ComparableExample(3))
        add(ComparableExample(8))
        add(ComparableExample(90))
        add(ComparableExample(5))
        add(ComparableExample(-90))
        add(ComparableExample(0))
        add(ComparableExample(-5))
    }

    val sortedPeople = compare(people)
    println(sortedPeople)
}

data class ComparableExample(val value: Int) : Comparable<ComparableExample> {
    override fun compareTo(other: ComparableExample): Int {
        return this.value - other.value
    }

    override fun toString(): String {
        return value.toString()
    }
}