fun main(){
    var number: Int = 127
    var num: Long = number.toLong()
    var num2: Long? = number as? Long
    var num3: Byte? = number as? Byte
    val num4: Byte = number.toByte()
    var num5: Float?= number as? Float
    num5 = number.toFloat()
    println(num5)
    println(num4)
    println(num3)
    println(num2)
    println(num)


    var word: Any = "Arthur"
    var name: String? = word as String
    var alphabet: Char? = word as? Char
    println("\n"+alphabet)
    println(name)

}