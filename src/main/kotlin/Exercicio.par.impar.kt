fun main (){
    //Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
    //número é par ou ímpar, e se é positivo ou negativo.
    println("Digite um número para verificar se ele é impar ou par, positivo ou negativo: ")
    var n = readln().toInt()
    if(n==0){
        println("Número nulo!")}
    else if(n<0 && (n%2)== 0){
        println(" O número escolhido é negativo e par!")}
    else if(n>0 && (n%2)!=0){
        println(" O número escolhido é positivo e ímpar")
    } else if(n>0 && (n%2)== 0){
        println(" O número escolhido é positivo e par!")}
    else{
        println(" O número escolhido é negativo e ímpar")}
}