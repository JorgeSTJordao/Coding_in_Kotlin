package functions.Exercises

import kotlin.math.pow

fun powerNumber(base: Float, exponent: Int) = base.pow(exponent)
fun main() {
    val base: Float = 4f
    val exponent: Int = 3
    println(powerNumber(base, exponent))
}