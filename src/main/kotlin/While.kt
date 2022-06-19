fun main(){
    //calculaBexigaEmCxAgua()
    //fizzBuzz()
    //inverteString(Karina Rocha")
    //println(analisaRepeticao("xxooxxo"))
    investimentos()
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

fun investimentos(){
    var mes = 0
    val salario = 10000f
    var patAna = 0f
    var patPaula = 0f
    val investimentoEmpresa = salario * 0.05f

    do {
        patAna += ((investimentoEmpresa + investimentoEmpresa) + (patAna * 0.002f))
        patPaula += (salario * 0.05f) + (patPaula * 0.008f)
        mes++
    }while (patAna > patPaula)
    println("O patrimonio da Ana é de : $patAna")
    println("O patrimonio da Paula é de : $patPaula")
    println("Paula vai superar o patrimonio de Ana no mes $mes")
}