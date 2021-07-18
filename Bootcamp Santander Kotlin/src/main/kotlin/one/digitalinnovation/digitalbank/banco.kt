package one.digitalinnovation.digitalbank

data class banco(
    val nome: String,
    val numero: Int
) {
    fun info() = "$nome - $numero"
}
