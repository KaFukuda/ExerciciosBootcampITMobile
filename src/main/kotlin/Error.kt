sealed class Error(i: Int) {
    abstract fun errors(number: Int): String
}
class ErrorServer : Error (404) {
    open var msg = "Not Found"
    override fun errors(number: Int): String  = msg
}



