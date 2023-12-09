package inheritance

private class X2

open class Instrument2(var brand: String){

    private fun emitSound() {}

    fun play() {
        println("Playing...!Done")
        emitSound()
    }
    fun tuneUp() {
        println("Tuning Up...!Done")
    }
}

class Drums2(brand: String): Instrument2(brand){
    fun Structure2(){}
}
fun main() {

    var d: Drums2 = Drums2("Zildjian")

    d.play()
    d.tuneUp()

}