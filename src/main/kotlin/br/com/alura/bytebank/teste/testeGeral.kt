package modelo.br.com.alura.bytebank.teste

fun testeGeral() {
    val titular: String = "Kiga"
    val idConta: Int = 13016
    var saldo: Double = 27000.00
    var dividas: Double = 900.00
    var debitoAl: Double = 900.0

    println("Titular da modelo.Conta: R$ $titular")
    println("Numero da conta: R$ $idConta")
    println("Saldo da conta: R$ $saldo")
    println("Saldo total de dividas: R$ $dividas")
    println(pagaConta(saldo, dividas))
    println(saldoConta(saldo, dividas, debitoAl))
    println(debitoAltomatico(saldo, debitoAl))

}
fun saldoConta(saldo: Double, dividas: Double, debitoAl: Double) {
    if ((saldo <= 0.0) and (dividas > 0.0) and (debitoAl > 0.0)) {
        var saldo = dividas + debitoAl
        return println("o saldo da conta é negativo. Saldo: R$- $saldo")
    }

    return if (saldo > 0.0) {
        println("Saldo da conta é positivo. R$ $saldo")
    } else if (saldo == 0.0) {
        println("Saldo da conta é neutro. R$ $saldo")
    } else {
        println("Saldo da conta é negativo. R$ $saldo")
    }
}


fun pagaConta(saldo: Double, dividas: Double): String {
    return if (saldo < dividas) {
        ("Saldo insuficiente para transação")
    } else {
        var saldo = saldo - dividas

        ("Saldo Atualizado: R$ $saldo")
    }
}

fun debitoAltomatico(saldo: Double, debitoAl: Double) {

    if (debitoAl > saldo) {
        return println("Saldo insuficiente para pagar todos agendamentos. Valor total dos agendamentos $debitoAl")
    }

    while (debitoAl != 0.0) {
        var debitoAl = debitoAl + saldo
        return println("Não hà mais contas no debito altomatico =)")
    }
}