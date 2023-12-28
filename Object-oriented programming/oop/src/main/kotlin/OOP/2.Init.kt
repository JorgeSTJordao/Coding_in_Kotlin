package OOP

class Animal(val species: String){

    var speak: String = ""
    init {
        if (species == "cat")
            speak = "miau"
        else if (species == "dog")
            speak = "au"
    }

    fun run(){

    }

    fun walk(){

    }
}

fun main() {
    Animal("Jack")
}


