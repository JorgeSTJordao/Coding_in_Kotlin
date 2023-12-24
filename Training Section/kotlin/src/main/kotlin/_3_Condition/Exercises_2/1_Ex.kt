package _3_Condition.Exercises_2

fun compare(side1: Int, side2: Int, side3: Int): String{
    return if(side1 == side2 && side1 == side3){
        "Equilátero"
    } else if (side1 == side2 || side1 == side3 || side2 == side3){
        "Isósceles"
    } else
        "Escaleno"
}

fun main() {
    val side1 = readLine()
    val side2 = readLine()
    val side3 = readLine()

    if((side1 != null && side1 != "")
        && (side2 != null && side2!= "")
        && (side3 != null && side3 != ""))
        println(compare(side1.toInt(), side2.toInt(), side3.toInt()))
}