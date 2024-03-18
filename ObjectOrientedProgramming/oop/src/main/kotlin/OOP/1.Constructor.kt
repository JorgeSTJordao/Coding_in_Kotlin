package OOP

class Triangle(val id: Int, val hight: Int, val lenght_: Int){

    var area = 0
    constructor(id: Int, hight: Int, lenght_: Int, area: Int): this(id, hight, lenght_){
        this.area = area
    }

    fun area(): Int{
        if (area == 0){
            area = (hight*lenght_)/2
            return area
        }
        return area
    }
}

fun main() {
    val triangle1: Triangle = Triangle(1, 2, 5)
    val triangle2: Triangle = Triangle(2, 3, 3, 9)

    println(triangle1.area())
}