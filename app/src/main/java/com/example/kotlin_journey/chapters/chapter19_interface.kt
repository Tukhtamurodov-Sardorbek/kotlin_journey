package com.example.kotlin_journey.chapters

interface MyInterface {
    val publicDataMember: String

    val publicDataMemberGetter: String
        get() = publicDataMember

    fun abstractMemberFunction()

    fun concreteMemberFunction() {
        println("Concrete member function")
    }

    fun commonConcreteMemberFunction() {
        println("Concrete member function")
    }
}

interface MyInterface2 {
    fun abstractMethod()

    fun concreteMethod() {
        println("Concrete method")
    }

    fun commonConcreteMemberFunction() {
        println("Common concrete member function")
    }
}

class MyInterfaceImpl : MyInterface, MyInterface2 {
    override val publicDataMember: String = "Public data member"

    override fun abstractMemberFunction() {
        println("Abstract member function")
    }


    override fun abstractMethod() {
        println("Abstract method")
    }

    override fun commonConcreteMemberFunction() {
        // Specify which interface's commonConcreteMemberFunction to call
        super<MyInterface>.commonConcreteMemberFunction()
    }

}

fun main() {
    val instance = MyInterfaceImpl()
    instance.abstractMethod()
    instance.abstractMemberFunction()
    instance.commonConcreteMemberFunction()

    println(instance.publicDataMember)
    println(instance.publicDataMemberGetter)

}