fun main(){
    //calculaBexigaEmCxAgua()
    //fizzBuzz()
    //inverteString(Karina Rocha")
    //println(analisaRepeticao("xxooxxo"))
}

fun calculaBexigaEmCxAgua(){
    val caixaDAgua = 2000
    val capacidadeBalao = 7
    var qtdeBaloes = 0
    while ((qtdeBaloes * capacidadeBalao) + capacidadeBalao < caixaDAgua){
        qtdeBaloes++
    }
    println("Cabem $qtdeBaloes balões na caixa d'água")
}

fun fizzBuzz(){
    var i = 1
    while( i <= 50){
        when {
            i % 15 == 0 -> print("FizzBuzz ")
            i % 3 == 0 -> print("Buzz ")
            i % 5 == 0 -> print("Fizz ")
            else ->  print("$i ")
        }
       i++
    }
}

fun inverteString ( str : String){
    var i = str.length -1
    while (i >= 0) {
        print(str[i])
        i--
    }
}

fun analisaRepeticao( str: String): Boolean{
    var strMinusculo = str.lowercase()
    var countX = 0
    var countO = 0
    var i = 0
    while (i < str.length){
        if (strMinusculo[i] == 'x' ){
            countX++
        }else if (strMinusculo[i] == 'o'){
            countO++
        }
        i++
    }
    return countX == countO && countX != 0
}