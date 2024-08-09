package couroutines.asynchronous_flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

fun flowFunction(): Flow<Int> = flow {
    for (i in 1..3){
        delay(1000L)
        emit(i)
    }
}