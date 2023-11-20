package OOP_Start

class Position(var namePosition: String){

    var speak: String = ""
    init {
        if (namePosition == "manager"){
            speak = "Hello, everyone!"
        }
        else if (namePosition == "employee"){
            speak = "Hello, sir and everyone!"
        } else {
            speak = "ZZZ"
        }
    }

    fun speaking(){
        println(speak)
    }
}

fun main() {
    var worker = Position("manager")
    worker.speaking()
}