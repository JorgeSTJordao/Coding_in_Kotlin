package OOP_Start

class StudentMember{
    lateinit var club: String

    fun choseClub(){
        club = "Chess Club"
    }

    fun enjoyClub(){
        if(!this::club.isInitialized){
            club = "Chess Club"
        }
    }
}

fun main() {
    var student1: StudentMember = StudentMember()
    student1.enjoyClub()
    println(student1.club)
}