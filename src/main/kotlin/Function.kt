//Funções
//Exercicio 4.1

fun receiveInt(n:Int = 5){
    val fibo = listOf(0, 1, 1, 2, 3, 5, 8 ,13)
    return println(fibo.take(n))
}

fun getInitial( name: String = "gabriel"): Char {
    return name[0]
}

//Exercicio 4.2
fun Int.ehPar(): Unit{
    val num = this % 2 == 0
    return println(num)
}