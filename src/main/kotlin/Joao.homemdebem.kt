//João, homem de bem, comprou um microcomputador para controlar o rendimento diário
//de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
//regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
//excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
//verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
//da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
//ZERO.
fun main(){
    println("Olá, para verificarmos se possui alguma multa para pagar, me informe o peso em quilos:")
    val peso = readln().toDouble()
    if(peso>50){
        val resultado = (peso-50)*4
        val ex = peso-50
        println("O valor a pagar é de: $resultado reais e o valor excedente é de $ex quilos")
    }else{
        println("Você não possui multa a pagar!")
    }
}