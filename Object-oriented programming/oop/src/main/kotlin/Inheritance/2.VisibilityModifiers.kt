package Inheritance

import kotlin.math.pow

open class Eletronic1(val os: String){

    private val minMemorySize = 2f.pow(30)

    fun powerOn(){ }

    protected fun powerOff(){}
}

class Phone1(os: String): Eletronic1(os){

    fun listenMusic(){}
}

fun main() {
    val p: Phone1 = Phone1("Android")

    p.powerOn()
    p.listenMusic()
}