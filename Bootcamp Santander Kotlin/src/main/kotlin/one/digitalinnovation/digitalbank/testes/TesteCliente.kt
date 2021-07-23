//pacotes e importações
package one.digitalinnovation.digitalbank.testes
import one.digitalinnovation.digitalbank.Cliente
import one.digitalinnovation.digitalbank.ClienteTipo

fun main() {

        //propriedades herdadas, e implementadas, da especialização pessoa
        //'senha' é a propriedade especializada da classe 'Cliente'
        val Joao = Cliente(
            nome="joao gomes",
            cpf="321.321.321.32",
            clienteTipo = ClienteTipo.PF,
            senha = "senha321"
        )
        //saídas dados
        println(Joao)

        TesteAutenticador().autentica(Joao)
}