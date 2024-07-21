package couroutines.cancellation_and_timeouts

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun cancellCouroutine() = runBlocking{
    val job = launch {
        repeat(1000){
            println("Job: $it")
            delay(500L)
        }
    }
    delay(1300L)
    println("Main: Start!")
    job.cancel()
    job.join()
    println("Main: Finished!")
}