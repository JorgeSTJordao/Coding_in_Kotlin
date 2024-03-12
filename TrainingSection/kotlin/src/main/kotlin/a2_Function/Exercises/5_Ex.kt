package a2_Function.Exercises

fun replaceLetters(text: String): String{
    val newText = (text.lowercase()).replace("a", "x")
    return newText
}

fun main() {
    val text: String = "Update Nowadays"
    println(replaceLetters(text))
}