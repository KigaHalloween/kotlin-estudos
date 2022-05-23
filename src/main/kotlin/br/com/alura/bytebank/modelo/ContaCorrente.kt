package modelo.br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Cliente
import modelo.br.com.alura.bytebank.modelo.Conta

class ContaCorrente(
    Titular: Cliente,
    NumeroConta: Int
) : Conta(
    Titular = Titular,
    NumeroConta = NumeroConta
) {
    override fun saque(valor: Double) {

        return if (Saldo < valor) {
            println("Saldo insuficiente")
        } else {
            Saldo -= valor
            println("Saque realizado. Valor ${valor}")
        }
        val valorComTaxa = valor + 0.2
        saque(valorComTaxa)

    }

    override fun saldoConta() {
        TODO("Not yet implemented")
    }
}