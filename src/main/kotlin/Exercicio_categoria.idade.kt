//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
//categoria ela se encontra:
// 10-14 infantil
// 15-17 juvenil
// 18-25 adulto
fun main(){
    println("Vamos ver em qual categoria você se enquadra, me informe sua idade:")
    var idade = readln().toInt()
    when(idade){
        in 10 ..14 -> println("Sua categoria é Infantil!")
        in 15 ..17 -> println("Sua categoria é Juvenil!")
        in 18 ..25 -> println("Sua categoria é Adulto!")
        else -> println("Infelizmente não temos categoria para você.")
    }

}