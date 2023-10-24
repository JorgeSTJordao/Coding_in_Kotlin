package Exceptions

fun main() {
    val str: String? = null
    // Check the right side if it's a null variable
    println(str ?: "Null")

    val age = 16
    val str2 = if (age >= 16) "You are older than me" else "You are younger than me"

}