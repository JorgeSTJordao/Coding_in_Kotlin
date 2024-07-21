package couroutines.concurrency

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun sumTwo(n1: Int, n2: Int) = runBlocking {
    val deferred: Deferred<Int> = async {
        delay(1000L)
        n1 + n2
    }

    deferred.await().also {
        println("Result: $it")
        println("Inserting data in database")
        delay(100L)
        println("User doing other things...")
        delay(5000L)
        println("Data inserted")
    }

}