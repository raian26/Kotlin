
//Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.
////Outra forma de se fazer mostrada pelo Wes
//
///*fun parImpar() {
//    // Entrada de dados
//    println("Entre com o primeiro numero:")
//    val num1 = readLine()!!.toDouble()
//
//    // Processamento
//    // Pode fazer a conta direto na estrutura de seleção
//    // (ocupa menos memoria)
//    val par = num1 % 2
//    val raiz = sqrt(num1)
//    val quad = num1.pow(2)
//
//    // Saida de dados - Estrutura de seleção
//    if (par == 0.0){
//        println("O número $num1 é par!")
//        println("A raiz de $num1 é $raiz")
//    } else {
//        println("O número $num1 é impar!")
//        println("O quadrado de $num1 é $quad")
//    }
//}
import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    println("Para começarmos, me informe um valor, para verificarmos se é impar ou par:")
    val num = readln().toDouble()
    if(num % 2.0 == 0.0) {
        println("O número $num é par e sua raiz quadrada é: ${"%.3f".format(sqrt(num))}") }
    else{
        println("O número $num é impar, e ele elevado ao quadro é:${"%.3f".format(num.pow(2))}") }
}