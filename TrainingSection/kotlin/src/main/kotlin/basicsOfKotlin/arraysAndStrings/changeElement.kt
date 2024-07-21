package basicsOfKotlin.arraysAndStrings

fun main(){
    val cars = arrayOf("Ford", "BMW", "Toyota")
    cars[1] = "Hyundai"
    println(cars.joinToString(", "))
}