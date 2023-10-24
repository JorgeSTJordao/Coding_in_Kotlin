package `1`.`1Functions`.Exercises

import kotlin.math.pow

fun thirdPower(number: Short) = Math.pow(number.toDouble(), 3.toDouble())
fun main() {
    val number: Short = 2
    val result: Double

    result = thirdPower(number)
    print("Answer: ${result}")
}