package one.digitalinnovation.digitalbank

enum class ClienteTipo(val descricao: String)  {
    PF("Pessoa Física"),
    PJ("Pessoa Jurídica");

    companion object {
        fun printDescricao() = ClienteTipo
    }
}