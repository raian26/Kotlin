package exercicio_PolimorfismoHeranca
fun main(){
    var cachorro1 = Cachorro("Cão",4,"Vira lata caramelo","Médio")
    var preguica2 = Preguica("Maria",5,true)
    var cavalo1 = Cavalo("Pé de Pano",8,"Alasão","Cavalo de montaria")
    cachorro1.colocarColeira()
    cachorro1.emitirSom()
    println(cachorro1)
    cachorro1.correr()
    cachorro1.passear()
    println(preguica2)
    preguica2.emitirSom()
    println(cavalo1)
    cavalo1.emitirSom()
}
