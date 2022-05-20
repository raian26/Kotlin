import kotlin.math.pow

fun main(){
    println("CALCULADORA DO IMC")
    println("Para começar me informe seu peso em quilos:")
    var peso = readln().toDouble()
    println("Agora me informe a sua altura:")
    var alt = readln().toDouble()
    println("O seu IMC é: ${calcIMC(peso, alt)}")


}

fun calcIMC(n1:Double , n2:Double):Double{
    var IMC = (n1 / (n2.pow(2)))
    var imc = "%.3f".format(IMC).toDouble()
    return imc
}