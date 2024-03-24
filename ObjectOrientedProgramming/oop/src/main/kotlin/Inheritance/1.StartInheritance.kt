package Inheritance

enum class SuporteInstrumento(val suporte: String){
    PALETAS("paleta"),
    BAQUETAS("baquetas"),
    OUTROS("outros"),
    SEM("não tem")
}

open class Instrumento(){

    var nome = ""
    constructor(nome: String): this(){
        this.nome = nome
    }

    fun tocar(){
        println("Tocando")}

    fun afinar(){
        println("Afinando")}

    fun pararTocar(){
        println("Parando de tocar")
    }
}

class Guitarra(val recurso: SuporteInstrumento): Instrumento("guitarra")


class Bateria(val recurso: SuporteInstrumento): Instrumento("bateria")


fun main() {
    val bateria = Bateria(SuporteInstrumento.BAQUETAS)
    val guitarra = Guitarra(SuporteInstrumento.PALETAS)

    //Bateria
    guitarra.afinar()
    bateria.afinar()

    //Tocando
    bateria.tocar()
    bateria.pararTocar()
}