package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.SaldoInsuficienteException


fun funcao1() {
    println("inicio função 1")
    try{
    funcao2()
    println("fim função 1")
    }catch (e: SaldoInsuficienteException){
        e.printStackTrace()
        println("SaldoInsuficienteException foi encontrada")
    }
}

fun funcao2() {
    println("inicio função 2")
    for (i in 1..5) {
        println(i)
        throw SaldoInsuficienteException()
    }
    println("fim função 2")
}