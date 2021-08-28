class Stud(val firstname: String = "Arthur")//PRIMARY CONSTRUCTORCalled instide (...) NO BODY ONLY PARAMETERS
{
    var  lastname : String? = null
    init {//PRIMARY CONSTRUCTOR HAS NO BODY ONLY PARAMETERS, SO THE BODY IS IN INIT BLOCK . IT CAN BE SKIPPED IF NO Body required
        var salute = "Hi..."
        println("${salute} inside init block")
    }
    //Secondary Constructor
    constructor(firstname: String, lastname : String): this(firstname)//calls init block with this keyword [Compulsory]
    {       // body of Secondry Constructor
        println("INSIDE SECONDRY CONSTRUCTOR")
        this.lastname = lastname;
    }
}
fun main(){
    var s1: Stud =Stud()                        //Primary constructor called
    var s2 : Stud=Stud("JOHN")          //Primary constructor called
    var s3 : Stud = Stud("Dutch","VAN DER LIN") //Secondary constructor called


    println("${s1.firstname} \n ${s1.lastname}")
    println("${s2.firstname} \n ${s2.lastname}")
    println("${s3.firstname} \n ${s3.lastname}")
}