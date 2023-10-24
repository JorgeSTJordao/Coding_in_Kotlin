package `2`.Decisions.Exercises2

fun geometricShape(s1: Int, s2: Int, s3: Int){
    if(s1 == s2 && s2 == s3){
        print("Triângulo equilátero")
    }else{
        print("Triângulo não equilátero")
    }
}

fun main() {
    print("Digite o valor do 1º lado: ")
    val s1 = readLine()!!.toInt()
    print("Digite o valor do 2º lado: ")
    val s2 = readLine()!!.toInt()
    print("Digite o valor do 3º lado: ")
    val s3 = readLine()!!.toInt()

    geometricShape(s1, s2, s3)

}