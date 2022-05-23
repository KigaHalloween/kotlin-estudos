package modelo

import br.com.alura.bytebank.modelo.Endereco

// é possivel usar o alias (as) para poder usar classes/funcionalidades de mesmo nome

fun main() {
 var enderecoNulo: Endereco? = Endereco(cep = "72146014", Complemento = "casa")
    enderecoNulo?.let{
        println(it.cep.length)
        var tamanhoComplemento: Int =
            it.Complemento?.length ?: throw java.lang.IllegalStateException("O Complemento deve ser especificado")
        println(tamanhoComplemento)
    }
    teste("")
    teste(5)
}

//safe cast
fun teste(valor: Any){
    val numero: Int? = valor as? Int
    println(numero)
 }

