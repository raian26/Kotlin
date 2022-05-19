fun main() {
    var n: Int


    for (n in 1..100) {


        if(n%3 ==0 && n%5==0) {
            println("Fizzbuzz")}
        else if (n % 3 == 0) {

            println("Fiz")

        } else if(n % 5 == 0) {

            println("Buzz")
        } else println(n)
    }
}