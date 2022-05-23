package modelo.br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaDeAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import modelo.br.com.alura.bytebank.teste.saldoConta


@Suppress("UNREACHABLE_CODE")
abstract class Conta(
    var Titular: Cliente,
    val NumeroConta: Int
) : Autenticavel {
    var Saldo = 0.0
    //protected set

    companion object contador {
        var total = 0
            private set

    }

    init {
        contador.total++
        println("Tota de contas : ${contador.total} ")

    }

    override fun autentica(senha: Int): Boolean {
        return Titular.autentica(senha)
    }

    fun deposita(valor: Double) {
        Saldo += valor
    }

    abstract fun saque(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (Saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "O saldo é insuficiente. Saldo atual: $Saldo")
        }
        if (!autentica(senha)) {
            throw FalhaDeAutenticacaoException()
        }
        //throw RuntimeException()
        Saldo -= valor
        destino.deposita(valor)

    }

    abstract fun saldoConta()


}
