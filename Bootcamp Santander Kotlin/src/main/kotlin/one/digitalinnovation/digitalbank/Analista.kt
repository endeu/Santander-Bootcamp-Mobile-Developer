//pacotes e importações
package one.digitalinnovation.digitalbank

//o construtor de 'analista' inicializa as propriedades de funcionario
//o analista é o tipo especializado do funcionario
//o funcionario é o tipo especializado da pessoa
class Analista(
    nome: String,
    cpf: String,
    salario: Double):
    Funcionario(nome, cpf, salario) {

    //o auxilio sera 10% do salario
    override fun CalculoAux()= salario + (salario*0.1)
}