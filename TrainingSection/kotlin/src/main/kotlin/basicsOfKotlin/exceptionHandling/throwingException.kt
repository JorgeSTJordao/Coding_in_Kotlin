package basicsOfKotlin.exceptionHandling

fun getWaterWeight(weight: Float): String{
    if(weight == 0f)
        throw IllegalArgumentException("Empty barrel")
    else if (weight > 0 && weight < 40)
        return "Low"
    return "Fine"
}

fun main(){
    val weight = 50f
    val result =  getWaterWeight(weight)
    println(result)
}