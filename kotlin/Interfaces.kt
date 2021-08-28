interface Footballer{
    val position: String
    fun dribble()
    fun kick(){
        println("Kick the football")
    }
}

open class Human(val name: String)

class Fellow(name: String, override val position: String): Human(name), Footballer{
    override fun dribble(){
        println("Dribble the ball")
    }
}

fun main(){
    val student = Fellow("John", "Striker")
    playFootball(student)
    printName(student)
}

fun playFootball(footballer: Footballer){
    footballer.dribble()
    footballer.kick()
}

fun printName(person: Fellow){
    println("Person name is: ${person.name}")
}