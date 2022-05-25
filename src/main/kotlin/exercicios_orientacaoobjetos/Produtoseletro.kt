package exercicios_orientacaoobjetos

class Produtoseletro(
    var tipo:String,
    var marca:String,
    var modelo:String
) {var tensao =""
    var anofabric=""
    var desligado =true
    constructor(tipo:String,marca: String,modelo: String,tensao:String,anofabric:String):
            this(tipo, marca, modelo){
                this.tensao=tensao
                this.anofabric=anofabric
            }
    fun ligar(){
        if(desligado){
            desligado = false
            println("\nLigando a/o $tipo!")}
        else
            println("\n$tipo já está ligada!!!")
    }
    fun desligar(){
        if(!desligado){
            desligado = true
            println("\nDesligando a/o $tipo")}
            else
                println("\n$tipo já está desligado!!!")
        }
    fun list(){
        println("\n$tipo\n$marca\n$modelo\n$tensao\n$anofabric")
    }
    }