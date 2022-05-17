
//Faça um programa que receba
// três inteiros e diga qual deles é o maior.

fun main(){
    println("Vamos verificar entre 3 números, qual deles é o maior?")
    println("Para começarmos, me informe 3 valores:")
    var n1 = readln().toDouble()
    var n2 = readln().toDouble()
    var n3 = readln().toDouble()
    if(n1> n2 && n1>n3){
        println("O maior número é o $n1")
    } else if(n2>n3 && n2>n1) {
        println("O maior número é o $n2")
    } else
        println("O maior número é o $n3")
}