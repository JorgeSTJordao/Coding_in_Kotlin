package basicsOfKotlin.collections

/*
Array vs List

Array:
- Fixed Sized
- immutableArray: unable to update items
- mutableArray: able to update items

List:
- Size changeable
- immutable lists: do not have 'add' function
- mutable lists: update items and change size
 */

fun main(){
    //People -> each score for my application according to the user
    val listPeople = listOf("Jason", "Ellie", "Courtney", "Zordon")
    val listNumbers = listOf(5, 2, 2, 3)
    listNumbers.any {number -> number == 3}

    //operations
    //number of elements
    println("There are " + listNumbers.count() + " elements")

    //biggest number
    println("The biggest number is " + listNumbers.max())

    //filter list by a condition (boolean)
    println(listNumbers.filterIndexed {index, item -> index == item})

    //create a dict
    println(listNumbers.mapIndexed { index, item -> listPeople[index] to item })
}