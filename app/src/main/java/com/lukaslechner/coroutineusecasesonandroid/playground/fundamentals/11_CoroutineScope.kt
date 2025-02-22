package com.lukaslechner.coroutineusecasesonandroid.playground.fundamentals

import androidx.lifecycle.viewModelScope
import com.lukaslechner.coroutineusecasesonandroid.base.BaseViewModel
import com.lukaslechner.coroutineusecasesonandroid.usecases.flow.usecase1.UiState
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class CoroutineScopeWithLaunch: BaseViewModel<UiState>() {

    // O/P: xxx log outside launch block
    // xxx log coroutineScope
    fun coroutineScopeInsideLaunch1() {
        viewModelScope.launch {
            coroutineScope {
                launch { delay(5000); println("xxx log coroutineScope") }
            }
        }
        println("xxx log outside launch block")
    }

    // O/P: xxx log outside launch block
    // xxx log coroutineScope
    fun coroutineScopeInsideLaunch2() {
        viewModelScope.launch {
            coroutineScope {
                delay(5000); println("xxx log coroutineScope")
            }
        }
        println("xxx log outside launch block")
    }
}


/*
* https://stackoverflow.com/questions/53535977/coroutines-runblocking-vs-coroutinescope
* coroutineScope Inside RunBlocking
* Here, coroutineScope not blocking main thread, it is runBlocking who is blocking main thread.
* Here, coroutineScope can't suspend main thread bcos it's inside runBlocking. Hence it is not printing line 65 first
*
* O/P:
* Task from coroutine scope
* Task from runBlocking
* Task from nested launch
* Coroutine scope is over
* */
fun main() = runBlocking { // this: CoroutineScope
    launch {
        delay(200L)
        println("Task from runBlocking")
    }

    coroutineScope { // Creates a new coroutine scope
        launch {
            delay(900L)
            println("Task from nested launch")
        }

        delay(100L)
        println("Task from coroutine scope") // This line will be printed before nested launch
    }

    println("Coroutine scope is over") // This line is not printed until nested launch completes
}