package com.lukaslechner.coroutineusecasesonandroid.playground.suspendrunblocking

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking { // this: CoroutineScope
        launch {
            suspendingWork3()
        }
        println("Follow")
    }
    println("execution.")
}

private suspend fun suspendingWork3() {
    delay(1000L)
    println("the")
}