package BeeCrowd._1_Beginners

fun media(grades: List<Int>, weights: List<Float>): Float{
    return (grades[0]*weights[0] + grades[1]*weights[1])/(weights[0]+weights[1])
}

fun main() {
    val grades: List<Int> = listOf()
    val weights: List<Float> = listOf(4.0f, 6.0f)

    do {
        try {
            print("Type your ${grades.size + 1} th grade: ")
            var grade: Int? = readLine().toInt()


        } catch (e: Exception){
            println("Denid! Try again")
        }

    }while (grades.size != weights.size)

    val tot_media = media(grades, weights)
    println("Your media is $tot_media")

}