package `3`.Loop.Exercises

fun main() {

    println("Ascending Order")
    for (i in 1..50) {
        if (i % 5 == 0)
            continue

        print("${i} ")
    }
}