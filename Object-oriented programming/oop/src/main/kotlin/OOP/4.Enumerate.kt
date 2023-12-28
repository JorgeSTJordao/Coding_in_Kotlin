package OOP

enum class AnimalEnum(val id: Int){
    Grasshopper(1){
        override fun toString(): String {
            return "Priority ID $id"
        }
                  },
    Rabbit(2),
    Bird(3),
    Dog(4),
    Horse(5)
}

fun main() {
    for (animal in AnimalEnum.entries){
        println(animal)
    }
}