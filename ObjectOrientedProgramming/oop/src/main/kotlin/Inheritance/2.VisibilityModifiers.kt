package Inheritance

open class Eletronic1(val os: String){

    val memorySizeRAM = "RAM memory size: 8 GB"
    //private val shapePhone = "Rectangle"
    protected val shapePhone = "Rectangle"

    fun powerOn(){
        println("The cell phone was turned on")
    }

    fun powerOff(){
        println("The cell phone was turned off")
    }
}

class Phone1(os: String): Eletronic1(os){

     fun listenMusic(){
         println("You're listening Simple Plan right now")
     }
}

fun main() {
    val p: Phone1 = Phone1("Android")

    p.powerOn()
    println(p.memorySizeRAM)
    p.listenMusic()
    p.powerOff()
}