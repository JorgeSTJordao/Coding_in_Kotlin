//class and attributes
class School (val yearFoundation: Int, val name: String){

    //methods
    fun registerStudents(){
        println("${yearFoundation}")
    }
    fun registerTeachers(){
    }
}

fun main() {
    val schoolX: School = School(1978, "RDA")
    println(schoolX.yearFoundation)
}