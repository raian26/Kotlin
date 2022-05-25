import exercicios_orientacaoobjetos.Produtoseletro

fun main(){
    val prod1= Produtoseletro("Microondas","LG","B223")
    val prod2= Produtoseletro("Geladeira","Brastemp","Frost42","220v","2021")

    prod1.list()
    prod2.list()
    prod1.desligar()
    prod2.ligar()
    prod2.ligar()
    prod2.desligar()
}