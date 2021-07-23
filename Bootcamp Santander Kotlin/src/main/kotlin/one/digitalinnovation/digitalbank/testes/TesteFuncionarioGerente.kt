//pacotes e importações
package one.digitalinnovation.digitalbank.testes
import one.digitalinnovation.digitalbank.Gerente

fun main() {

    //propriedades herdadas, e implementadas, das especializações funcionario e pessoa
    //'senha' é a propriedade especializada da classe 'Gerente'
    val Maria = Gerente(nome = "Maria do Carmo", cpf = "123.123.123.12", salario = 500.00, senha = "senha123")

    //saídas dados
    ImprimeRelatorioFuncionario.imprimir(Maria)

    TesteAutenticador().autentica(Maria)
}