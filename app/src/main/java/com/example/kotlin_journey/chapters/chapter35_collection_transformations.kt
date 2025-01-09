package com.example.kotlin_journey.chapters

fun main() {
    val data = List(10) { if (it == 0) 1 else it }

    val first = data.first() // If data is empty -> throws an Exception
    val nullableFirst = data.firstOrNull()

    val last = data.last() // If data is empty -> throws an Exception
    val nullableLast = data.lastOrNull()

    print("$first - $nullableFirst\t")
    print("$last - $nullableLast\n")

    val filteredData = data.filter { it % 2 == 0 }
    println(filteredData)

    val refactorData = data.map { it * 2 }
    println(refactorData)

    val groupData: Map<Boolean, List<Int>> = data.groupBy { it % 2 == 0 }
    println(groupData)

    val removeDuplicates = data.distinct()
    println(removeDuplicates)

    val sortedDataAscending = data.sorted()
    val sortedDataDescending = data.sortedDescending()
    val reversedData = data.reversed()
    println(sortedDataAscending)
    println(sortedDataDescending)
    println(reversedData)

    val assosiation: Map<Int, Int> = data.associate { it to it * 2 }
    println(assosiation)

    val assosiationWith = data.associateWith { it % 2 == 0 }
    println(assosiationWith)

    val assosiationBy = data.associateBy { it % 2 == 0 } // Returns the last values of groupBy
    println(assosiationBy)


    val partitioning: Pair<List<Int>, List<Int>> = data.partition { it % 2 == 0 }
    println(partitioning)

    val str = data.joinToString(separator = " | ", prefix = "[ ", postfix = " ]"){
        (it + 1).toString()
    }
    println(str)
}