fun main(){
    //contagem(50)
    //contagemRegressiva(50)
    //contagemSemMultiplos5(30)
    //somaTotal(500)
    //escadaHash(7)
}

fun contagem ( num: Int ){
    for (num in 1..num step 1)
        print("$num - ")
}

fun contagemRegressiva ( i: Int ){
    for ( i in i downTo 1 step 1){
        print("$i - ")
    }
}

fun contagemSemMultiplos5 ( j : Int ){
    for ( j in 1..j step 1) {
        if (j %5 != 0){
            print("$j - ")
        }
    }
}

fun somaTotal ( k: Int ){
    var soma = 0
    for ( k in soma..k){
        soma += k
    }
    println(soma)
}

fun escadaHash( l: Int){
    for( l  in 1..l ){
        for ( m in 1..l ){
            print("#")
        }
        println()
    }
}