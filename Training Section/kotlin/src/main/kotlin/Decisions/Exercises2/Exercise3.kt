package `2`.Decisions.Exercises2

fun checkIn(age: Byte, ticketType: String, ticketCode: String): String{
    if (age >= 16){
        if (ticketType == "comum") {
            if (ticketCode.startsWith("XT")) {
                return "Welcome! :)"
            }
        }
        else if (ticketType == "premium" || ticketType == "luxo"){
            if (ticketCode.startsWith("XL")){
                return "Welcome! :)"
            }
        }

    }

    return "Negado. Convite inválido."
}
fun main() {
    // ? When the instance is not null
    // !! Whe can raise a NullPointerException
    print("Digite sua idade: ")
    val age = readLine()!!.toByte()
    print("Digite o tipo de convite: ")
    val ticketType = readLine()!!.toString()
    print("Digite o código do convite: ")
    val ticketCode = readLine()!!.toString()

    val message = checkIn(age, ticketType, ticketCode)
    print(message)
}