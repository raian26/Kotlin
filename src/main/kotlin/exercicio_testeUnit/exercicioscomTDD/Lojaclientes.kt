package exercicio_testeUnit.exercicioscomTDD

class Lojaclientes(
     private var nome:String
) {
    val listcompras = mutableListOf<String>()

    init {
        //Exceção - Medida que o programa utiliza caso alguma regra seja descumprida
        //que leva o programa a ser finalizado
        if (nome == "" || nome.length > 10) {
            /*
            throw Exception(mensagem)
             */
            throw Exception("\nNome inválido para cadastro!")
        }
    }

    private var endereco: String = ""
    private var telefone: String = ""

    constructor(nome: String, endereco: String) :
            this(nome) {
        this.endereco = endereco
    }

    constructor(nome: String, endereco: String, telefone: String) :
            this(nome, endereco) {
        this.telefone = telefone
    }


    fun addcompra(produto: String) {
        if (produto != "") {
            listcompras.add(produto)
            println("\nCompra adicionada com sucesso!")
        } else {
            println("Nome do produto não pode ser vazio!!!")
        }
    }

    fun excluircompra(compra: String) {
        if (listcompras.contains(compra)) {
            listcompras.remove(compra)
        } else {
            println("O produto $compra não está na lista de compra!!!")
        }
    }

    fun enviar() {
        if (endereco == "") {
            println("Infelizmente não podemos enviar os produtos, pois você não cadastrou o seu endereço!!!")
        } else {
            println("\n Os produtos serão enviados no endereço cadastrado abaixo:")
            println("\n$endereco")
        }
    }

    fun listar() {
        listcompras.forEach {
            println("\n###Lista de compras###\n")
            println(it)
        }
    }

    fun dadosclient() {
        println("\n$nome\n$endereco\n$telefone")

    }

    fun totalitens(): Int {
        return listcompras.size
    }

    fun verificarItem(item: String): Boolean {
        return listcompras.contains(item)
    }
}

