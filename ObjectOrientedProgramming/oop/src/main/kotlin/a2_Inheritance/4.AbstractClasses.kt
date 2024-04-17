package a2_Inheritance

abstract class Poligonos{

    val tipo = "Poligono"

    abstract fun area(l: Int): String

}

class Quadrado(): Poligonos(){
    override fun area(l: Int): String{
        val areaString = "${l*l} cm2"
        return areaString
    }
}

fun main() {
    val quadrado1 = Quadrado()
    println(quadrado1.area(5))
}