val nome: String = "Karina"
var idade: Int = 32
val altura: Double = 1.69
const val CPF: Long = 123123123321L

//String
val numberOfPets = 3

val code = "0123456"

//substring cria uma nova string a partir de outra
val code2 = code.substring(0, 3)


//Pair e Triples
//Para simplificar e não precisar criar uma classe

val dadosSistema : Pair< String,String> = Pair("meuemail@com", "senha123")
val email = dadosSistema.first
val senha = dadosSistema.second

val cadastro: Triple< Int, Int, String> = Triple(1, 123123, "KaFukuda")
val id = cadastro.first
val matricula = cadastro.second
val user = cadastro.third


//Coleções

//lista imutavel
val charList = listOf('a','b','c')
//println(charList.get(1))

//lista mutavel
val charArray = arrayOf('a','b','c')
//println(charArray.isEmpty())

val entradas= mutableListOf<String>()

