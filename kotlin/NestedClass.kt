class child(val name : String){
    inner class SchoolBag(){// IF inner keyword is not used name cannot be accessed inside SchoolBAg class
        fun printBagOwner(){
            println("The name of the owner is : ${name}")
        }
    }
}
fun main(){
    child("Arthur").SchoolBag().printBagOwner()
}