//pacotes e importações
package one.digitalinnovation.digitalbank.testes
import one.digitalinnovation.digitalbank.Logavel

class TesteAutenticador {

    //a função autentica quando instanciada no código, com base na condição
    //booleana no override da especialização da classe Gerente
    fun autentica(logavel: Logavel) = println(logavel.login())
}