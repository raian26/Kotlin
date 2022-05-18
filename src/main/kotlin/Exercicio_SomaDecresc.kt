//2- Faça um programa que pegue um número do teclado e calcule a soma de todos os
//números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
//1+2+3+4+5+6+7=28.
fun main() {
    println("Favor digite um número, para saber a soma de todos números até ele:")
    var num = readln().toInt()
    var soma = 0
    for (num in 1..num) {
        soma += num
    }
    println("A soma total é:$soma")
}