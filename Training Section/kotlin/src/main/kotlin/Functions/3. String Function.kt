package Functions

fun main() {
    val data = "JVM_program"

    //String length
    println("String length: ${data.length}")
    println("-------------------")

    //String index
    println("Index 0 from String: ${data[0]}")
    println("-------------------")

    //What's the beginning of the word
    println(data.startsWith("JVM"))
    println("-------------------")

    // Ending
    println(data.endsWith("ramm"))
    println("-------------------")

    // It's going to return two letters from the string variable
    println(data.substring(2, 4))
    println("-------------------")

    println(data.replace("program", "it's so damn good!"))
    println("-------------------")

    println(data.lowercase())
    println(data.uppercase())
    println("-------------------")

    println("      hello spider-man          ".trim())
}