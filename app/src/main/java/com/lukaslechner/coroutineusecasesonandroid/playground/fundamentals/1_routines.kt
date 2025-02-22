package com.lukaslechner.coroutineusecasesonandroid.playground.fundamentals

/*
* Thread.sleep() stops the execution at the line it gets called until the time gets over.
* Hence blocking the current thread.
*
*
*  */
fun main() {
    println("main starts")
    routine(1, 500)
    routine(2, 300)
    println("main ends")
}

fun routine(number: Int, delay: Long) {
    println("Routine $number starts work")
    Thread.sleep(delay)
    println("Routine $number has finished")
}