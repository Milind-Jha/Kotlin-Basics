fun main() {
    var output: String?= null
    output= concater("Coding Ninjas")+ ":"+
            addNumbers(3,4)
    println(output)
}
fun addNumbers(x: Int,y: Int) =x*y
fun concater(substring: String) ="The result is"