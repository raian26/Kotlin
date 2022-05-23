fun main(){
    val aviao1=Avioes(6500,130,110000,true)
    val aviao2=Avioes(2000,3,3500,true,"Avião particular")
    aviao1.listar()
    println()
    aviao2.listar()
    aviao1.verificar(4000)
    aviao2.verificar(4000)
    aviao1.voar()
    aviao1.pousa()
    aviao1.pousa()
    aviao1.voar()
    aviao1.voar()
}