package OOP

class Subject(var name: String){

    var maxNumberStudents = 30

    get(){
        println("- Get access")
        return field
    }
    set(value){
        println("- Set access")
        field = value
    }
}
fun main() {
    val math: Subject = Subject("math")
    println("First Acess")
    println(math.maxNumberStudents)

    println("\nSecond Acess")
    math.maxNumberStudents = 45
    println(math.maxNumberStudents)

}