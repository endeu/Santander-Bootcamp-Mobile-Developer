package one.digitalinnovation.digitalbank.testes

import one.digitalinnovation.digitalbank.Funcionario
import one.digitalinnovation.digitalbank.pessoa
import java.math.BigDecimal

fun main() {
    val Wendell = pessoa(nome = "Wendell", cpf = "123.123.123-12")
    //saídas dados pessoa
    println(Wendell.nome)
    println(Wendell.cpf)

    val Wendll = Funcionario(nome = "Wendell Guariento", cpf = "123.123.123.12", salario = BigDecimal.valueOf(1000.00))
    //saídas dados funcionario
    println(Wendll.nome)
    println(Wendll.cpf)
    println(Wendll.salario)

}