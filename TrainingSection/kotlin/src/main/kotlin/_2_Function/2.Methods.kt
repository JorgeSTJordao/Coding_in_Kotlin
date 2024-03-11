package _2_Function

fun div2(preco: Int, parcelas: Int) = (preco/parcelas)

fun main() {
    val preco: Int = 2800
    val parcelas: Int = 4
    println("O preco pode ser parcelado em $parcelas vezes, assim, tera que pagar ${div2(preco, parcelas)} por mes ")
}