package a4_Loop

fun main() {
    val cost = 1000

    for (worker in 1..cost)
        if ((worker * 100) >= cost)
            break

}
