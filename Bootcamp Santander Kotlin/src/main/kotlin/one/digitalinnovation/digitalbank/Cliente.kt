//pacotes e impoirtações
package one.digitalinnovation.digitalbank

//o construtor de 'Cliente' inicializa as propriedades de 'Pessoa'
//com as propriedades especializadas referentes a 'clienteTipo' e uma senha própria
class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
): Pessoa(nome, cpf), Logavel {

    override fun login(): Boolean = "senha321" == senha

    //se a função 'login', da interface 'Logavel', receber a string na propriedade senha 'senha321'
    //a função irá retornar verdadeiro
    //(referente ao 'TesteAutenticador')
    override fun toString(): String="""
        Nome: $nome
        cpf: $cpf
        Tipo: ${clienteTipo.descricao}
    """.trimIndent()
    }