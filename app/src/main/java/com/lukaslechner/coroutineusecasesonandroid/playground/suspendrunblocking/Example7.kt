package com.lukaslechner.coroutineusecasesonandroid.playground.suspendrunblocking

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking { // this: CoroutineScope
        suspendedPrint("Try")
        suspendingWork7()
        suspendedPrint("of")
    }
    println("execution.")
}

suspend fun suspendingWork7() {
    coroutineScope { // this: CoroutineScope
        /*launch {
            delay(2000L)
            suspendedPrint("the")
        }*/
//        launch {
            delay(1000L)
            suspendedPrint("follow")
//        }
        suspendedPrint("to")
    }
    suspendedPrint("flow")
}

suspend fun suspendedPrint(value: String) {
    println(value)
}