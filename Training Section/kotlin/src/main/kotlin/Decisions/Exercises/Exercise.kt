package `2`.Decisions.Exercises

fun positionChoice(choice: String): Float {
    if (choice == "Gerente"){
        return 2000f
    }
    else if (choice == "Coordenadores"){
        return 1500f
    }
    else if (choice == "Engenheiros de Software"){
        return 1000f
    }
    else if (choice == "Estagiários"){
        return 500f
    }
    else {
        return 0f
    }

}
fun main() {
    val dataPerson: String = "Gerente"
    var dataSalary = positionChoice(dataPerson)
    println("O salário do ${dataPerson} será de R$${dataSalary}")
}