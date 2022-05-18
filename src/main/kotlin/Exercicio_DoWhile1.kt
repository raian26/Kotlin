//Crie um programa que leia um número do teclado até que encontre um
//número igual a zero. No final, mostre a soma dos números
//digitados.(DO...WHILE)
fun main() {
    var num: Int
    var soma = 0
    var aux = 0
    println("Por favor digite um número, para somarmos todos os números dele até zero:")
    num = readln().toInt()
    do {
        soma += aux
        aux++
    } while (aux <= num)
    println("O resultado é: $soma")
}