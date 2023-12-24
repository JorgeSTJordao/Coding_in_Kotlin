package _4_Loop._Exercises

fun main() {
    val volume = 2000
    var variation = 7
    var unit = 0

    variation += variation

    while (volume >= variation){
        ++unit
        variation += variation
        println(variation)
    }

    print("Serão necessários $unit unidades")
}