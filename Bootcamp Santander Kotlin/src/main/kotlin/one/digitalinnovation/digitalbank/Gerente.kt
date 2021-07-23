//pacotes e importações
package one.digitalinnovation.digitalbank

//o construtor de 'gerente' inicializa as propriedades de funcionario
//o gerente é o tipo especializado do funcionario
//o funcionario é o tipo especializado da pessoa
class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
):
    Funcionario(nome=nome, cpf=cpf, salario=salario), Logavel {

    //o auxilio sera 40% do salario
    override fun CalculoAux(): Double =  salario*0.4

    //se a função 'login', da interface 'Logavel', receber a string na propriedade senha 'senha123'
    //a função irá retornar verdadeiro
    //(referente ao 'TesteAutenticador')
    override fun login(): Boolean = "senha123" == senha
    }