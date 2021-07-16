package one.digitalinnovation.digitalbank

class pessoa {
    //atributos de uma pessoa
    //variaveis da classe pessoa
    var nome: String = "Wendell"
    var cpf: String = "123.123.123-13"

    //restringe alterações dos valores das propriedades
    //fora do escopo da classe
    private set
}

fun main() {
    //ao criar a variável "Wendell" e instanciar à classe pessoa()
    //define que o estado e comportamento de "Wendell", que no caso é uma pessoa
    val Wendell = pessoa()

    //saídas
    println(Wendell.nome)
    println(Wendell.cpf)
}