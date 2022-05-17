//Faça um programa que entre com
// três números e coloque em ordem crescente.
//// Maneira que o Paulo resolveu (porém usou array):
///*fun main(){
//    print("Digite o primeiro numero? ")
//    val n1 = readln().toInt()
//    print("Digite o primeiro numero? ")
//    val n2 = readln().toInt()
//    print("Digite o primeiro numero? ")
//    val n3 = readln().toInt()
//   /* val order = listOf(n1,n2, n3 )
//   // print("Ordem: ${order.sorted()}")//

// Metodo feito pelo Elisson
/*print("Entre com o primeiro número:")
val n1 = readln().toInt()
print("Entre com o segundo número:")
val n2 = readln().toInt()
print("Entre com o terceiro número:")
val n3 = readln().toInt()

val listanum = listOf(n1, n2, n3)

val ordcre = listanum.sorted()
val orddec = listanum.sortedDescending()

println("Os números em ordem crescente são: $ordcre")
println("Os números em ordem decrescente são: $orddec")
*/

fun main(){
    println("Para começarmos, me informe três valores, para colocarmos em ordem crescente:")
    val n1 = readln().toDouble()
    val n2 = readln().toDouble()
    val n3 = readln().toDouble()
    if (n1 > n2 && n2 > n3) {
        println("A ordem crescente é $n3, $n2, $n1")
    } else if (n3 >= n2 && n2>=n1) {
        println("A ordem crescente é $n2, $n3, $n1")
    } else if (n2 >= n1 && n1 >= n3) {
        println("A ordem crescente é $n3, $n1, $n2")
    } else if (n2 >= n3 && n3 >= n1) {
        println("A ordem crescente é $n1, $n3, $n2")
    } else if (n3 >= n1 && n1 >= n2) {
        println("A ordem crescente é $n2, $n1, $n3")
    } else
        println("A ordem crescente é $n1, $n2, $n3")

}
