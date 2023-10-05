package Variables

/**
Type	Bit
Double	64
Float	32
Long	64
Int	    32
Short	16
Byte	8
Boolean ? (We can use 1 bit, but according to JVM this is might be not the right value)
String  ?
Char    ?
 */

fun main() {

    var c: Char = 'a'
    var s: String = "Now I'm can understand what's the difference between Char and String types"
    var l: Long = 10L

    var i: Byte = 127
    // var iplus: Byte = 128 You will get an error

    println("DOUBLE MAX ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")
    println("BYTE MAX ${Byte.MAX_VALUE} - MIN ${Byte.MIN_VALUE}")
    println(i)
    println(l)
}
