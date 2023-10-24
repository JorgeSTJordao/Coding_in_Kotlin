package Functions.Exercises

import com.sun.jdi.event.StepEvent

fun changeLetter(rooText: String): String{

    val textLowerCase = rooText.lowercase()
    return textLowerCase.replace("a", "x")
}

fun main() {
    val rooText: String = "Arpanet Gaimu was Aut"

    print("'${changeLetter(rooText)}'")
}