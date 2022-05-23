package modelo.br.com.alura.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    var plr: Double
) : FuncionarioAdim(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
){

    override val bonificacao: Double
        get() {
            return salario * 0.3 + plr
        }


    fun participacao(salario: Double) {
        plr = salario * 0.25
        return println("Participação no lucro: $plr")
    }



}