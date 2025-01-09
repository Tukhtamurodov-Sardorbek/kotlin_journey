package com.example.kotlin_journey.chapters

import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    var flag: Int =0
    println(">>>> Current Thread: ${Thread.currentThread()} <<<<")
    println("Kotlin version: ${KotlinVersion.CURRENT} [FLAG: $flag]") // Output: Kotlin version: 1.9.24

    // runBlocking is mostly used in UnitTests
    runBlocking(Dispatchers.IO) {
        flag = 1
        // Launches a new coroutine without blocking the current thread and returns a reference to the coroutine as a Job.
        // The coroutine is cancelled when the resulting job is cancelled.
        // Here, the Dispatcher is not specified -> so, it'll by default inherit the thread of its parent
        val job = launch {
            flag = 2
            println("First launch started! [FLAG: $flag]")
            delay(1000)
            flag = 3
            println("First launch completed! [FLAG: $flag]")
            flag = 4
        }
        flag = 5
        job.cancel()

        // Dispatchers specify on which Thread to execute the Coroutine
        launch(Dispatchers.IO) {
            flag = 6
            println("Start fetching data from network [FLAG: $flag]")
            println(">>>> Current Thread: ${Thread.currentThread()} <<<<")
            val data = fetchData()
            flag = 7
            println("Finish fetching data from network: $data [FLAG: $flag]")
        }

        println(">>>> Current Thread: ${Thread.currentThread()} <<<<")
        println("The launch won't affect the synchronous operations, so this print is displayed well before the launch completes its task! [FLAG: $flag]")


        val asyncEx: Deferred<Int> = async(Dispatchers.IO) {
            delay(1000)
            println("Async Example")
            10
        }
        val asyncVal = asyncEx.await()
        println(asyncVal)

        val async1 = async {
            println("Async1 STARTED")
            delay(1000)
            println("Async1 FINISHED")
            1
        }
        val async2 = async {
            println("Async2 STARTED")
            delay(1000)
            println("Async2 FINISHED")
            2
        }

        val concurrentAsyncVal = listOf(async1, async2).awaitAll()
        println(concurrentAsyncVal.toString())
    }

    // Dispatchers
    val d = Dispatchers.Default // For CPU intensive tasks [heavy calculation, image processing]
    val m = Dispatchers.Main // For UI operations
    val i = Dispatchers.IO // For network calls, file io, database operations
    val u = Dispatchers.Unconfined // Can move from one to another thread
}

// Future function
suspend fun fetchData(): String {
    delay(1000)
    return "Network Data"
}

