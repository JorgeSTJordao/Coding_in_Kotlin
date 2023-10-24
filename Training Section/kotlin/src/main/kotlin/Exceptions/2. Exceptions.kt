package `4`.Exceptions

fun main() {

    try{

        var s: String? = null
        println(s!!.length)

    }catch (e: NullPointerException){
        println("Null variable")
    }catch (e: ArithmeticException){
        println("Division by 0 is impossible")
    }finally{
        println("Finally!")
    }

    println("End.")
}