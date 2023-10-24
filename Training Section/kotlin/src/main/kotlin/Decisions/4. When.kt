package `2`.Decisions

fun positionChoice(choice: String): Float {
    return if (choice == "Gerente"){
        2000f
    }
    else if (choice == "Coordenadores"){
        1500f
    }
    else if (choice == "Engenheiros de Software"){
        1000f
    }
    else if (choice == "Estagiários"){
        500f
    }
    else {
        0f
    }
}

fun bonusWhen(cargo: String): Float{
    return when (cargo){
        "Gerente" ->  2000f
        "Coordenador" -> 1500f
        "Engenheiro de Software" -> 1000f
        "Estagiário" -> 500f
        else -> 0f
    }
}

fun main() {
    val dataPerson: String = "Gerente"
    var dataSalary = positionChoice(dataPerson)
    println("O salário do ${dataPerson} será de R$${dataSalary}")
}