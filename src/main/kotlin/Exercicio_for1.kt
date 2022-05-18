//Informar todos os números de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5. (FOR)
fun main(){
    var num:Int
    for(i in 1000 .. 1999) {
        num = i
        if (num % 11 == 5) {
            println(num)
        }
    }
}