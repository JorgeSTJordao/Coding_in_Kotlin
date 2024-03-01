package BeeCrowd._1_Beginners

class Interval(value: Float){
    val v = value

    init {
        println("You chose ${v}")
    }
    fun compare(): String {
        if (v >= 0f && v <= 25f) return "between 0 and 25"
        else if (v > 25f && v <= 50f) return "between 25 and 75"
        else if (v > 50f && v <= 75f) return "between 50 and 75"
        else if (v > 75f && v <= 100f) return "between 75 and 100"
        else return "nothing"
    }

}

fun main() {
    val interval1: Interval = Interval(-0.00001f)
    println(interval1.compare())
}