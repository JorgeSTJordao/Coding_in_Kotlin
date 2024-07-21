package conditions.exercises

fun bonusPlusYears(position: String, years: Int) {
    if (position.lowercase() == "manager") {
        if (years < 2)
            println("The manager will get a bonus worthing R$2000.00")
        else
            println("The manager will get a bonus worthing R$3000.00")
    } else {
        if (years < 1)
            println("The coordinator will get a bonus worthing  R$1500.00")
        else
            println("The coordinator will get a bonus worthing  R$1800.00")
    }
}
fun bonusWithoutYears(position: String) {
    if (position.lowercase() == "software engineering")
        println("The software engineering will get a bonus worthing  R$1000.00")
    else
        println("The intern will get a bonus worthing  R$500.00")
}

fun main() {
    val position = "Manager"
    val years = 2

    if(position.lowercase() == "manager" || position.lowercase() == "coordinator"){
        bonusPlusYears(position, years)

    }else{
        bonusWithoutYears(position)
    }
}