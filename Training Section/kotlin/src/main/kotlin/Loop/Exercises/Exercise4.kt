package `3`.Loop.Exercises

fun main() {

    print("Type the stairs number: ")
    val num = readLine()

    if (num != null && num != "") {
        val numStairs = num.toInt()
        for (i in 1..numStairs){
            for (j in 1..i)
                print("#")
            print("\n")
        }
    }
}