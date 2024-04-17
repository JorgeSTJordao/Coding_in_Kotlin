package a1_OOP

import java.time.LocalDate

//Criar a classe Pessoa, Endereço e Data de Nascimento para o tipo Data Class

data class DataNascimento(val ano: Int, val mes: Int, val dia: Int){
    override fun toString(): String {
        return "Nascido no dia $dia, mês $mes e ano $ano"
    }
}

data class Endereco(val rua: String, val numero: Int, val bairro: String, val cidade: String, val estado: String){
    override fun toString(): String {
        return "Rua $rua, nº $numero. Bairro $bairro. $cidade, $estado"
    }
}

data class Pessoa(val nome: String, val idade: Int, val endereco: Endereco, val dataNascimento: DataNascimento, val ano_atual: Int){
    override fun toString(): String {
        return "O $nome tem ${ano_atual - dataNascimento.component3()} anos. $dataNascimento. O seu endereço é $endereco"
    }
}

fun main() {
    val hoje = LocalDate.now()
    val ano = hoje.year

    val dataNascimento = DataNascimento(1,1,2001)
    val endereco1 = Endereco("Ana Denna", 15, "Beta", "Sacramento", "Califórnia")
    val pessoa1 = Pessoa("Jorge", 20, endereco1, dataNascimento, ano)

    println(endereco1)
    println(pessoa1)

}

