package one.digitalinnovation.digitalbank.testes

import one.digitalinnovation.digitalbank.Analista

fun main() {
    val Wendll = Analista(nome = "Wendell Guariento", cpf = "123.123.123.12", salario = 100.00)

    //saídas dados funcionario
    //calsse imprimeRelatorioFuncionario instanciada com a função imprime
    ImprimeRelatorioFuncionario.imprimir(Wendll)
}