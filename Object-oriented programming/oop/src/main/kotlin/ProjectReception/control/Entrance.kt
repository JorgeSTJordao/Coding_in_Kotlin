package ProjectReception.control

import ProjectReception.business.BusinessGuest
import ProjectReception.entity.Invitation

class Entrance {

    private val businessGuest = BusinessGuest()

    init {
        println("The entrance is open")
        println(control())
    }

    private fun control(): String {
        val age = Console.readInt("How old are you? ")
        val guest = Invitation(age = age)

        println("You are $age years old")

        if (!businessGuest.legalOfAge(guest.age))
            println("You are under age!")

        guest.type = Console.readString("Which ticket type is yours? ")
        if (!businessGuest.validType(guest.type))
            return "Denied. Wrong Ticket."

        guest.code = Console.readString("What's your ticket code? ")
        if (!businessGuest.validGuest(guest))
            return "Denied. Wrong Ticket."

        return "Welcome :)"
    }

}