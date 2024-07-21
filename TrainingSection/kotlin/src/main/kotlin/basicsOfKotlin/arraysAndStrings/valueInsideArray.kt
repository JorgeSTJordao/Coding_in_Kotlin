package basicsOfKotlin.arraysAndStrings

fun main(){
    val cars = arrayOf("Ford", "BMW", "Toyota", "Volvo")
    println(cars.contains("Ford"))
    println(cars.any{ car -> car == "Ford"})
}