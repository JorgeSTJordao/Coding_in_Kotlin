package Decisions.Exercises
fun calculusPosition(dataJob: String, dataTime: Byte): Float{

    if (dataJob == "Gerente"){
        if (dataTime >= 2){
            return 3000f
        } else {
            return 2000f
        }
    }
    else if (dataJob == "Coordenador"){
        if (dataTime < 1){
            return 1500f
        } else {
            return 1800f
        }
    }
    else if (dataJob == "Engenheiro de Software") {
        return 1000f
    }
    else if (dataJob == "Estagiário") {
        return 500f
    }
    else {
        return 0f
    }
}
fun main() {
    val dataTime: Byte = 1
    val dataJob: String = "Gerente"
    val data = calculusPosition(dataJob, dataTime)
    println("O ${dataJob} deve receber R$${data}")
}