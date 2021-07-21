package one.digitalinnovation.digitalbank.testes

import one.digitalinnovation.digitalbank.pessoa

fun main() {
    //ao criar a variável "Wendell" e instanciar à classe pessoa()
    //define o estado e comportamento de "Wendell", que no caso é uma pessoa
    val Wendell = pessoa(nome = "Wendell", cpf = "123.123.123-12")

    //saídas
    println(Wendell.nome)
    println(Wendell.cpf)
}