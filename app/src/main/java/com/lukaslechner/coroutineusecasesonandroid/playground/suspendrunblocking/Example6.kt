package com.lukaslechner.coroutineusecasesonandroid.playground.suspendrunblocking

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking { // this: CoroutineScope
        suspendingWork6()
        println("of")
    }
    println("execution.")
}

suspend fun suspendingWork6() = coroutineScope { // this: CoroutineScope
    launch {
        delay(2000L)
        println("flow")
    }
    launch {
        delay(1000L)
        println("the")
    }
    println("Follow")
}