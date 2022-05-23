package modelo.br.com.alura.bytebank.modelo

import modelo.br.com.alura.bytebank.modelo.FuncionarioAdim

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdim(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {

    override val bonificacao: Double
        get() {
            return salario * 0.2
        }


}