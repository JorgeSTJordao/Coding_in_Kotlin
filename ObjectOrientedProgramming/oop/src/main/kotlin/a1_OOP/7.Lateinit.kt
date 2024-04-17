package a1_OOP

class Produto(val nome: String, val preco: Float, var estoque: Int){

    lateinit var situacaoDesconto: String
    var desconto: Float

    init{
        desconto = if(estoque >= 100) {
            preco / 2
        } else {
            0f
        }
    }

    fun valorDesconto(){
        if (desconto != 0f) {
            situacaoDesconto = "O produto ${nome.lowercase()} está com R$ $desconto de desconto!"
            println(situacaoDesconto)
        } else {
            situacaoDesconto = "O produto ${nome.lowercase()} não tem desconto"
            println(situacaoDesconto)
        }
    }


}

fun main() {
    val produto1 = Produto("Arroz", 5f, 100)
    produto1.valorDesconto()
}