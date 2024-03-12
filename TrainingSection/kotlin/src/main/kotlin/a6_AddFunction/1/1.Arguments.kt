package a6_AddFunction.`1`

fun address(street: String, city: String, state: String = "Nevada"){
    println("$state | $city | $street")
}

fun main() {
    address("X Street", "Las Vegas")
}