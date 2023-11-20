package inheritance

open class Instrument(var brand: String){
    fun play() {
        println("Playing...!Done")
    }
    fun tuneUp() {
        println("Tuning Up...!Done")
    }
}

class Drums(brand: String): Instrument(brand){
    fun Structure(){} 
}
fun main() {

    var d: Drums = Drums("Zildjian")

    d.play()
    d.tuneUp()

}