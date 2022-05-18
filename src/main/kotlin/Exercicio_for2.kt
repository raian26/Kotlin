//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
fun main(){
    var num:Int
    var par=0
    var impar=0
    for(i in 1..10){
        println("Digite o $i º número:")
        num=readln().toInt()
        if(num%2==0){
            par++
        }else{
            impar++
        }
    }
    println("A quantidade de números pares é $par, e de números ímpares é $impar")
}