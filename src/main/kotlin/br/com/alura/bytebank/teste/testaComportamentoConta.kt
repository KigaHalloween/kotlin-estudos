package modelo.br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.FalhaDeAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import modelo.br.com.alura.bytebank.modelo.ContaCorrente
import modelo.br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentoConta() {
    var kiga = Cliente(nome = "Kiga", cpf = "000.000.000-00", senha = 123)
    var Raquel = Cliente(nome = "Raquel", cpf = "000.000.000-00", senha = 321)

    var contaKiga = ContaCorrente(Titular = kiga, NumeroConta = 99)
    var contaRaquel = ContaPoupanca(Titular = Raquel, NumeroConta = 100)


    println("Titular: ${contaKiga.Titular.nome}")
    println("Cpf:${contaKiga.Titular.cpf} ")

    contaKiga.deposita(900.0)
    contaKiga.saque(0.0)
    try {
        contaKiga.transfere(100.0, contaRaquel, senha = 123)
        println("tranferencia realizada")
    } catch (e: SaldoInsuficienteException) {
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaDeAutenticacaoException) {
        println("Falha de autenticação da Senha!")
    }catch (e: Exception){
        println("Erro desconhecido")
        e.printStackTrace()
    }
    contaKiga.deposita(7000.0)
   // println("titular: ${contaKiga.Titular}")
   // println("Saldo: ${contaKiga.Saldo}")


    println("--------------------------------------------")
    contaRaquel.deposita(10000.0)
    contaRaquel.saque(2000.0)
    try {
        contaRaquel.transfere(300.0, contaKiga, senha = 321)
        println("tranferencia realizada")
    } catch (e: SaldoInsuficienteException) {
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaDeAutenticacaoException) {
        println("Falha de autenticação da Senha!")
    }catch (e: Exception){
        println("Erro desconhecido")
        e.printStackTrace()
    }
    println(contaRaquel.Titular)

}

