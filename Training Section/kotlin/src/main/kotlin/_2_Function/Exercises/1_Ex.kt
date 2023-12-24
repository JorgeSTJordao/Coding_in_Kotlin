package _2_Function.Exercises

fun dataTransformer(years: Int){
    println("$years years is the same as: ")
    println("${years*12} months")
    println("${years*12*30} days")
    println("${years*12*30*24} hours")
    println("${years*12*30*24*60} minutes")
    println("${years*12*30*24*60*60} seconds")
}

fun main() {
    val years: Int = 4
    dataTransformer(years)
}