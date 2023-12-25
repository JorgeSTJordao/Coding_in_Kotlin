package _4_Loop._Exercises

fun main() {
    var volume = 1995
    val variation = 7
    var unit = 0


    while (volume >= variation){
        volume -= variation
        ++unit
        //print("$volume ")
    }

    if (volume == 0){
        print("Todo o galão foi preenchido com $unit unidades")
    }else{
        print("Ainda ficaram em falta $volume L para preencher o galão. Mas o resto precisou de $unit unidades")
    }
}