package exceptions

fun main() {
    val variable: String? = null

    variable?.let{
        println(variable.length)
    }
}