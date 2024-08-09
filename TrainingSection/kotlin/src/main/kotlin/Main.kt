
import couroutines.asynchronous_flow.flowFunction
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.runBlocking


fun printData(data: String) = data


fun main() = runBlocking {
    flowFunction().collectLatest {
        println(it)
    }
}