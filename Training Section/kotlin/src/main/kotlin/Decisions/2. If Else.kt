package Decisions

fun areOfAge(age: Byte){
    if (age >= 16){
        println("Now you are of Age")
    }
    else if (age >= 10) {
        println("You are just a tween")
    }
    else {
        println("You are just a kid")
    }
}

fun main() {

    areOfAge(9)
    areOfAge(17)
    areOfAge(11)
}