package couroutines.concurrency

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

fun compareWithoutCoroutines(n1: Int, n2: Int){
        try {
            (n1 + n2)
            (n1 - n2)
            (n1 * n2)
            (n1 / n2)
        } catch (e: Exception) {
            throw e
        }
}

suspend fun compareWithCoroutines(n1: Int, n2: Int) = coroutineScope {
    try {
        launch {
            (n1 + n2)
        }
        launch {
            (n1 - n2)
        }
        launch {
            (n1 * n2)
        }
        launch {
            (n1 / n2)
        }
    } catch (e: Exception) {
        throw e
    }

}