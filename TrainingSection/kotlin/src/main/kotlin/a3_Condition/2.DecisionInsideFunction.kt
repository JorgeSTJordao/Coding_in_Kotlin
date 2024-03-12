package a3_Condition

fun sick(temperature: Float){
    if(temperature < 36.0f){
        println("You're sick")
    }
    else if(temperature >= 38.0){
        println("You're about do die")
    }else {
        println("It's everything with you")
    }
}

fun main() {
    val temperature: Float = 35.999f

    sick(temperature)
}