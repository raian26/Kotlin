fun main(){

    println("Olá, vamos calcular a área e o perímetro do nosso círculo, para comerçarmos me informe o diâmetro(cm):")
   var d = readln().toDouble()
    val pi:Double = kotlin.math.PI
    var C = (pi* d)
    var a = pi * ((d*d)/4)
    var Cf= "%.3f".format(C)
    var af= "%.3f".format(a)
    println("A cirunferencia é $Cf centímetros, e a área é $af centímentros")

}