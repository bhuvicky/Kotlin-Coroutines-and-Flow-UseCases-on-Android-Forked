package com.lukaslechner.coroutineusecasesonandroid.playground.fundamentals

import kotlin.concurrent.thread

/*
* Exception in thread "main" java.lang.OutOfMemoryError:
* unable to create native thread: possibly out of memory or process/resource limits reached
* */
fun main() {
    repeat(1_000_000) {
        thread {
            Thread.sleep(5000)
            print(".")
        }
    }
}