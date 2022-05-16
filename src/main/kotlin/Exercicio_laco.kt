//Desenvolva um sistema em que:
//Leia 4 (quatro) números;
//Calcule o quadrado de cada um;
//Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
//Caso contrário, imprima os valores lidos e seus respectivos quadrados.
fun main(){
    println("Para começarmos, me informe 4 números: ")
    val n1 = readln().toDouble()
    val n2 = readln().toDouble()
    val n3 = readln().toDouble()
    val n4 = readln().toDouble()
    val q1 =n1 * n1
    val q2 =n2 * n2
    val q3 =n3 * n3
    val q4 =n4 * n4
    if(q3>=1000){
        println("O quadrado do terceiro valor é $q3")
    }else {
        println("O primeiro valor foi $n1 e seu quadrado é $q1. \n O segundo valor foi $n2 e seu quadrado é $q2")
          println("O terceiro valor foi $n3 e seu quadrado é $q3. \n O quarto valor foi $n4 e seu quadrado é $q4")
    }



}