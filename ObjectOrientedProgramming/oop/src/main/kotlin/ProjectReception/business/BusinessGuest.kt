package ProjectReception.business

import ProjectReception.entity.Invitation

class BusinessGuest {
    fun legalOfAge(age: Int) = age >= 16

    fun validType(type: String) = (type == "usual" || type == "premium" || type == "luxury")

    fun validGuest(ticket: Invitation) = when (ticket.type) {
        "usual" -> ticket.type.startsWith("xt")
        "premium", "luxury" -> ticket.type.startsWith("xl")
        else -> false
    }
}