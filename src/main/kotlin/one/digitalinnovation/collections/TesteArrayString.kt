package one.digitalinnovation.collections

fun main () {

    val nomes =  Array(3) {""}

    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"

    for (nome in nomes) {
        println (nome)
    }

    println ("--------------------------")

    nomes.sort()
    nomes.forEach { nome ->
        println (nome)
    }

    val nomes2 = arrayOf("Maria", "Zazá", "José")

    println ("--------------------------")

    nomes2.sort()
    nomes2.forEach { nome ->
        println (nome)
    }


}