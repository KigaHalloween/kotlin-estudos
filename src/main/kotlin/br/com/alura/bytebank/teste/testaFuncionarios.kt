package modelo.br.com.alura.bytebank.teste

import modelo.br.com.alura.bytebank.modelo.Analista
import modelo.br.com.alura.bytebank.modelo.CalculaBonus
import modelo.br.com.alura.bytebank.modelo.Diretor
import modelo.br.com.alura.bytebank.modelo.Gerente

fun testaFuncionarios() {
    val kigaH = Analista(
        nome = "kigaH",
        cpf = "122.122.122-22",
        salario = 2000.0,

        )
    val kiga = Gerente(
        nome = "kiga",
        cpf = "111.111.111-22",
        salario = 5000.0,
        senha = 1967,
    )

    val halloween = Diretor(
        nome = "halloeen",
        cpf = "222.222.222-22",
        salario = 8000.0,
        senha = 3465,
        plr = 0.0,

        )
    println("________________________* modelo.Analista *_______________________________")
    println("Nome: ${kigaH.nome}")
    println("CPF: ${kigaH.cpf}")
    println("Salario ${kigaH.salario}")
    println("Bonificação:  ${kigaH.bonificacao}")


    println("__________________________* modelo.Gerente *________________________________")

    kiga.autentica(senha = 1967)
    println("Nome: ${kiga.nome}")
    println("CPF: ${kiga.cpf}")
    println("Salario ${kiga.salario}")
    println("Salario e bonificação:  ${kiga.bonificacao}")


    println("__________________________*modelo.Diretor*_______________________________")

    halloween.autentica(senha = 3465)
    println("Nome: ${halloween.nome}")
    println("CPF: ${halloween.cpf}")
    println("Salario ${halloween.salario}")
    println("Salario e bonificação:  ${halloween.bonificacao}")
    halloween.participacao(salario = 8000.0)

    println("--------------------------*Calculo de Bonus*------------------------------------")

    val calcula = CalculaBonus()
    calcula.registra(kigaH)
    calcula.registra(kiga)
    calcula.registra(halloween)

    println("Total de bonus da equipe: ${calcula.total}")


}