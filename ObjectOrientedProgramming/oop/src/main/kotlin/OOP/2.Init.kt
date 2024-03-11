package OOP

class Animal(val name: String, val species: String){

    var speak: String? = null

    init {
        if (species == "cat")
            speak = "miau, miau"
        else if (species == "dog")
            speak = "au, au"
    }

    fun run(){
        println("Jack: $speak")
        println("Owner: run $name, run!")
    }

    fun walk(){
        println("Jack: $speak")
        println("Owner: keep walking my little $name")
    }
}
fun main() {
    val animal1: Animal = Animal("Jack", "cat")

    animal1.run()
    animal1.walk()
}


