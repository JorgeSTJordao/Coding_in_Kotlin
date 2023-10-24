package `2`.Decisions.Exercises2

fun checkVariables(height: Int, length: Int){
    if (height == length){
        print("Lados iguais")
    }else{
        print("Lados diferentes")
    }
}

fun main() {
    print("Digite um valor: ")
    val height = readLine()!!.toInt()
    print("Digite um outro valor: ")
    val length = readLine()!!.toInt()

    checkVariables(height, length)
}