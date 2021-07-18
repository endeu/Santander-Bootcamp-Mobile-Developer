package one.digitalinnovation.digitalbank.testes

//importando classe banco
import one.digitalinnovation.digitalbank.banco

fun main(){
    //argumentos nomeaveis propriedade=valor
    val digiOneBank = banco(nome = "DigiOne", numero = 12)

    //saidas
    println(digiOneBank.nome)
    println(digiOneBank.numero)
}