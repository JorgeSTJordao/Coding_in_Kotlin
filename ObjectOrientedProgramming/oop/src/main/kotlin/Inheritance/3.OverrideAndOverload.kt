package Inheritance

open class Eletronic2(val os: String){
    
    fun powerOn(){ }

    //It must be an opened function
    open fun powerOff(){ }
}

class Phone2(os: String): Eletronic2(os){

    fun listenMusic(){ }

    fun closeApplication(){}

    override fun powerOff(){
        closeApplication()
        super.powerOff()
    }
}

fun main() {
    val p: Phone2 = Phone2("Android")

    p.powerOn()
    p.listenMusic()
}