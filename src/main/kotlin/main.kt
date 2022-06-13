fun main() {
    println(code2)
    println("O tamanho da substring eh : ${code2.length}")
    println("Eu tenho $numberOfPets pets")

    // Add items using add()
    println("Add noodles: ${entradas.add("noodles")}")
    println("Entradas: $entradas")
    println("Add spaghetti: ${entradas.add("spaghetti")}")
    println("Entradas: $entradas")

    4.ehPar()
    5.ehPar()

    val filme = Movie("Um Sonho de Liberdade", 1995 ,"Frank Darabont", 9.3)
    println(filme)

    val cloneFilme = filme.copy(year = 1994)
    println(filme == cloneFilme)

    println(resultado)

    //exercicio 3.2
    try {
        val dado = 132132
        dado.toString()
        println(dado)
    } catch (e: Exception){
        println("No way to cast this val to String")
    }

    //exercicio 3.3

    val temp = 22

    when {
        temp < 0 -> println("Freezing weather")
        temp in 1..10 -> println("Very Cold weather")
        temp in 11..20 -> println("Cold weather")
        temp in 21..30 -> println("Normal in Temp")
        temp in 31..40 -> println("Its Hot")
        temp >= 40 -> println("Very Hot")
    }

    //ForEach

    val feira = listOf<String>("tomate", "banana" , "maçã")
    feira.forEachIndexed { i, it ->
        println("$i -> $it ")
    }

    val filterList = feira.filter { it.contains("banana")}
    println(filterList)

 //Exercicio 3.4
    val list  = listOf(13, 61, 35, 96, 3, 93, 6, 43, 68, 75, 88, 19, 17, 81, 52, 5, 51, 74, 54, 10, 45,
    91, 39, 47, 83, 59, 65, 30, 46, 24, 29, 32, 12, 38, 7, 84, 31, 87, 69, 85, 97,
    28, 70, 1, 36, 34, 8, 77, 48, 42, 82, 18, 53, 9, 98, 78, 67, 56, 16, 26, 73,
    20, 86, 62, 95, 76, 25, 71, 11, 58, 57, 55, 33, 94, 22, 21, 41, 15, 40, 27, 89,
    4, 90, 72, 92, 63, 44, 60, 79, 99, 64, 66, 37, 50, 2, 80, 49, 23, 14)

    list.filter { it > 60}
        .also{ println("numeros maiores que 60 são: $it")
        }

    list
        .find{ it % 7 == 0}
        ?.also{
            println("Divisivel por 7 $it")}
        ?: println("Nao tem")

    list
        .any { it.toString().reversed() == it.toString()}
        .also { exists ->
            if (exists){
            println("Existe")
        } else println("Nao tem")
    }
}