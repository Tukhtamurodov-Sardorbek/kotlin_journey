package com.example.kotlin_journey.chapters

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking

fun basicStream() = flow {
    for (i in 0..10) {
        delay(400)
        emit(i)
    }
}

fun fixedStream() = flowOf(1, 2, 3, 4, 5)

fun asFlowStream() = listOf(1, 2, 3, 4, 5, 6).asFlow()

fun main() {
    runBlocking {
        basicStream().collect {
            print("$it ")
        }
        println("")
        fixedStream().collect {
            print("$it ")
        }
        println("")
        asFlowStream().collect {
            print("$it ")
        }
    }
}