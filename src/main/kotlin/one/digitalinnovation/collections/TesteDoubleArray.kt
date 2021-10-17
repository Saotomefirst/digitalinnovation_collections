package one.digitalinnovation.collections

fun main () {
    val salarios = DoubleArray(5)

    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 3000.0
    salarios[3] = 4000.0
    salarios[4] = 500.0

    salarios.forEach { salario ->
        println(salario)
    }

    println ("--------------------------")

    salarios.forEachIndexed() { index, salario ->
        salarios[index] = salario * 1.1
        println ("Posição $index -> Salário $salario -> Novo Salário ${salarios[index]}")
    }

    println ("--------------------------")

    salarios.forEach { salario ->
        println(salario)
    }


    println ("--------------------------")

    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)

    salarios2.sort()

    salarios2.forEach {salario ->
        println(salario)
    }

}