class Student{
    val school ="DP School"
    var age: Int = 5

    val isteenager : Boolean
        get() = age>12

    var name :String? = null
        get() = field?: "Unknown"
        set(word){
            if (word!=null){
                field = word
            }
        }
}
fun main(){
    val student :Student = Student()
    println("The age is : ${student.age}")
    println("Teenager : ${student.isteenager}")
    student.age =15
    println("The age is : ${student.age}")
    println("Teenager : ${student.isteenager}")
    println("Name of school : ${student.school}")
    println("Name of student : ${student.name}")
    student.name="Arthur"
    println("Name of student : ${student.name}")
}