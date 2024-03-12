package a8_LambdaFunction

//variavel = {parâmetro: tipo -> corpo}
val potencia = {valor: Double -> Math.pow(2.0, valor)}

fun main() {
    //Valor potência de base 2
    print("Digite um número inteiro positivo: ")
    val expoente = readLine()?.toDoubleOrNull()

    expoente?.let{
        println(potencia(it))
    }
}