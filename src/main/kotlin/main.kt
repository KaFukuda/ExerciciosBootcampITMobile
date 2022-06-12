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
}