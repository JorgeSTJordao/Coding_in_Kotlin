package BeeCrowd._1_Beginners

import kotlin.math.pow
import kotlin.math.sqrt

fun quadraticFormula(xdouble: Float, x: Float, c:Float){
    val delta = x.pow(2f) - 4f*xdouble*c

    val x1 = (sqrt(delta) - x)/(2f*xdouble)
    val x2 = (sqrt(delta) + x)/(2f*xdouble)

    println("1th Solution ${x1}")
    println("2nd Solution ${x2}")
}
fun main() {
    print("First value: ")
    val x_double = readln()!!.toFloat()

    print("Second value: ")
    val x = readln()!!.toFloat()

    print("Third value: ")
    val c = readln()!!.toFloat()

    if (x_double == 0f || x == 0f || c == 0f)
        println("Not possible calculate it")
    else
        quadraticFormula(x_double, x, c)
}