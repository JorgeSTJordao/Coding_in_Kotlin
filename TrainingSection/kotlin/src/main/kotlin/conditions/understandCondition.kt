package conditions

fun main() {
    val num: Byte = Byte.MAX_VALUE
    val num1: Int = 14

    println(num)
    if (num <= num1){
        println("It's less than or equal to $num1")
    }
    else{
        println("It's greater than $num1")
    }
}