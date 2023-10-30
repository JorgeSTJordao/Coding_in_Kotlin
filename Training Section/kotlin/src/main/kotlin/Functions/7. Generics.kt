package Functions

fun main() {
    print(med(false, 9f, true, "data", "another"))

    arrayOf(2, 3, 5, 6, 2, 42f, false)
}

fun <T, J> med(abc: J, vararg grades: T): Float{
    var sum = 0f
    for (n in grades){
        if (n is Float){
            sum += n

        }
    }
    return (sum / grades.size)
}