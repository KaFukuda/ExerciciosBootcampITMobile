//Condicionais(if/else)

//val maxValue = if( a > b) a else b

//Crie um código que avalie se um caractere é uma vogal ou
//não.

//exercicio 3.1
val palavra = "teste de vogais"
val msg = "contém vogal(is)"
val erro = "não tem"

val pattern = "[aeiou]".toRegex()

var resultado = if (palavra.contains(pattern)) msg else erro

//exercicios 3.2 , 3.3  e 3.4 no main

//declarar variável como nula

var price: Float? = null

//Elvis Operator verifica nullabilities

//var altura = altura ?: 1.60F







