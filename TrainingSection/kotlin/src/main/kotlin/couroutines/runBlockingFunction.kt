package couroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun runBlockingFunction() = runBlocking {
    launch {
        delay(1000L)
        println("World")
    }
    launch {
        delay(1000L)
        println("!")
    }
    println("Hello")
}