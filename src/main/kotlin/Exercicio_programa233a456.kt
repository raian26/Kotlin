//1- Faça um programa que mostre uma contagem na tela de 233 a 456, só que
//contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.

fun main() {
    var n: Int = 233
    do {
        if (n in 300..400) {
            n += 3
        } else (n <= 456)
        run {
            n += 5
        }
        println("$n")}while(n<=456)
}