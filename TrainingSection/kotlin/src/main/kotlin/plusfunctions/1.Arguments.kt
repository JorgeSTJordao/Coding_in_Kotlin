package plusfunctions

fun address(street: String, city: String, state: String = "Nevada"){
    println("$state | $city | $street")
}

fun main() {
    address("X Street", "Las Vegas")
}