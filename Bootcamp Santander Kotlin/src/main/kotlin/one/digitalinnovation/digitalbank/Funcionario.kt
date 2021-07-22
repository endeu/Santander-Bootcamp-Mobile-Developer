package one.digitalinnovation.digitalbank

//herda propriedades de pessoa
//funcionario é uma pessoa
abstract class Funcionario(

    //propriedades da classe, referentes à pessoa
    //subscrevendo propriedades 'nome' e 'cpf' na classe pessoa
    nome: String,
    cpf: String,
    val salario: Double

    //referencia à classe pessoa, herdando propriedades
): pessoa(nome, cpf) {

    protected abstract fun CalculoAux(): Double

    override fun toString(): String="""
        Nome: $nome
        Nome: $cpf
        Nome: $salario
        Aux: ${CalculoAux()}
    """.trimIndent()

}