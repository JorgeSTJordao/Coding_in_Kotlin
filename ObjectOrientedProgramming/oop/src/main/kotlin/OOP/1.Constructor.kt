package OOP

class School(val id: Int, var name: String){

    //Attributes
    //In the class the attribute must have a value (it can be null)
    var yearFoundation: Int? = null

    constructor(id: Int, name: String, yearFoundation: Int) : this(id, name){

        //this = the object
        this.yearFoundation = yearFoundation

        if (yearFoundation < 1985)
            println("Old-school")
        else
            println("New School")
    }

    //Methods
    fun registerTeachers(){
    }

}

class PrivateClass private constructor()

fun main() {
    val schoolX: School = School(1, "RDA",1985)

    //Name and year foundation
    println(schoolX.id)
    println(schoolX.yearFoundation)

    //Methods
    schoolX.registerTeachers()



}