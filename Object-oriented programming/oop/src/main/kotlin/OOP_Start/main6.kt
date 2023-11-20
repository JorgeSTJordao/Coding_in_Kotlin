package OOP_Start

fun main() {
    val student1: Student = Student(10, "English")
    val student2: Student = Student(15, "Physics")

    print("Student...\n")
    println(student1.toString())
    println(student1.hashCode())
    println("\nOther student...")
    println(student2.toString())
    println(student2.hashCode())
    println(student1.equals(student2))
}

class Student(val age: Int, val subject: String)/*{
    override fun equals(other: Any?): Boolean {
        return if (other is Student){
            (other.age == this.age && other.subject == this.subject)
        } else {
            false
        }
    }

    override fun toString(): String {
        return "Object instances: $age years && $subject as your subject"
    }
}*/
data class SuperStudent(val age: Int, val subject: String){}

data class Address(val street: String, val zipCode: String, val city: String)
fun address(e: Address){}