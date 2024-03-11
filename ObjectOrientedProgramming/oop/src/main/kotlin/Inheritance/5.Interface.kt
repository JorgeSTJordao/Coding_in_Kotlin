package Inheritance
//os: Operating System

interface Expensive {
    fun reducePrice(){}
}

open class Eletronic5(val os: String){
    fun powerOn(){}

    fun powerOff(){}
}

class Phone5(os: String): Eletronic5(os), Expensive{
    fun installApplication(){}

    override fun reducePrice() {
        super.reducePrice()
    }
}

fun main() {
    val p: Phone5 = Phone5("Android")

    p.powerOn()
    p.powerOff()
}