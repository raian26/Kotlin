package exercicio_PolimorfismoHeranca

fun main(){
    var cavalo1 = Cavalo("Ventania",5,"Manga Larga","Cavalo selvagem")
    println(cavalo1)
    cavalo1.emitirSom()
    cavalo1.correr()
    cavalo1.colocarSela()
}