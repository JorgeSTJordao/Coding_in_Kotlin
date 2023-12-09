package inheritance

open class Instrument1(var brand: String){

    fun play() {
        println("Playing...!Done")
    }
    fun tuneUp() {
        println("Tuning Up...!Done")
    }
}

class Drums1(brand: String): Instrument1(brand){
    fun Structure(){}
}
fun main() {

    var d: Drums1 = Drums1("Zildjian")

    d.play()
    d.tuneUp()

}