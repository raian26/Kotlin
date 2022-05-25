package exercicio_PolimorfismoHeranca

class Preguica(nome: String, idade: Int, var garras: Boolean) :Animal(nome, idade) {


    fun afiarGarras() {
        if (garras) {
            println("Estou afiando minhas garras")
        } else {
            println("$nome não possui garras para afiar!")
        }

    }

    override fun emitirSom() {
        println("Som de Preguiça ahhhhhhhhh\n")
    }

    override fun correr() {
        println("Eu não corro,eu subo em árvores!\nSubindo na árvore!")
    }

    override fun toString(): String {
        return "\n$nome, tem $idade anos de idade e possui garras é $garras"
    }
}