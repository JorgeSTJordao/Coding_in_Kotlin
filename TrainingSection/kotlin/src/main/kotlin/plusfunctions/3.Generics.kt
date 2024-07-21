package plusfunctions

fun <T> gradesSum1(vararg grades: T): Float{
    var soma = 0f
    for (elem in grades){
        if (elem is Float)
            soma += elem
    }
    return soma
}

fun main() {
    println(gradesSum1("Peter", "Stark", 3.5f, 3.0f, false, 3, 2.0f))
}