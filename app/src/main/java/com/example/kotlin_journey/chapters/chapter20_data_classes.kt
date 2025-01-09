package com.example.kotlin_journey.chapters

// Data classes are used to hold data
// They automatically provide implementations for common functions like toString(), equals(), and hashCode()
// Data classes must have at least one primary constructor parameter
// Data classes cannot be abstract, open, sealed, or inner

data class User(
    val id: String,
    val age: Int,
    val name: String,
){
    override fun toString(): String {
//        return super.toString() // User(id=1, age=25, name=John Doe)
        return "[id: $id name: $name age: $age]"
    }
}

fun main(){
    val user1 = User("1", 25, "John Doe")
    val user2 = User("2", 24, "Smith Ken")
    val copy = user2.copy()
    val copyWithEdit = user2.copy(age = 30)

    println(user2 == copy) // true because they have the same content
    println(user2 === copy) // false because they are different instances

    println("user1 == user2 => ${user1 == user2}")
    println("user2 == copyWithEdit => ${user2 == copyWithEdit}")
    println("user2 == copy => ${user2 == copy}")
    println("user2 === copyWithEdit => ${user2 === copyWithEdit}")
    println("user2 === copy => ${user2 === copy}")

    print("${user1.component1()} ") // 1
    print("${user1.component2()} ") // 25
    print(user1.component3()) // John Doe
}