package Inheritance

//os: Operating System

open class Eletronic(val os: String){
    fun powerOn(){}

    fun powerOff(){}
}

class Phone(os: String): Eletronic(os){
    fun listenMusic(){}
}

fun main() {
    val p: Phone = Phone("Android")

    p.powerOn()
    p.listenMusic()
    p.powerOff()
}