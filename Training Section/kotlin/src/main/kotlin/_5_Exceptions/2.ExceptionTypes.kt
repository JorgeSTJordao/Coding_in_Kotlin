package _5_Exceptions

fun main() {
    try {
        val num = 15
        println(num/0)
    } catch (e: ArithmeticException){
        println("Division by zero is impossible")
    } finally {
        println("I don't know what's the Exception here")
    }
}