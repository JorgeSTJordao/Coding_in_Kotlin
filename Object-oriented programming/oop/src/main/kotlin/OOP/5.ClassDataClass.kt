package OOP

fun main() {
    val f1: FormData = FormData(10, 8)
    var f2: FormData

    f2 = f1.copy(50)

    //Methods
    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("\n")
    println(f2.equals(f2))
    println(f2.toString())
    println(f2.hashCode())
}

class Form_(val a: Int, val b: Int)
data class FormData(val a: Int, val b: Int)
