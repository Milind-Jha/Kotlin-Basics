data class DataClasses(val name: String, val section: String){
    var age = 8         // NOT A GOOD PRACTICE TO DECLARE VAR/VAL OUTSIDE CONSTRUCTOR
}
fun main(){
    var dataClasses1: DataClasses = DataClasses("Arthur","A")
    dataClasses1.age=12
    var dataClasses2: DataClasses = DataClasses("Arthur","A")
    println("${dataClasses1.name} ${dataClasses1.section} ${dataClasses1.age}")
    println("${dataClasses2.name} ${dataClasses2.section} ${dataClasses2.age}")
    println("dataClasses1 equals dataClasses2 : ${dataClasses1.equals(dataClasses2)}") // Since age is outside the constructor
                                                                                    // it is not considered in equality
    println("${dataClasses1.toString()} ${dataClasses2.toString()}")

    val dataClasses3 = dataClasses1.copy("Mica") // dataclases3 all are same as dataclasses1 except name
    println("${dataClasses3.name} ${dataClasses3.section} ${dataClasses3.age}")

    //val(name, section, age) = dataClasses1 ERROR
    val (name, section) = dataClasses1
    println("${name} ${section}")
}