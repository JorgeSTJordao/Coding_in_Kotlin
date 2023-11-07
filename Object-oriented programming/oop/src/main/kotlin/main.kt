class Person(var birthYear: Int, var name: String){

    var body: String = ""


    fun sleep(){
    }

    fun wake(){
    }
}

fun main() {
    // class - attributes and methods

    // class = object
    var person: Person = Person(2000, "Steve")

    person.name
    person.wake()
    person.sleep()
}