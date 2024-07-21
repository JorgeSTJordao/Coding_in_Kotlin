package couroutines.concurrency

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun awaitFunction() = runBlocking {
    val deferred: Deferred<Int> = async {
        loadData()
    }
    println("waiting for deferred data...")
    deferred.await().also {deferredReceived ->
        println(deferredReceived.plus(1))
    }
}

suspend fun loadData(): Int {
    println("Loading")
    delay(1000L)
    println("Loaded!")
    return 1
}