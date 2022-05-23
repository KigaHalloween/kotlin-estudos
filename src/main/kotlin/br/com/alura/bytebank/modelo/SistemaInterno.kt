package modelo.br.com.alura.bytebank.modelo

import modelo.br.com.alura.bytebank.modelo.Autenticavel

class SistemaInterno {

    fun entra(adim: Autenticavel, senha: Int){
      if (adim.autentica(senha)){
          println("Bem vindo ao ByteBank")
      }else{
          println("Acesso negado")
      }
    }
}