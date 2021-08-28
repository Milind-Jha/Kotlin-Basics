fun main(args: Array<String>) {
    println("person3 is instantiated, ")
    val person3 = Per("Jack")
}

class Per(_firstName: String = "UNKNOWN", _age: Int = 0) {
    val firstName = _firstName.capitalize()
    var age = _age
    init {
        println("First Name = $firstName,")
        print("Age = $age\n")
    }
}