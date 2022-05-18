//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99. (WHILE)

fun main() {
    var idade: Int = 0
    var maior: Int = 0
    var menor: Int = 0
    while (idade != -99) {
        println("Para começarmos me informe sua idade:")
        idade = readln().toInt()
        if (idade > 50) {
            maior++
        }
        if (idade in 0..20) {
            menor++
        }
    }
    println("O total de pessoas com mais de 50 anos é:$maior")
    println("O total de pessoas com menos de 21 anos é:$menor")
}
