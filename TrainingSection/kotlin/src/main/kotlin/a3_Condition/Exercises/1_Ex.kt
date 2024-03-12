package a3_Condition.Exercises

fun bonus(position: String){
    return if (position.lowercase() == "manager"){
        println("The manager will get a bonus worthing R$2000.00")
    } else if (position.lowercase() == "coordinator"){
        println("The coordinator will get a bonus worthing  R$1500.00")
    }else if (position.lowercase() == "software engineering"){
        println("The software engineering will get a bonus worthing  R$1000.00")
    } else {
        println("The intern will get a bonus worthing  R$500.00")
    }
}

fun main() {
    val position = "Manager"
    bonus(position)
}