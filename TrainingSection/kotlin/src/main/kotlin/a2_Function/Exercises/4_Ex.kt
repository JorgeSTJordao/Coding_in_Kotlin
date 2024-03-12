package a2_Function.Exercises

import kotlin.math.round

fun conversion(number: Float) = (number * 1.6)

fun main() {
    val number: Float = 3f
    println(" $number miles is the same as ${round(conversion(number))} km")
}
