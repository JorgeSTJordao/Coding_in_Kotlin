package arrays

fun main() {
    val list_1:  List<Any> = listOf(1, 2, 3, 4, 5)
    val list_2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    //Checking an element by the index
    println(list_2[0])
    //Last element
    println(list_2[list_2.size - 1])

    //Adding element and removing it
    list_2.add(3)
    list_2.removeAt(0)
    println(list_2)
}