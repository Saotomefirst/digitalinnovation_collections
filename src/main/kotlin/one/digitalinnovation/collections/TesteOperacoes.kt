package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(2400.0, 1250.0, 5000.0)

    for (salario in salarios) {
        println (salario)
    }

    println ("--------------------------")

    println("Maior Salário: ${salarios.maxOrNull()}")
    println("Menor Salário: ${salarios.minOrNull()}")
    println("Média Salarial: ${salarios.average()}")

    println ("--------------------------")


    val salariosMaiorQue2500 = salarios.filter { it > 1500.0 }

    for (salario in salariosMaiorQue2500) {
        println (salario)
    }


}

