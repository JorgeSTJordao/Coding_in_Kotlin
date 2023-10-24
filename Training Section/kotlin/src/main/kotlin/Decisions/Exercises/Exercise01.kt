package Decisions.Exercises

/*
It's going to return the last character of String sequence
 */
fun lastLetter(data: String): Char {

    if (data.length >= 2){
        return data[data.length - 1]
    } else {
        return data[0]
    }

}

fun main() {
    val data: String = "I love the Graph Theory"
    val lastData: Char

    lastData = lastLetter(data)
    println("${lastData}")
}