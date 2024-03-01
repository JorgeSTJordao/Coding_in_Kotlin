package OOP

class School(val yearFoundation: Int, var name: String){

    //Properties
    var doc: String? = null

    constructor(yearFoundation: Int, name: String, doc: String) : this(yearFoundation, name){
        //this = is the object
        this.doc = doc
    }

    //Methods
    fun registerStudents(){
    }

    fun registerTeachers(){
    }
}

class PrivateClass private constructor()

fun main() {
    val schoolX: School = School(1978, "RDA","e21e2121")
    println(schoolX.yearFoundation)

    schoolX.registerTeachers()
    schoolX.registerStudents()
    println(schoolX.doc)


}