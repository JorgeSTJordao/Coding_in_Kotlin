package _3_Condition

fun main() {
    var estado = false

    while (!estado) {
        print("Digite um número inteiro: ")
        val valor: String? =  readlnOrNull()
        try {
            valor?.let {
                val numInt = it.toInt()
                println("O número selecionado foi $numInt")
                estado = true
            }
        } catch (e: Exception) {
            println("Valor nulo ou de tipo diferente")
        }
    }
}