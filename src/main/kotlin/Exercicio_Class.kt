import exercicios_orientacaoobjetos.Clientes

fun main(){
    val raian = Clientes("Raian","raian.guilherme","777-777-777-77",4000.00)
    raian.mostradados()
    println()
    raian.mostraSaldo()
    println()
    raian.comprar(33)
    raian.mostraSaldo()
    raian.deposito(55.0)
    raian.mostraSaldo()
}