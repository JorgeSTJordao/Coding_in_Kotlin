package couroutines.context_dispatchers

import kotlinx.coroutines.*

@OptIn(ExperimentalCoroutinesApi::class, DelicateCoroutinesApi::class)
fun typeCourotineDispatchers() = runBlocking {
    launch {
        println("Main Block: ${Thread.currentThread().name}")
    }

    launch(Dispatchers.Unconfined) {
        println("Unconfined: ${Thread.currentThread().name}")
    }

    launch(Dispatchers.Default) {
        println("Default: ${Thread.currentThread().name}")
    }

    launch(newSingleThreadContext("MyThread")) {
        println("Own Thread: ${Thread.currentThread().name}")
    }
}