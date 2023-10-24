package `1`.`1Functions`.Exercises

fun conversionDistance(milesQtde: Float): Float{
    return (milesQtde*1.6f)
}

fun main() {
    var milesQtde: Float = 1f
    val result: Float

    result = conversionDistance(milesQtde)
    print("${milesQtde} miles is eqquals to ${result} km")
}