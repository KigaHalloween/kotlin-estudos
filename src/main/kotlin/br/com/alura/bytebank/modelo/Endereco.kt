package br.com.alura.bytebank.modelo

class Endereco(
    val numero: Int = 0,
    val bairro: String = "",
    val cidade: String = "",
    val estado: String = "",
    val cep: String = "",
    val Complemento: String? = null
) {
    override fun toString(): String {
        return """Endereco(
            |numero=$numero, 
            |bairro='$bairro',
            |cidade='$cidade', 
            |estado='$estado', 
            |cep=$cep, 
            |Complemento='$Complemento')
            | """.trimMargin()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Endereco

        if (numero != other.numero) return false
        if (bairro != other.bairro) return false
        if (cidade != other.cidade) return false
        if (estado != other.estado) return false
        if (cep != other.cep) return false
        if (Complemento != other.Complemento) return false

        return true
    }

    override fun hashCode(): Int {
        var result = numero
        result = 31 * result + bairro.hashCode()
        result = 31 * result + cidade.hashCode()
        result = 31 * result + estado.hashCode()
        result = 31 * result + cep.hashCode()
        result = 31 * result + Complemento.hashCode()
        return result
    }

}