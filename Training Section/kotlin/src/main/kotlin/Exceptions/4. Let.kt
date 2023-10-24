package Exceptions

fun main() {
    val str: String? = null

    if (str != null){
        str.lowercase()
        str.length
    }

    str?.let {
        //body
        // The variable name is called "it"
        it.uppercase()
        it.length
    }
}