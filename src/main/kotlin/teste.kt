fun main() {
    var soma = 0.0
    var num = 0.0
    var aux: Int = 0
    val media:Int = 0
    while(num>=0){
        println("Para começarmos digite um número para ser somado, para sair digite um valor negativo: ")
        num = readln().toDouble()
        soma += num
        aux++
        var media = soma / aux}

    println("A soma é: $soma e a média é $media, e o total de valores lidos foi de: $aux ")}
