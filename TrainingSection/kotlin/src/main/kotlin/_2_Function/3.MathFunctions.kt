package _2_Function

import kotlin.math.*

fun main() {
    val string = "hi there"


    println(string.length)

    println(string[0])

    println(string.startsWith("He"))

    println(string.endsWith("body"))

    println(string.substring(0, string.length-1))

    println(string.replace(" ", "_"))

    println(string.uppercase())

    println(string.lowercase())

    println("      $string        ".trim())
}