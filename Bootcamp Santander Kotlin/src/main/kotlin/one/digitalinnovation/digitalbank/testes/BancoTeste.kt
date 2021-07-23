//pacotes e importações
package one.digitalinnovation.digitalbank.testes
import one.digitalinnovation.digitalbank.Banco

fun main(){
    //argumentos nomeaveis propriedade=valor
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    //saidas
    println(digiOneBank.nome)
    println(digiOneBank.numero)
}