package BeeCrowd._1_Beginners

//Formula (V = 4/3*PI*R^3)

import kotlin.math.PI
import kotlin.math.pow

class Sphere(radius: Float){
    val r = radius

    init {
        println("The radius value is ${radius}")
    }

    fun volume() = "V = ${4f/3*PI*(r.pow(3))} cm3"
}

fun main() {
    val sphere: Sphere = Sphere(5.6f)
    println(sphere.volume())
}