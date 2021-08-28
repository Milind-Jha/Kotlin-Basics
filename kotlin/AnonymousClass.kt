import java.util.*
import java.lang.Object as Object1
open class People{
    fun walk(){
        println("Person is walking")
    }
    fun sleep(){
        println("Person is sleeping")
    }
    open fun talk(){
        println("Person is talking")
    }
}
fun main(){
    startTalking(object: People(){
        override fun talk(){
            println("I am talking")
        }
    })
}

fun startTalking(people: People){
    //code to setup the speaker
    people.talk()
}
