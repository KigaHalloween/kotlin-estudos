package modelo.br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Cliente

class ContaPoupanca(
    Titular: Cliente,
    NumeroConta: Int
) : Conta(
     Titular =    Titular,
    NumeroConta = NumeroConta
) {
    override fun saque(valor: Double) {
        if (Saldo < valor) {
            return println("Saldo insuficiente")
        } else {
            Saldo -= valor
            return println("Saque realizado. Valor ${valor}")
        }

        val valorComTaxa = valor + 0.2
        saque(valorComTaxa)

    }

    override fun saldoConta() {
        TODO("Not yet implemented")
    }
}