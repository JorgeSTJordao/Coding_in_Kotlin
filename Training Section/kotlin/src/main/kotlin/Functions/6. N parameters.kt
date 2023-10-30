package Functions

fun main() {
    print(media(7f, 9f))
}

fun media(vararg grades: Float): Float{
    var sum = 0f
    for (n in grades){
        sum += n
    }
    return (sum / grades.size)
}