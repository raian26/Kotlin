//1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
//apresente no final o total do somatório, a média e o total de valores lidos. O programa
//deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
//positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
//negativo.
fun main() {
    var soma = 0.0
    var aux: Int = 0
    val media: Int = 0
    do {
        println("Para começarmos digite um número para ser somado, para sair digite um valor negativo: ")
        var n: Int = readLine()!!.toInt()
        if (n >= 0) {
            soma += n
            aux++
        }
        var media = soma / aux
    } while (n >= 0)
    println("A soma é: $soma e a média é $media, e o total de valores lidos foi de: $aux ")
}
