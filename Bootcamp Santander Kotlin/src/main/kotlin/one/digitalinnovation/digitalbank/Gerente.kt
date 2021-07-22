package one.digitalinnovation.digitalbank

//o construtor de 'gerente' inicializa as propriedades de funcionario
//o gerente é o tipo especializado do funcionario
//o funcionario é o tipo especializado da pessoa
class Gerente(
    nome: String,
    cpf: String,
    salario: Double):
    Funcionario(nome=nome, cpf=cpf, salario=salario) {

    //o auxilio sera 40% do salario
    override fun CalculoAux(): Double =  salario*0.4
    }