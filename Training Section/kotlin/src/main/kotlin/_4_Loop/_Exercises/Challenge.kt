package _4_Loop._Exercises

fun calculusPatrimony(patrimony: Float, income: Float, insideCompany: Boolean): Float{
    val balance = 0.05f * 10000

    if (insideCompany){
        val tot = (balance*2 + patrimony)*income
        return tot + balance*2
    }
    val tot = (balance + patrimony)*income
    return tot + balance
}


fun main() {
    var months = 0

    val incomeAna = 0.002f
    val incomePaula = 0.008f

    var patrimonyAna = 0f
    var patrimonyPaula = 0f


    do {
        patrimonyAna = calculusPatrimony(patrimonyAna, incomeAna, true)
        patrimonyPaula = calculusPatrimony(patrimonyPaula, incomePaula, false)

        months++

    }while(patrimonyAna > patrimonyPaula)

    println(patrimonyAna)
    println(patrimonyPaula)
    println(months)
}