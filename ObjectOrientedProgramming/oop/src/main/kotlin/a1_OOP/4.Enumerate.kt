package a1_OOP

import java.time.LocalDate

enum class Cargo(val cargo: String, val salario: Double){
    //Cada opção está relacionada a classe, e todos os métodos listados...
    //abaixo fazem parte dos objetos
    GERENTE("Gerente", 6000.0),
    DIRETOR("Diretor", 4500.0),
    DESENVOLVEDOR("Desenvolvedor", 3000.0),
    ANALISTA_DADOS("Analista de Dados", 3100.0);

    fun categoriaCargo(): String = cargo

    fun categoriaSalario(): Double = salario
}

class Funcionario(val nome: String, val cargo: Cargo, val dataEmissao: LocalDate) {

    fun calcularSalarioAnual(): Double {
        return cargo.categoriaSalario() * 12
    }

    override fun toString(): String = "${nome} - ${cargo.categoriaCargo()} - ${dataEmissao} - R$ ${cargo.categoriaSalario()}"
}

fun main() {
    val funcionario1 = Funcionario("Antônio", Cargo.GERENTE, LocalDate.of(2000, 1, 1))
    println("O salário anual é de R$ ${funcionario1.calcularSalarioAnual()}")
}