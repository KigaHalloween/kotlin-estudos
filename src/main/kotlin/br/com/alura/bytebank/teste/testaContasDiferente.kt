package modelo.br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import modelo.br.com.alura.bytebank.modelo.Conta
import modelo.br.com.alura.bytebank.modelo.ContaCorrente
import modelo.br.com.alura.bytebank.modelo.ContaPoupanca

val kiga = Cliente(nome = "kiga", cpf = "000.000.000-00", senha = 456)
val halloween = Cliente(nome = "kiga", cpf = "000.000.000-00", senha = 4506)

fun testaContasDiferente() {
    val contaCorrente: Conta = ContaCorrente(
        Titular = kiga,
        NumeroConta = 100010
    )

    val contaPoucanca: Conta = ContaPoupanca(
        Titular = halloween,
        NumeroConta = 100011
    )

    contaCorrente.deposita(1000.0)
    contaPoucanca.deposita(2000.0)

    println("______________________________")
    println("Saldo da conta corrente: ${contaCorrente.Saldo}")
    println("________________________________")
    println("Saldo da conta Poupança: ${contaPoucanca.Saldo}")
    println("________________________________")

    contaCorrente.saque(100.0)
    contaPoucanca.saque(100.0)

    println("______________________________-")
    println("Saldo da conta corrente: ${contaCorrente.Saldo}")
    println("________________________________")
    println("Saldo da conta Poupança: ${contaPoucanca.Saldo}")
    println("________________________________")

    contaCorrente.transfere(99.00, contaPoucanca, senha = 321)
    println("Saldo da conta corrente: ${contaCorrente.Saldo}")
    println("________________________________")
    contaPoucanca.transfere(800.0, contaCorrente, senha = 321)
    println("Saldo da conta Poupança: ${contaPoucanca.Saldo}")
    println("________________________________")
}



