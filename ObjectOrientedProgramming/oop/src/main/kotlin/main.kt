
//Uma festa só permite a entrada de jovens maiores de 18 anos, assim devemos...
//verificar a quantidade de pessoas que irão entrar e quais foram autorizadas a partir da idade
//10 pessoas confirmaram a entrada, porém 5 negaram
//7 dos que vão vir possuem mais que 18 anos

//Pessoa deverá conter o id (único), nome, idade, status (participa (True)/ não participa (False))
class Pessoa(val id: Int, val nome: String, val idade: Int, val status: Boolean){

    //Usaremos os dadosPessoa para verificar a situação do convidado
    fun dadosPessoa(): Map<String, Any>{
        return mapOf("id" to id, "nome" to nome, "idade" to idade, "status" to status)
    }
}

//A festa deve conter uma função que analisa os dados do jovem
//1 - Se ele vier e for maior de idade, deve inserir em um dicionário que foi permitido
//2 - Se ele vier e for menor de idade, deve inserir no dicionário que não foi permitido
//3 - Caso não venha, deve inserir que não compareceu
class Festa{

}

fun questionarioPessoas(): MutableList<Any>{
    while(true){
        print("Digite seu nome: ")
        val nome = readln()

        print("Digite sua idade: ")
        val idade = readln().toIntOrNull()

        println("Você irá participar da festa?")
        println("0 - NÃO")
        println("1 - SIM")
        print("R: ")

        val statusBit = readln()

        val status = when (statusBit) {
            "0" -> false
            "1" -> true
            else -> null
        }

        if (!nome.equals(null) && idade != null  && status != null)
            return mutableListOf(nome, idade, status)

        println("Dados inseridos de forma incorreta. Preencha os novamente")
    }
}

fun main() {
    val num_convidados = 2

    for(id in 1..num_convidados) {
        val arrayDados = questionarioPessoas()
        arrayDados.add(0, id)
        println(arrayDados)
        println("\n")
    }

}
