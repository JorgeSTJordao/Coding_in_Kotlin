package Decisions
// Input | Output
fun main() {

    var sumAna:  Float = 0f
    var sumPaula: Float = 0f
    val salAna: Int = 10000
    val salCompany: Int = salAna
    val salPaulo: Int = 10000
    var monthsTime: Int = 0

    do{
        sumAna += (0.02*(0.05*salAna + 0.05*salCompany)).toFloat()
        sumPaula += (0.08*(0.05*salAna)).toFloat()

        monthsTime++

    }while(sumAna > sumPaula)

    print("Paula is going to take ${monthsTime} months to pass Ana")
}