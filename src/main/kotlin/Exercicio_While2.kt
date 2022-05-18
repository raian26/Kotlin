//Uma empresa desenvolveu uma pesquisa para saber as características
//psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
//era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
//agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
//pessoas, calcule e mostre: (WHILE)
// o número de pessoas calmas;
// o número de mulheres nervosas;
// o número de homens agressivos;
// o número de outros calmos;
// o número de pessoas nervosas com mais de 40 anos;
// o número de pessoas calmas com menos de 18 anos.
fun main() {
    var MulherNervosa = 0
    var HomenAgre = 0
    var maior40 = 0
    var menor18 = 0
    var outroCalm = 0
    var idade = 0
    var pessoasCalm = 0
    var sexo = 0
    var cont = 0
    var opcao = 0

    while (cont <= 5) {
        println("Olá para começarmos me diga sua idade:")
        idade = readln().toInt()
        println("Insira seu sexo (1-feminino / 2-masculino / 3-Outros): ")
        sexo = readln().toInt()
        println("Você se considera uma pessoa: (1-Calma / 2-Nervosa / 3-Agressiva):")
        var humor = readln().toInt()
        when (humor) {
            1 -> {
                pessoasCalm++; if (idade < 18) menor18++; if (sexo == 3) outroCalm++
            }
            2 -> {
                if (idade > 40) maior40++; if (sexo == 1) MulherNervosa++
            }
            3 -> {
                if (sexo == 2) HomenAgre++
            }
        }
        cont++
    }
    println("O número de pessoas calmas:$pessoasCalm")
    println("O número de mulheres nervosas:$MulherNervosa")
    println("O número de homens agressivos:$HomenAgre")
    println("O número de outros calmos:$outroCalm")
    println("O número de pessoas nervosas com mais de 40 anos:$maior40")
    println("O número de pessoas calmas com menos de 18 anos:$menor18")
}