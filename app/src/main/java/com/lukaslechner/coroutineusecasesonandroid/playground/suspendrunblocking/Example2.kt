package com.lukaslechner.coroutineusecasesonandroid.playground.suspendrunblocking

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking { // this: CoroutineScope
        suspendingWork2()
        println("the")
    }
    println("execution.")
}

suspend fun suspendingWork2() {
    delay(1000L)
    println("Follow")
}