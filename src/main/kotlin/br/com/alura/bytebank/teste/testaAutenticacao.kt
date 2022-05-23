package modelo.br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import modelo.br.com.alura.bytebank.modelo.Diretor
import modelo.br.com.alura.bytebank.modelo.Gerente
import modelo.br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "kiga",
        cpf = "000.111.222-33",
        salario = 10000.0,
        senha = 1234
    )

    val diretor = Diretor(
        nome = "Halloween",
        cpf = "555.111.222-33",
        salario = 10000.0,
        senha = 4321,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Halloween",
        cpf = "555.111.222-33",
        senha = 1222
    )


    val sistema = SistemaInterno()
    sistema.entra(cliente, 1222)
    sistema.entra(gerente, 1234)
    sistema.entra(diretor, 4321)

}
