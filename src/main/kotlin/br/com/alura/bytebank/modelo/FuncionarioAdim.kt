package modelo.br.com.alura.bytebank.modelo

import modelo.br.com.alura.bytebank.modelo.Autenticavel
import modelo.br.com.alura.bytebank.modelo.Funcionario

abstract class FuncionarioAdim(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {


    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        } else {
            return false
        }
    }

}