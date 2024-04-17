package a2_Inheritance

interface Employee{
    var salary: Float
    fun bonus(): Float
}

class Manager(override var salary: Float): Employee{
    override fun bonus(): Float {
        return salary*0.6f
    }
}

class Analyst(override var salary: Float): Employee{
    override fun bonus(): Float {
        return salary*0.5f
    }
}

fun showBonus(emply: Employee){
    println(emply.salary)
}
fun main() {
    showBonus(Manager(2000f))
    showBonus(Analyst(500f))
}