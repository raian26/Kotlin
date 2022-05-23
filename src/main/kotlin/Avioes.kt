class Avioes(
    var peso: Int,
    var qtetripulantes: Int,
    var autonomia: Int,
    var tremdepouso: Boolean
) {
    var voando = false
    var pousar = false
    var tipo =""


    constructor(peso: Int, qtetripulantes: Int, autonomia: Int, tremdepouso: Boolean, tipo: String) :
            this(peso, qtetripulantes, autonomia, tremdepouso) {
        this.tipo = tipo
    }

    fun listar() {
        println("$peso toneladas\n$qtetripulantes tripulantes\n$autonomia quilometros de autonomia\n$tipo")
    }

    fun verificar(dist: Int) {
        if (dist < autonomia && tremdepouso) {
            println("\nTudo certo para iniciarmos o vôo!!!")
        } else if (dist > autonomia) {
            println("\nO avião não possui autonomia para o distância informada")
        } else
            println("\nO avião não possui trem de pouso!!!")
    }


    fun voar() {
        if (voando) {
            println("\nO avião já está no ar!")
        }
        else {
            voando = true
            println("\nO avião irá subir vôo")
        }
    }
    fun pousa(){
    if(pousar){
        println("\nVocê já esta no chão!!!")}
        else{
            pousar =true
        println("\nColoquem os sintos, o avião irá pousar!!!")
        }

    }
    }


