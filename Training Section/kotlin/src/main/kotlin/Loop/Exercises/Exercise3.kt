package Loop.Exercises

fun main() {
    var sum: Int = 0

    for (i in 1..500) {
        sum += i
        println("${sum}")
    }
}