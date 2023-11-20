package OOP_Start

class Animal(var species: String){
    var speak: String = ""
        get(){
            println("Get access")
            return field
        }
        set(value){
            println("Set access")
            field = value
        }
}
fun main() {
    //println(Animal("dog").fala)

    var a = Animal("dog")
    a.speak = "auuuu"
}