package _4_Loop._Exercises

import kotlin.math.pow

fun calculusPatrimony(patrimony: Float, income: Float, insideCompany: Boolean, months: Int): Float{
    val balance = 0.05f * 10000

    if (insideCompany){
        return (balance*2 + patrimony)*(1 + income).pow(months)
    }
    return (balance + patrimony)*(1 + income).pow(months)
}


fun main() {
    var months = 0

    //INCOME
    val incomeAna = 0.002f
    val incomePaula = 0.008f

    //PATRIMONY
    var patrimonyAna = 0f
    var patrimonyPaula = 0f

    //DIFFERENCE
    var month = 0
    var max = 0f

    println("          ANA | PAULA")
    do {
        months++

        patrimonyAna = calculusPatrimony(patrimonyAna, incomeAna, true, months)
        patrimonyPaula = calculusPatrimony(patrimonyPaula, incomePaula, false, months)

        println("Month $months: $patrimonyAna | $patrimonyPaula | Proportion: ${patrimonyAna/patrimonyPaula}")

    }while(patrimonyAna > patrimonyPaula)

    println("\n")
    println("O patrimônio de Ana foi R$ $patrimonyAna")
    println("O patrimônio de Paula foi R$ $patrimonyPaula")
    println("Levou-se $months meses para o patrimônio de Paula ultrapassar o de Ana")
}