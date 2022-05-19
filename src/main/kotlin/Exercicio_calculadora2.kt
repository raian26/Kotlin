import kotlin.math.pow
import kotlin.math.sqrt

fun pot(n1: Double, x: Double): Double {
    var p = n1.pow(x)
    return p
}


fun raiz(n1: Double): Double {
    var r = sqrt(n1)
    return r
}

fun main() {
    var x: Double
    var num1: Double
    var num2: Double
    do {
        println("Me informe qual operação você quer: +  soma, - subtração, x multiplicação, / divisão, potencia ou raizquadrada, para sair digite sair:")
        val op = readln().toString()
        when (op) {
            "+" -> {
                println("Para começarmos me informe os dois valores que você deseja somar:")
                num1 = readln().toDouble()
                num2 = readln().toDouble()
                println("O valor da soma é:${soma(num1, num2)}")
            }
            "-" -> {
                println("Para começarmos me informe os dois valores que você deseja subtrair:")
                num1 = readln().toDouble()
                num2 = readln().toDouble()
                println("O valor da subtração é:${sub(num1, num2)}")
            }
            "x" -> {
                println("Para começarmos me informe os dois valores que você deseja multiplicar:")
                num1 = readln().toDouble()
                num2 = readln().toDouble()
                println("O produto da multiplicação é:${mult(num1, num2)}")
            }
            "/" -> {
                println("Para começarmos me informe o dividendo depois o divisor:")
                num1 = readln().toDouble()
                num2 = readln().toDouble()
                println("O resultado da divisão é:${divisao(num1, num2)}")
            }
            "raizquadrada" -> {
                println("Me informe qual o valor para a calcularmos a raiz quadrada:")
                val num1 = readln().toDouble()
                println("A raiz quadrada é:${raiz(num1)} ")
            }
            "potencia" -> {
                println("Me informe qual número e qual o valor de potencia que você deseja:")
                var num1 = readln().toDouble()
                x = readln().toDouble()
                println("A potência para o $num1 elevado a $x é:${pot(num1, x)}")
            }
        }
    } while (op != "sair")
}
