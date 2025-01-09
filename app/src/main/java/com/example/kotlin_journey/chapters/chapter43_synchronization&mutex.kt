package com.example.kotlin_journey.chapters

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

fun main() {
    val mutex = Mutex()

    runBlocking {
        launch {
            // Once the code block is completed, the lock is automatically released
            mutex.withLock {
                println("Shared code block")
            }

        }
    }
}

class BankAccount(
    private var balance: Double
) {
    val mutex = Mutex()

    suspend fun replenish(amount: Double) {
        mutex.withLock {
            balance += amount
        }
    }

    suspend fun withdrawal(amount: Double) {
        mutex.withLock {
            balance -= amount
        }
    }
}

