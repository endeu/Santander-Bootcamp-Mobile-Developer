package one.digitalinnovation.digitalbank.testes

import one.digitalinnovation.digitalbank.Gerente

fun main() {
    val Maria = Gerente(nome = "Maria do Carmo", cpf = "123.123.123.12", salario = 500.00)

    //saídas dados funcionario
    ImprimeRelatorioFuncionario.imprimir(Maria)
}