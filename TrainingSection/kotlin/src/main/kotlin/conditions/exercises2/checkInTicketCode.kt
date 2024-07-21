package conditions.exercises2

fun checkInTicketCode(typeTicket: String): String{
    val codeTicket = readLine()
    if(codeTicket != null && codeTicket != "")
        if ((typeTicket =="Normal" && codeTicket == "XT") ||
            (typeTicket == "Premium" || typeTicket =="Luxury") && codeTicket == "XL")
            return "Welcome :)"
    return "Access Denied. Invalid Ticket"
}

fun checkInAge(age: Int): String{
    if (age >= 16){
        //Question about type and code
        val typeTicket = readLine()
        if (typeTicket != null && typeTicket != ""){
            return when (typeTicket) {
                "Normal" -> checkInTicketCode(typeTicket)
                "Premium" -> checkInTicketCode(typeTicket)
                "Luxury" -> checkInTicketCode(typeTicket)
                else -> "Access Denied. Invalid Ticket"
            }
        }
    }
    return "You're under $age"
}
fun main() {
    print("Type your age: ")
    val age = readLine()

    if ((age != null && age != ""))
        println(checkInAge(age.toInt()))
}