package com.lukaslechner.coroutineusecasesonandroid.playground.suspendrunblocking

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking { // this: CoroutineScope
        launch {
            delay(500L)
            println("the")
        }
        println("Follow")
    }
    println("execution.")
}