package `3`.Loop

fun main() {

    var j: Int = 0

    while (j <= 100){

        if (j < 50) {
            j++
            continue
        }

        if (j == 75)
            break

        print("${j} ")
        j++
    }
}