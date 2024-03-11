package _5_Exceptions

fun main() {

    //Now we're dealing with null values. The "?" modifier will be used in this situation
    val variable: String? = null
    println(variable?.length)


    val anotherVariable = readLine()
    println(anotherVariable?.length)
}