package exercicio_PolimorfismoHeranca

class Cavalo(nome: String, idade: Int, var raca: String, var tipo: String) :Animal(nome, idade) {

    fun montar(){
        println("Montando no cavalo!")
    }
    fun colocarSela(){
        println("Sela colocada com sucesso!!!")
    }

    override fun emitirSom() {
        println("Hiin in in !!!!(Relincho alto de cavalo)")
    }

    override fun correr() {
        println("Correndo como um cavalo de fuga!!!")
    }

    override fun toString(): String {
        return "O nome é $nome, tem $idade anos de idade e é um cavalo do tipo $tipo"
    }
}