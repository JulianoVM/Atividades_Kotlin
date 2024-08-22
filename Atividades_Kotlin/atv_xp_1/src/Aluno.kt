class Aluno (var nome: String, var notas: ArrayList<Double>)
{
    fun calcularMedia(): Double
    {
        return notas.average()
    }
}