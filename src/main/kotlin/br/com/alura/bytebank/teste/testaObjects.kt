package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import modelo.br.com.alura.bytebank.modelo.Conta
import modelo.br.com.alura.bytebank.modelo.ContaCorrente
import modelo.br.com.alura.bytebank.modelo.ContaPoupanca
import modelo.br.com.alura.bytebank.teste.testaComportamentoConta

fun testaObjects() {
    var halloween = Cliente(nome = "Kiga", cpf = "000.000.000-00", senha = 123)
    var contaHalloween = ContaCorrente(Titular = halloween, NumeroConta = 99)

    var kiga = Cliente(nome = "Kiga", cpf = "000.000.000-00", senha = 123)
    var contaKiga = ContaCorrente(Titular = kiga, NumeroConta = 99)

    var Raquel = Cliente(nome = "Raquel", cpf = "000.000.000-00", senha = 321)
    var contaRaquel = ContaPoupanca(Titular = Raquel, NumeroConta = 100)


    testaComportamentoConta()
    println("total de contas: ${Conta.total} ")
}
