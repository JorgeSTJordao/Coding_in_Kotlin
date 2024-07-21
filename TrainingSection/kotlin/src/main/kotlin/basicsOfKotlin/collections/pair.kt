package basicsOfKotlin.collections

//create quickly a pair or triple

fun main() {
    val name = "Kotlin"
    val favorite = "Java"

    val resultPair = Pair(name, favorite)
    val resultList = resultPair.toList()
    println(resultPair)
    println(resultList)

    repeat(15) { print("-") }
    println()

    println(resultPair.toList()) // Pair -> List
    println(resultList.zipWithNext()) //List -> List<Pair>
}