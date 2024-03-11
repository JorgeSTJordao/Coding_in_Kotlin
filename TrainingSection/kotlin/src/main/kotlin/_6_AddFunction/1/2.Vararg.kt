package _6_AddFunction.`1`

fun gradesSum(vararg grades: Float): Float{
    var tot = 0f
    for (elem in grades){
         tot += elem
    }
    return tot
}

fun main() {
    println(gradesSum(3.5f, 3.0f, 6.7f, 4.3f))
}