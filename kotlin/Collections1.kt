fun main(){
//    val ranks = mutableMapOf(1 to "XY",2 to "AB",3 to "WX", "x" to 12)
//    ranks.put("x", "ABC" as Nothing) //Data Type is ANY so keyword NOTHING is Used
//    val map = mutableMapOf(1 to "1", 2 to "2", 3 to "3")
//    map.put("4",4 ) Error DataType is Int , String NOTHING keyword does not work

//    val name ="Mike"
//    printName(name)
//    val name:String? = null
//    print("My name is ")
//    println( name?: "John")
//    println("My name is "+ name?:"John") // Diffrent output Left precedence
}


//fun printName(name) = "My name is ${name?: "John"}"
fun printName(name: String = "John") = "My name is ${name}"
//fun printName(name: String?) = "My name is " + {name?: "John"}
//fun printName(name: String) = "My name is " + name
//fun printName(name: String?) = "My name is ${name?: "John"}"