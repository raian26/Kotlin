//Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
//trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
//programa deverá atender as seguintes funcionalidades:
//
//Armazenar dados da List
//Remover dados da list;
//Atualizar dados da list.
//Apresentar todos os dados da list.

fun main() {

    val listprodutos = mutableListOf<String>()
    println("Bem vindo ao controle de estoque!!!")
    do {
        println(
            "Para começarmos informe qual ação você deseja fazer:\n 1- Incluir produtos no estoque " +
                    "\n 2- Remover produto do estoque\n 3- Atualizar dados do estoque\n 4- Listar estoque ou \n 5- Sair"
        )
        var op = readln().toInt()
        when (op) {
            1 -> addlist(listprodutos)
            2 -> reList(listprodutos)
            3 -> atualizar(listprodutos)
            4 -> {
                println("O tamanho da lista é: ${listprodutos.size}")
                listprodutos.forEach{
                    println(it)
                }
            }
            5 -> println("Até mais!!!")
        }
    } while (op != 5)
}

fun addlist(listprodutos: MutableList<String>): MutableList<String> {

    while (true) {
        println("Me informe o produto que deseja adicionar ou para sair pressione enter: ")
        val produto = readln()

        if (produto != "") {
            listprodutos.add(produto)
            println("Produto $produto adicionado ao estoque!\n")
        } else {
            break
        }
    }
    return listprodutos
}

fun reList(listprodutos: MutableList<String>): MutableList<String> {

    while (true) {
        println("Digite um produto para você deletar do estoque ou digite sair: ")
        val produto = readln()
        if (listprodutos.contains(produto)) {
            listprodutos.remove(produto)
            println("Produto deletado com sucesso!")
        } else if (produto == "sair") {
            break
        } else {
            println("O item $produto não existe no estoque!\n")
        }
    }
    return listprodutos
}

fun atualizar(listprodutos: MutableList<String>): MutableList<String> {
    while (true) {
        println("Digite agora um produto que você queira atualizar ou digite sair: ")
        val atual = readln()
        if (listprodutos.contains(atual)) {
            val index = listprodutos.indexOf(atual)
            println("Digite o novo produto: ")
            val novo = readln()
            listprodutos[index] = novo
            println("O produto foi atualizado com sucesso!")
        } else if (atual == "sair") {
            break
        } else {
            println("O nome $atual não existe no estoque!\n")
        }
    }
    return listprodutos
}











