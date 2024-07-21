package arrays

fun main() {
    var set_: Set<Int> = setOf(1, 2, 3, 4, 4, 6, 2, 2)
    var set_2: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 4, 6, 2, 2)

    println(set_ == set_2)

    //Adding element
    set_2.add(7)
    println(set_2)
}