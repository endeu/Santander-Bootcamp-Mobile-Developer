//pacotes e importações
package one.digitalinnovation.digitalbank

data class Banco(
    val nome: String,
    val numero: Int
) {
    fun info() = "$nome - $numero"
}
