package OOP_Start

class Person2(val birthYear: Int, var name: String){

    var gender : String? = null
    constructor(birthYear: Int, name: String, gender : String): this(birthYear, name){
        this.gender = gender
    }

    fun sleep(){
    }

    fun wake(){
    }
}

//class Empty private constructor()

fun main() {
    // class - attributes and methods
    // class = object

    var person: Person2 = Person2(2000, "Steve", "male")

    //this == it's associated to the project

    person.name
    person.wake()
    person.sleep()
    person.gender
}