package exercicio_testeUnit.exercicioscomTDD


fun main() {
    var num1: Double
    var num2: Double
    do {println(
        "###CALCULADORA###\n" + "###MENU###\n" + "Para começar escolha a operação:\n" + "1-Soma\n" + "2-Subtração\n" + "3-Multiplicação\n" + "4-Divisão\n" + "5-Potência\n" + "6-Raiz Quadrada\n" + "7-Sair"
    )
    var op = readln().toInt()

        when (op) {
            1 -> {
                println("Me informe os dois valores que desja somar")
                num1 = readln().toDouble()
                num2 = readln().toDouble()
                println("O resultado da soma é: ${Calculadora.soma(num1, num2)}\n")
            }
            2 -> {
                println("Me informe os dois valores que deseja subtrair")
                num1 = readln().toDouble()
                num2 = readln().toDouble()
                println("O resultado da subtração é:${Calculadora.subtracao(num1, num2)}\n")
            }
            3 -> {
                println("Me informe os dois valores que deseja multiplicar")
                num1 = readln().toDouble()
                num2 = readln().toDouble()
                println("O resultado da multiplicação é: ${Calculadora.multi(num1, num2)}\n")
            }
            4 -> {
                println("Me informe os dois valores que deseja dividir:")
                num1 = readln().toDouble()
                num2 = readln().toDouble()
                println("O resultado da divição é:${Calculadora.div(num1, num2)}\n")
            }
            5 -> {
                println("Digite um valor para a base e o segundo valor para o expoente")
                num1 = readln().toDouble()
                num2 = readln().toDouble()
                println("O resultado da potência é ${Calculadora.pot(num1, num2)}\n")

            }
            6 -> {
                println("Digite um valor para calcular a raiz quadrada")
                num1 = readln().toDouble()
                println("O resultado da raiz quadrada é ${Calculadora.raiz2(num1)}")
            }
        }
    } while (op != 7)

}