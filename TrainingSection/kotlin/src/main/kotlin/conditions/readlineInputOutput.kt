package conditions

fun main() {
    var state = false

    while (!state) {
        print("Digite um número inteiro: ")

        val valor: String? =  readlnOrNull()

        try {
            valor?.let {
                println("Número selecionado: ${it.toInt()}")
                state = true
            }
        } catch (e: Exception) {
            println("${e.message}")
        }
    }
}