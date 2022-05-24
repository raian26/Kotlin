import exercicioencap.Lojaclientes

/*Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão e pelo me
nos mais duas opções de construtores conforme sua percepção, com os atributos: nome (String), endereço
(String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
 */
fun main() {
    var compra: String
    var client1nome:String
    var client1 = Lojaclientes("a")
    while(true){
    println("Olá Bem vindo a loja!!!\n")
       println("Para começarmos me informe seu nome para cadastro:\n")
        client1nome= readln()
        try{
        client1= Lojaclientes(client1nome)
            break
     } catch (e: Exception) {
        println(e.message) }}

    println("\n$client1nome gostaria de cadastrar seu endereço e telefone?(S/N)")
    var resp = readln()
    if (resp == "S") {
        println("\nMe informe o seu endereço completo:")
        var endclient1 = readln()
         client1 = Lojaclientes(client1nome, endclient1, "")
        println(
            "\nEndereço cadastrado com sucesso!!!\n" +
                    "Agora me informe seu telefone ou aperte enter para não informar:")
        var telclient1 = readln()
        client1 = Lojaclientes(client1nome, endclient1, telclient1)
        println("Telefone cadastrado com sucesso!!!")
    }

    do {
        println(
            "\n###MENU###\nMe iforme o que deseja fazer:\n1-Adicionar compra\n"+
                    "2-Remover compra\n3-Enviar compra\n4-Verificar a lista de compras\n"+
                    "5- Para sair"
        )
        var op = readln().toInt()
        when (op) {
            1 -> {
                println(" Informe  qual item deseja adicionar a lista de compra:")
                compra = readln()
                client1.addcompra(compra)
            }
            2 -> {
                println("Informe qual item deseja remover da lista de compra:")
                compra = readln()
                client1.excluircompra(compra)
            }
            3 -> {
                client1.enviar()
            }
            4 -> {
                client1.listar()
            }
        }
    } while (op != 5)
}





