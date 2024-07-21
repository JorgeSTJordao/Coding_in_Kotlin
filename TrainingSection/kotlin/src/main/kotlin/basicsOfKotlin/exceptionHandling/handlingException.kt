package basicsOfKotlin.exceptionHandling

fun main(){
    try {
        val value = 10
        if (value is Int)
            println(value/0)
        else if (value == 0){
            println(value/0)
        }
    } catch (e: ArithmeticException){
        println(e.message)
    }
}