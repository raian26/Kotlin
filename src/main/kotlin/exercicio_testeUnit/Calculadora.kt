package exercicio_testeUnit
import kotlin.math.pow
import kotlin.math.sqrt

 class Calculadora {
     companion object {
         fun soma(n1:Double,n2:Double): Double {
             return n1 + n2
         }

         fun subtracao(n1:Double,n2:Double): Double {
             return n1 - n2
         }

         fun multi(n1:Double,n2:Double): Double {
             return n1 * n2
         }

         fun div(n1:Double,n2:Double): Double {
             return n1 / n2
         }

         fun pot(n1:Double,n2:Double): Double {
             return n1.pow(n2)
         }

         fun raiz2(n1:Double): Double {
             return sqrt(n1)
         }
     }
}