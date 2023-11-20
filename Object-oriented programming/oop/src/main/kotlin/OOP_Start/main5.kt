package OOP_Start

enum class Prioridade(val value: Int){
    Baixa(5){
        override fun toString(): String {
            return "lower"
        }
    },
    Media(10){
        override fun toString(): String {
            return "median"
        }
    },
    Alta(15){
        override fun toString(): String {
            return "highest value $value"
        }
    }

}

fun main() {
    for (p in Prioridade.entries){
        println(p)
    }
}