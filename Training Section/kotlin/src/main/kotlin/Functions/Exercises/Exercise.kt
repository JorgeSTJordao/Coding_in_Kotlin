package Functions

fun conversion(yearsQtde: Byte){
    println("${yearsQtde} years is the same thing as...")
    println("Months: ${yearsQtde*12}")
    println("Days: ${yearsQtde*365}")
    println("Hours: ${yearsQtde*365*24}")
    println("Minutes: ${yearsQtde*365*24*60}")
    println("Seconds: ${yearsQtde*365*24*60*60}")
}

fun main() {

    val yearsQtde: Byte = 5

    conversion(yearsQtde)
}
