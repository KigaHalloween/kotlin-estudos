package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

 fun testaAny() {
        val endereco = Endereco(numero = 1, cep = "11111-111")
        val novoEndereco = Endereco(numero = 1, cep = "11111-111")


        println(endereco.equals(novoEndereco))
        println(endereco.hashCode())
        println(novoEndereco.hashCode())
        //println(endereco)
        //println(novoEndereco)
}