package exercicios_orientacaoobjetos/*
Crie uma classe patinete e apresente os atributos e métodos referentes esta classe,
em seguida crie um objeto patinete(SKATE),
defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
class ExercicioPatinete(
    private var shape: String,
    private var roda: String,
    private var truck: String
) {

    var anda = false
    var rolamento = ""
    var lixa = ""

    constructor(shape: String, roda: String, truck: String, rolamento: String, lixa: String) :
            this(shape, roda, truck) {
        this.rolamento = rolamento
        this.lixa = lixa
    }

    fun andar() {
        if (anda) {
            println("Você já está andando!!!")
        } else {
            anda = true
            println("Estamos começando a andar!")
        }
    }

    fun parar() {
        if (anda) {
            anda = false
            println("Freiooo!!")
        } else {
            println("Como vou frear se estamos parados??!!")
        }
    }

    fun ollie() {
        if (anda) {
            println("Ollie andando, muito bom!!")
        } else {
            println("Ollie parado.")
        }
    }

}