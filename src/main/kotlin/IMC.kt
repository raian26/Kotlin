import kotlin.math.roundToLong

fun main() {
    println("Olá, para começarmos me informe seu peso(kg) e sua altura(m)?")
    val peso = readln().toDouble()
    val altura = readln().toDouble()
    println("A legal seu peso é $peso  quilos e sua altura é $altura metros")
    val imc = peso / (altura * altura)
    val imcf = "%.2f".format(imc)
    if (imc < 18.5) {
        println("Seu IMC é: $imcf seu peso está abaixo")
    } else if (imc >= 18.5 && imc < 24.9) {
        println(" Seu IMC é: $imcf. Você está com o peso normal")
    } else if (imc >= 25 && imc < 29.9) {
        println(" Seu IMC é: $imcf. Você está com sobrepeso")
    } else if (imc >= 30 && imc < 34.9) {
        println(" Seu IMC é: $imcf.Você está com obsidade Grau I")
    } else if (imc>=35 && imc < 39.9) {
        println(" Seu IMC é: $imcf.Você está com obsidade Grau II")
    } else {
        println(" Seu IMC é: $imcf.Você está com obsidade Grau III")
    }
}
