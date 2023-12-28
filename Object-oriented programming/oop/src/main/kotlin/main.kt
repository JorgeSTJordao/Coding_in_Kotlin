import OOP.School

class School(val yearFoundation: Int, var name: String){

    fun registerStudents(){
    }

    fun registerTeachers(){
    }
}


fun main() {
    val schoolX: School = School(1978, "RDA")
    println(schoolX.yearFoundation)
}