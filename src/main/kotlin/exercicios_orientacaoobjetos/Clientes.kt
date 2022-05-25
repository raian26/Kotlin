package exercicios_orientacaoobjetos

class Clientes(
    var nome: String, var email: String, var cpf:String,
    var saldo: Double
) {


    fun deposito(valor: Double) {
        if (valor > 0.0) {
            saldo += valor
            println("Deposito realizado com sucesso!")

        }
    }

    fun comprar(qte:Int){
        saldo-= (qte * 5.00)

        if((qte*5.00) > saldo){
            println("Seu saldo não é suficiente para esta operação!!!\n Compra não realizada!!!")

        }

    }

    fun mostraSaldo(){
        println("O seu saldo é de $saldo R$")
    }

    fun mostradados(){
        println("\n$nome, \n$email,\n$cpf,")
    }
}
