package couroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun couroutineScopeFunction() = coroutineScope {
    launch {
        delay(1000L)
        println("World")
    }
    println("Hello")
}