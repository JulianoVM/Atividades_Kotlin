import java.time.Month

fun ex01()
{
    print("Digite um númeo inteiro qualquer: ")
    val num = readln().toInt()

    if (num < 1)
    {
        println("$num não é um número inteiro")
        return
    }

    for (i in 2..<num)
    {
        if (num % i == 0)
        {
            println("\n$num não é primo")
            return
        }
    }

    println("\n$num é primo")
}

fun ex02()
{
    print("Digite uma palavra ou frase: ")
    val texto = readln().toString()

    if (texto.isEmpty()) {println("\n Você não escreveu nada"); return}

    var palavras = 1
    for (i in texto)
    {
        if (i == ' ')
        {
            palavras++
        }
    }

    if (palavras == 1) {println("\n Você escreveu 1 palavra"); return}

    println("\n Você escreveu $palavras palavras")
}

fun ex03()
{
    val alunos = arrayListOf<Aluno>()

    print("Quantos alunos deseja cadastrar? ")
    val tamanho = readln().toInt()

    print("Quantas notas deseja cadastrar para os alunos? ")
    val quantNotas = readln().toInt()

    for (i in 1..tamanho) {
        print("\nQual o nome do ${i}º aluno? ")
        val nome = readln()

        val notas = arrayListOf<Double>()
        for (j in 1..quantNotas)
        {
            print("Digite a ${j}º nota do ${nome}: ")
            val nota = readln().toDouble()
            notas.add(nota)
        }

        val aluno = Aluno(nome, notas)
        alunos.add(aluno)
    }

    for (aluno in alunos)
    {
        val media = aluno.calcularMedia()
        println("\n${aluno.nome} teve a média: $media")

        if (aluno.calcularMedia() >= 7.0) {println("Resultado: Aprovado\n")}
        else {println("Resultado: Reprovado\n")}
    }
}

fun ex04()
{
    val nomes = mutableListOf<String>()

    print("Quantos nomes de alunos você deseja cadastrar? ")
    val quantNomes = readln().toInt()

    for (i in 1..quantNomes)
    {
        print("Digite o nome do ${i}º aluno(a): ")
        val nome = readln().toString()

        nomes.add(nome)
    }
    nomes.sort()

    println("Nomes em ordem alfabética:")
    nomes.forEach { println("$it") }
}

fun ex05()
{
    print("Quantas vezes deseja lançar os dados? ")
    val numLancamento = readln().toInt()

    var total = 0
    for (i in 1..numLancamento)
    {
        println("Aperte ENTER para realizar o ${i}º lançamento")
        readln()

        val dadoNum = arrayOf(1, 2, 3, 4, 5, 6)
        val valor1 = dadoNum.random()
        val valor2 = dadoNum.random()

        println("Dado 1: $valor1\nDado 2: $valor2")
        println("A soma deu: ${valor1 + valor2}\n")

        total += (valor1 + valor2)
    }

    println("A soma de todos os lançamentos foi de: $total")
    println("O máximo possível era de: ${numLancamento * 12}")
    println("O mínimoo possível era de: ${numLancamento * 2}")
}

fun ex06()
{
    var minTemp = 9999999999999.0
    var maxTemp = -9999999999999.0
    var diaMin = 0
    var diaMax = 0
    var vetorTemps = mutableListOf<Double>()

    for (i in 1..5)
    {
        print("Qual a temperatura do dia $i? ")
        val temp = readln().toDouble()
        vetorTemps.add(temp)

        if (temp < minTemp) {minTemp = temp; diaMin = i}
        if (temp > maxTemp) {maxTemp = temp; diaMax = i}
    }

    println("A temperatura máxima foi de ${maxTemp}ºC no dia $diaMax")
    println("A temperatura mínima foi de ${minTemp}ºC no dia $diaMin")
    println("A média das temperaturas do mês foram de ${vetorTemps.average()}ºC")
}

fun ex07()
{


}

fun ex08()
{


}

fun main()
{
    ex01()
    ex02()
    ex03()
    ex04()
    ex05()
    ex06()
    ex07()
    ex08()
}