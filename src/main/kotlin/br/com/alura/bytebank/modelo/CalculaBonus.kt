package modelo.br.com.alura.bytebank.modelo

class CalculaBonus {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Any) {
        if (funcionario is Funcionario) {
            this.total += funcionario.bonificacao
        }
    }

    fun registra(funcionario: Analista) {
        this.total += funcionario.bonificacao
    }

    fun registra(gerente: Gerente) {
        this.total += gerente.bonificacao
    }

    fun registra(diretor: Diretor) {
        this.total += diretor.bonificacao
    }

}