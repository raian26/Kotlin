fun main() {
    println("Calculadora:")
    println("Para começarmos me informe dois números:")
    val num1 = readln().toDouble()
    val num2 = readln().toDouble()
    println("Agora me informe qual operação você quer: +  soma, - subtração, x multiplicação, / divisão")
    val op = readln().toString()
    when (op) {
        "+" -> println("O valor da soma é:${soma(num1, num2)}")
        "-" -> println("O valor da subtração é:${sub(num1, num2)}")
        "x" -> println("O valor da multiplicação é:${mult(num1, num2)}")
        "/" -> println("O valor da divisão é:${divisao(num1, num2)}")
    }
}

fun soma(n1: Double, n2: Double): Double {
    val resultsoma = (n1 + n2)
    return resultsoma
}

fun sub(n1: Double, n2: Double): Double {
    val resultsub = (n1 - n2)
    return resultsub
}

fun mult(n1: Double, n2: Double): Double {
    val resulmult = (n1 * n2)
    return resulmult
}

fun divisao(n1: Double, n2: Double): Double {
    val resultdiv = (n1 / n2)
    return resultdiv
}