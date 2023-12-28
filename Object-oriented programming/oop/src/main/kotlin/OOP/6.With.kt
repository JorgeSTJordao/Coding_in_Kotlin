package OOP

fun main() {
    //U can find Animal class in file "2.Init.kt"
    val animal: Animal = Animal("dog")

    with(animal){
        run()
        walk()
    }
}