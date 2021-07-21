package one.digitalinnovation.digitalbank

import java.math.BigDecimal

//herda propriedades de pessoa
//funcionario é uma pessoa
class Funcionario(

    //propriedades da classe, referentes à pessoa
    //subscrevendo propriedades 'nome' e 'cpf' na classe pessoa
    override val nome: String,
    override val cpf: String,
    val salario: BigDecimal

    //referencia à classe pessoa, herdando propriedades
): pessoa(nome, cpf) {

}