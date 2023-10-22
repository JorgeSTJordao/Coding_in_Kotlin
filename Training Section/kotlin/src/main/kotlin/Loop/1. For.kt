package Loop

fun main() {

    print("String letters: ")
    val str = "Hello, World!"
    for (char in str){
        print("$char ")
    }

    print("\nString indexes: ")
    for (i in 0..str.length){
        print("$i ")
    }
    println("\n----------------------------")

    print("Multiples of 5: ")
    for (j in 0..50 step 5){
        print("$j ")
    }
    println("\n----------------------------")

    print("Multiples of 4: ")
    for(w in 16 downTo 0 step 3){
        print("$w")
    }

}