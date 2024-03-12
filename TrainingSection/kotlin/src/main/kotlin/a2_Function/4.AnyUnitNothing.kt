package a2_Function

fun functionAny(value: Any){
    println("Any is here")
}

fun functionUnit(value: String){
    println("Unit is here")
}

fun functionNothing(): Nothing{
    TODO("It's still missing something")
}

fun main() {
    val value = ""
    functionAny(value)
    functionUnit(value)
    functionNothing()
}