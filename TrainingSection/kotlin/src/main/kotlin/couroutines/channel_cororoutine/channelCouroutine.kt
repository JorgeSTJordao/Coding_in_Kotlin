package couroutines.channel_cororoutine

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun channelCouroutine() = runBlocking {
    val channel = Channel<String>()

    launch {
        channel.send("First")
        println("data1")
        delay(1000L)
        channel.send("Second")
        println("data2")
        delay(1000L)
        channel.close()
    }

    launch {
        channel.consumeEach {
            println(it)
        }
        delay(1000L)
        println("finished channel")
    }
}
