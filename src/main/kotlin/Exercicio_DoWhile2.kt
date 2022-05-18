//Escrever um programa que receba vários números inteiros no teclado. E no
//final imprimir a média dos números múltiplos de 3. Para sair digitar
//0(zero).(DO...WHILE)
fun main(){
    var num:Int
    var soma:Int=0
    var media:Double=0.0
    var i: Int=0
    do{
        println("Digite vários números inteiros, para calcularmos a média, para sair digite 0:")
        num=readln().toInt()
        if(num % 3 == 0 && num!=0){
        soma+=num
        i++
            }
    }while(num!=0)
    media= (soma/i).toDouble()
    println("A média dos números multiplos de 3 é:$media")
}