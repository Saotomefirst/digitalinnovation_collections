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

    println ("--------------------------")

    println (salarios.count{ it in 1500.0..2500.0})

    println ("--------------------------")

    println (salarios.find{ it == 2400.0})
    println (salarios.find{ it ==  500.0})
    println (salarios.find{ it in 1250.0..12500.0})

    println ("--------------------------")

    println (salarios.any{ it == 1250.0})
    println (salarios.any{ it == 1000.0})
}

