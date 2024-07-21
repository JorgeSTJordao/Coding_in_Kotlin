package functions

fun helloWorld(){
    println("Hello everybody!")
}

fun div(preco: Int, parcelas: Int): Int{
    return preco/parcelas
}

fun main() {
    val preco: Int = 2800
    val parcelas: Int = 4
    helloWorld()
    println("O preco pode ser parcelado em $parcelas vezes, assim, tera que pagar ${div(preco, parcelas)} por mes ")
}