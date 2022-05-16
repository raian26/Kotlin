import kotlin.math.pow

fun main(){

    println("Olá, vamos calcular a área e o perímetro do nosso círculo, para comerçarmos me informe o diâmetro(cm):")
   var d = readln().toDouble()
    val pi:Double = kotlin.math.PI
    var C = pi* d
    var a = pi * d.pow(2)/4   //pow seria a potencia de d, o n 2 seria o indicativo que seria elevado ao quadrado
    println("A circunferência é ${"%.3f".format(C)} centímetros, e a área é ${"%.3f".format(a)} centímentros")
}
// a expresão "%.3f.format() serve para formatar os números com casas decimais, no caso o 3 seria tres casas,
//o f indica que tem que ser um float para formatar, no caso ele converte para float para conseguir formatar



