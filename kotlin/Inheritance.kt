open class Person(val name: String){ //OPEN is used so that class can be inherited
    init {
        println("This is a person.")
    }
    open var age = 20               //OPEN is used to override age in subclass
    open fun doWork(){
        println("${name} is working\n")
    }
}
 class Studen( name: String,val school:String, override var age: Int ):Person(name)//:Person(name) means Person is
                                                                                      //parent class of studen
 {
    init {
        println("This is a student\n")
    }

     override fun doWork() {
         println("${name} is studying")
         super.doWork() //To call doWork function in Person base class
     }

 }
fun main(){
    val s : Studen = Studen("Arthur","DPS",12) // OBJECT OF CHILD CLASS STUDEN
    val s2: Person = Studen("MICA","JVM",15)   // OBJECT OF PArent CLASS person through Studen
    val p : Person = Person("Dutch")                      // OBJECT OF PARENT CLASS PERSON

    //val s2: Studen = Person("Mica") ERROR

    println("${s.name} ${s.school} ${s.age}")
    s.doWork()
    println("${s2.name} ${s2.age}") // ${s2.school} is ERROR since s2 is OBJECT OF PArent CLASS person called through Studen
    s2.doWork()
    println("${p.name}  ${p.age}")
    p.doWork()
}