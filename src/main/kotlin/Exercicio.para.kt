// Desenvolver um sistema que efetue a soma de todos os números ímpares que são
//múltiplos de três e que se encontram no conjunto dos números de 1 até 500
fun main () {
    var soma = 0
    for(i in 1..500){

        if (i % 2 != 0 && i % 3 == 0) {

            soma += i

        }
    }
    println("A soma dos números impares e divisíveis por 3, de 1 até 500 é: $soma")

}