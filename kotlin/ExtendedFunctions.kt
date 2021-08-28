class St (val firstname : String, val lastname: String ){
    //No Body
}
fun St.fullname(){ //CReating function fullname outside body of St still it belongs to Class St
    println("Full name of the person is : ${firstname} ${lastname}")
}
fun main(){
    val s : St = St("Arthur","Morgan")
    s.fullname()
    val x = 23
    println(x.getEven())
}

fun Int.getEven() : Int{ // Creating function getEven outside the body of predefined class Int
    if (this%2==0){
        return this
    }
    else
        return this+1
}
//