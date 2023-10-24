package `1`.`1Functions`.Exercises

fun strLen(data: String) = data.length

fun main() {
    val data: String = "Hello, News Guys"
    val dataLen: Int

    dataLen = strLen(data)
    println("The the text '${data}' has ${dataLen} letters")
}