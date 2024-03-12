package a5_Exceptions

fun main() {
    val variable: String? = null

    variable?.let{
        println(variable.length)
    }
}