package com.lukaslechner.coroutineusecasesonandroid.playground.suspendrunblocking

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking { // this: CoroutineScope
        launch {
            delay(500L)
            supendedPrint("printing")
        }
        launch {
            supendedPrint("the")
        }
        supendedPrint("Follow")
    }
    println("execution.")
}

suspend fun supendedPrint(value: String) {
    println(value)
}