package arrays

fun main() {
    val twoDArray = Array(2) { Array<Int>(2) {3}}
    println(twoDArray.contentDeepToString ())
}