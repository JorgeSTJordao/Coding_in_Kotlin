package _7_Arrays

fun main() {

    //Key: Costumer name | Value:  Age
    val map_ = mapOf<String, Int>(Pair("Ana", 25), Pair("Pierre", 41), Pair("Peter", 53))

    //Costumers name
    println(map_.keys)
    println(map_.get("Ana") == map_["Ana"])
}