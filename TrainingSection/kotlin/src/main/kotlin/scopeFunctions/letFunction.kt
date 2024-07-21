package scopeFunctions

fun letFunction(variable: Int){
    var anotherVariable: Int? = null
    variable.let {
        try {
            anotherVariable = it.plus(4)
        }
        catch (e: Exception){
            println(e.message)
        }
    }
    println(anotherVariable)
    println(variable)
}