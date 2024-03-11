package BeeCrowd._1_Beginners

fun main() {
    val weight1 = 3.5f
    val weight2 = 7.5f

    //Grades
    // We'll use "?" for a safe call
    print("Type the 1st grade: ")
    val value1 = readLine()!!.toDouble()

    print("Type the 2nd grade: ")
    val value2 = readLine()!!.toDouble()

    val averageWeighted: Double

    averageWeighted = (weight1*value1 + weight2*value2)/(weight1 + weight2)
    println("The weighted average grades is ${averageWeighted}")
}