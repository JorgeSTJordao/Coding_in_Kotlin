package Inheritance

open class Eletronic(private val os: String){

    private var tamanhoRAM = "Tamanho de memória RAM: 8 GB"

    fun ligar(): Boolean{
        return true
    }

    open fun desligar(): Boolean{
        return false
    }
}

class Celular(os: String): Eletronic(os){

     fun ouvirMusica(){
         println("Você está ouvindo Simple Plan agora")
     }

    //Sobrescrever a função
    override fun desligar(): Boolean{
        //Chamando a função pai (herança)
        println("Desligando celular")
        val estado = super.desligar()
        return estado
    }
}

fun main() {
    val p1: Celular = Celular("Android")
    val p2: Celular = Celular("iOS")

    p1.ligar()
    p1.ouvirMusica()
    p1.desligar()
}