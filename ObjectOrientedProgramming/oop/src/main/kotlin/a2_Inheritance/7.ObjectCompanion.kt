package a2_Inheritance

class Matematica {

    //A medida que chama a classe, o valor somado no interior dela vai aumentando no
    // decorrer do tempo
    companion object {
        var binAtual = -1

        fun valorBinario(): Double{
            binAtual += 1
            val nextBin = Math.pow(2.0, binAtual.toDouble())

            return nextBin
        }
    }

}

fun main() {
    for (i in 0..10){
        println(Matematica.valorBinario())
    }
}