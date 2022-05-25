package exercicio_PolimorfismoHeranca

import javax.swing.Popup

class Cachorro(nome: String, idade: Int, var raca: String, var porte: String) : Animal(nome, idade) {


    fun passear() {
        println("Vamos passear!")
    }


    fun colocarColeira() {
        println("Coleira colocada!")
    }

    override fun correr() {
        println("Estou correndo como um cachorro!!!")
    }

    override fun emitirSom() {
        super.emitirSom()
        println("Au Au Au !!!!!\n")
    }

    override fun toString(): String {
        return "\nCachorro chamado $nome, da raça $raca, e porte $porte"
    }
}