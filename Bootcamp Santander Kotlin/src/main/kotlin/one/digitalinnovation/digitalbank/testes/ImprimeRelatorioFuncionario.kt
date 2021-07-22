package one.digitalinnovation.digitalbank.testes

import one.digitalinnovation.digitalbank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprimir(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}