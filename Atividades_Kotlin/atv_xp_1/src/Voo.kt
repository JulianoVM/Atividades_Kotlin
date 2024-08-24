class Voo(var numeroDoVoo: Int, var assentosDisponiveis: Array<Int>)
{
    fun reservarAssento(assento: Int): Boolean
    {
        if (assento > 30 || assento < 1)
        {
            println("Esse assento não existe.")
            return false
        }

        if (assentosDisponiveis[assento] == 0)
        {
            assentosDisponiveis[assento] = 1
            return true
        }
        else
        {
            println("Assento indisponível")
        }

        return false
    }
}
