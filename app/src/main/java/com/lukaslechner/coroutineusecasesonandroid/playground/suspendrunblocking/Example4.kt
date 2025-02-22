package com.lukaslechner.coroutineusecasesonandroid.playground.suspendrunblocking

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking { // this: CoroutineScope
    launch {
        suspendingWork4()
    }
    launch {
        suspendingWork4()
    }
    println("Hello")
}

suspend fun suspendingWork4() {
    delay(1000L)
    println("LogRocket!")
}